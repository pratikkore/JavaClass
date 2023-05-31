package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class HashMap1 {
	Connection con;

	HashMap1() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	HashMap<Integer, Customer> al = new HashMap<>();

	void showData() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
		while (rs.next()) {
			Integer id = rs.getInt(1);
			String name = rs.getString(2);
			String mob = rs.getString(3);
			String gen = rs.getString(4);
			String email = rs.getString(5);

			Customer c = new Customer(name, mob, gen, email);
			al.put(id, c);
		}
	}

	void display() {
		System.out.println(al);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		HashMap1 hs = new HashMap1();
		hs.showData();
		hs.display();

	}

}
