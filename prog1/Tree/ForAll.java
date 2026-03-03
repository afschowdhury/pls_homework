package Tree;

public class ForAll extends Exp {
    private String boundVar;
    private Exp body;

    public ForAll(String v, Exp b) { boundVar = v; body = b; }

    public void print() {
	System.out.print("forall " + boundVar + " . ");
	body.print();
    }

    void print(OpExp.Op parent, OpExp.LR child) {
	System.out.print('(');
	print();
	System.out.print(')');
    }

    public Exp substitute(String var, Exp replacement) {
	if (var.equals(boundVar)) return this;
	return new ForAll(boundVar, body.substitute(var, replacement));
    }
}
