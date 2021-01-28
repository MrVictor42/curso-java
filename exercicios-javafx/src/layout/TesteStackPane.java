package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	
	public TesteStackPane() {
		
		Caixa c1 = new Caixa().comTexto("Caixa 01");
		Caixa c2 = new Caixa().comTexto("Caixa 02");
		Caixa c3 = new Caixa().comTexto("Caixa 03");
		Caixa c4 = new Caixa().comTexto("Caixa 04");
		Caixa c5 = new Caixa().comTexto("Caixa 05");
		Caixa c6 = new Caixa().comTexto("Caixa 06");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1);
		
		setOnMouseClicked(evento -> {
			if(evento.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});
		
		Thread thread = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(3000);
					Platform.runLater(() -> {
						getChildren().get(0).toFront();											
					});					
				} catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
	}
}