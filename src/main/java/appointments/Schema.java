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
        String appointmentSql = """
                CREATE TABLE appointments(
                appointment_id INTEGER PRIMARY KEY AUTOINCREMENT,
                patient_id INTEGER NOT NULL,
                FOREIGN KEY(patient_id) REFERENCES patients(patient_id),
                appointment_date TEXT NOT NULL,
                appointment_time TEXT NOT NULL
                )
                """;

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(appointmentSql);
        }

    }
}
