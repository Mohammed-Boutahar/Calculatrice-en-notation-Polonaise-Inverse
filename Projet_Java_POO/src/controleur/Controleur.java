package controleur;

import java.util.List;

import vue.Gui;
import vue.IView;

import modele.Accumulateur;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controleur implements IView, EventHandler<ActionEvent>, PropertyChangeListener {
	
	//Appel aux variables dont on aura besoin
	Accumulateur a = new Accumulateur();;
	Gui gui;
	String L = "";
	int count = 0;
	
	//permet de mettre a jour l'affichage du GUI à partir des opérandes dans la pile p
	public void Update_Pile() {
		if(a.p.size()>=4) {
			gui.getLabel1().setText(a.p.get(a.p.size()-1).toString());
			gui.getLabel2().setText(a.p.get(a.p.size()-2).toString());
			gui.getLabel3().setText(a.p.get(a.p.size()-3).toString());
			gui.getLabel4().setText(a.p.get(a.p.size()-4).toString());
		}
		if(a.p.size()==3) {
			gui.getLabel1().setText(a.p.get(a.p.size()-1).toString());
			gui.getLabel2().setText(a.p.get(a.p.size()-2).toString());
			gui.getLabel3().setText(a.p.get(a.p.size()-3).toString());
			gui.getLabel4().setText("0");
		}
		if(a.p.size()==2) {
			gui.getLabel1().setText(a.p.get(a.p.size()-1).toString());
			gui.getLabel2().setText(a.p.get(a.p.size()-2).toString());
			gui.getLabel3().setText("0");
			gui.getLabel4().setText("0");
		}
		if(a.p.size()==1) {
			gui.getLabel1().setText("Valeur finale  :  " + a.p.get(a.p.size()-1));
			gui.getLabel2().setText("0");
			gui.getLabel3().setText("0");
			gui.getLabel4().setText("0");
		}
	}
	
	
	public Controleur(Gui gui) {
		this.gui=gui;
//------------------------------------------------------------------------------------//
//----------------------------Using Mouse Events--------------------------------------//

		//---------------------------Numbers-----------------------------------//
		//--------------------- 1 2 3 4 5 6 7 8 9-----------------------------//
		
		gui.getButton0().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
		    L+=0;
		    gui.getLabel0().setText(L);
		});
		
		gui.getButton1().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=1;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton2().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=2;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton3().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=3;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton4().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=4;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton5().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=5;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton6().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=6;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton7().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=7;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton8().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=8;
			gui.getLabel0().setText(L);
		});
		
		gui.getButton9().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			L+=9;
			gui.getLabel0().setText(L);
		});
		//------------------------Fin Numbers----------------------------------//
		

		
		//Button Push for entering values(opérandes)
		gui.getButtonPush().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(L=="") {
				gui.getLabel0().setText("Entrez une valeur d'abord");
			}
			else {
				a.p.push(Double.parseDouble(L));
				gui.getLabel0().setText("Valeur suivante");
				
				Update_Pile();
				
				gui.getCounter0().setText("" + a.p.size());
				System.out.println(a.p.toString());
				L="";
				count=0;
			}
		});
		
		//----------------------Operations------------------------------//
		gui.getSomme().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()>1) {
				gui.getLast_op0().setText("+");
			}
			gui.getLabel0().setText("Valeur suivante");
			
			a.add();

			Update_Pile();
			
			gui.getCounter0().setText("" + a.p.size());
		});
		
		gui.getSoustr().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()>1) {
				gui.getLast_op0().setText("-");
			}
			gui.getLabel0().setText("Valeur suivante");
			a.sub();
			
			Update_Pile();
			
			gui.getCounter0().setText("" + a.p.size());
		});
		
		gui.getDiv().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if((Double)a.p.get(a.p.size()-1) == 0.0) {
				gui.getLabel0().setText("Op. impossible (0)");
			}
			else {
				gui.getLabel0().setText("Valeur suivante");
				if(a.p.size()>1) {
					a.div();
					gui.getLast_op0().setText("/");
				}
			}
			
			Update_Pile();
			
			gui.getCounter0().setText("" + a.p.size());
		});
		
		gui.getMultip().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()>1) {
				gui.getLast_op0().setText("*");
			}
			gui.getLabel0().setText("Valeur suivante");
			a.mult();
			
			Update_Pile();

			gui.getCounter0().setText("" + a.p.size());
		});
		
		
		gui.getSquare().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()>0) {
				gui.getLast_op0().setText("²");
				}
			gui.getLabel0().setText("Valeur suivante");
			a.square();
			
			Update_Pile();

			gui.getCounter0().setText("" + a.p.size());
		});
		
		gui.getRacine().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			gui.getLabel0().setText("Valeur suivante");
			a.racine();
			
			if((Double)a.p.get(a.p.size()-1) < 0.0) {
				gui.getLabel0().setText("Op. Impossible (-)");

			}
			else {
				gui.getLabel0().setText("Valeur suivante");
				if(a.p.size()>0) {
					gui.getLast_op0().setText("√");
					}
			}
			
			Update_Pile();
			
			gui.getCounter0().setText("" + a.p.size());
		});
		//--------------------------Fin Opérations--------------------------//
		
		//Virgule
		gui.getVirgule().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(count == 0 & L!="") {
				count++;
				L+=".";
				gui.getLabel0().setText(L);
			}
			else{
				gui.getLabel0().setText("Erreur. Entrez un nombre");
			}
		});
		
		//permet de vider tous les elements (pile, liste, label...) qu'on est en train d'utiliser
		gui.getClear().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("Cleared");
			a.clear();
			gui.getLabel0().setText("Entrez une valeur");
			gui.getLabel1().setText("0");
			gui.getLabel2().setText("0");
			gui.getLabel3().setText("0");
			gui.getLabel4().setText("0");
			gui.getCounter0().setText("0");
			gui.getLast_op0().setText("");
			L="";
			count=0;
		});
		
		//change la position des deux dernieres opérandes
		gui.getSwap().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			if(a.p.size()==0) {
				System.out.println("La pile est vide");
			}
			else {
				System.out.println("Swaped");
				a.swap();
				System.out.println(a.p.toString());
			}
			
			Update_Pile();
		});
		
		//signe opposé
		gui.getInverse().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			System.out.println("inversion du signe de la derniere valeur");
			a.neg();
			
			Update_Pile();
			
			System.out.println(a.p.toString());
		});
	

