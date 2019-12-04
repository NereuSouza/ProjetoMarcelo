package projeto;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;


public class LerArquivo {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
		Linha30 linha30 = new Linha30();
		Linha32 linha32 = new Linha32();
		Linha34 linha34 = new Linha34();
		
		
		File arquivo1 = new File("C:/Users/NEREU/Downloads/NEFI_TESTE_1908.TXT");
		FileReader fr = new FileReader(arquivo1);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {

		String linha = br.readLine();
		String tipoDeRegistro = linha.substring(0,3);
		
		switch (tipoDeRegistro) {
		case "030":
			
			linha30.insertLinhaBanco(linha);
		/*	
		case "032":
			
			linha32.interpretaLinha(linha);
			
		case "034":
			
			linha34.interpretaLinha(linha);
			*/
		}
		
		/*
		if (tipoDeRegistro.equals("034")) {
			linha34.interpretaLinha(linha);
		}
		*/
		}
		br.close();
		fr.close();
		
		System.out.println("fim");

	}

}
