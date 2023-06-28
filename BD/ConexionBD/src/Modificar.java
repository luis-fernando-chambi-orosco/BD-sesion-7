import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Modificar {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		ResultSet rs=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("UPDATE arbitros set ArbEda=? WHERE ArbCod=?");
			stm.setInt(1, 15);
			stm.setInt(2, 103);
			stm.executeUpdate();
			System.out.println("se a modficado los datos");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}


}
