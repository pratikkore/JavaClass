package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 2)
		Class c = null;
		Connection con = null;
		try {
			c = Class.forName("com.mysql.cj.jdbc.Driver");
			// 3)
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom?autoReconnect=true&useSSL=false",
					"root", "ROOT");
			System.out.println("connection established");

			// 4)
			Statement st = con.createStatement();
			// 5)
			ResultSet rs = st.executeQuery("select * from customer");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(4));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
}
