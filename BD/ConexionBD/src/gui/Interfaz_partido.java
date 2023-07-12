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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Interfaz_partido extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textCodigo;
	private JTextField textEstadoCurso;
	private JTextField textCodigoLiga;
	private JTextField textFieldEstadoRegistro;
	private JTextField textFieldCodigoEstadio;
	private JTextField textFieldHoraInicio;
	private JTextField textFieldHoraFinal;
	private JTextField textFieldArbitro1;
	private JTextField textFieldArbitro2;
	private JTextField textFieldArbitro3;
	private JTextField textFieldCodigoLocal;
	private JTextField textFieldGolLocal;
	private JTextField textFieldCodigoVisitante;
	private JTextField textFieldGolVisitante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_partido frame = new Interfaz_partido();
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
	public Interfaz_partido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PARTIDOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(343, 11, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del partido");
		lblNewLabel_1.setBounds(20, 52, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado del partido");
		lblNewLabel_2.setBounds(20, 77, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Liga del partido");
		lblNewLabel_3.setBounds(20, 102, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Equipo local");
		lblNewLabel_4.setBounds(20, 169, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Equipo visitante");
		lblNewLabel_5.setBounds(273, 169, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ARBITROS");
		lblNewLabel_6.setBounds(583, 52, 51, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Arbitro Principal");
		lblNewLabel_7.setBounds(580, 77, 102, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Arbitro Asistente 1");
		lblNewLabel_7_1.setBounds(580, 102, 114, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Arbitro Asistente 2");
		lblNewLabel_7_2.setBounds(580, 127, 114, 14);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Estadio del partido");
		lblNewLabel_1_1.setBounds(273, 52, 92, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fecha D/M/A");
		lblNewLabel_1_2.setBounds(273, 77, 92, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Hora de inicio");
		lblNewLabel_3_1.setBounds(273, 102, 92, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Hora de fin");
		lblNewLabel_3_1_1.setBounds(273, 127, 92, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Estado de registro");
		lblNewLabel_3_2.setBounds(20, 127, 92, 14);
		contentPane.add(lblNewLabel_3_2);
		
		table = new JTable();
		table.setBounds(20, 268, 770, 120);
		contentPane.add(table);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(122, 49, 102, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textEstadoCurso = new JTextField();
		textEstadoCurso.setColumns(10);
		textEstadoCurso.setBounds(122, 74, 102, 20);
		contentPane.add(textEstadoCurso);
		
		textCodigoLiga = new JTextField();
		textCodigoLiga.setColumns(10);
		textCodigoLiga.setBounds(122, 99, 102, 20);
		contentPane.add(textCodigoLiga);
		
		textFieldEstadoRegistro = new JTextField();
		textFieldEstadoRegistro.setEditable(false);
		textFieldEstadoRegistro.setColumns(10);
		textFieldEstadoRegistro.setBounds(122, 124, 102, 20);
		contentPane.add(textFieldEstadoRegistro);
		
		textFieldCodigoEstadio = new JTextField();
		textFieldCodigoEstadio.setColumns(10);
		textFieldCodigoEstadio.setBounds(375, 49, 155, 20);
		contentPane.add(textFieldCodigoEstadio);
		
		textFieldHoraInicio = new JTextField();
		textFieldHoraInicio.setColumns(10);
		textFieldHoraInicio.setBounds(375, 99, 155, 20);
		contentPane.add(textFieldHoraInicio);
		
		textFieldHoraFinal = new JTextField();
		textFieldHoraFinal.setColumns(10);
		textFieldHoraFinal.setBounds(375, 124, 155, 20);
		contentPane.add(textFieldHoraFinal);
		
		textFieldArbitro1 = new JTextField();
		textFieldArbitro1.setColumns(10);
		textFieldArbitro1.setBounds(704, 74, 86, 20);
		contentPane.add(textFieldArbitro1);
		
		textFieldArbitro2 = new JTextField();
		textFieldArbitro2.setColumns(10);
		textFieldArbitro2.setBounds(704, 99, 86, 20);
		contentPane.add(textFieldArbitro2);
		
		textFieldArbitro3 = new JTextField();
		textFieldArbitro3.setColumns(10);
		textFieldArbitro3.setBounds(704, 124, 86, 20);
		contentPane.add(textFieldArbitro3);
		
		textFieldCodigoLocal = new JTextField();
		textFieldCodigoLocal.setColumns(10);
		textFieldCodigoLocal.setBounds(122, 166, 70, 20);
		contentPane.add(textFieldCodigoLocal);
		
		textFieldGolLocal = new JTextField();
		textFieldGolLocal.setEditable(false);
		textFieldGolLocal.setColumns(10);
		textFieldGolLocal.setBounds(196, 166, 28, 20);
		contentPane.add(textFieldGolLocal);
		
		textFieldCodigoVisitante = new JTextField();
		textFieldCodigoVisitante.setColumns(10);
		textFieldCodigoVisitante.setBounds(375, 166, 124, 20);
		contentPane.add(textFieldCodigoVisitante);
		
		textFieldGolVisitante = new JTextField();
		textFieldGolVisitante.setEditable(false);
		textFieldGolVisitante.setColumns(10);
		textFieldGolVisitante.setBounds(502, 166, 28, 20);
		contentPane.add(textFieldGolVisitante);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(135, 231, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(20, 231, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(20, 399, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnInactivar = new JButton("Inactivar");
		btnInactivar.setBounds(273, 231, 89, 23);
		contentPane.add(btnInactivar);
		
		JButton btnReactivar = new JButton("Reactivar");
		btnReactivar.setBounds(441, 231, 89, 23);
		contentPane.add(btnReactivar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(583, 231, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(698, 231, 92, 23);
		contentPane.add(btnActualizar);
		
		JComboBox comboBoxDia = new JComboBox();
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", ""}));
		comboBoxDia.setBounds(375, 73, 46, 22);
		contentPane.add(comboBoxDia);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMes.setBounds(422, 73, 46, 22);
		contentPane.add(comboBoxMes);
		
		JComboBox comboBoxAño = new JComboBox();
		comboBoxAño.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024", "2025", "2026", "2027", "2028", "2029"}));
		comboBoxAño.setBounds(470, 73, 60, 22);
		contentPane.add(comboBoxAño);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(701, 399, 89, 23);
		contentPane.add(btnSalir);
	}
}
