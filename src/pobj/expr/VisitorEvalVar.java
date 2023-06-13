package pobj.expr;

import java.util.Map;

public class VisitorEvalVar extends VisitorEval{
	//évaluation, sans exception, d’une expr contenant des variables dans un environnement donné
	Map<String,Integer> env;

	public VisitorEvalVar(Map<String,Integer> env) {
		this.env=env;
	}
	@Override
	public Integer visit(Var v) {
		if (env.size()==0) return null;
		else {
			return env.get(v.toString());
		}
	}


}
