package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallbleStatment1 {
	Connection con = null;
	CallableStatement cs = null;
	Scanner sc = new Scanner(System.in);

	CallbleStatment1() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void callProcedure() throws SQLException {
		cs = con.prepareCall("{call proc1()}");
		boolean b = cs.execute();

		if (true) {
			ResultSet rs = cs.getResultSet();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			boolean b1 = cs.getMoreResults();
			System.out.println("-----");
			if (true) {
				ResultSet rs1 = cs.getResultSet();
				while (rs1.next()) {
					System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getInt(3));
				}
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallbleStatment1 c = new CallbleStatment1();
		c.callProcedure();
	}
}
