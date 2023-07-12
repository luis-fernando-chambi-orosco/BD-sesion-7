package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorjugadores;
import Controlador.controladorpartido;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton btnAdicionar;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JButton btnReactivar;
	private JButton btnInactivar;
	private JButton btnActualizar;
	private JButton btnSalir;
	private JButton btnCancelar;
	private JComboBox<Integer> comboBoxDia;
	private JComboBox<Integer> comboBoxMes;
	private JComboBox<Integer> comboBoxAño;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Interfaz_partido vista=new Interfaz_partido();
		controladorpartido controladorpar=new controladorpartido(vista);
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
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(20, 52, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estatus ");
		lblNewLabel_2.setBounds(20, 77, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Liga");
		lblNewLabel_3.setBounds(20, 102, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Equipo local");
		lblNewLabel_4.setBounds(20, 169, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Equipo visitante");
		lblNewLabel_5.setBounds(273, 169, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ARBITROS");
		lblNewLabel_6.setBounds(583, 52, 102, 14);
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Estadio ");
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
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(20, 268, 770, 120);
		contentPane.add(tblTabla);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
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
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(135, 231, 89, 23);
		contentPane.add(btnModificar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionar.setBounds(20, 231, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(20, 399, 89, 23);
		contentPane.add(btnCancelar);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(273, 231, 89, 23);
		contentPane.add(btnInactivar);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReactivar.setBounds(441, 231, 89, 23);
		contentPane.add(btnReactivar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(583, 231, 89, 23);
		contentPane.add(btnBorrar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(698, 231, 92, 23);
		contentPane.add(btnActualizar);
		
		comboBoxDia = new JComboBox<Integer>();
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", ""}));
		comboBoxDia.setBounds(375, 73, 46, 22);
		contentPane.add(comboBoxDia);
		
		comboBoxMes = new JComboBox<Integer>();
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMes.setBounds(422, 73, 46, 22);
		contentPane.add(comboBoxMes);
		
		comboBoxAño = new JComboBox<Integer>();
		comboBoxAño.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024", "2025", "2026", "2027", "2028", "2029"}));
		comboBoxAño.setBounds(470, 73, 60, 22);
		contentPane.add(comboBoxAño);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(701, 399, 89, 23);
		contentPane.add(btnSalir);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextEstadoCurso() {
		return textEstadoCurso;
	}

	public void setTextEstadoCurso(JTextField textEstadoCurso) {
		this.textEstadoCurso = textEstadoCurso;
	}

	public JTextField getTextCodigoLiga() {
		return textCodigoLiga;
	}

	public void setTextCodigoLiga(JTextField textCodigoLiga) {
		this.textCodigoLiga = textCodigoLiga;
	}

	public JTextField getTextFieldEstadoRegistro() {
		return textFieldEstadoRegistro;
	}

	public void setTextFieldEstadoRegistro(JTextField textFieldEstadoRegistro) {
		this.textFieldEstadoRegistro = textFieldEstadoRegistro;
	}

	public JTextField getTextFieldCodigoEstadio() {
		return textFieldCodigoEstadio;
	}

	public void setTextFieldCodigoEstadio(JTextField textFieldCodigoEstadio) {
		this.textFieldCodigoEstadio = textFieldCodigoEstadio;
	}

	public JTextField getTextFieldHoraInicio() {
		return textFieldHoraInicio;
	}

	public void setTextFieldHoraInicio(JTextField textFieldHoraInicio) {
		this.textFieldHoraInicio = textFieldHoraInicio;
	}

	public JTextField getTextFieldHoraFinal() {
		return textFieldHoraFinal;
	}

	public void setTextFieldHoraFinal(JTextField textFieldHoraFinal) {
		this.textFieldHoraFinal = textFieldHoraFinal;
	}

	public JTextField getTextFieldArbitro1() {
		return textFieldArbitro1;
	}

	public void setTextFieldArbitro1(JTextField textFieldArbitro1) {
		this.textFieldArbitro1 = textFieldArbitro1;
	}

	public JTextField getTextFieldArbitro2() {
		return textFieldArbitro2;
	}

	public void setTextFieldArbitro2(JTextField textFieldArbitro2) {
		this.textFieldArbitro2 = textFieldArbitro2;
	}

	public JTextField getTextFieldArbitro3() {
		return textFieldArbitro3;
	}

	public void setTextFieldArbitro3(JTextField textFieldArbitro3) {
		this.textFieldArbitro3 = textFieldArbitro3;
	}

	public JTextField getTextFieldCodigoLocal() {
		return textFieldCodigoLocal;
	}

	public void setTextFieldCodigoLocal(JTextField textFieldCodigoLocal) {
		this.textFieldCodigoLocal = textFieldCodigoLocal;
	}

	public JTextField getTextFieldGolLocal() {
		return textFieldGolLocal;
	}

	public void setTextFieldGolLocal(JTextField textFieldGolLocal) {
		this.textFieldGolLocal = textFieldGolLocal;
	}

	public JTextField getTextFieldCodigoVisitante() {
		return textFieldCodigoVisitante;
	}

	public void setTextFieldCodigoVisitante(JTextField textFieldCodigoVisitante) {
		this.textFieldCodigoVisitante = textFieldCodigoVisitante;
	}

	public JTextField getTextFieldGolVisitante() {
		return textFieldGolVisitante;
	}

	public void setTextFieldGolVisitante(JTextField textFieldGolVisitante) {
		this.textFieldGolVisitante = textFieldGolVisitante;
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

	public JComboBox<Integer> getComboBoxDia() {
		return comboBoxDia;
	}

	public void setComboBoxDia(JComboBox<Integer> comboBoxDia) {
		this.comboBoxDia = comboBoxDia;
	}

	public JComboBox<Integer> getComboBoxMes() {
		return comboBoxMes;
	}

	public void setComboBoxMes(JComboBox<Integer> comboBoxMes) {
		this.comboBoxMes = comboBoxMes;
	}

	public JComboBox<Integer> getComboBoxAño() {
		return comboBoxAño;
	}

	public void setComboBoxAño(JComboBox<Integer> comboBoxAño) {
		this.comboBoxAño = comboBoxAño;
	}



}
