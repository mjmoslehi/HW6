import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private final Connection connection =
            DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "mjm6yhn7ujm");

    public JdbcConnection() throws SQLException {
    }
}
