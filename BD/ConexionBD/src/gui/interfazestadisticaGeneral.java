package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.controladorestgeneral;
import Controlador.controladorfixdet;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class interfazestadisticaGeneral extends JFrame {

	private JPanel contentPane;
	private JTextField cod;
	private JTextField numgoles;
	private JTextField tarjamar;
	private JTextField tarjroj;
	private JTextField codliga;
	private JTextField estado;
	private JTable tableestgen;
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
		interfazestadisticaGeneral vista=new interfazestadisticaGeneral();
		controladorestgeneral controladorestgen=new controladorestgeneral(vista);
	}

	/**
	 * Create the frame.
	 */
	public interfazestadisticaGeneral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tabla estadistica general ");
		lblNewLabel.setBounds(326, 28, 211, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(31, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de goles");
		lblNewLabel_2.setBounds(31, 136, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero de tarjetas amarillas");
		lblNewLabel_3.setBounds(31, 173, 170, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Numero de tarjeats rojas");
		lblNewLabel_4.setBounds(336, 93, 157, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Codigo de liga");
		lblNewLabel_5.setBounds(336, 136, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Estado de registro");
		lblNewLabel_6.setBounds(336, 173, 119, 14);
		contentPane.add(lblNewLabel_6);
		
		cod = new JTextField();
		cod.setBounds(100, 90, 86, 20);
		contentPane.add(cod);
		cod.setColumns(10);
		
		numgoles = new JTextField();
		numgoles.setBounds(181, 133, 86, 20);
		contentPane.add(numgoles);
		numgoles.setColumns(10);
		
		tarjamar = new JTextField();
		tarjamar.setBounds(222, 170, 86, 20);
		contentPane.add(tarjamar);
		tarjamar.setColumns(10);
		
		tarjroj = new JTextField();
		tarjroj.setBounds(503, 90, 86, 20);
		contentPane.add(tarjroj);
		tarjroj.setColumns(10);
		
		codliga = new JTextField();
		codliga.setBounds(465, 133, 86, 20);
		contentPane.add(codliga);
		codliga.setColumns(10);
		
		estado = new JTextField();
		estado.setEditable(false);
		estado.setText("A");
		estado.setBounds(465, 170, 86, 20);
		contentPane.add(estado);
		estado.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 333, 795, 132);
		contentPane.add(scrollPane);
		
		tableestgen = new JTable();
		scrollPane.setViewportView(tableestgen);
		
		btnNewButtonadicionar = new JButton("Adicionar");
		btnNewButtonadicionar.setBounds(50, 228, 89, 23);
		contentPane.add(btnNewButtonadicionar);
		
		btnNewButtonmodificar = new JButton("Modificar");
		btnNewButtonmodificar.setBounds(232, 228, 89, 23);
		contentPane.add(btnNewButtonmodificar);
		
		btnNewButtonborrar = new JButton("Borrar");
		btnNewButtonborrar.setBounds(379, 228, 89, 23);
		contentPane.add(btnNewButtonborrar);
		
		btnNewButtonactualizar = new JButton("Actualizar");
		btnNewButtonactualizar.setBounds(577, 228, 98, 23);
		contentPane.add(btnNewButtonactualizar);
		
		btnNewButtoninactivar = new JButton("Inactivar");
		btnNewButtoninactivar.setBounds(50, 262, 89, 23);
		contentPane.add(btnNewButtoninactivar);
		
		btnNewButtonreactivar = new JButton("Reactivar");
		btnNewButtonreactivar.setBounds(232, 262, 89, 23);
		contentPane.add(btnNewButtonreactivar);
		
		btnNewButtonsalir = new JButton("Salir");
		btnNewButtonsalir.setBounds(379, 262, 89, 23);
		contentPane.add(btnNewButtonsalir);
		
		btnNewButtoncancelar = new JButton("Cancelar");
		btnNewButtoncancelar.setBounds(577, 262, 98, 23);
		contentPane.add(btnNewButtoncancelar);
	}

	public JTextField getCod() {
		return cod;
	}

	public void setCod(JTextField cod) {
		this.cod = cod;
	}

	public JTextField getNumgoles() {
		return numgoles;
	}

	public void setNumgoles(JTextField numgoles) {
		this.numgoles = numgoles;
	}

	public JTextField getTarjamar() {
		return tarjamar;
	}

	public void setTarjamar(JTextField tarjamar) {
		this.tarjamar = tarjamar;
	}

	public JTextField getTarjroj() {
		return tarjroj;
	}

	public void setTarjroj(JTextField tarjroj) {
		this.tarjroj = tarjroj;
	}

	public JTextField getCodliga() {
		return codliga;
	}

	public void setCodliga(JTextField codliga) {
		this.codliga = codliga;
	}

	public JTextField getEstado() {
		return estado;
	}

	public void setEstado(JTextField estado) {
		this.estado = estado;
	}

	public JTable getTableestgen() {
		return tableestgen;
	}

	public void setTableestgen(JTable tableestgen) {
		this.tableestgen = tableestgen;
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
	
}
