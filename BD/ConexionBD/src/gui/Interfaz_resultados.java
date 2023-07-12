package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class Interfaz_resultados extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodigo;
	private JTextField textFieldCodigoPartido;
	private JTextField textFieldTablaPosicionDet;
	private JTextField textFieldPuntos;
	private JTextField textFieldGolesFavor;
	private JTextField textFieldGolesContra;
	private JTextField textFieldEstadoRegistro;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_resultados frame = new Interfaz_resultados();
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
	public Interfaz_resultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESULTADOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(223, 11, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del Resultado");
		lblNewLabel_1.setBounds(23, 66, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Codigo del partido");
		lblNewLabel_1_1.setBounds(23, 97, 117, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tabla de posicion");
		lblNewLabel_1_2.setBounds(23, 128, 101, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Goles a Favor");
		lblNewLabel_1_1_1.setBounds(342, 97, 87, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Goles en contra");
		lblNewLabel_1_1_1_1.setBounds(342, 128, 100, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Puntos ganados");
		lblNewLabel_1_2_1.setBounds(342, 66, 101, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(160, 63, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldCodigoPartido = new JTextField();
		textFieldCodigoPartido.setColumns(10);
		textFieldCodigoPartido.setBounds(160, 94, 86, 20);
		contentPane.add(textFieldCodigoPartido);
		
		textFieldTablaPosicionDet = new JTextField();
		textFieldTablaPosicionDet.setColumns(10);
		textFieldTablaPosicionDet.setBounds(160, 125, 86, 20);
		contentPane.add(textFieldTablaPosicionDet);
		
		textFieldPuntos = new JTextField();
		textFieldPuntos.setColumns(10);
		textFieldPuntos.setBounds(465, 63, 86, 20);
		contentPane.add(textFieldPuntos);
		
		textFieldGolesFavor = new JTextField();
		textFieldGolesFavor.setColumns(10);
		textFieldGolesFavor.setBounds(465, 94, 86, 20);
		contentPane.add(textFieldGolesFavor);
		
		textFieldGolesContra = new JTextField();
		textFieldGolesContra.setColumns(10);
		textFieldGolesContra.setBounds(465, 125, 86, 20);
		contentPane.add(textFieldGolesContra);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Estado de Registro");
		lblNewLabel_1_2_2.setBounds(23, 159, 127, 14);
		contentPane.add(lblNewLabel_1_2_2);
		
		textFieldEstadoRegistro = new JTextField();
		textFieldEstadoRegistro.setEditable(false);
		textFieldEstadoRegistro.setColumns(10);
		textFieldEstadoRegistro.setBounds(160, 156, 86, 20);
		contentPane.add(textFieldEstadoRegistro);
		
		table = new JTable();
		table.setBounds(23, 278, 528, 116);
		contentPane.add(table);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(21, 210, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(21, 244, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(23, 405, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(450, 405, 101, 23);
		contentPane.add(btnSalir);
		
		JButton btnInactivar = new JButton("Inactivar");
		btnInactivar.setBounds(235, 210, 89, 23);
		contentPane.add(btnInactivar);
		
		JButton btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(235, 244, 89, 23);
		contentPane.add(btnReactivar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(450, 210, 101, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(450, 244, 101, 23);
		contentPane.add(btnActualizar);
	}
}
