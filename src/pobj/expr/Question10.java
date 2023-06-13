package pobj.expr;

public class Question10 {
	// retourne vrai si e est un arbre d’expression constant

	public static boolean isConstant(Expression e) {
		VisitorConstant v=new VisitorConstant();
		return e.accept(v);
	}
	
	// retourne la valeur d’une expression constante
	// signale une exception si l’expression n’est pas constante
	public static int evalConstantExpression (Expression e) {
		return e.eval();
	}
}
