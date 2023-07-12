package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class resultadosDAO {
    Conexion conec = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public List Listar() {
		String sql = "select * from resultados";
		List<resultados> lista = new ArrayList<>();
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				resultados res = new resultados();
				res.setCodigo(rs.getInt(1));
				res.setPuntos_ganados(rs.getInt(2));
				res.setGoles_favor(rs.getInt(3));
				res.setGoles_contra(rs.getInt(4));
				res.setCodigo_tabla_posiciones_det(rs.getInt(5));
				res.setCodigo_partido(rs.getInt(6));
				res.setEstado(rs.getString(7));
				lista.add(res);
			}

		} catch (SQLException e) {
			System.out.println("error mostrar la lista" + e);
		}
		return lista;
	}

	public void agregar(resultados res) {
		String sql = "insert into resultados value (?,?,?,?,?,?,?)";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, res.getCodigo());
			ps.setInt(2, res.getPuntos_ganados());
			ps.setInt(3, res.getGoles_favor());
			ps.setInt(4, res.getGoles_contra());
			ps.setInt(5, res.getCodigo_tabla_posiciones_det());
			ps.setInt(6, res.getCodigo_partido());
			ps.setString(7, res.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar" + e);
		}
	}

	public void actualizar(resultados res) {
		String sql = "UPDATE resultados SET ResPunGan=?,ResGolFav=?,ResGolCon=?,ResTabPosDetCod=?,ResParCod=?,ResEstReg=?  WHERE ResCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, res.getPuntos_ganados());
			ps.setInt(2, res.getGoles_favor());
			ps.setInt(3, res.getGoles_contra());
			ps.setInt(4, res.getCodigo_tabla_posiciones_det());
			ps.setInt(5, res.getCodigo_partido());
			ps.setString(6, res.getEstado());
			ps.setInt(7, res.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void dejarInactivo(resultados res) {
		String sql = "UPDATE resultados SET ResEstReg=? WHERE ResCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, res.getEstado());
			ps.setInt(2, res.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void volverActivo(resultados res) {
		String sql = "UPDATE resultados SET ResEstReg=? WHERE ResCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, res.getEstado());
			ps.setInt(2, res.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borradoLogico(resultados res) {
		String sql = "UPDATE resultados SET ResEstReg=? WHERE ResCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, res.getEstado());
			ps.setInt(2, res.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borrar(int id) {
		String sql = "delete from resultados where ResCod=" + id;
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
