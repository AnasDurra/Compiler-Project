parser grammar DartParser;


options {
  tokenVocab=DartLexer;
}

prog: statment* scaffold?  EOF
    ;
// modify comma
scaffold: SCAFFOLD LP (scaffoldProperty (COMMA scaffoldProperty )* COMMA?) ? RP
        ;


scaffoldProperty
    :   BODY COLON widget #ScaffoldBody
    |   APPBARATRIB COLON appBar #ScaffoldAppBar
    ;


appBar
    :   APPBAR LP (appBarProperties (COMMA appBarProperties)* COMMA? )? RP
    ;

appBarProperties
    :   TITLE COLON STRING #AppBarTitle
    |   CENTERTITLE COLON BOOLEAN #AppBarCenterTitle
    ;

widget
    :   row
    |   center
    |   text
    |   container
    |   expanded
    |   column
    |   gestureDetector
    |   padding
    |   image
    |   button
    |   customWidget
    |   textField
    ;

customWidget
    :   WIDGETNAME LP (customWidgetProperties (COMMA customWidgetProperties)* COMMA? )?  RP
    ;

customWidgetProperties
    :   IDENTIFIER COLON (NUM | STRING | FLOAT)
    ;

row
    : ROW LP (rowProperties (COMMA rowProperties)* COMMA? )? RP
    ;

//those already written in there own seperate visitors
rowProperties
    :   childrenProperty
    |   mainAxisSizeProperty
    |   crossAxisAlignmentProperty
    ;

center
    :   CENTER LP (centerProperties (COMMA centerProperties)* COMMA? )? RP
    ;

//those already written in there own seperate visitors
centerProperties
    :   childProperty #CenterChild
    ;



column
    :   COLUMN LP (columnProperties (COMMA columnProperties)* COMMA? )? RP
    ;

columnProperties
    :   childrenProperty
    |   mainAxisSizeProperty
    |   crossAxisAlignmentProperty
    ;


text
    :   TEXT LP (textProperties (COMMA textProperties)* COMMA? )? RP
    ;

textProperties:     TEXTATRIB COLON STRING #TextContent
              |     FONTWEIGHT COLON (BOLD | LIGHT | MEDIUM | SEMIBOLD) #TextFontWeight
              |     FONTSIZE COLON (NUM|FLOAT) #TextFontSize
              |     LETTERSPACING COLON (NUM|FLOAT) #TextLetterSpacing
              |     TEXTALIGN COLON (CENTERVALUE | START_ATTR | END_ATTR | JUSTIFY_ATTR)    #TextTextAlign
              ;


container: CONTAINER LP (containerProperties (COMMA containerProperties)* COMMA? )? RP;

containerProperties:    widthProperty #ContainerWidth
                   |    heightProperty #ContainerHeight
                   |    CONTENTALIGNMENT COLON (CENTERVALUE | LEFT | RIGHT) #ContainerContentAlignment
                   |    childProperty #ContainerChild
                   |    decorationProperty #ContainerDecoration
                   ;

decorationProperty: DECORATION COLON boxDecoration; //new gabsonia

boxDecoration:  BOXDECORATION LP (boxDecorationProperties (COMMA boxDecorationProperties)* COMMA? )? RP;

boxDecorationProperties: colorProperty
                       | borderRadiusProperty
                       ;
borderRadiusProperty: BORDERRADIUS COLON borderRadius;

borderRadius
    :   borderRadiusOnly
    |   borderRadiusCircular
    ;

borderRadiusCircular: BORDERRADIUSCIRCULAR LP borderRadiusCircularProperties COMMA? RP;
borderRadiusOnly: BORDERRADIUSONLY LP (borderRadiusOnlyProperties (COMMA borderRadiusOnlyProperties)* COMMA? )? RP;

borderRadiusCircularProperties: RADIUS COLON (NUM|FLOAT); //TODO make it double only

borderRadiusOnlyProperties //TODO make it double only
    :   TOPRIGHT COLON (NUM|FLOAT) #BorderRadiusOnlyTopRight
    |   TOPLEFT COLON (NUM|FLOAT) #BorderRadiusOnlyTopLeft
    |   BOTTOMRIGHT COLON (NUM|FLOAT) #BorderRadiusOnlyBottomRight
    |   BOTTOMLEFT COLON (NUM|FLOAT) #BorderRadiusOnlyBottomLeft
    ;

expanded:   EXPANDED LP (expandedProperties (COMMA expandedProperties)* COMMA? )? RP;

expandedProperties:     FLEX COLON NUM #ExpandedFlex
                  |     childProperty #ExpandedChild
                  ;


gestureDetector: GESTUREDETECTOR LP (gestureDetectorProperties (COMMA gestureDetectorProperties)* COMMA? )? RP;

