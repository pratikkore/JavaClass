package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArrayList1 {
	Connection con;

	ArrayList1() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	ArrayList<String> al = new ArrayList<>();

	void showData() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
		while (rs.next()) {
			al.add(rs.getString(2));
		}
	}

	void display() {
		System.out.println(al);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ArrayList1 al = new ArrayList1();
		al.showData();
		al.display();

	}
}
