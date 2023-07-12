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

import gui.Interfaz_resultados;
import modelo.resultados;
import modelo.resultadosDAO;


public class controladorresultados implements ActionListener{
    int codigo;
    int puntos_ganados;
    int goles_favor;
    int goles_contra;
    int codigo_tabla_posiciones_det;
    int codigo_partido;
    String estado;

    resultados res = new resultados();
    resultadosDAO parDAO = new resultadosDAO();
    Interfaz_resultados vista = new Interfaz_resultados();
    DefaultTableModel tablaent = new DefaultTableModel();

    public controladorresultados(Interfaz_resultados vista) {
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
        List<resultados> listaprod = parDAO.Listar();
        for (resultados pro : listaprod) {
            tablaent.addRow(new Object[] { pro.getCodigo(), pro.getPuntos_ganados(), pro.getGoles_favor(),
                    pro.getGoles_contra(), pro.getCodigo_tabla_posiciones_det(), pro.getCodigo_partido(), pro.getEstado(), });
        }
        vista.getTable().setModel(tablaent);
        vista.getTable().setPreferredSize(new Dimension(350, tablaent.getRowCount() * 16));
    }

    public void llenar(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTextFieldCodigo()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextFieldPuntos()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextFieldGolesFavor()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTextFieldGolesContra()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
        vista.getTextFieldTablaPosicionDet()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
        vista.getTextFieldCodigoPartido()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 5).toString());
        vista.getTextFieldEstadoRegistro()
                .setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 6).toString());
    }

    public boolean validardatosent() {
        if ("".equals(vista.getTextFieldCodigo().getText()) || "".equals(vista.getTextFieldCodigoPartido().getText())
                || "".equals(vista.getTextFieldTablaPosicionDet().getText())) {
            JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
            return false;
        }
        return true;
    }

    // validando los datos para que el usuario no meta cosas que no se pide
    public boolean cargardatosjug() {
        try {
            codigo = Integer.parseInt(vista.getTextFieldCodigo().getText());
            puntos_ganados = Integer.parseInt(vista.getTextFieldPuntos().getText());
            goles_favor = Integer.parseInt(vista.getTextFieldGolesFavor().getText());
            goles_contra = Integer.parseInt(vista.getTextFieldGolesContra().getToolTipText());
            codigo_tabla_posiciones_det = Integer.parseInt(vista.getTextFieldTablaPosicionDet().getToolTipText());
            codigo_partido = Integer.parseInt(vista.getTextFieldCodigoPartido().getToolTipText());
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
            puntos_ganados = Integer.parseInt(vista.getTextFieldPuntos().getText());
            goles_favor = Integer.parseInt(vista.getTextFieldGolesFavor().getText());
            goles_contra = Integer.parseInt(vista.getTextFieldGolesContra().getToolTipText());
            codigo_tabla_posiciones_det = Integer.parseInt(vista.getTextFieldTablaPosicionDet().getToolTipText());
            codigo_partido = Integer.parseInt(vista.getTextFieldCodigoPartido().getToolTipText());
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
        vista.getTextFieldPuntos().setText("");
        vista.getTextFieldGolesFavor().setText("");
        vista.getTextFieldGolesContra().setText("");
        vista.getTextFieldTablaPosicionDet().setText("");
        vista.getTextFieldCodigoPartido().setText("");
		vista.getTextFieldEstadoRegistro().setText("");
        codigo = 0;
        codigo_partido = 0;
        codigo_tabla_posiciones_det = 0;
        estado = "A";

    }

    public void agregar() {
        try {
            if (validardatosent()) {
                if (cargardatosjugNuevo()) {
                    resultados det = new resultados(codigo, puntos_ganados, goles_favor, goles_contra, 
                    codigo_tabla_posiciones_det,codigo_partido, estado);
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
                    resultados det = new resultados(codigo, puntos_ganados, goles_favor, goles_contra, 
                    codigo_tabla_posiciones_det,codigo_partido, estado);

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
                    resultados det = new resultados(codigo, puntos_ganados, goles_favor, goles_contra, 
                    codigo_tabla_posiciones_det,codigo_partido, "*");

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
                    resultados det = new resultados(codigo, puntos_ganados, goles_favor, goles_contra, 
                    codigo_tabla_posiciones_det,codigo_partido, "I");
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
                    resultados det = new resultados(codigo, puntos_ganados, goles_favor, goles_contra, 
                    codigo_tabla_posiciones_det,codigo_partido, "A");
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
