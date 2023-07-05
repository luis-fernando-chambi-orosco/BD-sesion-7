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


import Controlador.controladorjugadores;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Interfaz_jugadores extends JFrame {

	private JPanel PanelJugadores;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textPosicionJugador;
	private JTextField textEstado;
	private JTextField textCodigoEquipo;
	private JTextField textNumeroCamiseta;
	private JTextField textEdad;
	private JTextField textGoles;
	private JTextField textTargetasAmarillas;
	private JTextField textTargetasRojas;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReactivar;
	private JButton btnInactivar;
	private JButton btnActualizar;
	private JButton btnSalir;
	private JButton btnCancelar;
	private JLabel lblNewLabel_7;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Interfaz_jugadores vista=new Interfaz_jugadores();
		controladorjugadores controladorjug=new controladorjugadores(vista);
	}

	/**
	 * Create the frame.
	 */
	public Interfaz_jugadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 709);
		PanelJugadores = new JPanel();
		PanelJugadores.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelJugadores);
		PanelJugadores.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JUGADORES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(279, 11, 183, 34);
		PanelJugadores.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(30, 72, 46, 14);
		PanelJugadores.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(30, 110, 46, 14);
		PanelJugadores.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setBounds(30, 151, 46, 14);
		PanelJugadores.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Posicion");
		lblNewLabel_4.setBounds(30, 187, 115, 14);
		PanelJugadores.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estado De Registro");
		lblNewLabel_5.setBounds(30, 262, 115, 14);
		PanelJugadores.add(lblNewLabel_5);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(146, 69, 114, 20);
		PanelJugadores.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(146, 107, 114, 20);
		PanelJugadores.add(textNombre);
		textNombre.setColumns(10);
		
		textDNI = new JTextField();
		textDNI.setBounds(146, 148, 114, 20);
		PanelJugadores.add(textDNI);
		textDNI.setColumns(10);
		
		textPosicionJugador = new JTextField();
		textPosicionJugador.setBounds(146, 184, 114, 20);
		PanelJugadores.add(textPosicionJugador);
		textPosicionJugador.setColumns(10);
		
		textEstado = new JTextField();
		textEstado.setEditable(false);
		textEstado.setBounds(174, 259, 86, 20);
		PanelJugadores.add(textEstado);
		textEstado.setColumns(10);
		
		btnAgregar = new JButton("Adicionar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(30, 321, 100, 23);
		PanelJugadores.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(30, 355, 100, 23);
		PanelJugadores.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(624, 321, 100, 23);
		PanelJugadores.add(btnBorrar);
		
		JLabel lblNewLabel_6 = new JLabel("Lista de Jugadores");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(297, 392, 151, 14);
		PanelJugadores.add(lblNewLabel_6);
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(30, 442, 694, 187);
		PanelJugadores.add(tblTabla);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
		lblNewLabel_7 = new JLabel("Seleccionar un jugador para modificar o borrar");
		lblNewLabel_7.setBounds(249, 417, 300, 14);
		PanelJugadores.add(lblNewLabel_7);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(328, 355, 100, 23);
		PanelJugadores.add(btnReactivar);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(328, 321, 100, 23);
		PanelJugadores.add(btnInactivar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(624, 355, 100, 23);
		PanelJugadores.add(btnActualizar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(624, 640, 100, 23);
		PanelJugadores.add(btnSalir);
		
		JLabel lblNewLabel_3_1 = new JLabel("Numero Camiseta");
		lblNewLabel_3_1.setBounds(478, 72, 108, 14);
		PanelJugadores.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Edad");
		lblNewLabel_3_1_1.setBounds(478, 110, 86, 14);
		PanelJugadores.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Goles");
		lblNewLabel_3_1_1_1.setBounds(478, 151, 86, 14);
		PanelJugadores.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Targetas Amarillas");
		lblNewLabel_3_1_1_1_1.setBounds(475, 187, 111, 14);
		PanelJugadores.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Targetas Rojas");
		lblNewLabel_3_1_1_1_1_1.setBounds(475, 222, 100, 14);
		PanelJugadores.add(lblNewLabel_3_1_1_1_1_1);
		
		textCodigoEquipo = new JTextField();
		textCodigoEquipo.setColumns(10);
		textCodigoEquipo.setBounds(146, 219, 114, 20);
		PanelJugadores.add(textCodigoEquipo);
		
		JLabel lblNewLabel_4_1 = new JLabel("Codigo Equipo");
		lblNewLabel_4_1.setBounds(30, 222, 115, 14);
		PanelJugadores.add(lblNewLabel_4_1);
		
		textNumeroCamiseta = new JTextField();
		textNumeroCamiseta.setColumns(10);
		textNumeroCamiseta.setBounds(610, 69, 114, 20);
		PanelJugadores.add(textNumeroCamiseta);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(610, 107, 114, 20);
		PanelJugadores.add(textEdad);
		
		textGoles = new JTextField();
		textGoles.setEditable(false);
		textGoles.setColumns(10);
		textGoles.setBounds(610, 148, 114, 20);
		PanelJugadores.add(textGoles);
		
		textTargetasAmarillas = new JTextField();
		textTargetasAmarillas.setEditable(false);
		textTargetasAmarillas.setColumns(10);
		textTargetasAmarillas.setBounds(610, 184, 114, 20);
		PanelJugadores.add(textTargetasAmarillas);
		
		textTargetasRojas = new JTextField();
		textTargetasRojas.setEditable(false);
		textTargetasRojas.setColumns(10);
		textTargetasRojas.setBounds(610, 219, 114, 20);
		PanelJugadores.add(textTargetasRojas);
		
		btnCancelar = new JButton("cancelar");
		btnCancelar.setBounds(30, 640, 100, 23);
		PanelJugadores.add(btnCancelar);
		
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
	public JPanel getPanelJugadores() {
		return PanelJugadores;
	}

	public void setPanelJugadores(JPanel panelJugadores) {
		PanelJugadores = panelJugadores;
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

	public JTextField getTextPosicionJugador() {
		return textPosicionJugador;
	}

	public void setTextPosicionJugador(JTextField textPosicionJugador) {
		this.textPosicionJugador = textPosicionJugador;
	}

	public JTextField getTextNumeroCamiseta() {
		return textNumeroCamiseta;
	}

	public void setTextNumeroCamiseta(JTextField textNumeroCamiseta) {
		this.textNumeroCamiseta = textNumeroCamiseta;
	}

	public JTextField getTextEdad() {
		return textEdad;
	}

	public void setTextEdad(JTextField textEdad) {
		this.textEdad = textEdad;
	}

	public JTextField getTextGoles() {
		return textGoles;
	}

	public void setTextGoles(JTextField textGoles) {
		this.textGoles = textGoles;
	}

	public JTextField getTextTargetasAmarillas() {
		return textTargetasAmarillas;
	}

	public void setTextTargetasAmarillas(JTextField textTargetasAmarillas) {
		this.textTargetasAmarillas = textTargetasAmarillas;
	}

	public JTextField getTextTargetasRojas() {
		return textTargetasRojas;
	}

	public void setTextTargetasRojas(JTextField textTargetasRojas) {
		this.textTargetasRojas = textTargetasRojas;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

}
