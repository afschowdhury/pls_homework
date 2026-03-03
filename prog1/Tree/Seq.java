package Tree;

public class Seq extends Stmt {
    private Stmt s1;
    private Stmt s2;

    public Seq(Stmt a, Stmt b) { s1 = a; s2 = b; }

    public Exp wlp(Exp post) {
	return s1.wlp(s2.wlp(post));
    }
}
