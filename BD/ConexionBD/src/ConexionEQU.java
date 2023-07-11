import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionEQU {

    private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/liga_de_futbol";
    private static final String USUARIO = "root";
    private static final String CLAVE = "3006";

    public Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
        } catch (SQLException e) {
            System.out.println("Error de conexión");
        }
        return conexion;
    }

    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;

        try {
            cn = c1.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM equipos");
            while (rs.next()) {
                int id = rs.getInt("EquCod");
                String nombre = rs.getString("EquNom");
                String estadoRegistro = rs.getString("EquEstReg");

                System.out.println("ID equipo: " + id + ", Nombre: " + nombre + ", Estado de registro: " + estadoRegistro);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta");
        } finally {
            try {
                if (rs != null) rs.close();
                if (stm != null) stm.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión");
            }
        }
    }

}
