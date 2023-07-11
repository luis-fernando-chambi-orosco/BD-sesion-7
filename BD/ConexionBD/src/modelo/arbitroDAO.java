package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Conexion;

public class arbitroDAO {
    Conexion conec = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void dejarInactivo(arbitro arb) {
        String sql = "UPDATE arbitros SET ArbEstReg=? WHERE ArbCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, arb.getEstado());
            ps.setInt(2, arb.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void volverActivo(arbitro arb) {
        String sql = "UPDATE arbitros SET ArbEstReg=? WHERE ArbCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, arb.getEstado());
            ps.setInt(2, arb.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public List<arbitro> listar() {
        String sql = "SELECT * FROM arbitros";
        List<arbitro> lista = new ArrayList<>();
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                arbitro arb = new arbitro();
                arb.setCodigo(rs.getInt(1));
                arb.setNombre(rs.getString(2));
                arb.setCategoria(rs.getString(3));
                arb.setDni(rs.getString(4));
                arb.setEdad(rs.getInt(5));
                arb.setEstado(rs.getString(6));
                lista.add(arb);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " + e);
        }
        return lista;
    }

    public void agregar(arbitro arb) {
        String sql = "INSERT INTO arbitros (ArbNom, ArbCat, ArbDNI, ArbEda, ArbEstReg) VALUES (?, ?, ?, ?, ?)";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, arb.getNombre());
            ps.setString(2, arb.getCategoria());
            ps.setString(3, arb.getDni());
            ps.setInt(4, arb.getEdad());
            String estado = arb.getEstado();
            if (estado.isEmpty()) {
                estado = "A";
            }
            ps.setString(5, estado);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e);
        }
    }

    public void actualizar(arbitro arb) {
        String sql = "UPDATE arbitros SET ArbNom=?, ArbCat=?, ArbDNI=?, ArbEda=?, ArbEstReg=? WHERE ArbCod=?";
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, arb.getNombre());
            ps.setString(2, arb.getCategoria());
            ps.setString(3, arb.getDni());
            ps.setInt(4, arb.getEdad());
            ps.setString(5, arb.getEstado());
            ps.setInt(6, arb.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    public void borrar(int id) {
        String sql = "DELETE FROM arbitros WHERE ArbCod=" + id;
        try {
            con = conec.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al borrar: " + e);
        }
    }
}
