package bankrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudentRecord {
	private static final String UPDATE_SQL = "update record set locationID=?,state=? where studentID=?";

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connect = getConnection(); PreparedStatement stmt = connect.prepareStatement(UPDATE_SQL)) {
			System.out.println("Connection Established !!!");

			stmt.setInt(1, 108);
			stmt.setString(2, "MN");
			stmt.setInt(3, 2);
			stmt.executeUpdate();
			System.out.println("Updated Record Successfully !!!");

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
