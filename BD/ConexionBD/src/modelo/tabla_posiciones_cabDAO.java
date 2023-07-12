package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class tabla_posiciones_cabDAO {
    Conexion conec = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public List Listar() {
		String sql = "select * from tabla_posiciones_cab";
		List<tabla_posiciones_cab> lista = new ArrayList<>();
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				tabla_posiciones_cab tabPos = new tabla_posiciones_cab();
				tabPos.setCodigo(rs.getInt(1));
				tabPos.setCodigo_liga(rs.getInt(2));;
				tabPos.setEstado(rs.getString(3));
				lista.add(tabPos);
			}

		} catch (SQLException e) {
			System.out.println("error mostrar la lista" + e);
		}
		return lista;
	}

	public void agregar(tabla_posiciones_cab tabPos) {
		String sql = "insert into tabla_posiciones_cab value (?,?,?)";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, tabPos.getCodigo());
			ps.setInt(2, tabPos.getCodigo_liga());
			ps.setString(7, tabPos.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar" + e);
		}
	}

	public void actualizar(tabla_posiciones_cab tabPos) {
		String sql = "UPDATE tabla_posiciones_cab SET TabPosLigCod=?,TabPosEstReg=?  WHERE TabPosCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, tabPos.getCodigo_liga());
			ps.setString(2, tabPos.getEstado());
			ps.setInt(3, tabPos.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void dejarInactivo(tabla_posiciones_cab tabPos) {
		String sql = "UPDATE tabla_posiciones_cab SET TabPosEstReg=? WHERE TabPosCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPos.getEstado());
			ps.setInt(2, tabPos.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void volverActivo(tabla_posiciones_cab tabPos) {
		String sql = "UPDATE tabla_posiciones_cab SET TabPosEstReg=? WHERE TabPosCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPos.getEstado());
			ps.setInt(2, tabPos.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borradoLogico(tabla_posiciones_cab tabPos) {
		String sql = "UPDATE tabla_posiciones_cab SET TabPosEstReg=? WHERE TabPosCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPos.getEstado());
			ps.setInt(2, tabPos.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borrar(int id) {
		String sql = "delete from tabla_posiciones_cab where TabPosCod=" + id;
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
