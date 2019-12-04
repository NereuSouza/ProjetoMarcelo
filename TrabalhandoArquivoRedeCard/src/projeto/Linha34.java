package projeto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Linha34 implements ILinha {

	@Override
	public void insertLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		

		String numeroPv = linha.substring(4, 13);
		String numeroDocumento = linha.substring(13, 24);
		String dia = linha.substring(24, 26);
		String mes = linha.substring(26, 28);
		String ano = linha.substring(28, 32);
		String dataTr = ano + "-" + mes + "-" + dia;
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Date data = sdf.parse(dataTr);

		
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}


}
