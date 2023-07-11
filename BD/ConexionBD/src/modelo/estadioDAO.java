package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class estadioDAO {
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void dejarInactivo(estadio est) {
        String sql = "UPDATE estadio SET EstEstReg=? WHERE EstCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getEstado());
            ps.setInt(2, est.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void volverActivo(estadio est) {
        String sql = "UPDATE estadio SET EstEstReg=? WHERE EstCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getEstado());
            ps.setInt(2, est.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public List<estadio> listar() {
        String sql = "SELECT * FROM estadio";
        List<estadio> lista = new ArrayList<>();
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                estadio est = new estadio();
                est.setCodigo(rs.getInt(1));
                est.setNombre(rs.getString(2));
                est.setEstado(rs.getString(3));
                lista.add(est);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " + e);
        }
        return lista;
    }

    public void agregar(estadio est) {
        String sql = "INSERT INTO estadio (EstNom, EstEstReg) VALUES (?, ?)";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getNombre());
            String estado = est.getEstado();
            if (estado.isEmpty()) {
                estado = "A";
            }
            ps.setString(2, estado);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e);
        }
    }

    public void actualizar(estadio est) {
        String sql = "UPDATE estadio SET EstNom=?, EstEstReg=? WHERE EstCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getNombre());
            ps.setString(2, est.getEstado());
            ps.setInt(3, est.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    public void borrar(int id) {
        String sql = "DELETE FROM estadio WHERE EstCod=" + id;
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al borrar: " + e);
        }
    }
}
