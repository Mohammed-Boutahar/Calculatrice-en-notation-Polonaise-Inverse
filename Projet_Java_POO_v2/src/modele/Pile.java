package modele;

import java.util.Stack;

public class Pile extends Stack<Object>{
	
	void push(double unNombre) {
		super.push(unNombre);
	}
	
	public Double pop() {
		return (Double)super.pop();
	}
	
	void drop() {
		this.pop();
	}
	
	public void clear() {
		super.clear();
	}
}
