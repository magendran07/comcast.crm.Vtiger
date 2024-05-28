package com.comcast.crm.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class databaseUtilityTest {
 Connection con;
	 static ResultSet result = null;
	
	public  void getConnections(String url,String userName,String Password) throws SQLException {
	
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
	 con=DriverManager.getConnection(url, userName, Password);
	}
	
	public  void closeConnection() throws SQLException {
		con.close();
	}
	
	public  ResultSet getselectQuery(String Query) throws SQLException {
		
		try{
		Statement stat=con.createStatement();
		result=stat.executeQuery(Query);
	
		}
		catch(Exception e) {	
			System.out.println(e);
		}
		System.out.println(result.next());
		return result;
	
	}
	public  int nonselectQuery(String Query) throws SQLException {
		Statement stat=con.createStatement();
	int result=stat.executeUpdate(Query);
	return result;	
	}
	public void getColunmDetails(int colunmNum,String Query) throws SQLException {
		try {
		Statement stat=con.createStatement();
		result=stat.executeQuery(Query);
	while(result.next()) {
		String colunmDetails=result.getString(colunmNum);
		System.out.println(colunmDetails);
		}
		}
		catch(Exception e) {	
			System.out.println(e);
		}
		
	}
	
	

}
