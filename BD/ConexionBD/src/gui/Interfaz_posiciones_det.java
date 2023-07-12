package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorposiciones_det;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Interfaz_posiciones_det extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodigo;
	private JTextField textFieldCodigoEquipo;
	private JTextField textFieldCodigoPosicionesCab;
	private JTextField textFieldEstadoRegistro;
	private JTextField textFieldGolesFavor;
	private JTextField textFieldGolesContra;
	private JTextField textFieldPuesto;
	private JTextField textFieldPuntaje;
	private JTextField textFieldPartidosJugados;
	private JTextField textFieldPartidosGanados;
	private JTextField textFieldPartidosEmpatados;
	private JTextField textFieldPartidosPerdidos;
	private JTable table;
	private JButton btnAdicionar;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReactivar;
	private JButton btnInactivar;
	private JButton btnActualizar;
	private JButton btnSalir;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Interfaz_posiciones_det vista=new Interfaz_posiciones_det();
		controladorposiciones_det controladorposdet=new controladorposiciones_det(vista);
	}

	/**
	 * Create the frame.
	 */
	public Interfaz_posiciones_det() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetallesDePosiciones = new JLabel("Detalles de posiciones ");
		lblDetallesDePosiciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDetallesDePosiciones.setBounds(266, 11, 192, 14);
		contentPane.add(lblDetallesDePosiciones);
		
		JLabel lblNewLabel = new JLabel("Codigo de detalle");
		lblNewLabel.setBounds(21, 42, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCodigoDeEquipo = new JLabel("Codigo de Equipo");
		lblCodigoDeEquipo.setBounds(21, 71, 106, 14);
		contentPane.add(lblCodigoDeEquipo);
		
		JLabel lblCodigo = new JLabel("Codigo Tabla ");
		lblCodigo.setBounds(21, 102, 106, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNewLabel_4 = new JLabel("Puntaje");
		lblNewLabel_4.setBounds(490, 133, 106, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Partidos Jugados");
		lblNewLabel_3_1.setBounds(254, 42, 106, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Partidos Ganados");
		lblNewLabel_3_2.setBounds(254, 71, 106, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Partidos Empatados ");
		lblNewLabel_3_3.setBounds(254, 102, 134, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Partidos Perdidos");
		lblNewLabel_3_4.setBounds(254, 133, 106, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Goles a favor");
		lblNewLabel_3_4_1.setBounds(490, 42, 106, 14);
		contentPane.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Goles en contra");
		lblNewLabel_3_4_2.setBounds(490, 71, 106, 14);
		contentPane.add(lblNewLabel_3_4_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Estado de Registro");
		lblNewLabel_4_1.setBounds(21, 133, 122, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Puesto");
		lblNewLabel_4_2.setBounds(490, 102, 106, 14);
		contentPane.add(lblNewLabel_4_2);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(133, 39, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldCodigoEquipo = new JTextField();
		textFieldCodigoEquipo.setColumns(10);
		textFieldCodigoEquipo.setBounds(133, 68, 86, 20);
		contentPane.add(textFieldCodigoEquipo);
		
		textFieldCodigoPosicionesCab = new JTextField();
		textFieldCodigoPosicionesCab.setColumns(10);
		textFieldCodigoPosicionesCab.setBounds(133, 99, 86, 20);
		contentPane.add(textFieldCodigoPosicionesCab);
		
		textFieldEstadoRegistro = new JTextField();
		textFieldEstadoRegistro.setEditable(false);
		textFieldEstadoRegistro.setColumns(10);
		textFieldEstadoRegistro.setBounds(133, 130, 86, 20);
		contentPane.add(textFieldEstadoRegistro);
		
		textFieldGolesFavor = new JTextField();
		textFieldGolesFavor.setColumns(10);
		textFieldGolesFavor.setBounds(594, 39, 86, 20);
		contentPane.add(textFieldGolesFavor);
		
		textFieldGolesContra = new JTextField();
		textFieldGolesContra.setColumns(10);
		textFieldGolesContra.setBounds(594, 68, 86, 20);
		contentPane.add(textFieldGolesContra);
		
		textFieldPuesto = new JTextField();
		textFieldPuesto.setColumns(10);
		textFieldPuesto.setBounds(594, 99, 86, 20);
		contentPane.add(textFieldPuesto);
		
		textFieldPuntaje = new JTextField();
		textFieldPuntaje.setColumns(10);
		textFieldPuntaje.setBounds(594, 130, 86, 20);
		contentPane.add(textFieldPuntaje);
		
		textFieldPartidosJugados = new JTextField();
		textFieldPartidosJugados.setColumns(10);
		textFieldPartidosJugados.setBounds(372, 39, 86, 20);
		contentPane.add(textFieldPartidosJugados);
		
		textFieldPartidosGanados = new JTextField();
		textFieldPartidosGanados.setColumns(10);
		textFieldPartidosGanados.setBounds(372, 68, 86, 20);
		contentPane.add(textFieldPartidosGanados);
		
		textFieldPartidosEmpatados = new JTextField();
		textFieldPartidosEmpatados.setColumns(10);
		textFieldPartidosEmpatados.setBounds(372, 99, 86, 20);
		contentPane.add(textFieldPartidosEmpatados);
		
		textFieldPartidosPerdidos = new JTextField();
		textFieldPartidosPerdidos.setColumns(10);
		textFieldPartidosPerdidos.setBounds(372, 130, 86, 20);
		contentPane.add(textFieldPartidosPerdidos);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionar.setBounds(21, 187, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(130, 187, 89, 23);
		contentPane.add(btnModificar);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(254, 187, 89, 23);
		contentPane.add(btnInactivar);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReactivar.setBounds(369, 187, 89, 23);
		contentPane.add(btnReactivar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(490, 187, 89, 23);
		contentPane.add(btnBorrar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(594, 187, 89, 23);
		contentPane.add(btnActualizar);
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(23, 221, 657, 207);
		contentPane.add(tblTabla);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(21, 439, 89, 23);
		contentPane.add(btnCancelar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(591, 439, 89, 23);
		contentPane.add(btnSalir);

		

	}

	public JTextField getTextFieldCodigo() {
		return textFieldCodigo;
	}

	public void setTextFieldCodigo(JTextField textFieldCodigo) {
		this.textFieldCodigo = textFieldCodigo;
	}

	public JTextField getTextFieldCodigoEquipo() {
		return textFieldCodigoEquipo;
	}

	public void setTextFieldCodigoEquipo(JTextField textFieldCodigoEquipo) {
		this.textFieldCodigoEquipo = textFieldCodigoEquipo;
	}

	public JTextField getTextFieldCodigoPosicionesCab() {
		return textFieldCodigoPosicionesCab;
	}

	public void setTextFieldCodigoPosicionesCab(JTextField textFieldCodigoPosicionesCab) {
		this.textFieldCodigoPosicionesCab = textFieldCodigoPosicionesCab;
	}

	public JTextField getTextFieldEstadoRegistro() {
		return textFieldEstadoRegistro;
	}

	public void setTextFieldEstadoRegistro(JTextField textFieldEstadoRegistro) {
		this.textFieldEstadoRegistro = textFieldEstadoRegistro;
	}

	public JTextField getTextFieldGolesFavor() {
		return textFieldGolesFavor;
	}

	public void setTextFieldGolesFavor(JTextField textFieldGolesFavor) {
		this.textFieldGolesFavor = textFieldGolesFavor;
	}

	public JTextField getTextFieldGolesContra() {
		return textFieldGolesContra;
	}

	public void setTextFieldGolesContra(JTextField textFieldGolesContra) {
		this.textFieldGolesContra = textFieldGolesContra;
	}

	public JTextField getTextFieldPuesto() {
		return textFieldPuesto;
	}

	public void setTextFieldPuesto(JTextField textFieldPuesto) {
		this.textFieldPuesto = textFieldPuesto;
	}

	public JTextField getTextFieldPuntaje() {
		return textFieldPuntaje;
	}

	public void setTextFieldPuntaje(JTextField textFieldPuntaje) {
		this.textFieldPuntaje = textFieldPuntaje;
	}

	public JTextField getTextFieldPartidosJugados() {
		return textFieldPartidosJugados;
	}

	public void setTextFieldPartidosJugados(JTextField textFieldPartidosJugados) {
		this.textFieldPartidosJugados = textFieldPartidosJugados;
	}

	public JTextField getTextFieldPartidosGanados() {
		return textFieldPartidosGanados;
	}

	public void setTextFieldPartidosGanados(JTextField textFieldPartidosGanados) {
		this.textFieldPartidosGanados = textFieldPartidosGanados;
	}

	public JTextField getTextFieldPartidosEmpatados() {
		return textFieldPartidosEmpatados;
	}

	public void setTextFieldPartidosEmpatados(JTextField textFieldPartidosEmpatados) {
		this.textFieldPartidosEmpatados = textFieldPartidosEmpatados;
	}

	public JTextField getTextFieldPartidosPerdidos() {
		return textFieldPartidosPerdidos;
	}

	public void setTextFieldPartidosPerdidos(JTextField textFieldPartidosPerdidos) {
		this.textFieldPartidosPerdidos = textFieldPartidosPerdidos;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
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

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

}
