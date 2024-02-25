package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConection {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Intenta establecer la conexión
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/a3jpa", "root", "");
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            // Cierra la conexión si se estableció correctamente
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
