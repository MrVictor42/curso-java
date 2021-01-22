package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String deleteSQL = "DELETE FROM pessoas WHERE codigo > ?";

		System.out.println("Informe o Código da Pessoa: ");
		int codigoPessoa = scanner.nextInt();
		
		
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
		stmt.setInt(1, codigoPessoa);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa Excluída Com Sucesso!");
		} else {
			System.out.println("Nada Feito...");
		}	
		
		System.out.println("Linhas Afetadas: " + contador);
		
		conexao.close();
		scanner.close();
		stmt.close();
	}
}