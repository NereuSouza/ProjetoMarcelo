package projeto;

import java.sql.SQLException;
import java.text.ParseException;

import com.mysql.jdbc.PreparedStatement;

public class Linha34Dao implements ILinha {

	@Override
	public void insertLinhaBanco(String linha) throws SQLException, ParseException {
		
		
		int numPVC =Integer.parseInt( linha.substring(3, 12));
		
		int numDoc = Integer.parseInt(linha.substring(12, 23));
		
		String dataLanc = linha.substring(23, 32);
		
		int valorLanc =Integer.parseInt( linha.substring(32, 46));
		
		String Cred = linha.substring(46, 48);
		
		int Banco = Integer.parseInt(linha.substring(48, 51));
		
		int Agencia = Integer.parseInt(linha.substring(51, 57));
		
		int ContaC = Integer.parseInt(linha.substring(57, 68));
		
		String dataMovi = linha.substring(67, 75);
		
		int numRV = Integer.parseInt(linha.substring(76, 85));
		
		String dataRV = linha.substring(84, 92);
		
		int band = Integer.parseInt(linha.substring(93, 94));
		
		int tipoTrans = Integer.parseInt(linha.substring(94, 95));
		
		int valorBrutoRV = Integer.parseInt(linha.substring(95, 110));
		
		int valorTaxaDesc = Integer.parseInt(linha.substring(110, 125));
		
		String numParc = linha.substring(125, 130);
		
		String statusCred = linha.substring(130, 132);
		
		int numPvOrig = Integer.parseInt(linha.substring(132, 140));
		
	
		
		Conexao con = new Conexao();
		
		PreparedStatement stmt = (PreparedStatement) con.getConexao().prepareStatement("INSERT INTO reg34 (num_pv_cen,num_doc,dt_lanc,val_lanc,c_cred,num_banc,num_agen,num_cont_corr,dt_mov,num_rv,dt_rv,bandeira,tp_trans,val_bruto_rv,val_taxa_desc,num_parcelas,status_cred,num_pv_original) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		stmt.setInt(1, numPVC);
		stmt.setInt(2, numDoc);
		stmt.setString(3, dataLanc);
		stmt.setInt(4, valorLanc);
		stmt.setString(5, Cred);
		stmt.setInt(6, Banco);
		stmt.setInt(7, Agencia);
		stmt.setInt(8, ContaC);
		stmt.setString(9, dataMovi);
		stmt.setInt(10, numRV);
		stmt.setString(11, dataRV);
		stmt.setInt(12, band);
		stmt.setInt(13, tipoTrans);
		stmt.setInt(14, valorBrutoRV);
		stmt.setInt(15, valorTaxaDesc);
		stmt.setString(16, numParc);
		stmt.setString(17, statusCred);
		stmt.setInt(18, numPvOrig);
		stmt.execute();
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
