package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXExercicio01 extends Application {

	@Override
	public void start(Stage promaryStage) throws Exception {
		
		
		Group noRoot = new Group();
		HBox cmp01 = new HBox();
		Rectangle cmp02  = new Rectangle (100, 100,Color.AQUA);
		Text cmp03 = new Text("Dorm 6:\n200");
		ImageView cmp04 = new ImageView();
		
			Button btn01 = new Button("Botão 1");
			Button btn02 = new Button("Botão 2");
			Button btn03 = new Button("Botão 3");
			///posiionando botoes
			//Eixo x
			btn01.setLayoutX(110);
			btn02.setLayoutX(150);
			//Eixo y 
			btn01.setLayoutY(110);
			btn02.setLayoutY(150);
			
			// CRIANDO O CONTERNER

			//ADICIONANDO BOTÕES NO PAINEL
			root.getChildren().addAll(btn01, btn02);// ADICIONANDO O BOTÃO NO PAINEL
			
			//criando a scena
			
			
			//AMARRANDO A CENA NA TELA
			
			primaryStage.setTitle("Titulo da Janela");
			primaryStage.setScene(cena);//ATRIBUINDO A CENA PARA A JANELA
			primaryStage.show();
			}//fim do método start
		
		
			public static void main(String[] args) {
			launch(args);
			

	}

	
}
