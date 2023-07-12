package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorArbitro;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class interfaz_arbitro extends JFrame {

    private JPanel panelArbitro;
    private JTextField textCodigo;
    private JTextField textNombre;
    private JTextField textCategoria;
    private JTextField textDni;
    private JTextField textEdad;
    private JTextField textEstado;
    private JTable table;
    private JButton btnAgregar;
    private JButton btnBorrar;
    private JButton btnModificar;
    private JButton btnActualizar;
    private JButton btnSalir;
    private JButton btnCancelar;
    private JButton btnInactivar;
    private JButton btnReactivar;
    private JLabel lblNewLabel_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        interfaz_arbitro vista = new interfaz_arbitro();
        controladorArbitro controladorArb = new controladorArbitro(vista);
    }

    /**
     * Create the frame.
     */
    public interfaz_arbitro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 600);
        panelArbitro = new JPanel();
        panelArbitro.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(panelArbitro);
        panelArbitro.setLayout(null);

        JLabel lblNewLabel = new JLabel("ÁRBITROS");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(270, 11, 108, 34);
        panelArbitro.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Código");
        lblNewLabel_1.setBounds(100, 72, 46, 14);
        panelArbitro.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Nombre");
        lblNewLabel_2.setBounds(100, 110, 46, 14);
        panelArbitro.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Categoría");
        lblNewLabel_3.setBounds(100, 151, 60, 14);
        panelArbitro.add(lblNewLabel_3);

        JLabel lblNewLabel_5 = new JLabel("DNI");
        lblNewLabel_5.setBounds(100, 190, 46, 14);
        panelArbitro.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Edad");
        lblNewLabel_6.setBounds(100, 230, 46, 14);
        panelArbitro.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Estado");
        lblNewLabel_7.setBounds(100, 271, 46, 14);
        panelArbitro.add(lblNewLabel_7);

        textCodigo = new JTextField();
        textCodigo.setBounds(190, 69, 114, 20);
        panelArbitro.add(textCodigo);
        textCodigo.setColumns(10);

        textNombre = new JTextField();
        textNombre.setBounds(190, 107, 114, 20);
        panelArbitro.add(textNombre);
        textNombre.setColumns(10);

        textCategoria = new JTextField();
        textCategoria.setBounds(190, 148, 86, 20);
        panelArbitro.add(textCategoria);
        textCategoria.setColumns(10);

        textDni = new JTextField();
        textDni.setBounds(190, 187, 86, 20);
        panelArbitro.add(textDni);
        textDni.setColumns(10);

        textEdad = new JTextField();
        textEdad.setBounds(190, 227, 86, 20);
        panelArbitro.add(textEdad);
        textEdad.setColumns(10);

        textEstado = new JTextField();
        textEstado.setBounds(190, 268, 86, 20);
        panelArbitro.add(textEstado);
        textEstado.setColumns(10);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnAgregar.setBounds(94, 310, 103, 23);
        panelArbitro.add(btnAgregar);

        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnModificar.setBounds(238, 310, 103, 23);
        panelArbitro.add(btnModificar);

        btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnBorrar.setBounds(382, 310, 89, 23);
        panelArbitro.add(btnBorrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCancelar.setBounds(518, 344, 89, 23);
        panelArbitro.add(btnCancelar);

        lblNewLabel_4 = new JLabel("Seleccione un árbitro para modificar o borrar");
        lblNewLabel_4.setBounds(138, 473, 366, 14);
        panelArbitro.add(lblNewLabel_4);

        JScrollPane tblTabla = new JScrollPane();
        tblTabla.setBounds(60, 460, 600, 78);
        panelArbitro.add(tblTabla);

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
            }));
        tblTabla.setViewportView(table);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnActualizar.setBounds(94, 344, 103, 23);
        panelArbitro.add(btnActualizar);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSalir.setBounds(518, 310, 89, 23);
        panelArbitro.add(btnSalir);

        btnInactivar = new JButton("Inactivar");
        btnInactivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnInactivar.setBounds(238, 344, 105, 23);
        panelArbitro.add(btnInactivar);

        btnReactivar = new JButton("Reactivar");
        btnReactivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnReactivar.setBounds(382, 344, 89, 23);
        panelArbitro.add(btnReactivar);
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnInactivar() {
        return btnInactivar;
    }

    public void setBtnInactivar(JButton btnInactivar) {
        this.btnInactivar = btnInactivar;
    }

    public JButton getBtnReactivar() {
        return btnReactivar;
    }

    public void setBtnReactivar(JButton btnReactivar) {
        this.btnReactivar = btnReactivar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JPanel getPanelArbitro() {
        return panelArbitro;
    }

    public void setPanelArbitro(JPanel panelArbitro) {
        this.panelArbitro = panelArbitro;
    }

    public JTextField getTextCodigo() {
        return textCodigo;
    }

    public void setTextCodigo(JTextField textCodigo) {
        this.textCodigo = textCodigo;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public void setTextNombre(JTextField textNombre) {
        this.textNombre = textNombre;
    }

    public JTextField getTextCategoria() {
        return textCategoria;
    }

    public void setTextCategoria(JTextField textCategoria) {
        this.textCategoria = textCategoria;
    }

    public JTextField getTextDni() {
        return textDni;
    }

    public void setTextDni(JTextField textDni) {
        this.textDni = textDni;
    }

    public JTextField getTextEdad() {
        return textEdad;
    }

    public void setTextEdad(JTextField textEdad) {
        this.textEdad = textEdad;
    }

    public JTextField getTextEstado() {
        return textEstado;
    }

    public void setTextEstado(JTextField textEstado) {
        this.textEstado = textEstado;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
