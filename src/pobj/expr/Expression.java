package pobj.expr;

public interface Expression {
	public int eval();
	
	public <T> T accept(IVisitor<T> v);
	// invoque la méthode visit du visiteur en lui passant la référence this
}
