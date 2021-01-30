package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if(emailValido && senhaValida) {
			Notifications.create().position(Pos.TOP_RIGHT)
				.title("LoginJFX").text("Login Efetivado Com Sucesso").showInformation();
		} else {
			Notifications.create().position(Pos.TOP_RIGHT)
				.title("LoginJFX").text("Usuário e Senha Inválidos!").showError();
		}
	}
}