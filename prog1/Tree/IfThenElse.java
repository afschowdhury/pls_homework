package Tree;

public class IfThenElse extends Stmt {
    private Exp cond;
    private Stmt thenBranch;
    private Stmt elseBranch;

    public IfThenElse(Exp c, Stmt t, Stmt e) {
	cond = c; thenBranch = t; elseBranch = e;
    }

    public Exp wlp(Exp post) {
	Exp wp1 = thenBranch.wlp(post);
	Exp wp2 = elseBranch.wlp(post);
	return new OpExp(
	    new OpExp(cond, OpExp.Op.IMP, wp1),
	    OpExp.Op.AND,
	    new OpExp(new OpExp(OpExp.Op.NOT, cond), OpExp.Op.IMP, wp2)
	);
    }
}
