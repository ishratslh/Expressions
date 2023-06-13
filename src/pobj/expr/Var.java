package pobj.expr;

public class Var implements Expression {
	private final String nom;

	@Override
	public String toString() {
		return nom ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Var other = (Var) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public Var(String nom) {
		super();
		this.nom = nom;
	}

	public String getName() {
		return nom;
	}

	@Override
	public int eval() throws UnsupportedOperationException{ //signale une exception si l’arbre d’expression contient des variables
		if (this instanceof Var) throw new UnsupportedOperationException();
		return 0;

	}
	@Override
	public <T> T accept(IVisitor<T> v) {

		return v.visit(this);
	}

}
