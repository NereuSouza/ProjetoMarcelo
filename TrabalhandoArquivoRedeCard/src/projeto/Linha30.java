package projeto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Linha30 implements ILinha {

	
	@Override
	public void insertLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
		String diaTr = linha.substring(3, 5);
		String mesTr = linha.substring(5,7);
		String anoTr = linha.substring(7, 11);
		String dataTr = anoTr + "-" + mesTr + "-" + diaTr;
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Date data = sdf.parse(dataTr);
		
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

	
	
}
