package pobj.expr;

public class Constant implements Expression {
	private int value;

	public int getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Constant other = (Constant) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public Constant(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value ;
	}

	public Constant() {
		value = 0;
	}

	@Override
	public int eval() { //Les constantes s’évaluent en leur valeur
		return value;
	}

	@Override
	public <T> T accept(IVisitor<T> v) {

		return v.visit(this);
	}

}
