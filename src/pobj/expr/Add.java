package pobj.expr;

public class Add extends BinOp implements Expression{

	public Add(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public String toString() {
		return "( " + getLeft() + " + " + this.getRight() + " )" ;
	}

	@Override
	public int eval() throws UnsupportedOperationException{
		int left = getLeft().eval();
		int right = getRight().eval();
		return left+right;
	}
	@Override
	public <T> T accept(IVisitor<T> v) {
		
		return v.visit(this);
	}


}
