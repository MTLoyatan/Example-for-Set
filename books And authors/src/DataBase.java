import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/publisher";
	private static final String USER = "root";
	private static final String PASS = "";

	public DataBase() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("connecting to database...");
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ResultSet displayBookswithAuthors() throws Exception {

		String sql = "select * from authors,books,authors_books"
				+ " where authors_books.book_isbn=books.isbn and "
				+ "authors_books.author_id=authors.id";
		ResultSet rs = stmt.executeQuery(sql);

		return rs;

	}

	public void closeConnection() throws SQLException {

		if (con != null)
			con.close();
		if (stmt != null)
			stmt.close();

	}
}
