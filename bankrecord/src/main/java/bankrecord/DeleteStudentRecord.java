package bankrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudentRecord {
	private static final String DELETE_SQL = "delete from record where studentID=?";

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connect = getConnection(); PreparedStatement stmt = connect.prepareStatement(DELETE_SQL)) {

			System.out.println("Connection Established !!!");
			stmt.setInt(1, 4);
			stmt.executeUpdate();
			System.out.println("Record Removed successfully !!!");

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
