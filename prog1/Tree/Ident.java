package Tree;

public class Ident extends Exp {
    String name;

    public Ident(String n) { name = n; }

    public String getName() { return name; }

    public void print() {
	System.out.print(name);
    }

    public Exp substitute(String var, Exp replacement) {
	if (name.equals(var)) return replacement;
	return this;
    }
}
