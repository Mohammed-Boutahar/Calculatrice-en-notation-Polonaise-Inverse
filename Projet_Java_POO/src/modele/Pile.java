package modele;

import java.util.Stack;

public class Pile extends Stack<Object>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
