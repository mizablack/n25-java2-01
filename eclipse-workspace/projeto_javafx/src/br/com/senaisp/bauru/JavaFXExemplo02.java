package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXExemplo02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		// CRIAR O TRIANGULO
		Polygon triangulo = new Polygon(new double[] {
				210.0, 10.0,
				210.0, 210.0,
				10.0, 210.0
				
		});
		triangulo.setFill(Color.rgb(0, 0, 255,0.5));
		triangulo.setLayoutX(200);
		triangulo.setLayoutY(200);
		//ADICIONANDO O TRIANGULO AO GROUP
		noRoot.getChildren().addAll(triangulo);// ADICIONANDO O BOTÃO NO PAINEL
		//criando a cena
		Scene cena = new Scene(noRoot, 400, 400,Color.LIGHTBLUE);
		primaryStage.setTitle("Formas JavaFX");
		primaryStage.setScene(cena);//ATRIBUINDO A CENA PARA A JANELA
		primaryStage.show();


	}

	public static void main(String[] args) {
		launch(args);
	}

}
