package servers;

import java.sql.SQLException;

import dao.Dao;

public class PurchasePlanDBAccess {
	
	public static int Insert(String bookTitlePlan , String bookWriterPlan , String bookCompanyPlan) throws SQLException {
	
		Dao dao = null;
		int result = 0;
		//Daoがnullなのは何故だ
		try {
			dao = new Dao();
			
			result = dao.purchaseplan(bookTitlePlan, bookWriterPlan , bookCompanyPlan);
		}finally {
			if(dao != null) dao.close();
		}
		
		return result;

	}

}
