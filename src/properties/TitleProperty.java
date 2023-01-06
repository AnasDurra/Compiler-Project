package properties;

import visitors.Visitor;

public class TitleProperty extends Property {

    private final String value;

    public TitleProperty(String value, String lnNumber) {
        super("title", lnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
