package servers;

import java.sql.SQLException;

import dao.Dao;

public class InputBookDBAccess {

	public static int Insert(String bookTitleInput , String bookWriterInput , String bookCompanyInput) throws SQLException {
		// TODO Auto-generated constructor stub
		Dao dao = null;
		int result = 0;
		
		try {
			dao = new Dao();
			
			result = dao.insertbook(bookTitleInput, bookWriterInput , bookCompanyInput);
		}finally {
			if(dao != null) dao.close();
		}
		
		return result;
	}
}
