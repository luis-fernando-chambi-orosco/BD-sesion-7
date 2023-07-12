package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;


public class fixcabDAO {
	Conexion conec= new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public void dejarInactivo(fixcab cab) {
		String sql = "UPDATE fixture_cab SET FixEstReg=? WHERE FixCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, cab.getEstado());
			ps.setInt(2, cab.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al inactivar" + e);
		}
	}

	public void volverActivo(fixcab cab) {
		String sql = "UPDATE fixture_cab SET FixEstReg=? WHERE FixCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, cab.getEstado());
			ps.setInt(2, cab.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al activar " + e);
		}
	}
	public List Listar() {
		String sql="select * from fixture_cab";
		List<fixcab> lista = new ArrayList<>();
		try{
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				fixcab cab=new fixcab();
				cab.setCodigo(rs.getInt(1));
				cab.setCodigo_liga(rs.getInt(2));
				cab.setEstado(rs.getString(3));
				lista.add(cab);
			}
			
		}catch(SQLException e){
			System.out.println("error mostrar la lista"+e);
		}
		return lista;
	}
	public void agregar(fixcab cab) {
		String sql="insert into fixture_cab value (?,?,?)";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1, cab.getCodigo());
			ps.setInt(2, cab.getCodigo_liga());
			String estado = cab.getEstado();
			 if (estado.isEmpty()) {
		            estado = "A";
		        }
		        ps.setString(3, estado);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar"+e);
		}
	}
	public void modificar(fixcab cab) {
		String sql="UPDATE fixture_cab SET FixLigCod=?,FixEstReg=? WHERE FixCod=?";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1,cab.getCodigo_liga());
			ps.setString(2,cab.getEstado());
			ps.setInt(3,cab.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar"+e);
		}
	}
	public void borrar(int id) {
		String sql="delete from fixture_cab where FixCod="+id;
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al borrar"+e);
		}
	}
}
