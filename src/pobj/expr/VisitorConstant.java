package pobj.expr;

public class VisitorConstant implements IVisitor<Boolean>{
	public VisitorConstant(){}

	@Override
	public Boolean visit(Constant c) {
		return true;
	}

	@Override
	public Boolean visit(Add e) {
		return e.getLeft().accept(this) && e.getRight().accept(this);
//		Boolean v1 = e.getLeft().accept(this);
//		Boolean v2 = e.getRight().accept(this);
//		if (v1==false||v2==false) return false;
//		else return true;
	}

	@Override
	public Boolean visit(Mult e) {
		return e.getLeft().accept(this) && e.getRight().accept(this);
		/*Boolean v1 = e.getLeft().accept(this);
		Boolean v2 = e.getRight().accept(this);
		if (v1==false||v2==false) return false;
		else return true ;*/
	}

	@Override
	public Boolean visit(Var v) {
		return false;
	}

}
