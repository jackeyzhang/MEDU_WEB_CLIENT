/**
 * 
 */
package data.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrator
 *
 */
public class DB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Connection con = getConn();
			Statement stmt = con.createStatement();
//			stmt.executeUpdate("insert into student values('������',0,'��')");
			String query = "select * from student";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				String name = rs.getString(1);
				int age = rs.getInt(2);
				String sex = rs.getString(3);
				System.out.println(name+":"+age+":"+""+sex);
			}
			
			System.out.println("over");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConn() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url="jdbc:mysql://localhost:3306/new_db?user=root&password=root";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(){
		
	}


}
