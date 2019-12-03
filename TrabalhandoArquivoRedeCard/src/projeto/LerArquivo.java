package projeto;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LerArquivo {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		Linha34 a = new Linha34();
		File arquivo1 = new File("C:/Users/NEREU/Downloads/NEFI_TESTE_1908.TXT");
		FileReader fr = new FileReader(arquivo1);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {

		String linha = br.readLine();
		String tipoDeRegistro = linha.substring(0,3);
		if (tipoDeRegistro.equals("030")) {
			a.interpretaLinha(linha);
		}
		
		}
		br.close();
		fr.close();

	}

}
