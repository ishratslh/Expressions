package pobj.expr;

public abstract class BinOp{
	private final Expression left; //fils gauche
	private final Expression right; //fils droit

	public Expression getRight() {
		return right;
	}

	public Expression getLeft() {
		return left;
	}

	public BinOp(Expression left, Expression right) {
		this.left = left;
		this.right = right;

	}

}
