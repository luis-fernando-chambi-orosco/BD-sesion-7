package Controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import gui.Interfaz_posiciones_det;
import modelo.tabla_posiciones_detalle;
import modelo.tabla_posiciones_detalleDAO;

public class controladorposiciones_det implements ActionListener {
    int codigo;
    int codigo_equipo;
    int codigo_tabla_posiciones_cab;
    int partidos_jugados;
    int partidos_ganados;
    int partidos_empatados;
    int partidos_perdidos;
    int goles_favor;
    int goles_contra;
    int puntaje;
    int puesto;
    String estado;

    tabla_posiciones_detalle par = new tabla_posiciones_detalle();
    tabla_posiciones_detalleDAO parDAO = new tabla_posiciones_detalleDAO();
    Interfaz_posiciones_det vista = new Interfaz_posiciones_det();
    DefaultTableModel tablaent = new DefaultTableModel();

    public controladorposiciones_det(Interfaz_posiciones_det vista) {
        this.vista = vista;
        vista.setVisible(true);
        agregareventos();
        listartabla();
    }

    public void agregareventos() {
        vista.getBtnAdicionar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnSalir().addActionListener(this);
        vista.getBtnModificar().addActionListener(this);
        vista.getBtnInactivar().addActionListener(this);
        vista.getBtnReactivar().addActionListener(this);
        vista.getBtnCancelar().addActionListener(this);
        vista.getTable().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                llenar(e);

            }
        });
    }

    public void listartabla() {
        String[] titulos = new String[] { "Codigo", "Equipo", "Tabla", "P. jugados", "P. ganados", "P. empatados",
                "P. perdidos", "Goles a favor", "Goles en contra", "Puntaje", "Posicion", "Estado Registro" };
        tablaent = new DefaultTableModel(titulos, 0);
        List<tabla_posiciones_detalle> listaprod = parDAO.Listar();
        for (tabla_posiciones_detalle pro : listaprod) {
            tablaent.addRow(new Object[] { pro.getCodigo(), pro.getCodigo_equipo(),
                    pro.getCodigo_tabla_posiciones_cab(), pro.getPartidos_jugados(),
                    pro.getPartidos_ganados(), pro.getPartidos_empatados(), pro.getPartidos_perdidos(),
                    pro.getGoles_favor(),
                    pro.getGoles_contra(), pro.getPuntaje(), pro.getPuesto(), pro.getEstado(), });

        }
        vista.getTable().setModel(tablaent);
        vista.getTable().setPreferredSize(new Dimension(350, tablaent.getRowCount() * 16));
    }

    public void llenar(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTextFieldCodigo()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextFieldCodigoEquipo()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextFieldCodigoPosicionesCab()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTextFieldPartidosJugados()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
        vista.getTextFieldPartidosGanados()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
        vista.getTextFieldPartidosEmpatados()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 5).toString());
        vista.getTextFieldPartidosPerdidos()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 6).toString());
        vista.getTextFieldGolesFavor()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 7).toString());
        vista.getTextFieldGolesContra()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 8).toString());
        vista.getTextFieldPuntaje()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 9).toString());
        vista.getTextFieldPuesto()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 10).toString());
        vista.getTextFieldEstadoRegistro()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 11).toString());
    }

    public boolean validardatosent() {
        if ("".equals(vista.getTextFieldCodigo().getText()) || "".equals(vista.getTextFieldCodigoEquipo().getText())
                || "".equals(vista.getTextFieldCodigoPosicionesCab().getText())) {
            JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
            return false;
        }
        return true;
    }

    // validando los datos para que el usuario no meta cosas que no se pide
    public boolean cargardatosjug() {
        try {
            codigo = Integer.parseInt(vista.getTextFieldCodigo().getText());
            codigo_equipo = Integer.parseInt(vista.getTextFieldCodigoEquipo().getText());
            codigo_tabla_posiciones_cab = Integer.parseInt(vista.getTextFieldCodigoPosicionesCab().getText());
            partidos_jugados = Integer.parseInt(vista.getTextFieldPartidosJugados().getText());
            partidos_ganados = Integer.parseInt(vista.getTextFieldPartidosGanados().getText());
            partidos_empatados = Integer.parseInt(vista.getTextFieldPartidosEmpatados().getText());
            partidos_perdidos = Integer.parseInt(vista.getTextFieldPartidosPerdidos().getText());
            goles_favor = Integer.parseInt(vista.getTextFieldGolesFavor().getText());
            goles_contra = Integer.parseInt(vista.getTextFieldGolesContra().getToolTipText());
            puntaje = Integer.parseInt(vista.getTextFieldPuntaje().getToolTipText());
            puesto = Integer.parseInt(vista.getTextFieldPuesto().getToolTipText());
            estado = vista.getTextFieldEstadoRegistro().getText();
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al cargar datos" + e);
            return false;
        }
    }

    public boolean cargardatosjugNuevo() {
        try {
            codigo = Integer.parseInt(vista.getTextFieldCodigo().getText());
            codigo_equipo = Integer.parseInt(vista.getTextFieldCodigoEquipo().getText());
            codigo_tabla_posiciones_cab = Integer.parseInt(vista.getTextFieldCodigoPosicionesCab().getText());
            partidos_jugados = Integer.parseInt(vista.getTextFieldPartidosJugados().getText());
            partidos_ganados = Integer.parseInt(vista.getTextFieldPartidosGanados().getText());
            partidos_empatados = Integer.parseInt(vista.getTextFieldPartidosEmpatados().getText());
            partidos_perdidos = Integer.parseInt(vista.getTextFieldPartidosPerdidos().getText());
            goles_favor = Integer.parseInt(vista.getTextFieldGolesFavor().getText());
            goles_contra = Integer.parseInt(vista.getTextFieldGolesContra().getToolTipText());
            puntaje = Integer.parseInt(vista.getTextFieldPuntaje().getToolTipText());
            puesto = Integer.parseInt(vista.getTextFieldPuesto().getToolTipText());
            estado = vista.getTextFieldEstadoRegistro().getText();
            
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al cargar datos" + e);
            return false;
        }
    }

    public void limpiar() {
        vista.getTextFieldCodigo().setText("");
        vista.getTextFieldCodigoEquipo().setText("");
        vista.getTextFieldCodigoPosicionesCab().setText("");
        vista.getTextFieldPartidosJugados().setText("");
        vista.getTextFieldPartidosGanados().setText("");
        vista.getTextFieldPartidosEmpatados().setText("");
        vista.getTextFieldPartidosPerdidos().setText("");
        vista.getTextFieldGolesFavor().setText("");
        vista.getTextFieldGolesContra().setText("");
        vista.getTextFieldPuntaje().setText("");
        vista.getTextFieldPuesto().setText("");
		vista.getTextFieldEstadoRegistro().setText("");
        codigo = 0;
        codigo_equipo = 0;
        codigo_tabla_posiciones_cab = 0;
        estado = "A";

    }

    public void agregar() {
        try {
            if (validardatosent()) {
                if (cargardatosjugNuevo()) {
                    tabla_posiciones_detalle det = new tabla_posiciones_detalle(codigo, codigo_equipo, codigo_tabla_posiciones_cab, partidos_jugados,
                            partidos_ganados, partidos_empatados, partidos_perdidos, goles_favor, goles_contra, puntaje,
                            puesto, estado);
                    parDAO.agregar(det);
                    JOptionPane.showMessageDialog(null, "registro exitosos");
                    limpiar();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al agregar" + e);
        }
    }

    public void modificar() {
        try {
            if (validardatosent()) {
                if (cargardatosjug()) {
                    tabla_posiciones_detalle det = new tabla_posiciones_detalle(codigo, codigo_equipo, codigo_tabla_posiciones_cab, partidos_jugados,
                            partidos_ganados, partidos_empatados, partidos_perdidos, goles_favor, goles_contra, puntaje,
                            puesto, estado);;

                    parDAO.actualizar(det);
                    JOptionPane.showMessageDialog(null, "modificacion exitosa");
                    limpiar();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al actualizar datos" + e);
        }
    }

    public void borrar() {
        try {
            if (validardatosent()) {
                if (cargardatosjug()) {
                    tabla_posiciones_detalle det = new tabla_posiciones_detalle(codigo, codigo_equipo, codigo_tabla_posiciones_cab, partidos_jugados,
                            partidos_ganados, partidos_empatados, partidos_perdidos, goles_favor, goles_contra, puntaje,
                            puesto, "*");

                    parDAO.borradoLogico(det);
                    JOptionPane.showMessageDialog(null, "inactivacion exitosa");
                    limpiar();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al inactivar" + e);
        }
    }

    public void salir() {
        try {
            JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("ocurrio un error inesperado" + e);
        }
    }

    public void actualizar() {
        try {
            listartabla();
            JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ocurrio un error inesperado al querer actualizar la tabla" + e);
        }
    }

    public void inactivar() {
        try {
            if (validardatosent()) {
                if (cargardatosjug()) {
                    tabla_posiciones_detalle det = new tabla_posiciones_detalle(codigo, codigo_equipo, codigo_tabla_posiciones_cab, partidos_jugados,
                            partidos_ganados, partidos_empatados, partidos_perdidos, goles_favor, goles_contra, puntaje,
                            puesto, "I");
                    parDAO.dejarInactivo(det);
                    JOptionPane.showMessageDialog(null, "inactivacion exitosa");
                    limpiar();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al inactivar" + e);
        }
    }

    public void reactivar() {
        try {
            if (validardatosent()) {
                if (cargardatosjug()) {
                    tabla_posiciones_detalle det = new tabla_posiciones_detalle(codigo, codigo_equipo, codigo_tabla_posiciones_cab, partidos_jugados,
                            partidos_ganados, partidos_empatados, partidos_perdidos, goles_favor, goles_contra, puntaje,
                            puesto, "A");
                    parDAO.dejarInactivo(det);
                    JOptionPane.showMessageDialog(null, "inactivacion exitosa");
                    limpiar();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error al inactivar" + e);
        }
    }

    // con esto daremos acciones a los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == vista.getBtnAdicionar()) {
            agregar();
        }
        if (e.getSource() == vista.getBtnModificar()) {
            modificar();
        }
        if (e.getSource() == vista.getBtnBorrar()) {
            borrar();
        }
        if (e.getSource() == vista.getBtnActualizar()) {
            actualizar();
        }
        if (e.getSource() == vista.getBtnSalir()) {
            salir();
        }
        if (e.getSource() == vista.getBtnCancelar()) {
            limpiar();
        }

        if (e.getSource() == vista.getBtnInactivar()) {
            inactivar();
        }

        if (e.getSource() == vista.getBtnReactivar()) {
            reactivar();
        }

    }

}
