package Tree;

public class AssertStmt extends Stmt {
    private Exp assertion;

    public AssertStmt(Exp a) { assertion = a; }

    public Exp wlp(Exp post) {
	Exp vc = new OpExp(assertion, OpExp.Op.IMP, post);
	vc.print();
	System.out.println();
	return assertion;
    }
}
