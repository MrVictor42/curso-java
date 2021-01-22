package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		
		try {
			Properties props = getProperties();
			final String url = props.getProperty("banco.url");
			final String usuario = props.getProperty("banco.usuario");
//			final String senha = props.getProperty("banco.senha");
			
			Connection conexao = DriverManager.getConnection(url, usuario, "bgatahkei3010");
			
			return conexao;
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}