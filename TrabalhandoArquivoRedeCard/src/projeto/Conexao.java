package projeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConexao() {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carro_motorista", "root", "Slave.10");
			System.out.println("Conectado com Suceso!!!");
			
		}catch(SQLException e){
			
			System.err.println("Erro ao conectar!");
		}
		return conn;
	}
	
		

}
