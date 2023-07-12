package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.controladorentrenador;
import Controlador.controladorfixdet;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfazdet extends JFrame {

	private JPanel contentPane;
	private JTextField cod;
	private JTextField codcab;
	private JTextField codpart;
	private JTextField estado;
	private JTable tabledet;
	JButton btnNewButtonadicionar;
	JButton btnNewButtonmodificar;
	JButton btnNewButtonborrar;
	JButton btnNewButtonactualizar;
	JButton btnNewButtoninactivar;
	JButton btnNewButtonreactivar;
	JButton btnNewButtonsalir;
	JButton btnNewButtoncancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		interfazdet vista=new interfazdet();
		controladorfixdet controladordet=new controladorfixdet(vista);
	}

	/**
	 * Create the frame.
	 */
	public interfazdet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("fixture det");
		lblNewLabel.setBounds(186, 11, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(48, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo de cabecera");
		lblNewLabel_2.setBounds(48, 90, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Codigo de partido");
		lblNewLabel_3.setBounds(48, 125, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Estado de registro");
		lblNewLabel_4.setBounds(48, 163, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		cod = new JTextField();
		cod.setBounds(168, 51, 86, 20);
		contentPane.add(cod);
		cod.setColumns(10);
		
		codcab = new JTextField();
		codcab.setBounds(168, 87, 86, 20);
		contentPane.add(codcab);
		codcab.setColumns(10);
		
		codpart = new JTextField();
		codpart.setBounds(168, 122, 86, 20);
		contentPane.add(codpart);
		codpart.setColumns(10);
		
		estado = new JTextField();
		estado.setEditable(false);
		estado.setText("A");
		estado.setBounds(168, 160, 86, 20);
		contentPane.add(estado);
		estado.setColumns(10);
		
		btnNewButtonadicionar = new JButton("Adicionar");
		btnNewButtonadicionar.setBounds(35, 206, 89, 23);
		contentPane.add(btnNewButtonadicionar);
		
		btnNewButtonmodificar = new JButton("Modificar");
		btnNewButtonmodificar.setBounds(143, 206, 89, 23);
		contentPane.add(btnNewButtonmodificar);
		
		btnNewButtonborrar = new JButton("Borrar");
		btnNewButtonborrar.setBounds(269, 206, 89, 23);
		contentPane.add(btnNewButtonborrar);
		
		btnNewButtonactualizar = new JButton("Actualizar");
		btnNewButtonactualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonactualizar.setBounds(387, 206, 103, 23);
		contentPane.add(btnNewButtonactualizar);
		
		btnNewButtoninactivar = new JButton("Inactivar");
		btnNewButtoninactivar.setBounds(35, 249, 89, 23);
		contentPane.add(btnNewButtoninactivar);
		
		btnNewButtonreactivar = new JButton("Reactivar");
		btnNewButtonreactivar.setBounds(143, 249, 89, 23);
		contentPane.add(btnNewButtonreactivar);
		
		btnNewButtonsalir = new JButton("Salir");
		btnNewButtonsalir.setBounds(269, 249, 89, 23);
		contentPane.add(btnNewButtonsalir);
		
		btnNewButtoncancelar = new JButton("Cancelar");
		btnNewButtoncancelar.setBounds(387, 249, 103, 23);
		contentPane.add(btnNewButtoncancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 307, 465, 124);
		contentPane.add(scrollPane);
		
		tabledet = new JTable();
		scrollPane.setViewportView(tabledet);
	}

	public JTextField getCod() {
		return cod;
	}

	public void setCod(JTextField cod) {
		this.cod = cod;
	}

	public JTextField getCodcab() {
		return codcab;
	}

	public void setCodcab(JTextField codcab) {
		this.codcab = codcab;
	}

	public JTextField getCodpart() {
		return codpart;
	}

	public void setCodpart(JTextField codpart) {
		this.codpart = codpart;
	}

	public JTextField getEstado() {
		return estado;
	}

	public void setEstado(JTextField estado) {
		this.estado = estado;
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

	public JButton getBtnNewButtonreactivar() {
		return btnNewButtonreactivar;
	}

	public void setBtnNewButtonreactivar(JButton btnNewButtonreactivar) {
		this.btnNewButtonreactivar = btnNewButtonreactivar;
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

	public JTable getTabledet() {
		return tabledet;
	}

	public void setTabledet(JTable tabledet) {
		this.tabledet = tabledet;
	}

}
