package bankrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRecord {
	public static final String INSERT_INTO = "insert into record (name,locationId,city,state) values(?,?,?,?)";

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connect = getConnection(); PreparedStatement stmt = connect.prepareStatement(INSERT_INTO)) {

			System.out.println("Connection Established !!!");
			stmt.setString(1, "");
			stmt.setInt(2, 45);
			stmt.setString(3, "Austin");
			stmt.setString(4, "Tx");
			stmt.execute();
			System.out.println("Connection Successful !!!");
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
