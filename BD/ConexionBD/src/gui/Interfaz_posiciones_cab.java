package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorposiciones_cab;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interfaz_posiciones_cab extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldCodigo;
	private JTextField textFieldCodigoLiga;
	private JTextField textFieldEstadoRegistro;
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
		Interfaz_posiciones_cab vista=new Interfaz_posiciones_cab();
		controladorposiciones_cab controladorres=new controladorposiciones_cab(vista);
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
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(27, 253, 355, 104);
		contentPane.add(tblTabla);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
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
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionar.setBounds(27, 184, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(27, 218, 89, 23);
		contentPane.add(btnModificar);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(164, 184, 89, 23);
		contentPane.add(btnInactivar);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReactivar.setBounds(164, 219, 89, 23);
		contentPane.add(btnReactivar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(293, 184, 89, 23);
		contentPane.add(btnBorrar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(293, 218, 89, 23);
		contentPane.add(btnActualizar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(27, 373, 89, 23);
		contentPane.add(btnCancelar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(293, 373, 89, 23);
		contentPane.add(btnSalir);

		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTextFieldCodigo() {
		return textFieldCodigo;
	}

	public void setTextFieldCodigo(JTextField textFieldCodigo) {
		this.textFieldCodigo = textFieldCodigo;
	}

	public JTextField getTextFieldCodigoLiga() {
		return textFieldCodigoLiga;
	}

	public void setTextFieldCodigoLiga(JTextField textFieldCodigoLiga) {
		this.textFieldCodigoLiga = textFieldCodigoLiga;
	}

	public JTextField getTextFieldEstadoRegistro() {
		return textFieldEstadoRegistro;
	}

	public void setTextFieldEstadoRegistro(JTextField textFieldEstadoRegistro) {
		this.textFieldEstadoRegistro = textFieldEstadoRegistro;
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
