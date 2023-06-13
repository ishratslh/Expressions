package pobj.expr;

public class VisitorSimplify implements IVisitor<Expression>{
	// simplifier les expressions arithmétiques 
	public VisitorSimplify() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Expression visit(Constant c) {
		return c;
	}

	@Override
	public Expression visit(Add e) {

		if ( Question10.isConstant( e.getLeft() )) {
			if (e.getLeft().eval()==0) return e.getRight().accept(this);
		}

		if (Question10.isConstant(e.getRight())  ) {
			if (e.getRight().eval()==0) return e.getLeft().accept(this);
		}

		if ( Question10.isConstant( e.getLeft() )
				&& Question10.isConstant(e.getRight())  ) {
			return new Constant(e.eval());
		}
		return new Add(e.getLeft().accept(this), e.getRight().accept(this));
	}


	@Override
	public Expression visit(Mult e) {
		if ( Question10.isConstant( e.getLeft() )) {
			if (e.getLeft().eval()==0) return new Constant(0);
		}

		if (Question10.isConstant(e.getRight())  ) {
			if (e.getRight().eval()==0) return new Constant(0);
		}

		if ( Question10.isConstant( e.getLeft() )) {
			if (e.getLeft().eval()==1) return e.getRight().accept(this);
		}

		if (Question10.isConstant(e.getRight())  ) {
			if (e.getRight().eval()==1) return e.getLeft().accept(this);
		}

		if ( Question10.isConstant( e.getLeft() )
				&& Question10.isConstant(e.getRight())  ) {
			return new Constant(e.eval());
		}
		return new Mult(e.getLeft().accept(this), e.getRight().accept(this));
	}

	@Override
	public Expression visit(Var v) {
		return v;
	}

}
