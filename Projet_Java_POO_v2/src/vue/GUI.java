package vue;
	
import java.io.FileInputStream;

import controleur.Controleur;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modele.Accumulateur;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


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

	public void button_style(Button b) {
		b.setFont(Font.font("Arial", FontWeight.BOLD, 15));
	}
	
	@Override
	public void start(Stage stage) {
		try {
			
			AnchorPane root = new AnchorPane();
			
			Scene scene = new Scene(root,350,400);
			
			   //Import image
	        //Creating an image 
	        Image image1 = new Image(new FileInputStream("src/vue/licorne.png"));  
	        Image image2 = new Image(new FileInputStream("src/vue/paillettes.png"));
	        Image image3 = new Image(new FileInputStream("src/vue/rect_vide.png")); 
	        Image image4 = new Image(new FileInputStream("src/vue/rect_vide.png")); 
	        Image image5 = new Image(new FileInputStream("src/vue/rect_vide.png")); 
	        Image image6 = new Image(new FileInputStream("src/vue/rect_vide.png")); 
	        Image image7 = new Image(new FileInputStream("src/vue/rect.png")); 
	        Image image8 = new Image(new FileInputStream("src/vue/rect.png")); 

	        
	        //Setting the image view 
	        ImageView imageView1 = new ImageView(image1);
	        ImageView imageView2 = new ImageView(image2);
	        ImageView imageView3 = new ImageView(image3);
	        ImageView imageView4 = new ImageView(image4);
	        ImageView imageView5 = new ImageView(image5);
	        ImageView imageView6 = new ImageView(image6);
	        ImageView imageView7 = new ImageView(image7);
	        ImageView imageView8 = new ImageView(image8);
	        
	        //Setting the position of the image 
	        imageView1.setX(210); 
	        imageView1.setY(80); 
	        imageView2.setX(0); 
	        imageView2.setY(190);
	        
	        imageView3.setX(-10); 
	        imageView3.setY(-8); 
	        imageView4.setX(-10); 
	        imageView4.setY(30); 
	        imageView5.setX(-10); 
	        imageView5.setY(70); 
	        imageView6.setX(-10); 
	        imageView6.setY(110); 
	        imageView7.setX(0); 
	        imageView7.setY(180); 
	        imageView8.setX(180); 
	        imageView8.setY(-145); 
	
	        //setting the fit height and width of the image view 
	        imageView1.setFitHeight(100); 
	        imageView1.setFitWidth(150); 
	        imageView2.setFitHeight(400); 
	        imageView2.setFitWidth(400); 
	        
	        imageView3.setFitHeight(50); 
	        imageView3.setFitWidth(200); 
	        imageView4.setFitHeight(50); 
	        imageView4.setFitWidth(200); 
	        imageView5.setFitHeight(50); 
	        imageView5.setFitWidth(200); 
	        imageView6.setFitHeight(50); 
	        imageView6.setFitWidth(200); 
	        imageView7.setFitHeight(10); 
	        imageView7.setFitWidth(350); 
	        imageView8.setFitHeight(475); 
	        imageView8.setFitWidth(3); 
	        
	        root.getChildren().addAll(imageView1, imageView2, imageView3, 
	        		imageView4, imageView5, imageView6, imageView7, imageView8);
			
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
			swap = new Button("Swap");
			button_style(button0);
			button_style(button1);
			button_style(button2);
			button_style(button3);
			button_style(button4);
			button_style(button5);
			button_style(button6);
			button_style(button7);
			button_style(button8);
			button_style(button9);
			button_style(virgule);
			button_style(somme);
			button_style(soustr);
			button_style(multip);
			button_style(div);
			button_style(square);
			button_style(racine);
			button_style(inverse);
			button_style(swap);
			
			clear = new Button("Clear");
			clear.setStyle("-fx-font: 15 arial; -fx-base: #C2FFF5;");

			keyboard = new Button("KeyBoard");
			keyboard.setStyle("-fx-font: 15 arial; -fx-base: #DB7093;");

			buttonPush = new Button("<>");
			buttonPush.setStyle("-fx-font: 15 arial; -fx-base: #C71585;");


			
			root.getChildren().addAll(button0, button1, button2,button3,button4,button5,button6,button7,button8,button9,div,inverse,
					multip,somme,soustr,buttonPush,virgule, clear, swap, keyboard, square, racine);

			
			//Position bouton +
		    AnchorPane.setBottomAnchor(somme, 145.0);
		    AnchorPane.setLeftAnchor(somme, 280.0);
		    AnchorPane.setRightAnchor(somme, 10.0);
		    
			//Position bouton -
		    AnchorPane.setBottomAnchor(soustr, 110.0);
		    AnchorPane.setLeftAnchor(soustr, 280.0);
		    AnchorPane.setRightAnchor(soustr, 10.0);
		    
			//Position bouton *
		    AnchorPane.setBottomAnchor(multip, 75.0);
		    AnchorPane.setLeftAnchor(multip, 280.0);
		    AnchorPane.setRightAnchor(multip, 10.0);
		    
			//Position bouton /
		    AnchorPane.setBottomAnchor(div, 40.0);
		    AnchorPane.setLeftAnchor(div, 280.0);
		    AnchorPane.setRightAnchor(div, 10.0);
		    
			//Position bouton ,
		    AnchorPane.setBottomAnchor(virgule, 40.0);
		    AnchorPane.setLeftAnchor(virgule, 100.0);
		    AnchorPane.setRightAnchor(virgule, 190.0);
		    
			//Position bouton +/-
		    AnchorPane.setBottomAnchor(inverse, 40.0);
		    AnchorPane.setLeftAnchor(inverse, 190.0);
		    AnchorPane.setRightAnchor(inverse, 100.0);
		    
			//Position bouton <>
		    AnchorPane.setBottomAnchor(buttonPush, 5.0);
		    AnchorPane.setLeftAnchor(buttonPush, 10.0);
		    AnchorPane.setRightAnchor(buttonPush, 190.0);
		    
			//Position bouton zero
		    AnchorPane.setBottomAnchor(getButton0(), 40.0);
		    AnchorPane.setLeftAnchor(getButton0(), 10.0);
		    AnchorPane.setRightAnchor(getButton0(), 280.0);
		    
			//Position bouton un
		    AnchorPane.setBottomAnchor(button1, 145.0);
		    AnchorPane.setLeftAnchor(button1, 10.0);
		    AnchorPane.setRightAnchor(button1, 280.0);
		    
		    //Position bouton deux
		    AnchorPane.setBottomAnchor(button2, 145.0);
		    AnchorPane.setLeftAnchor(button2, 100.0);
		    AnchorPane.setRightAnchor(button2, 190.0);
		    
		    //Position bouton trois
		    AnchorPane.setBottomAnchor(button3, 145.0);
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
		    AnchorPane.setBottomAnchor(button7, 75.0);
		    AnchorPane.setLeftAnchor(button7, 10.0);
		    AnchorPane.setRightAnchor(button7, 280.0);
		    
		    //Position bouton huit
		    AnchorPane.setBottomAnchor(button8, 75.0);
		    AnchorPane.setLeftAnchor(button8, 100.0);
		    AnchorPane.setRightAnchor(button8, 190.0);
		    
		    //Position bouton neuf
		    AnchorPane.setBottomAnchor(button9, 75.0);
		    AnchorPane.setLeftAnchor(button9, 190.0);
		    AnchorPane.setRightAnchor(button9, 100.0);
		    
			//Position bouton swap
		    AnchorPane.setBottomAnchor(swap, 5.0);
		    AnchorPane.setLeftAnchor(swap, 185.0);
		    AnchorPane.setRightAnchor(swap, 95.0);
		    
			//Position bouton clear
		    AnchorPane.setBottomAnchor(clear, 5.0);
		    AnchorPane.setLeftAnchor(clear, 275.0);
		    AnchorPane.setRightAnchor(clear, 5.0);
		    
		    //Position bouton keyboard
		    AnchorPane.setBottomAnchor(keyboard, 180.0);
		    AnchorPane.setLeftAnchor(keyboard, 10.0);
		    AnchorPane.setRightAnchor(keyboard, 190.0);
		    
			//Position bouton square
		    AnchorPane.setBottomAnchor(square, 180.0);
		    AnchorPane.setLeftAnchor(square, 190.0);
		    AnchorPane.setRightAnchor(square, 100.0);
		    
			//Position bouton racine
		    AnchorPane.setBottomAnchor(racine, 180.0);
		    AnchorPane.setLeftAnchor(racine, 280.0);
		    AnchorPane.setRightAnchor(racine, 10.0);

		    root.setStyle("-fx-background-color: pink");
			
			Font standard_font = new Font("Arial", 15);
		    
		    label4 = new Label("0");
		    label4.setFont(standard_font);
		    
		    label3 = new Label("0");
		    label3.setFont(standard_font);
		    
		    label2 = new Label("0");
		    label2.setFont(standard_font);
		    
		    label1 = new Label("0");
		    label1.setFont(standard_font);
		    
		    setLabel0(new Label("Valeur en cours"));
		    label0.setTextFill(Color.web("grey"));
		    label0.setFont(Font.font("Arial", FontWeight.BOLD, 15));

		    counter = new Label("Nbr. élement  =");
		    counter.setFont(standard_font);
		    counter0 = new Label("0");
		    counter0.setFont(standard_font);

		    last_op = new Label("Dernière Op.  =");
		    last_op.setFont(standard_font);
		    last_op0 = new Label("");
		    last_op0.setFont(standard_font);
		    
		    label4.relocate(20, 10);
		    label3.relocate(20, 50);
	        label2.relocate(20, 90);
	        label1.relocate(20, 130);
	        label0.relocate(20, 160);
	        last_op.relocate(200, 50);
	        last_op0.relocate(310, 50);
	        counter.relocate(200, 10);
	        counter0.relocate(310, 10);

	        root.getChildren().addAll(label0, label2, label1, label3, label4, 
	        		last_op, last_op0, counter, counter0);
	        
	        
	        
	   //Import controleur
	        Controleur c = new Controleur(this);
	        

			stage.setTitle("Calculatrice Polonaise inverse");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.centerOnScreen();
			stage.show();
			
			
			//----------------------------FIN DU TRY----------------------------------//
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}





	
	// ----------++++----Launch----++++-------------//
		public static void main(String[] args) {
			launch(args);
		}
	// ----------++++--------------++++------------//






	//-------------------------------------------------------------------//
	public Label getLabel0() {
		return label0;
	}
	public void setLabel0(Label Label0) {
		this.label0 = Label0;
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

}
