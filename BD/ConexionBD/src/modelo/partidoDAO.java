package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class partidoDAO {
	Conexion conec = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public List Listar() {
		String sql = "select * from partido";
		List<partido> lista = new ArrayList<>();
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				partido par = new partido();
				par.setCodigo(rs.getInt(1));
				par.setEstadoCurso(rs.getString(2));
				par.setCodigo_liga(rs.getInt(3));
				par.setCodigo_equipo_local(rs.getInt(4));
				par.setCodigo_equipo_visitante(rs.getInt(5));
				par.setCodigo_arbitro1(rs.getInt(6));
				par.setCodigo_arbitro2(rs.getInt(7));
				par.setCodigo_arbitro3(rs.getInt(8));
				par.setAño(rs.getInt(9));
				par.setMes(rs.getInt(10));
				par.setDia(rs.getInt(11));
				par.setHora_inicio(rs.getInt(12));
				par.setHora_final(rs.getInt(13));
				par.setGoles_local(rs.getInt(14));
				par.setGoles_visitante(rs.getInt(15));
				par.setEstado(rs.getString(16));
				par.setCodigo_estadio(rs.getInt(17));
				lista.add(par);
			}

		} catch (SQLException e) {
			System.out.println("error mostrar la lista" + e);
		}
		return lista;
	}

	public void agregar(partido par) {
		String sql = "insert into partido value (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, par.getCodigo());
			ps.setString(2, par.getEstadoCurso());
			ps.setInt(3, par.getCodigo_liga());
			ps.setInt(4, par.getCodigo_equipo_local());
			ps.setInt(5, par.getCodigo_equipo_visitante());
			ps.setInt(6, par.getCodigo_arbitro1());
			ps.setInt(7, par.getCodigo_arbitro2());
			ps.setInt(8, par.getCodigo_arbitro3());
			ps.setInt(9, par.getAño());
			ps.setInt(10, par.getMes());
			ps.setInt(11, par.getDia());
			ps.setInt(12, par.getHora_inicio());
			ps.setInt(13, par.getHora_final());
			ps.setInt(14, par.getGoles_local());
			ps.setInt(15, par.getGoles_visitante());
			ps.setString(16, par.getEstado());
			ps.setInt(17, par.getCodigo_estadio());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar" + e);
		}
	}

	public void actualizar(partido par) {
		String sql = "UPDATE partido SET ParEstCur=?,ParLigCod=?,ParEquLocCod=?,ParEquVisCod=?,ParArbCod1=?,ParArbCod2=?,ParArbCod3=?,ParFecAño=?,ParFecMes=?,ParFecDia=?,ParHorIni=?,ParHorFin=?,ParEstReg=?,ParEstCod=?  WHERE ParCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, par.getEstadoCurso());
			ps.setInt(2, par.getCodigo_liga());
			ps.setInt(3, par.getCodigo_equipo_local());
			ps.setInt(4, par.getCodigo_equipo_visitante());
			ps.setInt(5, par.getCodigo_arbitro1());
			ps.setInt(6, par.getCodigo_arbitro2());
			ps.setInt(7, par.getCodigo_arbitro3());
			ps.setInt(8, par.getAño());
			ps.setInt(9, par.getMes());
			ps.setInt(10, par.getDia());
			ps.setInt(11, par.getHora_inicio());
			ps.setInt(12, par.getHora_final());
			ps.setString(13, par.getEstado());
			ps.setInt(14, par.getCodigo_estadio());
			ps.setInt(15, par.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void dejarInactivo(partido par) {
		String sql = "UPDATE partido SET ParEstReg=? WHERE ParCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, par.getEstado());
			ps.setInt(2, par.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void volverActivo(partido par) {
		String sql = "UPDATE partido SET JugEstReg=? WHERE ParCod=?";
		try {
			con = conec.conectar();
			ps = con.prepareStatement(sql);
			ps.setString(1, par.getEstado());
			ps.setInt(2, par.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar" + e);
		}
	}

	public void borrar(int id) {
		String sql = "delete from partido where ParCod=" + id;
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
