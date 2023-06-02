package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {
	Connection con = null;

	AddBatch() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void add() throws SQLException {
		Statement st = con.createStatement();
		st.addBatch("insert into model values(108,'RoyalEnfield',36000,'2012-02-19')");
		st.addBatch("insert into model values(109,'Unicorn',40000,'2021-12-21')");
		st.addBatch("update model set cost=3500000 where model_id=103");
		st.addBatch("delete from model where model_id=106");

		int a[] = st.executeBatch();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "row affected");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AddBatch a = new AddBatch();
		a.add();
	}
}
