package com.assign.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HSQLDBConnection {

	public static Connection getConnection() {
		Connection con = null;

		try {
			// Registering the HSQLDB JDBC driver
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			System.out.println("HSQLDB JDBCDriver Loaded");
			// Creating the connection with HSQLDB
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/Test", "SA", "");
			if (con != null) {
				System.out.println("Connection created successfully");

			} else {
				System.out.println("Problem with creating connection");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}