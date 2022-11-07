package modele;

public class Accumulateur {

	public Pile p;

	public Accumulateur() {
		p = new Pile();
	}
	
	public void push(float a) {
		p.push(a); 
	}
	
	public void drop() { //supprimer le dernier élément de la pile 
		p.pop();
	}
	
	public void clear() {
		p.clear();
	}
	
	public void swap() {
		if (p.size()>1){
			double n1= (Double)p.pop();
			double n2= (Double)p.pop();
			p.push(n1);
			p.push(n2);
		}
	}
		
	
	public void neg() {
		
	}
	
	
	//effectue la somme des 2 derniers nombres de la pile
	public void add(){ 
			if (p.size()>1){
				double somme=0.0;
				double n1= (Double)p.pop();
				double n2= (Double)p.pop();
				somme=n1+n2;
				p.push(somme);
				
			}
		}
	
	//effectue la soustraction des 2 derniers nombres de la pile
	public void sub(){ 
			if (p.size()>1){
				double resultat=0;
				double n1= (Double)p.pop();
				double n2= (Double)p.pop();
				resultat=n2-n1;
				p.push(resultat);
				
			}
		}
	
	
	//effectue la multiplication des 2 derniers nombres de la pile
	public void mult(){ 
			if (p.size()>1){
				double resultat=0;
				double n1= (Double)p.pop();
				double n2= (Double)p.pop();
				resultat=n1*n2;
				p.push(resultat);
			}
		}
	// effectue la division des 2 derniers nombres de la pile
	public void div(){
		if (p.size()>1){
			double resultat=0;
			double n1= (Double)p.pop();
			double n2= (Double)p.pop();
			if(n1==0) { System.out.println("erreur");
					  }
			else{
			resultat=n2/n1;
			p.push(resultat);
			}
		} 
	}	
}
