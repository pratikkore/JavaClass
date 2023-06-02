package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreParedStatement {
	Connection con = null;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);

	PreParedStatement() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();

	}

	void insert() throws SQLException {
		ps = con.prepareStatement("insert into customer values (?,?,?,?,?,?)");
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		System.out.println("Enter customer name");
		String name = sc.next();
		System.out.println("Enter customer Surname");
		String surName = sc.next();
		System.out.println("Enter customer mobile no");
		String mob = sc.next();
		System.out.println("Enter customer gender");
		String gen = sc.next();
		System.out.println("Enter customer email");
		String email = sc.next();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, surName);
		ps.setString(4, mob);
		ps.setString(5, gen);
		ps.setString(6, email);
		int a = ps.executeUpdate();
		System.out.println(a + " row inserted");
	}

	void show() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5) + " " + rs.getString(6));
		}
	}

	void delet() throws SQLException {
		String deleteQuery = "DELETE FROM customer WHERE cust_id = ?";
		PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);

		System.out.println("Enter customer id");
		int id = sc.nextInt();
		if (id != 0) {
			deleteStmt.setInt(1, id);
			deleteStmt.executeUpdate();
			System.out.println("Succesfully deleted ...");
		}
		deleteStmt.close();

////		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from customer");
//		System.out.println("Enter Customer id which you want to delet ..");
//		int dId = sc.nextInt();
//		ps.setInt(1, dId);
//
//		int c = st.executeUpdate("delete from customer where cust_id  =" + dId);
//		if (c == 0)
//			System.out.println("Customer id doesnot exist");
//		else
//			System.out.println("id Deleted successfully");
//		st.close();
//		con.close();
	}

	void update() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
		System.out.println("Enter Customer first_name to update mobile number : ");
		String fName = sc.next();
		System.out.println("Enter Customer mobile number to update : ");
		int mNum = sc.nextInt();

		int rows = st.executeUpdate("Update customer set mobile_numb=" + mNum + "where first_name=" + fName);
		System.out.println("Rows updated = " + rows);
		st.close();
		con.close();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreParedStatement p = new PreParedStatement();
//		p.insert();
//		p.show();
		p.delet();
//		p.update();
	}

}
