import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionEQU {
	
	private static final String CONTROLADOR="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/liga_de_futbol";
	private static final String USUARIO="root";
	private static final String CLAVE="973298303";
	
	public Connection conectar() {
		Connection conexion=null;
		try {
			Class.forName(CONTROLADOR);
			conexion=DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("conexion ok");
		}catch (ClassNotFoundException e) {
			System.out.println("error al cargar el controlador");
		}catch(SQLException e) {
			System.out.println("error conexion");
		}
		return conexion;
	}
	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		Statement stm=null;
		ResultSet rs=null;
               
		try{
			cn=c1.conectar();
			stm=cn.createStatement();
			rs=stm.executeQuery("SELECT * FROM equipos");
			while(rs.next()){
				int id=rs.getInt(1);
				String a=rs.getString(2);
				String b=rs.getString(3);
				System.out.println("IDequipo:"+id+" Nombre:"+a+" Estado de Registro:"+b);

			}
			
		}catch(SQLException e){
			System.out.println("error");
		}

	}
	

}
