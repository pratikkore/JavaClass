package marchWrritenTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Problem11 {

	Connection con;

	Problem11() throws ClassNotFoundException, SQLException {
		con = Problem11Connection.getConnection();
	}

	ArrayList<String> al = new ArrayList<>();

	void showData() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from movie where director='sukumar' ");
//		System.out.println(rs);

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			al.add(rs.getString(3));
		}

		System.out.println(al);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Problem11 n = new Problem11();

		n.showData();

	}

}
