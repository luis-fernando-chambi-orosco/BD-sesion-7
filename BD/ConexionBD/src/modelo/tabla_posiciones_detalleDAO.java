package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class tabla_posiciones_detalleDAO {
    Conexion conec = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public List Listar() {
		String sql = "select * from tabla_posiciones_detalle";
		List<tabla_posiciones_detalle> lista = new ArrayList<>();
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				tabla_posiciones_detalle tabPosDet = new tabla_posiciones_detalle();
				tabPosDet.setCodigo(rs.getInt(1));
				tabPosDet.setCodigo_equipo(rs.getInt(2));
				tabPosDet.setCodigo_tabla_posiciones_cab(rs.getInt(3));
				tabPosDet.setPartidos_jugados(rs.getInt(4));
				tabPosDet.setPartidos_ganados(rs.getInt(5));
				tabPosDet.setPartidos_empatados(rs.getInt(6));
				tabPosDet.setPartidos_perdidos(rs.getInt(7));
				tabPosDet.setGoles_favor(rs.getInt(8));
				tabPosDet.setGoles_contra(rs.getInt(9));
				tabPosDet.setPuntaje(rs.getInt(10));
				tabPosDet.setPuesto(rs.getInt(11));
				tabPosDet.setEstado(rs.getString(12));
				lista.add(tabPosDet);
			}

		} catch (SQLException e) {
			System.out.println("error mostrar la lista" + e);
		}
		return lista;
	}

	public void agregar(tabla_posiciones_detalle tabPosDet) {
		String sql = "insert into tabla_posiciones_detalle value (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, tabPosDet.getCodigo());
			ps.setInt(2, tabPosDet.getCodigo_equipo());
			ps.setInt(3, tabPosDet.getCodigo_tabla_posiciones_cab());
			ps.setInt(4, tabPosDet.getPartidos_jugados());
			ps.setInt(5, tabPosDet.getPartidos_ganados());
			ps.setInt(6, tabPosDet.getPartidos_empatados());
			ps.setInt(7, tabPosDet.getPartidos_perdidos());
			ps.setInt(8, tabPosDet.getGoles_favor());
			ps.setInt(9, tabPosDet.getGoles_contra());
			ps.setInt(10, tabPosDet.getPuntaje());
			ps.setInt(11, tabPosDet.getPuesto());
			ps.setString(12, tabPosDet.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar" + e);
		}
	}

	public void actualizar(tabla_posiciones_detalle tabPosDet) {
		String sql = "UPDATE tabla_posiciones_detalle SET TabPosDetEquCod=?,TabPosDetTabPosCod=?,TabPosDetParJug=?,TabPosDetParGan=?,TabPosDetParEmp=?,TabPosDetParPer=?,TabPosDetGolFav=?,TabPosDetGolCon=?,TabPosDetPun=?,TabPosDetPue=?,TabPosDetEstReg=?, WHERE TabPosDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, tabPosDet.getCodigo_equipo());
			ps.setInt(2, tabPosDet.getCodigo_tabla_posiciones_cab());
			ps.setInt(3, tabPosDet.getPartidos_jugados());
			ps.setInt(4, tabPosDet.getPartidos_ganados());
			ps.setInt(5, tabPosDet.getPartidos_empatados());
			ps.setInt(6, tabPosDet.getPartidos_perdidos());
			ps.setInt(7, tabPosDet.getGoles_favor());
			ps.setInt(8, tabPosDet.getGoles_contra());
			ps.setInt(9, tabPosDet.getPuntaje());
			ps.setInt(10, tabPosDet.getPuesto());
			ps.setString(11, tabPosDet.getEstado());
			ps.setInt(12, tabPosDet.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void dejarInactivo(tabla_posiciones_detalle tabPosDet) {
		String sql = "UPDATE tabla_posiciones_detalle SET TabPosDetEstReg=? WHERE TabPosDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPosDet.getEstado());
			ps.setInt(2, tabPosDet.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void volverActivo(tabla_posiciones_detalle tabPosDet) {
		String sql = "UPDATE tabla_posiciones_detalle SET TabPosDetEstReg=? WHERE TabPosDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPosDet.getEstado());
			ps.setInt(2, tabPosDet.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borradoLogico(tabla_posiciones_detalle tabPosDet) {
		String sql = "UPDATE tabla_posiciones_detalle SET TabPosDetEstReg=? WHERE TabPosDetCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, tabPosDet.getEstado());
			ps.setInt(2, tabPosDet.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borrar(int id) {
		String sql = "delete from tabla_posiciones_detalle where TabPosDetCod=" + id;
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
