import java.sql.*;

public class UpdatePlainJdbcExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test_db";
    static final String USER = "root";
    static final String PASS = "1221";
    static final String QUERY = "UPDATE students SET name=?, age=?, address=? WHERE id=?";

    public static void main(String[] args) {
        String updateName = "장이수2";
        int updateAge = 41;
        String updateAddress = "제주도";
        int whereId = 3;

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(QUERY)) {
            pstmt.setString(1, updateName);
            pstmt.setInt(2, updateAge);
            pstmt.setString(3, updateAddress);
            pstmt.setInt(4, whereId);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
        }
    }
}
