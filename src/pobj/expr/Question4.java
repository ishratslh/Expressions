package pobj.expr;

public class Question4 {
	private static Expression e1, e2, e3;
	public Question4() {
		// TODO Auto-generated constructor stub
	}
	public static Expression e1(){ //e1 = (2 + 3) ∗ 4
		return new Mult( new Add(new Constant (2), new Constant(3)), new Constant(4) );
	}
	public static Expression e2(){ //e2 = (x + 3) ∗ (x + 4)
		return new Mult( new Add(new Var ("x"), new Constant(3)), new Add(new Var ("x"), new Constant(4)));
	}
	public static Expression e3(){ //e3 = (x + 10) ∗ (y + −8)
		return new Mult( new Add(new Var ("x"), new Constant(10)), new Add(new Var ("y"), new Constant(-8)));
	}

}
