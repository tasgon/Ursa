package org.tasgo.jcurse.data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Connection connection;
	private Statement statement;

	public Database(String loc) throws SQLException {
		connection = DriverManager.getConnection("jdbc:sqlite:" + loc);
		statement = connection.createStatement();
		
		initTable();
	}
	
	private void initTable() throws SQLException {
		statement.executeUpdate("CREATE TABLE Profiles"
				+ "(Name varchar(255) UNIQUE, Type int, Data varchar(255)) IF NOT EXISTS Profiles");
	}
	
	public boolean verifyProfile(Profile profile) {
		return true;
	}
}
