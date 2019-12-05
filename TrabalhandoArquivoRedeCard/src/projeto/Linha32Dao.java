package projeto;

public class Linha32Dao implements ILinha{

	@Override
	public void insertLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("linha 032: ");
		System.out.println();
		String NPVMatriz = linha.substring(3, 12);
		System.out.println(NPVMatriz);
		String NomeComercialDaMatriz  = linha.substring(12, 29);
		System.out.println(NomeComercialDaMatriz);	
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
