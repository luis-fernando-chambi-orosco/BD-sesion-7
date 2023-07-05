package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Controlador.Conexion;
public class eventosDAO {
	Conexion conec= new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public List Listar_evento() {
		String sql="select * from evento";
		List<eventos> lista = new ArrayList<>();
		try{
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				eventos event=new eventos();
				event.setCodigo(rs.getInt(1));
				event.setTipo_evento(rs.getString(2));
				event.setCodigo_jugador(rs.getInt(3));
				event.setCodigo_partido(rs.getInt(4));
				event.setCodigo_arbitro(rs.getInt(5));
				event.setMin_evento(rs.getInt(6));
				event.setEstado(rs.getString(7));
				event.setCodigo_estadio(rs.getInt(8));
				
				lista.add(event);
			}
			
		}catch(SQLException e){
			System.out.println("error mostrar la lista"+e);
		}
		return lista;
	}
	public void dejarInactivo(eventos eve) {
		String sql = "UPDATE evento SET EveEstReg=? WHERE EveCod=?";
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

	public void volverActivo(eventos eve) {
		String sql = "UPDATE evento SET EveEstReg=? WHERE EveCod=?";
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
	public void agregar_evento(eventos event) {
		String sql="insert into evento value (?,?,?,?,?,?,?,?)";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setInt(1, event.getCodigo());
			ps.setString(2, event.getTipo_evento());
			ps.setInt(3, event.getCodigo_jugador());
			ps.setInt(4, event.getCodigo_partido());
			ps.setInt(5, event.getCodigo_arbitro());
			ps.setInt(6, event.getMin_evento());
		//	ps.setString(7, event.getEstado());
			String estado = event.getEstado();
	        if (estado.isEmpty()) {
	            estado = "A";
	        }
	        ps.setString(7, estado);
			ps.setInt(8, event.getCodigo_estadio());
			//ps.setInt(1, ent.getCodigo());
		//	ps.setInt(2, ent.getCodigo_equipo());
		//	ps.setString(3, ent.getNombre());
		//	ps.setString(4, ent.getDni());
		//	ps.setString(5, ent.getEstado());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("error al agregar"+e);
		}
	}
	public void modificar_evento(eventos event) {
		String sql="UPDATE evento SET EveTip=?,EveJugCod=?, EveParCod=?,EveArbCod=?,EveMin=?,EveEstReg=?,EveEstCod=? WHERE EveCod=?";
		try {
			con=conec.conectar();
			ps=con.prepareStatement(sql);
			ps.setString(1, event.getTipo_evento());
			ps.setInt(2, event.getCodigo_jugador());
			ps.setInt(3, event.getCodigo_partido());
			ps.setInt(4, event.getCodigo_arbitro());
			ps.setInt(5, event.getMin_evento());
			ps.setString(6, event.getEstado());
			ps.setInt(7, event.getCodigo_estadio());
			ps.setInt(8, event.getCodigo());
			//ps.setString(1,ent.getNombre());
			//ps.setString(2,ent.getDni());
			//ps.setString(3,ent.getEstado());
			//ps.setInt(4, ent.getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar"+e);
		}
	}
	public void borrar_evento(int id) {
		String sql="delete from evento where EveCod="+id;
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
