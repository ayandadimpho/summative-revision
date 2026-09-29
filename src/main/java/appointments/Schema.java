package appointments;
import java.sql.Connection;
import java.sql.Statement;

public class Schema {
    public static void createTables(Connection connection) {
        String sql = """
                CREATE TABLE patients(
                patient_id INTEGER PRIMARY KEY AUTOINCREMENT,
                name VARCHAR(100) NOT NULL,
                surname VARCHAR(100) NOT NULL,
                contact VARCHAR(20) NOT NULL
                )
                """;

    }
}
