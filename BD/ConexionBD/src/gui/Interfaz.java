package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorentrenador;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame {

	private JPanel PanelEntrenador;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textCodigoEquipo;
	private JTextField textEstado;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReactivar;
	private JButton btnInactivar;
	private JButton btnActualizar;
	private JButton btnSalir;
	private JButton btnButtonCancelar;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Interfaz vista=new Interfaz();
		controladorentrenador controladorent=new controladorentrenador(vista);
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 709);
		PanelEntrenador = new JPanel();
		PanelEntrenador.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelEntrenador);
		PanelEntrenador.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTRENADORES ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(188, 11, 183, 34);
		PanelEntrenador.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(51, 72, 46, 14);
		PanelEntrenador.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(51, 110, 46, 14);
		PanelEntrenador.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setBounds(51, 151, 46, 14);
		PanelEntrenador.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Codigo De equipo");
		lblNewLabel_4.setBounds(30, 187, 115, 14);
		PanelEntrenador.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estado De Registro");
		lblNewLabel_5.setBounds(30, 222, 115, 14);
		PanelEntrenador.add(lblNewLabel_5);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(155, 69, 114, 20);
		PanelEntrenador.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(155, 107, 114, 20);
		PanelEntrenador.add(textNombre);
		textNombre.setColumns(10);
		
		textDNI = new JTextField();
		textDNI.setBounds(155, 148, 114, 20);
		PanelEntrenador.add(textDNI);
		textDNI.setColumns(10);
		
		textCodigoEquipo = new JTextField();
		textCodigoEquipo.setBounds(155, 184, 114, 20);
		PanelEntrenador.add(textCodigoEquipo);
		textCodigoEquipo.setColumns(10);
		
		textEstado = new JTextField("A");
		textEstado.setEditable(false);
		textEstado.setBounds(155, 219, 86, 20);
		PanelEntrenador.add(textEstado);
		textEstado.setColumns(10);
		
		btnAgregar = new JButton("Adicionar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(64, 262, 89, 23);
		PanelEntrenador.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(199, 262, 103, 23);
		PanelEntrenador.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(339, 262, 89, 23);
		PanelEntrenador.add(btnBorrar);
		
		btnButtonCancelar = new JButton("Cancelar");
		btnButtonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnButtonCancelar.setBounds(476, 296, 89, 23);
		getContentPane().add(btnButtonCancelar);
		
		JLabel lblNewLabel_6 = new JLabel("Lista de Entrenadores ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(199, 348, 151, 14);
		PanelEntrenador.add(lblNewLabel_6);
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(30, 417, 524, 187);
		PanelEntrenador.add(tblTabla);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
		lblNewLabel_7 = new JLabel("Seleccionar un entrenador para modificar o borrar");
		lblNewLabel_7.setBounds(106, 373, 366, 14);
		PanelEntrenador.add(lblNewLabel_7);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(339, 296, 89, 23);
		PanelEntrenador.add(btnReactivar);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(197, 296, 105, 23);
		PanelEntrenador.add(btnInactivar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(64, 296, 103, 23);
		PanelEntrenador.add(btnActualizar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(476, 262, 89, 23);
		PanelEntrenador.add(btnSalir);
		
	}

	public JButton getBtnButtonCancelar() {
		return btnButtonCancelar;
	}

	public void setBtnButtonCancelar(JButton btnButtonCancelar) {
		this.btnButtonCancelar = btnButtonCancelar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnReactivar() {
		return btnReactivar;
	}

	public void setBtnReactivar(JButton btnReactivar) {
		this.btnReactivar = btnReactivar;
	}

	public JButton getBtnInactivar() {
		return btnInactivar;
	}

	public void setBtnInactivar(JButton btnInactivar) {
		this.btnInactivar = btnInactivar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActulizar) {
		this.btnActualizar = btnActulizar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
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


	public JPanel getPanelEntrenador() {
		return PanelEntrenador;
	}

	public void setPanelEntrenador(JPanel panelEntrenador) {
		PanelEntrenador = panelEntrenador;
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

	public JTextField getTextDNI() {
		return textDNI;
	}

	public void setTextDNI(JTextField textDNI) {
		this.textDNI = textDNI;
	}

	public JTextField getTextCodigoEquipo() {
		return textCodigoEquipo;
	}

	public void setTextCodigoEquipo(JTextField textCodigoEquipo) {
		this.textCodigoEquipo = textCodigoEquipo;
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
