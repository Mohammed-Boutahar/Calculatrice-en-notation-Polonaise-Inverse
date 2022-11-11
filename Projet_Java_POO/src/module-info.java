module Projet_Java_POO_v2 {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	
	opens vue to javafx.graphics, javafx.fxml;
}
