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
import Controlador.controladorevento;
import Controlador.controladorfixcab;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class interfazcab extends JFrame {

	JPanel contentPane;
	private JTextField codcab;
	private JTextField codlig;
	private JTextField estado;
	private JTable tablecab;
	JButton btnNewButtonadicionar;
	JButton btnNewButtonmodificar;
	JButton btnNewButtonborrar;
	JButton btnNewButtonactualizar;
	JButton btnNewButtoninactivar;
	JButton btnNewButtonreactvar;
	JButton btnNewButtonsalir;
	JButton btnNewButtoncancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		interfazcab vista=new interfazcab();
		controladorfixcab controladorent=new controladorfixcab(vista);
	}

	/**
	 * Create the frame.
	 */
	public interfazcab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TABLA DE FIX CAB");
		lblNewLabel.setBounds(214, 11, 152, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(43, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo de liga");
		lblNewLabel_2.setBounds(43, 81, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estado de registro");
		lblNewLabel_3.setBounds(43, 122, 104, 14);
		contentPane.add(lblNewLabel_3);
		
		codcab = new JTextField();
		codcab.setBounds(169, 42, 86, 20);
		contentPane.add(codcab);
		codcab.setColumns(10);
		
		codlig = new JTextField();
		codlig.setBounds(169, 78, 86, 20);
		contentPane.add(codlig);
		codlig.setColumns(10);
		
		estado = new JTextField();
		estado.setText("A");
		estado.setEditable(false);
		estado.setBounds(169, 119, 86, 20);
		contentPane.add(estado);
		estado.setColumns(10);
		
		btnNewButtonadicionar = new JButton("Adicionar");
		btnNewButtonadicionar.setBounds(58, 162, 89, 23);
		contentPane.add(btnNewButtonadicionar);
		
		btnNewButtonmodificar = new JButton("Modificar");
		btnNewButtonmodificar.setBounds(166, 162, 89, 23);
		contentPane.add(btnNewButtonmodificar);
		
		btnNewButtonborrar = new JButton("Borrar");
		btnNewButtonborrar.setBounds(296, 162, 89, 23);
		contentPane.add(btnNewButtonborrar);
		
		btnNewButtonactualizar = new JButton("Actualizar");
		btnNewButtonactualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonactualizar.setBounds(425, 162, 89, 23);
		contentPane.add(btnNewButtonactualizar);
		
		btnNewButtoninactivar = new JButton("Inactivar");
		btnNewButtoninactivar.setBounds(58, 206, 89, 23);
		contentPane.add(btnNewButtoninactivar);
		
		btnNewButtonreactvar = new JButton("Reactivar");
		btnNewButtonreactvar.setBounds(169, 206, 89, 23);
		contentPane.add(btnNewButtonreactvar);
		
		btnNewButtonsalir = new JButton("Salir");
		btnNewButtonsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonsalir.setBounds(296, 206, 89, 23);
		contentPane.add(btnNewButtonsalir);
		
		btnNewButtoncancelar = new JButton("Cancelar");
		btnNewButtoncancelar.setBounds(425, 206, 89, 23);
		contentPane.add(btnNewButtoncancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 256, 487, 150);
		contentPane.add(scrollPane);
		
		tablecab = new JTable();
		scrollPane.setViewportView(tablecab);
	}

	public JTextField getCodcab() {
		return codcab;
	}

	public void setCodcab(JTextField codcab) {
		this.codcab = codcab;
	}

	public JTextField getCodlig() {
		return codlig;
	}

	public void setCodlig(JTextField codlig) {
		this.codlig = codlig;
	}

	public JTextField getEstado() {
		return estado;
	}

	public void setEstado(JTextField estado) {
		this.estado = estado;
	}

	public JTable getTablecab() {
		return tablecab;
	}

	public void setTablecab(JTable tablecab) {
		this.tablecab = tablecab;
	}

	public JButton getBtnNewButtonadicionar() {
		return btnNewButtonadicionar;
	}

	public void setBtnNewButtonadicionar(JButton btnNewButtonadicionar) {
		this.btnNewButtonadicionar = btnNewButtonadicionar;
	}

	public JButton getBtnNewButtonmodificar() {
		return btnNewButtonmodificar;
	}

	public void setBtnNewButtonmodificar(JButton btnNewButtonmodificar) {
		this.btnNewButtonmodificar = btnNewButtonmodificar;
	}

	public JButton getBtnNewButtonborrar() {
		return btnNewButtonborrar;
	}

	public void setBtnNewButtonborrar(JButton btnNewButtonborrar) {
		this.btnNewButtonborrar = btnNewButtonborrar;
	}

	public JButton getBtnNewButtonactualizar() {
		return btnNewButtonactualizar;
	}

	public void setBtnNewButtonactualizar(JButton btnNewButtonactualizar) {
		this.btnNewButtonactualizar = btnNewButtonactualizar;
	}

	public JButton getBtnNewButtoninactivar() {
		return btnNewButtoninactivar;
	}

	public void setBtnNewButtoninactivar(JButton btnNewButtoninactivar) {
		this.btnNewButtoninactivar = btnNewButtoninactivar;
	}

	public JButton getBtnNewButtonreactvar() {
		return btnNewButtonreactvar;
	}

	public void setBtnNewButtonreactvar(JButton btnNewButtonreactvar) {
		this.btnNewButtonreactvar = btnNewButtonreactvar;
	}

	public JButton getBtnNewButtonsalir() {
		return btnNewButtonsalir;
	}

	public void setBtnNewButtonsalir(JButton btnNewButtonsalir) {
		this.btnNewButtonsalir = btnNewButtonsalir;
	}

	public JButton getBtnNewButtoncancelar() {
		return btnNewButtoncancelar;
	}

	public void setBtnNewButtoncancelar(JButton btnNewButtoncancelar) {
		this.btnNewButtoncancelar = btnNewButtoncancelar;
	}

	
	
}
