package marchWrritenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Problem14 {

	public static void main(String[] args) {
		Connection connection = null;

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

			String sql = "SELECT * FROM mytable";
			preparedStatement = connection.prepareStatement(sql);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				// Retrieve data from each row
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
