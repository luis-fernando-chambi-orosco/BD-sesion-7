import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
public class eliminarEQU {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("DELETE FROM equipos WHERE EquCod=?");
			stm.setInt(1, 3002);
			stm.executeUpdate();
			System.out.println("se a elimnado el equipo correctamente");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}
}
