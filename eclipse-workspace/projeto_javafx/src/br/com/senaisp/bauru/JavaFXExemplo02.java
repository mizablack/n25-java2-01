package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXExemplo02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		// StartX, StartY, EndX, ENDy
		LinearGradient lg =new LinearGradient(0, 1, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[] {
				new Stop(0,Color.WHITE),
				new Stop(0.5,Color.YELLOWGREEN),
				new Stop(1, Color.BLUE)
		});
		RadialGradient rg = new RadialGradient(0, 0, 0.5, 0.5, 1, true, CycleMethod.NO_CYCLE, new Stop [] {
				new Stop(0,Color.YELLOW),
				new Stop(0.25,Color.RED),
				new Stop(0.5, Color.TRANSPARENT)
		});
		// CRIAR O TRIANGULO
		Polygon triangulo = new Polygon(new double[] {
				210.0, 10.0,
				210.0, 210.0,
				10.0, 210.0
				
		});
		//triangulo.setFill(Color.rgb(0, 0, 255,0.5));
		//triangulo.setFill(lg);
		triangulo.setFill(rg);
		triangulo.setLayoutX(50);
		triangulo.setLayoutY(50);
		//ADICIONANDO O TRIANGULO AO GROUP
		noRoot.getChildren().addAll(triangulo);// ADICIONANDO O BOTÃO NO PAINEL
		//criando a cena
		Scene cena = new Scene(noRoot, 400, 400,Color.BLACK);
		primaryStage.setTitle("Formas JavaFX");
		primaryStage.setScene(cena);//ATRIBUINDO A CENA PARA A JANELA
		primaryStage.show();


	}

	public static void main(String[] args) {
		launch(args);
	}

}
