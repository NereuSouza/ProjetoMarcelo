package projeto;

public class Linha34Dao implements ILinha {

	@Override
	public void insertLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("LINHA 034: ");
		System.out.println();
		String NumeroDoPVCentralizador = linha.substring(3, 12);
		System.out.println(NumeroDoPVCentralizador);
		String NumeroDoDocumento = linha.substring(12, 23);
		System.out.println(NumeroDoDocumento);
		String DataDoLançamento = linha.substring(23, 31);
		System.out.println(DataDoLançamento);
		String ValorDoLançamento  = linha.substring(31, 46);
		System.out.println(ValorDoLançamento);
		String C = linha.substring(46, 47);
		System.out.println(C);
		String Banco = linha.substring(47, 50);
		System.out.println(Banco);
		String Agencia = linha.substring(50, 56);
		System.out.println(Agencia);
		String ContaCorrente = linha.substring(56, 67);
		System.out.println(ContaCorrente);
		String  DataDomovimento  = linha.substring(67, 75);
		System.out.println( DataDomovimento );
		String  NumeroDoRV  = linha.substring(75, 84);
		System.out.println( NumeroDoRV );
		String DataDoRV = linha.substring(84, 92);
		System.out.println(DataDoRV);
		String  Bandeira  = linha.substring(92, 93);
		System.out.println( Bandeira );
		String TipoDeTransação  = linha.substring(93, 94);
		System.out.println(TipoDeTransação );
		String  ValorBrutoDoRV = linha.substring(94, 109);
		System.out.println(ValorBrutoDoRV);
		String ValorDaTaxaDeDesconto  = linha.substring(109, 124);
		System.out.println(ValorDaTaxaDeDesconto );
		String NumeroDaParcelaTotal = linha.substring(124, 129);
		System.out.println(NumeroDaParcelaTotal);
		String StatusDoCredito  = linha.substring(129, 131);
		System.out.println(StatusDoCredito );
		String TabelaII  = linha.substring(131, 140);
		System.out.println(TabelaII );
		
	}

	@Override
	public void selectLinhaBanco(String linha) {
		// TODO Auto-generated method stub
		
	}

}
