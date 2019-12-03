package projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Linha34 implements ILinha {

	@Override
	public void interpretaLinha(String linha) throws IOException {
		// TODO Auto-generated method stub

		
				String numeroPv = linha.substring(4, 13);
				String numeroDocumento = linha.substring(13, 24);
				String dia = linha.substring(24, 26);
				String mes = linha.substring(26, 28);
				String ano = linha.substring(28, 32);
				String data = dia + "/" + mes + "/" + ano;
				

			

	}

}
