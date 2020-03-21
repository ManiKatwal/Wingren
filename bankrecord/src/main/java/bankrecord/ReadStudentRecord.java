package bankrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadStudentRecord {
	private static final String SELECT_ALL_SQL = "select * from record";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connect = getConnection();
				PreparedStatement stmt = connect.prepareStatement(SELECT_ALL_SQL);
				ResultSet result = stmt.executeQuery()) {

			System.out.println("Connection Established !!!");

			while (result.next()) {
				Integer studentID = result.getInt("studentID");
				String name = result.getString("name");
				Integer LocationID = result.getInt("LocationID");
				String city = result.getString("city");
				System.out.println(studentID + "," + name + " ," + LocationID + " ," + city);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Mani108");
	}

}
