package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class equipoDAO {
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void dejarInactivo(equipo equi) {
        String sql = "UPDATE equipos SET EquEstReg=? WHERE EquCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, equi.getEstado());
            ps.setInt(2, equi.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void volverActivo(equipo equi) {
        String sql = "UPDATE equipos SET EquEstReg=? WHERE EquCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, equi.getEstado());
            ps.setInt(2, equi.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public List<equipo> listar() {
        String sql = "SELECT * FROM equipos";
        List<equipo> lista = new ArrayList<>();
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                equipo equi = new equipo();
                equi.setCodigo(rs.getInt(1));
                equi.setNombre(rs.getString(2));
                equi.setEstado(rs.getString(3));
                lista.add(equi);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " + e);
        }
        return lista;
    }

    public void agregar(equipo equi) {
        String sql = "INSERT INTO equipos (EquNom, EquEstReg) VALUES (?, ?)";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, equi.getNombre());
            String estado = equi.getEstado();
            if (estado.isEmpty()) {
                estado = "A";
            }
            ps.setString(2, estado);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e);
        }
    }

    public void actualizar(equipo equi) {
        String sql = "UPDATE equipos SET EquNom=?, EquEstReg=? WHERE EquCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, equi.getNombre());
            ps.setString(2, equi.getEstado());
            ps.setInt(3, equi.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    public void borrar(int id) {
        String sql = "DELETE FROM equipos WHERE EquCod=" + id;
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al borrar: " + e);
        }
    }
}
