package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.equipo;
import modelo.equipoDAO;
import gui.interfaz_equipo;

public class controladorEquipo implements ActionListener {
    int codigo = 0;
    String nombre;
    String estado;
    equipo equipo = new equipo();
    equipoDAO equipoDAO = new equipoDAO();
    interfaz_equipo vista = new interfaz_equipo();
    DefaultTableModel tablaEquipos = new DefaultTableModel();

    public controladorEquipo(interfaz_equipo vista) {
        this.vista = vista;
        vista.setVisible(true);
        agregarEventos();
        listarTabla();
    }

    public void agregarEventos() {
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnSalir().addActionListener(this);
        vista.getBtnModificar().addActionListener(this);
        vista.getBtnInactivar().addActionListener(this);
        vista.getBtnReactivar().addActionListener(this);
        vista.getTable().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                llenar(e);
            }
        });
    }

    public void listarTabla() {
        String[] titulos = new String[] { "Código", "Nombre", "Estado Registro" };
        tablaEquipos = new DefaultTableModel(titulos, 0);
        List<equipo> listaEquipos = equipoDAO.listar();
        for (equipo equipo : listaEquipos) {
            tablaEquipos.addRow(new Object[] { equipo.getCodigo(), equipo.getNombre(), equipo.getEstado() });
        }
        vista.getTable().setModel(tablaEquipos);
    }

    public void llenar(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTextCodigo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextNombre().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextEstado().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
    }

    public boolean validarDatos() {
        if ("".equals(vista.getTextNombre().getText()) || "".equals(vista.getTextEstado().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos");
            return false;
        }
        return true;
    }

    public void cargarDatos() {
        codigo = Integer.parseInt(vista.getTextCodigo().getText());
        nombre = vista.getTextNombre().getText();
        estado = vista.getTextEstado().getText();
    }

    public void limpiar() {
        vista.getTextCodigo().setText("");
        vista.getTextNombre().setText("");
        vista.getTextEstado().setText("");
        codigo = 0;
        nombre = "--";
        estado = "--";
    }

    public void agregar() {
        if (validarDatos()) {
            cargarDatos();
            equipo equipo = new equipo(codigo, nombre, estado);
            equipoDAO.agregar(equipo);
            JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void modificar() {
        if (validarDatos()) {
            cargarDatos();
            equipo equipo = new equipo(codigo, nombre, estado);
            equipoDAO.actualizar(equipo);
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void borrar() {
        if (codigo != 0) {
            equipoDAO.borrar(codigo);
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void salir() {
        JOptionPane.showMessageDialog(null, "Se ha cerrado el programa exitosamente");
        System.exit(0);
    }
    
    public void inactivar() {
        if (codigo != 0) {
            equipoDAO.dejarInactivo(new equipo(codigo, "", "I"));
            JOptionPane.showMessageDialog(null, "Registro inactivado exitosamente");
            limpiar();
            listarTabla();
        }
    }
    
    public void reactivar() {
        if (codigo != 0) {
            equipoDAO.volverActivo(new equipo(codigo, "", "A"));
            JOptionPane.showMessageDialog(null, "Registro reactivado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnAgregar()) {
            agregar();
        } else if (e.getSource() == vista.getBtnModificar()) {
            modificar();
        } else if (e.getSource() == vista.getBtnBorrar()) {
            borrar();
        } else if (e.getSource() == vista.getBtnActualizar()) {
            listarTabla();
        } else if (e.getSource() == vista.getBtnSalir()) {
            salir();
        } else if (e.getSource() == vista.getBtnInactivar()) {
            inactivar();
        } else if (e.getSource() == vista.getBtnReactivar()) {
            reactivar();
        }
    }
}