//------------------------------------------------------------------------------------//
//------------------------------------------------------------------------------------//
//----------------------------Using Key Events--------------------------------------//
		
		//---------------------------Numbers-----------------------------------//
		//--------------------- 1 2 3 4 5 6 7 8 9-----------------------------//
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD0) {
				    L+=0;
				    gui.getLabel0().setText(L);
				}
			});

			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e-> {
				if (e.getCode() == KeyCode.NUMPAD1) {
			    L+=1;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD2) {
			    L+=2;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD3) {
			    L+=3;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD4) {
			    L+=4;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD5) {
			    L+=5;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD6) {
			    L+=6;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD7) {
			    L+=7;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD8) {
			    L+=8;
			    gui.getLabel0().setText(L);
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.NUMPAD9) {
			    L+=9;
			    gui.getLabel0().setText(L);
				}
			});
			
	//-----------------------------Fin Numbers----------------------------------//
		
	//---------------------------Push Button------------------------------------//
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.SPACE) {
					if(L=="") {
						gui.getLabel0().setText("Entrez une valeur d'abord");
					}
					else {
						a.p.push(Double.parseDouble(L));
						gui.getLabel0().setText("Valeur suivante");
						Update_Pile();

						System.out.println(a.p.toString());
						
						gui.getCounter0().setText("" + a.p.size());

						L="";
						count=0;
					}
				}
			});
				
			
		//----------------------------Operations------------------------------//
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.P | e.getCode() == KeyCode.PLUS) {
					gui.getLabel0().setText("Valeur suivante");
					
					a.add();

					Update_Pile();

					gui.getCounter0().setText("" + a.p.size());
					gui.getLast_op0().setText("+");
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.M | e.getCode() == KeyCode.MINUS) {
					gui.getLabel0().setText("Valeur suivante");
					a.sub();
					
					Update_Pile();

					gui.getCounter0().setText("" + a.p.size());
					gui.getLast_op0().setText("-");
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.DIVIDE) {
					if((Double)a.p.get(a.p.size()-1) == 0.0) {
						gui.getLabel0().setText("Op. impossible (0)");
					}
					else {
						gui.getLabel0().setText("Valeur suivante");
						if(a.p.size()>1) {
							a.div();
							gui.getLast_op0().setText("/");
						}
					}
					
					Update_Pile();

					gui.getCounter0().setText("" + a.p.size());
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.MULTIPLY) {
					gui.getLabel0().setText("Valeur suivante");
					a.mult();
					
					Update_Pile();
					
					gui.getCounter0().setText("" + a.p.size());
					gui.getLast_op0().setText("*");
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.C) {
					if(a.p.size()>0) {
						gui.getLast_op0().setText("²");
						}
					gui.getLabel0().setText("Valeur suivante");
					a.square();
					
					Update_Pile();

					gui.getCounter0().setText("" + a.p.size());
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.R) {
					
					gui.getLabel0().setText("Valeur suivante");
					a.racine();
					
					if((Double)a.p.get(a.p.size()-1) < 0.0) {
						gui.getLabel0().setText("Op. Impossible (-)");

					}
					else {
						gui.getLabel0().setText("Valeur suivante");
						if(a.p.size()>0) {
							gui.getLast_op0().setText("√");
							}
					}
					
					Update_Pile();
					
					gui.getCounter0().setText("" + a.p.size());
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.W) {
					if(a.p.size()==0) {
						System.out.println("La pile est vide");
					}
					else {
						System.out.println("Swaped");
						a.swap();
						System.out.println(a.p.toString());
					}
					Update_Pile();
				}
			});
	//------------------------------Fin Opérations--------------------------//
			
	
			
	//inverse le signe du dernier élement
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.I ) {
					System.out.println("inversion du signe de la derniere valeur");
					a.neg();
					
					Update_Pile();
					
					System.out.println(a.p.toString());
				}
			});
			
	//Virgule
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.COMMA | e.getCode() == KeyCode.PERIOD | 
						e.getCode() == KeyCode.DECIMAL) {
					if(count == 0 & L!="") {
						count++;
						L+=".";
						gui.getLabel0().setText(L);
					}
					else{
						gui.getLabel0().setText("Erreur. Entrez un nombre");
					}
				}
			});
			
			gui.getKeyboard().addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.BACK_SPACE) {
					System.out.println("Cleared");
					a.clear();
					gui.getLabel0().setText("Entrez une valeur");
					gui.getLabel1().setText("0");
					gui.getLabel2().setText("0");
					gui.getLabel3().setText("0");
					gui.getLabel4().setText("0");
					gui.getCounter0().setText("0");
					gui.getLast_op0().setText("");
					L="";
					count=0;
					System.out.println(a.p.toString());
				}
			});
		
			
	//Change le mode entre Clavier et Souris
			gui.getKeyboard().addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
				if(gui.getKeyboard().getText() == "KeyBoard") {
					gui.getKeyboard().setText("Mouse Mode");
					gui.getSomme().setText("+ / P");
					gui.getSoustr().setText("- / M");
					gui.getSquare().setText("² / C");
					gui.getRacine().setText("√ / R");
					gui.getClear().setText("<--");
					gui.getSwap().setText("W");
					gui.getInverse().setText("+/- / I");
					
				}
				else {
					gui.getKeyboard().setText("KeyBoard");
					gui.getSomme().setText("+");
					gui.getSoustr().setText("-");
					gui.getSquare().setText("²");
					gui.getRacine().setText("√");
					gui.getClear().setText("Clear");
					gui.getSwap().setText("Swap");
					gui.getInverse().setText("+/-");
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
