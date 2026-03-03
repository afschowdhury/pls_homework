package Tree;

public class Assign extends Stmt {
    private Ident var;
    private Exp exp;

    public Assign(Ident v, Exp e) { var = v; exp = e; }

    public Exp wlp(Exp post) {
	return post.substitute(var.getName(), exp);
    }
}
