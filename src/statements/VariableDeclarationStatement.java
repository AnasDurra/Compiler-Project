package statements;

public class VariableDeclarationStatement extends Statement {
    private final String type;
    private final String name;

    public VariableDeclarationStatement(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
