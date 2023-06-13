package pobj.expr;

public class VisitorEval implements IVisitor<Integer>{
	// calcule la valeur d’une expression sans variable

	public VisitorEval() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer visit(Constant c) {
		return c.getValue();
	}

	@Override
	public Integer visit(Add e) {
		Integer v1 = e.getLeft().accept(this);
		Integer v2 = e.getRight().accept(this);
		return v1+v2;
	}

	@Override
	public Integer visit(Mult e) {
		Integer v1 = e.getLeft().accept(this);
		Integer v2 = e.getRight().accept(this);
		return v1*v2;
	}

	@Override
	public Integer visit(Var v) throws UnsupportedOperationException{
		if (v instanceof Var) throw new UnsupportedOperationException();
		return 0;
	}


}
