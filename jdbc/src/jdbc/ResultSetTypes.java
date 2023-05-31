package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes {
	Connection con = null;
	Statement st = null;

	ResultSetTypes() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	}

	void showfirst() throws SQLException {

		ResultSet rs = st.executeQuery("select * from model");
		rs.first();
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
	}

	void showLast() throws SQLException {

		ResultSet rs = st.executeQuery("select * from model");
		rs.last();
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
	}

	void backward() throws SQLException {
		ResultSet rs = st.executeQuery("select * from model");
		rs.afterLast();
		while (rs.previous()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		}
	}

	void showMid() throws SQLException {
		ResultSet rs = st.executeQuery("select * from model");
		rs.absolute(3);
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

	}

	void update(int id) throws SQLException {
		ResultSet rs = st.executeQuery("select * from model");
		rs.beforeFirst();
		while (rs.next()) {
			int m_id = rs.getInt(1);
			if (m_id == id) {
				rs.updateInt(3, 45200);
			}
			rs.updateRow();
		}

	}

	void delete(int id) throws SQLException {
		ResultSet rs = st.executeQuery("select * from model");
		rs.beforeFirst();
		while (rs.next()) {
			int m_id = rs.getInt(1);
			if (m_id == id) {
				rs.deleteRow();
			}
		}
	}

	void insert() throws SQLException {

		ResultSet rs = st.executeQuery("select * from model");
		rs.moveToInsertRow();
		rs.updateInt(1, 106);
		rs.updateString(2, "bmw");
		rs.updateInt(3, 27500000);
		rs.updateString(4, "2020-02-03");
		rs.insertRow();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ResultSetTypes rs = new ResultSetTypes();
//		rs.showfirst();
//		System.out.println("---last row----");
//		rs.showLast();
//		System.out.println("-----backward----");
//		rs.backward();
//		System.out.println("--- third row---");
//		rs.showMid();

//		rs.update(1004);
		rs.delete(1005);
//		rs.insert();

	}

}
