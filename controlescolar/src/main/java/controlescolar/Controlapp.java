package controlescolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controlapp {

	static final String DB_URL = "jdbc:mysql://localhost/school";
	static final String USER = "root";
	static final String PASS = "Chuchomysql_01";

	public static void main(String[] args) throws Exception {

		// static final String QUERY= "//"

		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

}
