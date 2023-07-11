package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class ligaDAO {
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void dejarInactivo(liga lig) {
        String sql = "UPDATE liga SET LigEstReg=? WHERE LigCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, lig.getEstado());
            ps.setInt(2, lig.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void volverActivo(liga lig) {
        String sql = "UPDATE liga SET LigEstReg=? WHERE LigCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, lig.getEstado());
            ps.setInt(2, lig.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public List<liga> listar() {
        String sql = "SELECT * FROM liga";
        List<liga> lista = new ArrayList<>();
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                liga lig = new liga();
                lig.setCodigo(rs.getInt(1));
                lig.setNombre(rs.getString(2));
                lig.setTemporada(rs.getInt(3));
                lig.setEstado(rs.getString(4));
                lista.add(lig);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " + e);
        }
        return lista;
    }

    public void agregar(liga lig) {
        String sql = "INSERT INTO liga (LigNom, LigTemNum, LigEstReg) VALUES (?, ?, ?)";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, lig.getNombre());
            ps.setInt(2, lig.getTemporada());
            String estado = lig.getEstado();
            if (estado.isEmpty()) {
                estado = "A";
            }
            ps.setString(3, estado);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e);
        }
    }

    public void actualizar(liga lig) {
        String sql = "UPDATE liga SET LigNom=?, LigTemNum=?, LigEstReg=? WHERE LigCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, lig.getNombre());
            ps.setInt(2, lig.getTemporada());
            ps.setString(3, lig.getEstado());
            ps.setInt(4, lig.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    public void borrar(int id) {
        String sql = "DELETE FROM liga WHERE LigCod=" + id;
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al borrar: " + e);
        }
    }
}