gestureDetectorProperties: ONPRESSED COLON onFunction;

onFunction: LP (IDENTIFIER COMMA)* RP OB statment* CB;

padding:    PADDING LP (paddingProprtey (COMMA paddingProprtey)* COMMA? )? RP;

paddingProprtey
    :   PADDINGATTR COLON edgeInsets  #PaddingPadding
    |   childProperty  #PaddingChild //delete label ?
    ;

edgeInsets
    :   EDGE_INSETS_ONLY LP (edgeInsetsOnlyProperties (COMMA edgeInsetsOnlyProperties)* COMMA? )? RP  #EdgeInsetsOnly
    |   EDGE_INSETS_SYMMETRIC LP (edgeInsetsSymetricProperties (COMMA edgeInsetsSymetricProperties)* COMMA?)? RP  #EdgeInsetsSymetric
    ;

edgeInsetsOnlyProperties
    :   TOP COLON (NUM|FLOAT)    #EdgeInsetsOnlyTop
    |   LEFT COLON (NUM|FLOAT)      #EdgeInsetsOnlyLeft
    |   RIGHT COLON (NUM|FLOAT)    #EdgeInsetsOnlyRight
    |   BOTTOM COLON (NUM|FLOAT)    #EdgeInsetsOnlyBottom
    ;

edgeInsetsSymetricProperties
    :   HORIZONTAL COLON (NUM|FLOAT)    #EdgeInsetsSymetricHorizontal
    |   VERTICAL COLON (NUM|FLOAT)      #EdgeInsetsSymetricVertical
    ;

image
    :   IMAGE LP (imageProperties (COMMA imageProperties)* COMMA? )? RP
    ;

imageProperties
    :   URL COLON STRING    #ImageUrl
    |   FIT COLON (COVER | CONTAINS)  #ImageFit
    |   widthProperty     #ImageWidth
    |   heightProperty    #ImageHeight
    ;

button
    :   BUTTON LP (buttonProperties (COMMA buttonProperties)* COMMA? )? RP
    ;

buttonProperties
    :   widthProperty  #ButtonWidth
    |   heightProperty  #ButtonHeight
    |   TITLE COLON STRING  #ButtonTitle
    |   BACKGROUND_COLOR COLON HEX_NUM  #ButtonBackgroundColor
    |   TITLE_COLOR COLON HEX_NUM   #ButtonTitleColor
    |   ONPRESSED COLON onFunction   #ButtonOnPressed
    ;


textField: TEXTFIELD LP (textFieldProperties (COMMA textFieldProperties)* COMMA? )? RP;

textFieldProperties: VALUE COLON STRING #TextFieldValue
                   | LABEL COLON STRING #TextFieldLabel
                   | TEXTCOLOR COLON HEX_NUM #TextFieldTextColor
                   | PADDINGATTR COLON edgeInsets #TextFieldPadding
                   | HINT COLON STRING #TextFieldHint
                   | BORDERATRI COLON border #TextFieldBorder
                   | ONCHANGED COLON onFunction #TextFieldOnChanged
                   ;
border: BORDER LP (borderProperties (COMMA borderProperties)* COMMA? )? RP;

borderProperties: THICKNESS COLON NUM #BorderThickness
                | BORDERRADIUS COLON borderRadius   #BorderBorderRadius
                | colorProperty #BorderColor
                ;

statment
    :   variableDeclaration
    |   variableAssignment
    |   customWidgetDeclaration
    ;

// statements
variableDeclaration
    :   (INT | DOUBLE | STRINGTYPE) IDENTIFIER SC   #NonFunctionVariableDeclaration
    |   FUNCTION LP ((INT | DOUBLE | STRINGTYPE) COMMA)* RP IDENTIFIER SC   #FunctionVariableDeclaration
    ;

variableAssignment
    :   IDENTIFIER EQL (NUM | FLOAT | STRING) SC
    ;

//custom widget stuff
customWidgetDeclaration
    :   WIDGET WIDGETNAME OB variableDeclaration* RETURN LP widget RP CB
    ;

// Frequency grammars
widthProperty:  WIDTH COLON (NUM|FLOAT);
heightProperty: HEIGHT COLON (NUM|FLOAT);
colorProperty: COLOR COLON HEX_NUM;
childProperty:  CHILD COLON widget;
childrenProperty:   CHILDREN COLON OA (widget (COMMA widget)* COMMA? )? CA;
mainAxisSizeProperty:   MAINAXISSIZE COLON (MAX | MIN);
crossAxisAlignmentProperty: CROSSAXISALIGNMENT COLON (STRETCH | LEFT | RIGHT | CENTERVALUE);
