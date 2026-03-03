grammar IMP;

@header {
    package Parse;
    import Tree.*;
    import java.util.*;
}

program
    : pre=assertion statementlist post=assertion
		{
		    Exp wlp = $statementlist.tree.wlp($post.tree);
		    Exp vc = new OpExp($pre.tree, OpExp.Op.IMP, wlp);
		    vc.print();
		    System.out.println();
		}
    ;

statementlist returns [Stmt tree]
    : statement
		{ $tree = $statement.tree; }
    | s1=statement ';' s2=statementlist
		{ $tree = new Seq($s1.tree, $s2.tree); }
    ;

statement returns [Stmt tree]
    : 'skip'
		{ $tree = new Skip(); }
    | id ':=' arithexp
		{ $tree = new Assign($id.name, $arithexp.tree); }
    | 'begin' statementlist 'end'
		{ $tree = $statementlist.tree; }
    | 'if' boolterm 'then' s1=statement 'else' s2=statement
		{ $tree = new IfThenElse($boolterm.tree, $s1.tree, $s2.tree); }
    | assertion 'while' boolterm 'do' statement
		{ $tree = new While($assertion.tree, $boolterm.tree, $statement.tree); }
    | 'assert' assertion
		{ $tree = new AssertStmt($assertion.tree); }
    ;

assertion returns [Exp tree]
    : '{' t=boolexp '}'
		{ $tree = $t.tree; }
    ;

boolexp returns [Exp tree]
    : t=boolterm
		{ $tree = $t.tree; }
    | t1=boolterm '=>' t2=boolterm
		{ $tree = new OpExp($t1.tree, OpExp.Op.IMP, $t2.tree); }
    | t1=boolterm '<=>' t2=boolterm
		{ $tree = new OpExp($t1.tree, OpExp.Op.EQV, $t2.tree); }
    ;

boolterm returns [Exp tree]
    : t=boolterm2
		{ $tree = $t.tree; }
    | t1=boolterm 'or' t2=boolterm2
		{ $tree = new OpExp($t1.tree, OpExp.Op.OR, $t2.tree); }
    ;

boolterm2 returns [Exp tree]
    : t=boolfactor
		{ $tree = $t.tree; }
    | t1=boolterm2 'and' t2=boolfactor
		{ $tree = new OpExp($t1.tree, OpExp.Op.AND, $t2.tree); }
    ;

boolfactor returns [Exp tree]
    : 'true'
		{ $tree = new BoolLit(true); }
    | 'false'
		{ $tree = new BoolLit(false); }
    | compexp
		{ $tree = $compexp.tree; }
    | 'forall' id '.' boolexp
		{ $tree = new ForAll($id.name.getName(), $boolexp.tree); }
    | 'exists' id '.' boolexp
		{ $tree = new Exists($id.name.getName(), $boolexp.tree); }
    | 'not' boolfactor
		{ $tree = new OpExp(OpExp.Op.NOT, $boolfactor.tree); }
    | '(' t=boolexp ')'
		{ $tree = $t.tree; }
    ;

compexp returns [Exp tree]
    : t1=arithexp '<' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.LT, $t2.tree); }
    | t1=arithexp '<=' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.LE, $t2.tree); }
    | t1=arithexp '=' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.EQ, $t2.tree); }
    | t1=arithexp '!=' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.NE, $t2.tree); }
    | t1=arithexp '>=' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.GE, $t2.tree); }
    | t1=arithexp '>' t2=arithexp
		{ $tree = new OpExp($t1.tree, OpExp.Op.GT, $t2.tree); }
    ;

arithexp returns [Exp tree]
    : t=arithterm
		{ $tree = $t.tree; }
    | t1=arithexp '+' t2=arithterm
		{ $tree = new OpExp($t1.tree, OpExp.Op.PLUS, $t2.tree); }
    | t1=arithexp '-' t2=arithterm
		{ $tree = new OpExp($t1.tree, OpExp.Op.MINUS, $t2.tree); }
    ;

arithterm returns [Exp tree]
    : t=arithfactor
		{ $tree = $t.tree; }
    | t1=arithterm '*' t2=arithfactor
		{ $tree = new OpExp($t1.tree, OpExp.Op.TIMES, $t2.tree); }
    | t1=arithterm '/' t2=arithfactor
		{ $tree = new OpExp($t1.tree, OpExp.Op.DIV, $t2.tree); }
    ;

arithfactor returns [Exp tree]
    : id
		{ $tree = $id.name; }
    | integer
		{ $tree = $integer.value; }
    | '-' af=arithfactor
		{ $tree = new OpExp(OpExp.Op.UMINUS, $af.tree); }
    | '(' ae=arithexp ')'
		{ $tree = $ae.tree; }
    | id '(' arithexplist ')'
		{ $tree = new FuncApp($id.name.getName(), $arithexplist.trees); }
    ;

arithexplist returns [java.util.List<Exp> trees]
    : t=arithexp
		{ $trees = new java.util.ArrayList<Exp>(); $trees.add($t.tree); }
    | t=arithexp ',' rest=arithexplist
		{ $trees = $rest.trees; $trees.add(0, $t.tree); }
    ;

id returns [Ident name]
    : IDENT
		{ $name = new Ident($IDENT.text); }
    ;

integer returns [IntLit value]
    : INT
		{ $value = new IntLit(Integer.parseInt($INT.text)); }
    ;


IDENT
    : [A-Za-z][A-Za-z0-9_]*
    ;

INT
    : [0]|[1-9][0-9]*
    ;

WS
    : [ \r\n\t] -> skip
    ;
