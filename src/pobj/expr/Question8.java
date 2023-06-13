package pobj.expr;

import java.util.HashMap;
import java.util.Map;

public class Question8 {
	//nom des variables + leur valeur respective
	private static Map<String,Integer> env1, env2, env3;

	public static Map<String,Integer> env1(){ //env vide
		//env1.put(" ", 0);
		env1=new HashMap<String,Integer>();
		env1.clear();
		return env1;
	}
	public static Map<String,Integer> env2(){
		env2=new HashMap<String,Integer>();
		env2.put("x", 10);
		env2.put("y", 20);
		return env2;
	}
	public static Map<String,Integer> env3(){
		env3=new HashMap<String,Integer>();
		env3.put("z", 9);
		return env3;
	}
}
