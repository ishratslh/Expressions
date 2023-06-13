package pobj.expr;

public class VisitorDerive implements IVisitor<Expression>{
	//calcul de la dérivée d’une expression par rapport à une variable
	private Var x;

	public VisitorDerive(Var x) {
		this.x=x;
	}

	@Override
	public Expression visit(Constant c) {
		return new Constant(0);
	}

	@Override
	public Expression visit(Add e) {
		Expression e1 = e.getLeft().accept(this) ;
		Expression e2 = e.getRight().accept(this);

		return new Add(e1, e2);
	}

	@Override
	public Expression visit(Mult e) {
		Expression e1 = e.getLeft().accept(this) ;
		Expression e2 = e.getRight().accept(this);

		return new Add(new Mult(e.getLeft(), e2), new Mult(e.getRight(), e1));
	}

	@Override
	public Expression visit(Var v) {
		if (v.equals(x)) return new Constant(1);
		else return new Constant(0);
	}

}
