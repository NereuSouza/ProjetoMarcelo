package projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Linha30 implements ILinha {

	@Override
	public void interpretaLinha(String arquivo) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(arquivo);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {

		String linha = br.readLine();
		String tipoDeRegistro = linha.substring(0,3);
		if (tipoDeRegistro.equals("030")) {
			//System.out.println("Achei");
			//Imprimindo a Data do Cupon
			String diaTr = linha.substring(3, 5);
			String mesTr = linha.substring(5,7);
			String anoTr = linha.substring(7, 11);
			System.out.println("Data: "+diaTr+"/"+mesTr+"/"+anoTr);
			
			//imprimindo a operadora
			String operadora = linha.substring(11, 19);
			System.out.println("Operadora: "+operadora);
			
			
			//imprimindo extrato de movimentação financeira
			String tipo = linha.substring(19, 53);
			System.out.println("Tipo de Arquivo: "+tipo);
		}
		
		}
		br.close();
		fr.close();
		
	}
	

	
	
}
