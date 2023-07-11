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

import Controlador.controladorLiga;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class interfaz_liga extends JFrame {

    private JPanel PanelLiga;
    private JTextField textCodigo;
    private JTextField textNombre;
    private JTextField textTemporada;
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
        interfaz_liga vista = new interfaz_liga();
        controladorLiga controladorLiga = new controladorLiga(vista);
    }

    /**
     * Create the frame.
     */
    public interfaz_liga() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 606, 472);
        PanelLiga = new JPanel();
        PanelLiga.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(PanelLiga);
        PanelLiga.setLayout(null);

        JLabel lblNewLabel = new JLabel("LIGAS");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(237, 11, 108, 34);
        PanelLiga.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Código");
        lblNewLabel_1.setBounds(88, 72, 46, 14);
        PanelLiga.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Nombre");
        lblNewLabel_2.setBounds(88, 110, 46, 14);
        PanelLiga.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Temporada");
        lblNewLabel_3.setBounds(88, 151, 65, 14);
        PanelLiga.add(lblNewLabel_3);

        JLabel lblNewLabel_6 = new JLabel("Estado");
        lblNewLabel_6.setBounds(88, 190, 46, 14);
        PanelLiga.add(lblNewLabel_6);

        textCodigo = new JTextField();
        textCodigo.setBounds(176, 69, 114, 20);
        PanelLiga.add(textCodigo);
        textCodigo.setColumns(10);

        textNombre = new JTextField();
        textNombre.setBounds(176, 107, 114, 20);
        PanelLiga.add(textNombre);
        textNombre.setColumns(10);

        textTemporada = new JTextField();
        textTemporada.setBounds(176, 148, 86, 20);
        PanelLiga.add(textTemporada);
        textTemporada.setColumns(10);

        textEstado = new JTextField();
        textEstado.setBounds(176, 187, 86, 20);
        PanelLiga.add(textEstado);
        textEstado.setColumns(10);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnAgregar.setBounds(64, 262, 103, 23);
        PanelLiga.add(btnAgregar);

        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnModificar.setBounds(199, 262, 103, 23);
        PanelLiga.add(btnModificar);

        btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnBorrar.setBounds(339, 262, 89, 23);
        PanelLiga.add(btnBorrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCancelar.setBounds(476, 296, 89, 23);
        PanelLiga.add(btnCancelar);

        JLabel lblNewLabel_5 = new JLabel("Lista de Ligas");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_5.setBounds(199, 348, 151, 14);
        PanelLiga.add(lblNewLabel_5);

        JScrollPane tblTabla = new JScrollPane();
        tblTabla.setBounds(45, 330, 500, 78);
        PanelLiga.add(tblTabla);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                }));
        tblTabla.setViewportView(table);

        lblNewLabel_4 = new JLabel("Seleccione una liga para modificar o borrar");
        lblNewLabel_4.setBounds(106, 373, 366, 14);
        PanelLiga.add(lblNewLabel_4);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnActualizar.setBounds(64, 296, 103, 23);
        PanelLiga.add(btnActualizar);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSalir.setBounds(476, 262, 89, 23);
        PanelLiga.add(btnSalir);

        btnInactivar = new JButton("Inactivar");
        btnInactivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnInactivar.setBounds(197, 296, 105, 23);
        PanelLiga.add(btnInactivar);

        btnReactivar = new JButton("Reactivar");
        btnReactivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnReactivar.setBounds(339, 296, 89, 23);
        PanelLiga.add(btnReactivar);
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

    public JPanel getPanelLiga() {
        return PanelLiga;
    }

    public void setPanelLiga(JPanel panelLiga) {
        PanelLiga = panelLiga;
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

    public JTextField getTextTemporada() {
        return textTemporada;
    }

    public void setTextTemporada(JTextField textTemporada) {
        this.textTemporada = textTemporada;
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
