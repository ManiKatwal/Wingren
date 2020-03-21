package bankrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertRecord {

	private static final String INSERT_SQL = "insert into customer(firstName,lastName,address,dob,accountNumber) values(?,?,?,?,?)";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connect = getConnection(); PreparedStatement stmt = connect.prepareStatement(INSERT_SQL)) {
			System.out.println("Connection Established");

			stmt.setString(1, "Sobha");
			stmt.setString(2, "Chhetri K");
			stmt.setString(3, "NYK ");
			stmt.setString(4, "11/04/1999");
			stmt.setInt(5, 200036767);
			stmt.execute();

			System.out.println("Insert record Sucessfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bankaccount", "root", "Mani108");
	}

}
