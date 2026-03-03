package Tree;

public class Exists extends Exp {
    private String boundVar;
    private Exp body;

    public Exists(String v, Exp b) { boundVar = v; body = b; }

    public void print() {
	System.out.print("exists " + boundVar + " . ");
	body.print();
    }

    void print(OpExp.Op parent, OpExp.LR child) {
	System.out.print('(');
	print();
	System.out.print(')');
    }

    public Exp substitute(String var, Exp replacement) {
	if (var.equals(boundVar)) return this;
	return new Exists(boundVar, body.substitute(var, replacement));
    }
}
