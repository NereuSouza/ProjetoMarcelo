package projeto;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Linha32Dao implements ILinha{

	@Override
	public void insertLinhaBanco(String linha) throws SQLException {
		// TODO Auto-generated method stub
		
		//System.out.println();
		//System.out.println("linha 032: ");
		//System.out.println();
		String NPVMatriz = linha.substring(3, 12);
		//System.out.println(NPVMatriz);
		String NomeComercialDaMatriz  = linha.substring(12, 29);
		//System.out.println(NomeComercialDaMatriz);	
		
		Conexao con = new Conexao();
		
		PreparedStatement stmt = (PreparedStatement) con.getConexao().prepareStatement("INSERT INTO reg32 (cod_pv_fan,nom_fan) VALUES (?,?)");
		
		stmt.setString(1, NPVMatriz);
		stmt.setString(2, NomeComercialDaMatriz);
		stmt.execute();
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
