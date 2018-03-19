package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbConnection.QueryExecutor;

/**
 *
 * @author Yvan GAKUBA
 */
public class DBConnectionTest {
	public static void main(String[] args) {
		QueryExecutor qex = new QueryExecutor();
		String query="";
		/* 
		 * Testing insert data in a table
			String query = "INSERT INTO category VALUES(?,?,?,?,?)";
			boolean result = qex.insert(query, 2, "CINEMA", "Events regarding movie industry", 1, "2018-03-18");
			System.out.println(result);
		*/
		/*
		 * Testing updating data
			query="UPDATE category SET name=? WHERE category_id=?";
			boolean result=qex.update(query, "SPORT",1);
			System.out.println(result);
		 Testing retrieving data
		 */
		//Testing delete data from a table
			query="DELETE FROM category WHERE category_id=?";
			boolean result=qex.delete(query, 2);
			System.out.println(result);
		try {
			query = "SELECT * FROM category";
			ResultSet rs = qex.getData(query);
			while (rs.next()) {
				System.out.println(rs.getInt("category_id") + " - " + rs.getString("name") + " - "
						+ rs.getString("description") + " - " + rs.getString("created_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		qex.closeConnection();
	}
}
