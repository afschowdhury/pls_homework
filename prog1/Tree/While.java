package Tree;

public class While extends Stmt {
    private Exp invariant;
    private Exp guard;
    private Stmt body;

    public While(Exp inv, Exp g, Stmt b) {
	invariant = inv; guard = g; body = b;
    }

    public Exp wlp(Exp post) {
	Exp exitVC = new OpExp(
	    new OpExp(invariant, OpExp.Op.AND, new OpExp(OpExp.Op.NOT, guard)),
	    OpExp.Op.IMP,
	    post
	);
	exitVC.print();
	System.out.println();

	Exp bodyWLP = body.wlp(invariant);
	Exp bodyVC = new OpExp(
	    new OpExp(invariant, OpExp.Op.AND, guard),
	    OpExp.Op.IMP,
	    bodyWLP
	);
	bodyVC.print();
	System.out.println();

	return invariant;
    }
}
