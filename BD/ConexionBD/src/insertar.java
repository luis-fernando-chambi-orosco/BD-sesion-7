import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class insertar {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("INSERT INTO arbitros VALUES(?,?,?,?,?,?)");
			stm.setInt(1, 107);
			stm.setString(2, "Diego jkjkleonel");
			stm.setString(3, "Nacional");
			stm.setString(4, "75134456");
			stm.setInt(5, 23);
			stm.setString(6, "A");
			stm.executeUpdate();
			System.out.println("se a creado un nuevo arbitro");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}


}

