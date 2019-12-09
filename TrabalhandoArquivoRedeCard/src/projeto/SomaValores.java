package projeto;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class SomaValores {
	
	public static String somaValores() throws SQLException {
		
		String soma = null;
		
		Conexao con = new Conexao();
		
		Statement stmt = (Statement) con.getConexao().createStatement();
		
		ResultSet rs= stmt.executeQuery("select sum(val_lanc) as total from reg34");
		while(rs.next()) {
		soma = rs.getString("total");
		}
		return soma ;
		
	}

}
