package projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Linha32 implements ILinha {

	@Override
	public void interpretaLinha(String arquivo) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(arquivo);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {

		String linha = br.readLine();
		String tipoDeRegistro = linha.substring(0,3);
		if (tipoDeRegistro.equals("032")) {
			String nPv = linha.substring(4, 13);
			String nomeMatriz = linha.substring(13, 34);
			
			System.out.println("Nome do Ponto de Venda: "+ nPv);
			System.out.println("Nome da matriz: "+ nomeMatriz);
		}
		
		}
		br.close();
		fr.close();
	}
	
	

}
