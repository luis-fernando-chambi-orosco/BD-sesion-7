package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class entrenadorDAO {
Conexion conec= new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
public void dejarInactivo(entrenador eve) {
	String sql = "UPDATE entrenador SET EntEstReg=? WHERE EntCod=?";
	try {
		con = conec.conectar();
		ps = con.prepareStatement(sql);
		ps.setString(1, eve.getEstado());
		ps.setInt(2, eve.getCodigo());
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error" + e);
	}
}

public void volverActivo(entrenador eve) {
	String sql = "UPDATE entrenador SET EntEstReg=? WHERE EntCod=?";
	try {
		con = conec.conectar();
		ps = con.prepareStatement(sql);
		ps.setString(1, eve.getEstado());
		ps.setInt(2, eve.getCodigo());
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error" + e);
	}
}
public List Listar() {
	String sql="select * from entrenador";
	List<entrenador> lista = new ArrayList<>();
	try{
		con=conec.conectar();
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			entrenador ent=new entrenador();
			ent.setCodigo(rs.getInt(1));
			ent.setCodigo_equipo(rs.getInt(2));
			ent.setNombre(rs.getString(3));
			ent.setDni(rs.getString(4));
			ent.setEstado(rs.getString(5));
			lista.add(ent);
		}
		
	}catch(SQLException e){
		System.out.println("error mostrar la lista"+e);
	}
	return lista;
}
public void agregar(entrenador ent) {
	String sql="insert into entrenador value (?,?,?,?,?)";
	try {
		con=conec.conectar();
		ps=con.prepareStatement(sql);
		ps.setInt(1, ent.getCodigo());
		ps.setInt(2, ent.getCodigo_equipo());
		ps.setString(3, ent.getNombre());
		ps.setString(4, ent.getDni());
		String estado = ent.getEstado();
		 if (estado.isEmpty()) {
	            estado = "A";
	        }
	        ps.setString(5, estado);
		ps.executeUpdate();
	} catch (Exception e) {
		System.out.println("error al agregar"+e);
	}
}
public void actualizar(entrenador ent) {
	String sql="UPDATE entrenador SET EntNom=?,EntDNI=?, EntEstReg=? WHERE EntCod=?";
	try {
		con=conec.conectar();
		ps=con.prepareStatement(sql);
		ps.setString(1,ent.getNombre());
		ps.setString(2,ent.getDni());
		ps.setString(3,ent.getEstado());
		ps.setInt(4, ent.getCodigo());
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar"+e);
	}
}
public void borrar(entrenador eve) {
	String sql="UPDATE entrenador SET EntEstReg=? WHERE EntCod=?";
	try {
		con = conec.conectar();
		ps = con.prepareStatement(sql);
		ps.setString(1, eve.getEstado());
		ps.setInt(2, eve.getCodigo());
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al borrar"+e);
	}
}
}
