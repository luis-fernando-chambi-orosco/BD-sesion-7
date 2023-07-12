package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class fixdetDAO {
	Conexion conec= new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public void dejarInactivo(fixdet det) {
		String sql = "UPDATE fixture_det SET FixDetEstReg=? WHERE FixDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, det.getEstado());
			ps.setInt(2, det.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al inactivar" + e);
		}
	}

	public void volverActivo(fixdet det) {
		String sql = "UPDATE fixture_det SET FixDetEstReg=? WHERE FixDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, det.getEstado());
			ps.setInt(2, det.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al activar " + e);
		}
	}
	public List Listar() {
		String sql="select * from fixture_det";
		List<fixdet> lista = new ArrayList<>();
		try{
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				fixdet cab=new fixdet();
				cab.setCodigo(rs.getInt(1));
				cab.setCodigo_fixcab(rs.getInt(2));
				cab.setCodigo_partido(rs.getInt(3));
				cab.setEstado(rs.getString(4));
				lista.add(cab);
			}
			
		}catch(SQLException e){
			System.out.println("error mostrar la lista"+e);
		}
		return lista;
	}
	public void agregar(fixdet cab) {
		String sql="insert into fixture_det value (?,?,?,?)";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1, cab.getCodigo());
			ps.setInt(2, cab.getCodigo_fixcab());
			ps.setInt(3, cab.getCodigo_partido());
			String estado = cab.getEstado();
			 if (estado.isEmpty()) {
		            estado = "A";
		        }
		        ps.setString(4, estado);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar"+e);
		}
	}
	public void modificar(fixdet cab) {
		String sql="UPDATE fixture_det SET FixDetFixCod=?,FixParCod=?,FixDetEstReg=? WHERE FixDetCod=?";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1,cab.getCodigo_fixcab());
			ps.setInt(2,cab.getCodigo_partido());
			ps.setString(3,cab.getEstado());
			ps.setInt(4,cab.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar"+e);
		}
	}
	public void borrar(int id) {
		String sql="delete from fixture_det where FixDetCod="+id;
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
