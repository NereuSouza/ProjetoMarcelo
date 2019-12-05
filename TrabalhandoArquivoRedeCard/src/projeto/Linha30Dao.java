package projeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Linha30Dao implements ILinha{

	@Override
	public void insertLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
		System.out.println("linha 030: ");
		System.out.println();
		//TRABALHANDO DATA
		String diaTr = linha.substring(3, 5);
		String mesTr = linha.substring(5, 7);
		String anoTr = linha.substring(7, 11);

		String dataTr = anoTr + "-" + mesTr + "-" + diaTr;

		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		try {
			Date data = sdf.parse(dataTr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("data:" + dataTr);
		
		//---------------------------------------------------
		String operadora = linha.substring(11, 19);
		System.out.println(operadora);
		String oqueFaz = linha.substring(19, 53);
		System.out.println(oqueFaz);
		String nomeComercial = linha.substring(53, 75);
		System.out.println(nomeComercial);
		String sequenciaMovimento = linha.substring(75, 81);
		System.out.println(sequenciaMovimento);
		String numeroPVMatriz = linha.substring(81, 90);
		System.out.println(numeroPVMatriz);
		String tipoProcessamento = linha.substring(90, 105);
		System.out.println(tipoProcessamento);
		String versao = linha.substring(105, 125);
		System.out.println(versao);
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
