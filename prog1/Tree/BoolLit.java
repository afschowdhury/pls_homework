package Tree;

public class BoolLit extends Exp {
    private boolean value;

    public BoolLit(boolean v) { value = v; }

    public void print() {
	System.out.print(value ? "true" : "false");
    }

    public Exp substitute(String var, Exp replacement) {
	return this;
    }
}
