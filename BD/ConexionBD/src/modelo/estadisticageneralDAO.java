package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class estadisticageneralDAO {
	Conexion conec= new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public void dejarInactivo(estadisticageneral eve) {
		String sql = "UPDATE estadistica_general SET EstGenEstReg=? WHERE EstGenCod=?";
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

	public void volverActivo(estadisticageneral eve) {
		String sql = "UPDATE estadistica_general SET EstGenEstReg=? WHERE EstGenCod=?";
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
		String sql="select * from estadistica_general";
		List<estadisticageneral> lista = new ArrayList<>();
		try{
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				estadisticageneral ent=new estadisticageneral();
				ent.setCodigo(rs.getInt(1));
				ent.setGoles(rs.getInt(2));
				ent.setAmarillas(rs.getInt(3));
				ent.setRojas(rs.getInt(4));
				ent.setCodigo_liga(rs.getInt(5));
				ent.setEstado(rs.getString(6));
				lista.add(ent);
			}
			
		}catch(SQLException e){
			System.out.println("error mostrar la lista"+e);
		}
		return lista;
	}
	public void agregar(estadisticageneral ent) {
		String sql="insert into estadistica_general value (?,?,?,?,?,?)";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1, ent.getCodigo());
			ps.setInt(2, ent.getGoles());
			ps.setInt(3, ent.getAmarillas());
			ps.setInt(4, ent.getRojas());
			ps.setInt(5, ent.getCodigo_liga());
			String estado = ent.getEstado();
			 if (estado.isEmpty()) {
		            estado = "A";
		        }
		        ps.setString(6, estado);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar"+e);
		}
	}
	public void modificar(estadisticageneral ent) {
		String sql="UPDATE estadistica_general SET EstGenGolNum=?,EstGenTarAma=?,EstGenRoj=?,EstGenCodLig=?, EstGenEstReg=? WHERE EstGenCod=?";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1,ent.getGoles());
			ps.setInt(2,ent.getAmarillas());
			ps.setInt(3,ent.getRojas());
			ps.setInt(4,ent.getCodigo_liga());
			ps.setString(5,ent.getEstado());
			ps.setInt(6, ent.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar"+e);
		}
	}
	public void borrar(int id) {
		String sql="delete from estadistica_general where EstGenCod="+id;
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
