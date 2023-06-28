import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class insertarEQU {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("INSERT INTO equipos VALUES(?,?,?)");
			stm.setInt(1, 3009);
			stm.setString(2, "Atletico Characato");
			stm.setString(3, "A");
			stm.executeUpdate();
			System.out.println("se a creado un nuevo equipo");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}


}

