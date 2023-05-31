package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUpdateDelete {
	Connection con = null;
	Statement st;

	InsertUpdateDelete() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void insert() throws SQLException {
		st = con.createStatement();
		int a = st.executeUpdate("insert into customer values(7,'pinky','87987878','female','pinky@gmail.com')");
		System.out.println(a + " row inserted");
	}

	void show() throws SQLException {
		st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
		}
	}

	void update() throws SQLException {
		st = con.createStatement();
		int a = st.executeUpdate("update customer set mobile_numb='98989898' where cust_id=5");
		System.out.println(a + " row updated");
	}

	void delete() throws SQLException {
		st = con.createStatement();
		int a = st.executeUpdate("delete from customer where cust_id=2");
		System.out.println(a + " row deleted");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertUpdateDelete i = new InsertUpdateDelete();
		i.insert();
		i.update();
		i.delete();
		i.show();

	}
}
