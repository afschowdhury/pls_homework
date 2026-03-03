package Tree;

import java.util.ArrayList;
import java.util.List;

public class FuncApp extends Exp {
    private String name;
    private List<Exp> args;

    public FuncApp(String n, List<Exp> a) { name = n; args = a; }

    public void print() {
	System.out.print(name + "(");
	for (int i = 0; i < args.size(); i++) {
	    if (i > 0) System.out.print(",");
	    args.get(i).print();
	}
	System.out.print(")");
    }

    public Exp substitute(String var, Exp replacement) {
	List<Exp> newArgs = new ArrayList<>();
	for (Exp arg : args) newArgs.add(arg.substitute(var, replacement));
	return new FuncApp(name, newArgs);
    }
}
