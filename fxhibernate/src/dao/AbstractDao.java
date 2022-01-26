package dao;
/**
 * CONEXION GENERAL CON LA BASE DE DATOS
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao {
	
	protected static Connection conn=setconn();
	
	private static Connection setconn() {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neptuno?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "sami",
					"Samifatima1");
			return conn;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			}
  return null;
	}
}

























