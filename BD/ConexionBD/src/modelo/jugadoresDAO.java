package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class jugadoresDAO {
	Conexion conec = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public List Listar() {
		String sql = "select * from jugadores";
		List<jugadores> lista = new ArrayList<>();
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				jugadores jug = new jugadores();
				jug.setCodigo(rs.getInt(1));
				jug.setNombre(rs.getString(2));
				jug.setDni(rs.getString(3));
				jug.setPosicion_jugador(rs.getString(4));
				jug.setCodigo_equipo(rs.getInt(5));
				jug.setNumero_camiseta(rs.getInt(6));
				jug.setEdad(rs.getInt(7));
				jug.setGoles(rs.getInt(8));
				jug.setTargetas_amarillas(rs.getInt(9));
				jug.setTargetas_rojas(rs.getInt(10));
				jug.setEstado(rs.getString(11));
				lista.add(jug);
			}

		} catch (SQLException e) {
			System.out.println("error mostrar la lista" + e);
		}
		return lista;
	}

	public void agregar(jugadores jug) {
		String sql = "insert into jugadores value (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, jug.getCodigo());
			ps.setString(2, jug.getNombre());
			ps.setString(3, jug.getDni());
			ps.setString(4, jug.getPosicion_jugador());
			ps.setInt(5, jug.getCodigo_equipo());
			ps.setInt(6, jug.getNumero_camiseta());
			ps.setInt(7, jug.getEdad());
			ps.setInt(8, jug.getGoles());
			ps.setInt(9, jug.getTargetas_amarillas());
			ps.setInt(10, jug.getTargetas_rojas());
			ps.setString(11, jug.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar" + e);
		}
	}

	public void actualizar(jugadores jug) {
		String sql = "UPDATE jugadores SET JugNom=?,JugDNI=?,JugEquCod=?,JugNumCam=?,JugEda=?,JugEstReg=? WHERE JugCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, jug.getNombre());
			ps.setString(2, jug.getDni());
			ps.setInt(3, jug.getCodigo_equipo());
			ps.setInt(4, jug.getNumero_camiseta());
			ps.setInt(5, jug.getEdad());
			ps.setString(6, jug.getEstado());
			ps.setInt(7, jug.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void dejarInactivo(jugadores jug) {
		String sql = "UPDATE jugadores SET JugEstReg=? WHERE JugCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, jug.getEstado());
			ps.setInt(2, jug.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void volverActivo(jugadores jug) {
		String sql = "UPDATE jugadores SET JugEstReg=? WHERE JugCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, jug.getEstado());
			ps.setInt(2, jug.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borrar(int id) {
		String sql = "delete from jugadores where JugCod=" + id;
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al borrar" + e);
		}
	}
}
