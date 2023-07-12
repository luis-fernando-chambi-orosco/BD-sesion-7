package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.controladorresultados;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		Interfaz_resultados vista=new Interfaz_resultados();
		controladorresultados controladorres=new controladorresultados(vista);
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
		
		JScrollPane tblTabla = new JScrollPane();
		tblTabla.setBounds(23, 278, 528, 116);
		contentPane.add(tblTabla);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tblTabla.setViewportView(table);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdicionar.setBounds(21, 210, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(21, 244, 89, 23);
		contentPane.add(btnModificar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(23, 405, 89, 23);
		contentPane.add(btnCancelar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(450, 405, 101, 23);
		contentPane.add(btnSalir);
		
		btnInactivar = new JButton("Inactivar");
		btnInactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInactivar.setBounds(235, 210, 89, 23);
		contentPane.add(btnInactivar);
		
		btnReactivar = new JButton("Reactivar");
		btnReactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReactivar.setBounds(235, 244, 89, 23);
		contentPane.add(btnReactivar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrar.setBounds(450, 210, 101, 23);
		contentPane.add(btnBorrar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(450, 244, 101, 23);
		contentPane.add(btnActualizar);

		
	}

	public JTextField getTextFieldCodigo() {
		return textFieldCodigo;
	}

	public void setTextFieldCodigo(JTextField textFieldCodigo) {
		this.textFieldCodigo = textFieldCodigo;
	}

	public JTextField getTextFieldCodigoPartido() {
		return textFieldCodigoPartido;
	}

	public void setTextFieldCodigoPartido(JTextField textFieldCodigoPartido) {
		this.textFieldCodigoPartido = textFieldCodigoPartido;
	}

	public JTextField getTextFieldTablaPosicionDet() {
		return textFieldTablaPosicionDet;
	}

	public void setTextFieldTablaPosicionDet(JTextField textFieldTablaPosicionDet) {
		this.textFieldTablaPosicionDet = textFieldTablaPosicionDet;
	}

	public JTextField getTextFieldPuntos() {
		return textFieldPuntos;
	}

	public void setTextFieldPuntos(JTextField textFieldPuntos) {
		this.textFieldPuntos = textFieldPuntos;
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

	public JTextField getTextFieldEstadoRegistro() {
		return textFieldEstadoRegistro;
	}

	public void setTextFieldEstadoRegistro(JTextField textFieldEstadoRegistro) {
		this.textFieldEstadoRegistro = textFieldEstadoRegistro;
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
