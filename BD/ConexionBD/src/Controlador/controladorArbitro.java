package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.arbitro;
import modelo.arbitroDAO;
import gui.interfaz_arbitro;

public class controladorArbitro implements ActionListener {
    int codigo = 0;
    String nombre;
    String categoria;
    String dni;
    int edad;
    String estado;
    arbitro arbitro = new arbitro();
    arbitroDAO arbitroDAO = new arbitroDAO();
    interfaz_arbitro vista = new interfaz_arbitro();
    DefaultTableModel tablaArbitros = new DefaultTableModel();

    public controladorArbitro(interfaz_arbitro vista) {
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
        String[] titulos = new String[] { "Código", "Nombre", "Categoría", "DNI", "Edad", "Estado Registro" };
        tablaArbitros = new DefaultTableModel(titulos, 0);
        List<arbitro> listaArbitros = arbitroDAO.listar();
        for (arbitro arb : listaArbitros) {
            tablaArbitros.addRow(new Object[] { arb.getCodigo(), arb.getNombre(), arb.getCategoria(),
                    arb.getDni(), arb.getEdad(), arb.getEstado() });
        }
        vista.getTable().setModel(tablaArbitros);
    }

    public void llenar(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTextCodigo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextNombre().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextCategoria().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTextDni().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
        vista.getTextEdad().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
        vista.getTextEstado().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 5).toString());
    }

    public boolean validarDatos() {
        if ("".equals(vista.getTextNombre().getText()) || "".equals(vista.getTextCategoria().getText())
                || "".equals(vista.getTextDni().getText()) || "".equals(vista.getTextEdad().getText())
                || "".equals(vista.getTextEstado().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos");
            return false;
        }
        return true;
    }

    public void cargarDatos() {
        codigo = Integer.parseInt(vista.getTextCodigo().getText());
        nombre = vista.getTextNombre().getText();
        categoria = vista.getTextCategoria().getText();
        dni = vista.getTextDni().getText();
        edad = Integer.parseInt(vista.getTextEdad().getText());
        estado = vista.getTextEstado().getText();
    }

    public void limpiar() {
        vista.getTextCodigo().setText("");
        vista.getTextNombre().setText("");
        vista.getTextCategoria().setText("");
        vista.getTextDni().setText("");
        vista.getTextEdad().setText("");
        vista.getTextEstado().setText("");
        codigo = 0;
        nombre = "--";
        categoria = "--";
        dni = "--";
        edad = 0;
        estado = "--";
    }

    public void agregar() {
        if (validarDatos()) {
            cargarDatos();
            arbitro arb = new arbitro(codigo, nombre, categoria, dni, edad, estado);
            arbitroDAO.agregar(arb);
            JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void modificar() {
        if (validarDatos()) {
            cargarDatos();
            arbitro arb = new arbitro(codigo, nombre, categoria, dni, edad, estado);
            arbitroDAO.actualizar(arb);
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void borrar() {
        if (codigo != 0) {
            arbitroDAO.borrar(codigo);
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
            arbitroDAO.dejarInactivo(new arbitro(codigo, "", "", "", 0, "I"));
            JOptionPane.showMessageDialog(null, "Registro inactivado exitosamente");
            limpiar();
            listarTabla();
        }
    }

    public void reactivar() {
        if (codigo != 0) {
            arbitroDAO.volverActivo(new arbitro(codigo, "", "", "", 0, "A"));
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
