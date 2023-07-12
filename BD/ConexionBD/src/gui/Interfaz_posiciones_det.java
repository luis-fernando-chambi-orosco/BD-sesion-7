package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_posiciones_det frame = new Interfaz_posiciones_det();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(21, 187, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(130, 187, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnInactivar = new JButton("Inactivar");
		btnInactivar.setBounds(254, 187, 89, 23);
		contentPane.add(btnInactivar);
		
		JButton btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(369, 187, 89, 23);
		contentPane.add(btnReactivar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(490, 187, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(594, 187, 89, 23);
		contentPane.add(btnActualizar);
		
		table = new JTable();
		table.setBounds(23, 221, 657, 207);
		contentPane.add(table);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(21, 439, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(591, 439, 89, 23);
		contentPane.add(btnSalir);
	}

}
