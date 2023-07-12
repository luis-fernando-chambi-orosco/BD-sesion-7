package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interfaz_posiciones_cab extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldCodigo;
	private JTextField textFieldCodigoLiga;
	private JTextField textFieldEstadoRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_posiciones_cab frame = new Interfaz_posiciones_cab();
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
	public Interfaz_posiciones_cab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabla de posiciones ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(125, 11, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de tabla ");
		lblNewLabel_1.setBounds(27, 59, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Codigo de Liga");
		lblNewLabel_1_1.setBounds(27, 90, 101, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Estado de Registro");
		lblNewLabel_1_1_1.setBounds(27, 121, 123, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		table = new JTable();
		table.setBounds(27, 253, 355, 104);
		contentPane.add(table);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(164, 56, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldCodigoLiga = new JTextField();
		textFieldCodigoLiga.setColumns(10);
		textFieldCodigoLiga.setBounds(164, 87, 86, 20);
		contentPane.add(textFieldCodigoLiga);
		
		textFieldEstadoRegistro = new JTextField();
		textFieldEstadoRegistro.setEditable(false);
		textFieldEstadoRegistro.setColumns(10);
		textFieldEstadoRegistro.setBounds(164, 118, 86, 20);
		contentPane.add(textFieldEstadoRegistro);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(27, 184, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(27, 218, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnInactivar = new JButton("Inactivar");
		btnInactivar.setBounds(164, 184, 89, 23);
		contentPane.add(btnInactivar);
		
		JButton btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(164, 219, 89, 23);
		contentPane.add(btnReactivar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(293, 184, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(293, 218, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(27, 373, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(293, 373, 89, 23);
		contentPane.add(btnSalir);
	}
}
