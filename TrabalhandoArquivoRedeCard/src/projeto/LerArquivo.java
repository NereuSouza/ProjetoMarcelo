package projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;




public class LerArquivo {

	public static void main(String[] args) throws ParseException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Para ler o arquivo digite 1, para ver a soma dos valores lançados digite 2."));
		
		if(opcao == 1) {
		Linha30Dao linha30 = new Linha30Dao();
		Linha32Dao linha32 = new Linha32Dao();
		Linha34Dao linha34 = new Linha34Dao();

		File arquivo1 = new File("C:\\Users\\nereu.souza\\Downloads\\NEFI_TESTE_1908.TXT");
		FileReader fr = new FileReader(arquivo1);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {

			String linha = br.readLine();
			String tipoDeRegistro = linha.substring(0, 3);

			switch (tipoDeRegistro) {
		case "030":

				linha30.insertLinhaBanco(linha);

		case "032":

				linha32.insertLinhaBanco(linha);

		case "034":

				linha34.insertLinhaBanco(linha);

			}

		}
		br.close();
		fr.close();

		System.out.println("fim");
		
		}else if (opcao ==2) {
			
			JOptionPane.showMessageDialog(null, SomaValores.somaValores());
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Opção errada");
		}

	}

	

}
