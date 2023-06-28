import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class modificacionEQU {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("UPDATE equipos set EquNom=? WHERE EquCod=?");
			stm.setString(1,"UTC de paucarpata");
			stm.setInt(2,3005);
			stm.executeUpdate();
			System.out.println("se a modficado los datos");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}


}
