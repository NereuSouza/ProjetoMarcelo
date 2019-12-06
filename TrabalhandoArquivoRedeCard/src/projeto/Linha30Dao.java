package projeto;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;


public class Linha30Dao implements ILinha{

	@Override
	public void insertLinhaBanco(String linha) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		
		//System.out.println("linha 030: ");
		//System.out.println();
		//TRABALHANDO DATA
		String diaTr = linha.substring(3, 5);
		String mesTr = linha.substring(5, 7);
		String anoTr = linha.substring(7, 11);

		String dataTr = anoTr + "-" + mesTr + "-" + diaTr;

		//SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		//Date data = sdf.parse(dataTr);
		//System.out.println("data:" + dataTr);
		
		//---------------------------------------------------
		String operadora = linha.substring(11, 19);
		//System.out.println(operadora);
		String oqueFaz = linha.substring(19, 53);
		//System.out.println(oqueFaz);
		String nomeComercial = linha.substring(53, 75);
		//System.out.println(nomeComercial);
		int sequenciaMovimento = Integer.parseInt(linha.substring(75, 81));
		//System.out.println(sequenciaMovimento);
		int numeroPVMatriz = Integer.parseInt(linha.substring(81, 90));
		//System.out.println(numeroPVMatriz);
		String tipoProcessamento = linha.substring(90, 105);
		//System.out.println(tipoProcessamento);
		String versao = linha.substring(105, 125);
	//	System.out.println(versao);
		
		
		Conexao con = new Conexao();
			
		PreparedStatement stmt = (PreparedStatement) con.getConexao().prepareStatement("INSERT INTO reg30 (dtEmissao,redeCard,ext_mov_finan,nom_fant,sequ_mov,cod_pv_fan,tp_reproc,version) VALUES (?,?,?,?,?,?,?,?)");
		
		stmt.setString(1, dataTr);
		stmt.setString(2, operadora);
		stmt.setString(3, oqueFaz);
		stmt.setString(4, nomeComercial);
		stmt.setInt(5, sequenciaMovimento);
		stmt.setInt(6, numeroPVMatriz);
		stmt.setString(7, tipoProcessamento);
		stmt.setString(8, versao);
		stmt.execute();
		
		
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
