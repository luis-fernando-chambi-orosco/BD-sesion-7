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

import gui.Interfaz_posiciones_cab;
import modelo.tabla_posiciones_cab;
import modelo.tabla_posiciones_cabDAO;

public class controladorposiciones_cab implements ActionListener {

    int codigo;
    int codigo_liga;
    String estado;

    tabla_posiciones_cab res = new tabla_posiciones_cab();
    tabla_posiciones_cabDAO parDAO = new tabla_posiciones_cabDAO();
    Interfaz_posiciones_cab vista = new Interfaz_posiciones_cab();
    DefaultTableModel tablaent = new DefaultTableModel();

    public controladorposiciones_cab(Interfaz_posiciones_cab vista) {
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
        String[] titulos = new String[] { "Codigo", "Puntos Ganados", "Goles a favor", "Goles en contra", "detalle de posicion", 
                "Codigo de partido", "Estado Registro" };
        tablaent = new DefaultTableModel(titulos, 0);
        List<tabla_posiciones_cab> listaprod = parDAO.Listar();
        for (tabla_posiciones_cab pro : listaprod) {
            tablaent.addRow(new Object[] { pro.getCodigo(), pro.getCodigo_liga(), pro.getEstado(), });
        }
        vista.getTable().setModel(tablaent);
        vista.getTable().setPreferredSize(new Dimension(350, tablaent.getRowCount() * 16));
    }

    public void llenar(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTextFieldCodigo()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextFieldCodigoLiga()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextFieldEstadoRegistro()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
    }

    public boolean validardatosent() {
        if ("".equals(vista.getTextFieldCodigo().getText()) || "".equals(vista.getTextFieldCodigoLiga().getText())) {
            JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
            return false;
        }
        return true;
    }

    // validando los datos para que el usuario no meta cosas que no se pide
    public boolean cargardatosjug() {
        try {
            codigo = Integer.parseInt(vista.getTextFieldCodigo().getText());
            codigo_liga = Integer.parseInt(vista.getTextFieldCodigoLiga().getText());
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
            codigo_liga = Integer.parseInt(vista.getTextFieldCodigoLiga().getText());
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
        vista.getTextFieldCodigoLiga().setText("");
		vista.getTextFieldEstadoRegistro().setText("");
        codigo = 0;
        codigo_liga = 0;
        estado = "A";

    }

    public void agregar() {
        try {
            if (validardatosent()) {
                if (cargardatosjugNuevo()) {
                    tabla_posiciones_cab det = new tabla_posiciones_cab(codigo, codigo_liga, estado);
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
                    tabla_posiciones_cab det = new tabla_posiciones_cab(codigo, codigo_liga, estado);
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
                    tabla_posiciones_cab det = new tabla_posiciones_cab(codigo, codigo_liga, "*");
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
                    tabla_posiciones_cab det = new tabla_posiciones_cab(codigo, codigo_liga, "I");
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
                    tabla_posiciones_cab det = new tabla_posiciones_cab(codigo, codigo_liga, "A");
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
