package controleur;

import java.util.List;
import java.util.Stack;

import vue.GUI;
import vue.IView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import modele.Accumulateur;

//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controleur implements IView, EventHandler<ActionEvent>, PropertyChangeListener {
	
	Accumulateur a = new Accumulateur();;
	GUI gui;
	String L = "";
	int count = 0;
	
	public Controleur(GUI gui) {
		this.gui=gui;

		//---------------------Numbers-----------------------------------------//
		
		gui.getButton0().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
		    System.out.println("ENTER pressed");
		    L+=0;
		    gui.getLabel3().setText(L);
		    System.out.println(L);
		});
		
		gui.getButton1().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=1;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton2().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=2;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton3().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=3;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton4().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=4;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton5().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=5;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton6().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=6;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton7().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=7;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton8().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=8;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		
		gui.getButton9().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("ENTER pressed");
			L+=9;
			gui.getLabel3().setText(L);
			System.out.println(L);
		});
		//---------------Fin Numbers-------------------------------------//
		
		gui.getVirgule().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(count == 0 & L!="") {
				count++;
				L+=".";
				gui.getLabel3().setText(L);
			}
			else{
				System.out.println("Erreur...");
			}
		});
		
		gui.getButtonPush().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(L=="") {
				System.out.println("Entrez une valeur");
			}
			else {
			a.p.push(Double.parseDouble(L));
			gui.getLabel3().setText("Valeur suivante");
			System.out.println(L);
			System.out.println(a.p.toString());
			L="";
			count=0;
			}
		});
		
		//-----Opérations-----
		gui.getSomme().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("pressed");
			gui.getLabel3().setText("Valeur suivante");
			a.add();
			System.out.println(a.p.toString());
		});
		
		gui.getSoustr().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("pressed");
			gui.getLabel3().setText("Valeur suivante");
			a.sub();
			System.out.println(a.p.toString());
		});
		
		gui.getDiv().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("pressed");
			gui.getLabel3().setText("Valeur suivante");
			//a.p.drop();
			a.div();
			System.out.println(a.p.toString());
		});
		
		gui.getMultip().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("pressed");
			gui.getLabel3().setText("Valeur suivante");
			//a.p.drop();
			a.mult();
			System.out.println(a.p.toString());
		});
		
		
		gui.getClear().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("Cleared");
			a.clear();
			gui.getLabel3().setText("");
			L="";
			count=0;
			System.out.println(a.p.toString());
		});
		
		gui.getSwap().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()==0) {
				System.out.println("La pile est vide");
			}
			else {
				System.out.println("Swaped");
				a.swap();
				System.out.println(a.p.toString());
			}
		});
		
		
		
	}
	
	









	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void change(List<String> data) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void change(String accu) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}











	@Override
	public void handle(java.awt.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
