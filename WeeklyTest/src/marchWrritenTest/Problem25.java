package marchWrritenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//25.Assume in jdbc connection, preparedStatement and resultSet is used. 
//Show the code where finally block of code is written and you are trying to close all operations

public class Problem25 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "username", "password");

			String sql = "SELECT * FROM mytable";
			preparedStatement = connection.prepareStatement(sql);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");

				System.out.println("ID: " + id + ", Name: " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
