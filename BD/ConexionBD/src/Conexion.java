import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	
	private static final String CONTROLADOR="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/liga_de_futbol";
	private static final String USUARIO="root";
	private static final String CLAVE="3006";
	
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
			rs=stm.executeQuery("SELECT * FROM arbitros");
			while(rs.next()){
				int id=rs.getInt(1);
				String a=rs.getString(2);
				String b=rs.getString(3);
				int  c=rs.getInt(4);
				String d=rs.getString(5);
				String e=rs.getString(6);

				
				System.out.println("IDarbitro:"+id+" Nombre:"+a+" Categoria:"+b+" DNI:"+c+" edad:"+d+" Estado de registro:"+e);

			}
			
		}catch(SQLException e){
			System.out.println("error de tabla no encontrada");
		}

	}
	

}
