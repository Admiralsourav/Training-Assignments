package com.cognizant.singleTon;

public class DBConn {

	private DBConn() {
		
	}
	
	private static DBConn dbConn = null;
	
	public static DBConn getInstance() {
		if(dbConn == null)
		{
			dbConn = new DBConn();
		}
		
		return dbConn;
	}
	
}
