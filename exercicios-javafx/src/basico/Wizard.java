package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard :: Passo 01");
		janela.show();
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir p/ Passo2 >>");
		proximoPasso.setOnAction(evento -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		Button proximoPasso = new Button("Ir p/ Passo3 >>");	
		Button proximoAnterior = new Button("<< Voltar p/ Passo 1");

		proximoAnterior.setOnAction(evento -> {
			janela.setScene(passo1);
			janela.setTitle("Wizard :: Passo 01");
		});
		
		proximoPasso.setOnAction(evento -> {
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 03");
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	private void criarPasso3() {
		Button proximoPasso = new Button("Finalizar!");	
		Button proximoAnterior = new Button("<< Voltar p/ Passo 2");

		proximoAnterior.setOnAction(evento -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		
		proximoPasso.setOnAction(evento -> {
			System.exit(0);
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo3 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}