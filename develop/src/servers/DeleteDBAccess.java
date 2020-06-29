package servers;

import java.sql.SQLException;

import dao.Dao;

public class DeleteDBAccess {

	public static  int Delete(int id) throws SQLException {
			
			Dao dao = null;
			int result = 0;
			
			try {
				dao = new Dao();
				
				result = dao.deletebook(id);
			}finally {
				if(dao != null) dao.close();
			}
			
			return result;
		
		
	}

}
