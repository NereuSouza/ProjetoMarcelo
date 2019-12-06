package projeto;

import java.sql.SQLException;
import java.text.ParseException;

public interface ILinha {
	
	
	public void insertLinhaBanco(String linha) throws SQLException, ParseException;
	public void selectLinhaBanco(String linha);
	
	
	
}
