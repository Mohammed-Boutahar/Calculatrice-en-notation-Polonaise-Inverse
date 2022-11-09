package vue;
	
import java.io.FileInputStream;

import controleur.Controleur;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modele.Accumulateur;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class GUI extends Application {
	
	Accumulateur a;
	
	Button button0;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;

	Button virgule;
	Button buttonPush;
	Button swap;
	Button clear;
	
	Button somme;
	Button soustr;
	Button multip;
	Button div;
	Button square;
	Button racine;
	
	Button inverse;
	
	Button keyboard;
	
	Label label0;
	Label label1;
	Label label2;
	Label label3;
	Label label4;
	Label last_op;
	Label last_op0;
	Label counter;
	Label counter0;

	
	@Override
	public void start(Stage stage) {
		try {
			
			AnchorPane root = new AnchorPane();
			
			
			Scene scene = new Scene(root,350,400);
			
			
			button0 = new Button("0");
			button1 = new Button("1");
			button2 = new Button("2");
			button3 = new Button("3");
			button4 = new Button("4");
			button5 = new Button("5");
			button6 = new Button("6");
			button7 = new Button("7");
			button8 = new Button("8");
			button9 = new Button("9");
			virgule = new Button(",");
			somme = new Button("+");
			soustr = new Button("-");
			multip = new Button("*");
			div = new Button("/");
			square = new Button("²");
			racine = new Button("√");
			inverse = new Button("+/-");
			buttonPush = new Button("<>");
			swap = new Button("Swap");
			clear = new Button("Clear");
			
			keyboard = new Button("KeyBoard");

			
			root.getChildren().addAll(getButton0(), getButton1(), button2,button3,button4,button5,button6,button7,button8,button9,div,inverse,
					multip,somme,soustr,buttonPush,virgule, clear, swap, keyboard, square, racine);

			
			//Position bouton +
		    AnchorPane.setBottomAnchor(somme, 150.0);
		    AnchorPane.setLeftAnchor(somme, 280.0);
		    AnchorPane.setRightAnchor(somme, 10.0);
		    
			//Position bouton -
		    AnchorPane.setBottomAnchor(soustr, 110.0);
		    AnchorPane.setLeftAnchor(soustr, 280.0);
		    AnchorPane.setRightAnchor(soustr, 10.0);
		    
			//Position bouton *
		    AnchorPane.setBottomAnchor(multip, 70.0);
		    AnchorPane.setLeftAnchor(multip, 280.0);
		    AnchorPane.setRightAnchor(multip, 10.0);
		    
			//Position bouton /
		    AnchorPane.setBottomAnchor(div, 30.0);
		    AnchorPane.setLeftAnchor(div, 280.0);
		    AnchorPane.setRightAnchor(div, 10.0);
		    
			//Position bouton ,
		    AnchorPane.setBottomAnchor(virgule, 30.0);
		    AnchorPane.setLeftAnchor(virgule, 100.0);
		    AnchorPane.setRightAnchor(virgule, 190.0);
		    
			//Position bouton +/-
		    AnchorPane.setBottomAnchor(inverse, 30.0);
		    AnchorPane.setLeftAnchor(inverse, 190.0);
		    AnchorPane.setRightAnchor(inverse, 100.0);
		    
			//Position bouton <>
		    AnchorPane.setBottomAnchor(buttonPush, 0.0);
		    AnchorPane.setLeftAnchor(buttonPush, 10.0);
		    AnchorPane.setRightAnchor(buttonPush, 190.0);
		    
			//Position bouton zero
		    AnchorPane.setBottomAnchor(getButton0(), 30.0);
		    AnchorPane.setLeftAnchor(getButton0(), 10.0);
		    AnchorPane.setRightAnchor(getButton0(), 280.0);
		    
			//Position bouton un
		    AnchorPane.setBottomAnchor(getButton1(), 150.0);
		    AnchorPane.setLeftAnchor(getButton1(), 10.0);
		    AnchorPane.setRightAnchor(getButton1(), 280.0);
		    
		    //Position bouton deux
		    AnchorPane.setBottomAnchor(button2, 150.0);
		    AnchorPane.setLeftAnchor(button2, 100.0);
		    AnchorPane.setRightAnchor(button2, 190.0);
		    
		    //Position bouton trois
		    AnchorPane.setBottomAnchor(button3, 150.0);
		    AnchorPane.setLeftAnchor(button3, 190.0);
		    AnchorPane.setRightAnchor(button3, 100.0);
		    
			//Position bouton quatre
		    AnchorPane.setBottomAnchor(button4, 110.0);
		    AnchorPane.setLeftAnchor(button4, 10.0);
		    AnchorPane.setRightAnchor(button4, 280.0);
		    
		    //Position bouton cinq
		    AnchorPane.setBottomAnchor(button5, 110.0);
		    AnchorPane.setLeftAnchor(button5, 100.0);
		    AnchorPane.setRightAnchor(button5, 190.0);
		    
		    //Position bouton six
		    AnchorPane.setBottomAnchor(button6, 110.0);
		    AnchorPane.setLeftAnchor(button6, 190.0);
		    AnchorPane.setRightAnchor(button6, 100.0);
		    
			//Position bouton sept
		    AnchorPane.setBottomAnchor(button7, 70.0);
		    AnchorPane.setLeftAnchor(button7, 10.0);
		    AnchorPane.setRightAnchor(button7, 280.0);
		    
		    //Position bouton huit
		    AnchorPane.setBottomAnchor(button8, 70.0);
		    AnchorPane.setLeftAnchor(button8, 100.0);
		    AnchorPane.setRightAnchor(button8, 190.0);
		    
		    //Position bouton neuf
		    AnchorPane.setBottomAnchor(button9, 70.0);
		    AnchorPane.setLeftAnchor(button9, 190.0);
		    AnchorPane.setRightAnchor(button9, 100.0);
		    
			//Position bouton swap
		    AnchorPane.setBottomAnchor(swap, 0.0);
		    AnchorPane.setLeftAnchor(swap, 190.0);
		    AnchorPane.setRightAnchor(swap, 100.0);
		    
			//Position bouton clear
		    AnchorPane.setBottomAnchor(clear, 0.0);
		    AnchorPane.setLeftAnchor(clear, 280.0);
		    AnchorPane.setRightAnchor(clear, 10.0);
		    
		    //Position bouton keyboard
		    AnchorPane.setBottomAnchor(keyboard, 190.0);
		    AnchorPane.setLeftAnchor(keyboard, 10.0);
		    AnchorPane.setRightAnchor(keyboard, 190.0);
		    
			//Position bouton square
		    AnchorPane.setBottomAnchor(square, 190.0);
		    AnchorPane.setLeftAnchor(square, 190.0);
		    AnchorPane.setRightAnchor(square, 100.0);
		    
			//Position bouton racine
		    AnchorPane.setBottomAnchor(racine, 190.0);
		    AnchorPane.setLeftAnchor(racine, 280.0);
		    AnchorPane.setRightAnchor(racine, 10.0);

		    root.setStyle("-fx-background-color: pink");
			
			
		    label4 = new Label("0");
		    label4.setFont(new Font("Arial", 15));
		    
		    label3 = new Label("0");
		    label3.setFont(new Font("Arial", 15));
		    
		    label2 = new Label("0");
		    label2.setFont(new Font("Arial", 15));
		    
		    label1 = new Label("0");
		    label1.setFont(new Font("Arial", 15));
		    
		    setLabel0(new Label("Valeur en cours"));
		    label0.setTextFill(Color.web("grey"));
		    label0.setFont(new Font("Arial", 15));

		    counter = new Label("Nbr. élement  =");
		    counter0 = new Label("0");
		    last_op = new Label("Dernière Op.  =");
		    last_op0 = new Label("");
		    label4.relocate(20, 10);
		    label3.relocate(20, 50);
	        label2.relocate(20, 90);
	        label1.relocate(20, 130);
	        label0.relocate(20, 160);
	        last_op.relocate(220, 60);
	        last_op0.relocate(310, 60);
	        counter.relocate(220, 10);
	        counter0.relocate(310, 10);

	        root.getChildren().addAll(label0, label2, label1, label3, label4, 
	        		last_op, last_op0, counter, counter0);
	        
	   //Import controleur
	        Controleur c = new Controleur(this);
	        
	   //Import image
	        //Creating an image 
	        Image image = new Image(new FileInputStream("src/vue/licorne.png"));  
	        
	        //Setting the image view 
	        ImageView imageView = new ImageView(image); 
	        
	        //Setting the position of the image 
	        imageView.setX(210); 
	        imageView.setY(80); 
	        
	        //setting the fit height and width of the image view 
	        imageView.setFitHeight(100); 
	        imageView.setFitWidth(150); 
	        
	        root.getChildren().add(imageView);
	        
	        
			stage.setTitle("Calculatrice Polonaise inverse");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.centerOnScreen();
			stage.show();
			
			//_0.addEventHandler("ajout 0", a.p.push(0) );
			
			//----------------------------FIN DU TRY----------------------------------//
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}



	public Button getSquare() {
		return square;
	}



	public void setSquare(Button square) {
		this.square = square;
	}



	public Button getRacine() {
		return racine;
	}



	public void setRacine(Button racine) {
		this.racine = racine;
	}



	public Button getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Button keyboard) {
		this.keyboard = keyboard;
	}

	public Label getLabel4() {
		return label4;
	}
	public void setLabel4(Label label4) {
		this.label4 = label4;
	}



	public Label getLast_op0() {
		return last_op0;
	}
	public void setLast_op0(Label last_op0) {
		this.last_op0 = last_op0;
	}



	public Label getCounter0() {
		return counter0;
	}
	public void setCounter0(Label counter0) {
		this.counter0 = counter0;
	}



	public Label getLabel1() {
		return label1;
	}
	public void setLabel1(Label label1) {
		this.label1 = label1;
	}



	public Label getLabel2() {
		return label2;
	}
	public void setLabel2(Label label2) {
		this.label2 = label2;
	}



	public Label getLabel3() {
		return label3;
	}
	public void setLabel3(Label label3) {
		this.label3 = label3;
	}



	//-------------------------------------------------------------------//
	public Label getLabel0() {
		return label0;
	}
	public void setLabel0(Label Label0) {
		this.label0 = Label0;
	}

// ----------++++----Launch----++++-------------
	public static void main(String[] args) {
		launch(args);
	}

//---------------------Getters and Setters of all buttons------------------------------
	public Button getButton0() {
		return button0;
	}
	public void setButton0(Button button0) {
		this.button0 = button0;
	}

	public Button getButton1() {
		return button1;
	}
	public void setButton1(Button button1) {
		this.button1 = button1;
	}
	
	public Button getButton2() {
		return button2;
	}
	public void setButton2(Button button2) {
		this.button2 = button2;
	}
	
	public Button getButton3() {
		return button3;
	}
	public void setButton3(Button button3) {
		this.button3 = button3;
	}

	public Button getButton4() {
		return button4;
	}
	public void setButton4(Button button4) {
		this.button4 = button4;
	}

	public Button getButton5() {
		return button5;
	}
	public void setButton5(Button button5) {
		this.button5 = button5;
	}

	public Button getButton6() {
		return button6;
	}
	public void setButton6(Button button6) {
		this.button6 = button6;
	}

	public Button getButton7() {
		return button7;
	}
	public void setButton7(Button button7) {
		this.button7 = button7;
	}

	public Button getButton8() {
		return button8;
	}
	public void setButton8(Button button8) {
		this.button8 = button8;
	}

	public Button getButton9() {
		return button9;
	}
	public void setButton9(Button button9) {
		this.button9 = button9;
	}
	

	public Button getVirgule() {
		return virgule;
	}
	public void setVirgule(Button virgule) {
		this.virgule = virgule;
	}
	
	public Button getButtonPush() {
		return buttonPush;
	}
	public void setButtonPush(Button buttonPush) {
		this.buttonPush = buttonPush;
	}
	
	public Button getSwap() {
		return swap;
	}
	public void setSwap(Button swap) {
		this.swap = swap;
	}

	public Button getClear() {
		return clear;
	}
	public void setClear(Button clear) {
		this.clear = clear;
	}
	
	public Button getSoustr() {
		return soustr;
	}
	public void setSoustr(Button soustr) {
		this.soustr = soustr;
	}

	public Button getMultip() {
		return multip;
	}
	public void setMultip(Button multip) {
		this.multip = multip;
	}

	public Button getDiv() {
		return div;
	}
	public void setDiv(Button div) {
		this.div = div;
	}

	public Button getInverse() {
		return inverse;
	}
	public void setInverse(Button inverse) {
		this.inverse = inverse;
	}

	public Button getSomme() {
		return somme;
	}
	public void setSomme(Button somme) {
		this.somme = somme;
	}

}

//paillette rose violet licornes