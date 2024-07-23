import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLExample {
    public static void main(String[] args) {
        try {

            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        String url = "jdbc:postgresql://localhost:5432/Mergen";
        String user = "postgres";
        String password = "emir0533";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Veritabanına başarıyla bağlandı!");

                Statement statement = conn.createStatement();
                String query = "SELECT * FROM accounts";
                ResultSet rs = statement.executeQuery(query);

                while (rs.next()) {
                    int userId = rs.getInt("user_id");
                    String username = rs.getString("username");
                    String email = rs.getString("email");
                    System.out.println("UserID: " + userId + ", Username: " + username + ", Email: " + email);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
