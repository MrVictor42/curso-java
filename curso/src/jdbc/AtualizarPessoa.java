package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informe o ID da Pessoa: ");
		int codigoPessoa = scanner.nextInt();
		
		String selectSQL = "SELECT * FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigoPessoa);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			System.out.println("Nome Atual é: " + pessoa.getNome());
			scanner.nextLine();
			
			System.out.println("Informe o Novo Nome da Pessoa: ");
			String novoNome = scanner.nextLine();
			
			
			stmt.close();
			
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, pessoa.getCodigo());
			stmt.execute();
			
			System.out.println("Pessoa Alterada Com Sucesso!");
		} else {
			System.out.println("Pessoa Não Encontrada!!");
		}
		
		conexao.close();
		scanner.close();
		stmt.close();
	}
}