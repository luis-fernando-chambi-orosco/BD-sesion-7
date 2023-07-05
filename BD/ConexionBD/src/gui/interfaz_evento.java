package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.controladorentrenador;
import Controlador.controladorevento;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class interfaz_evento extends JFrame {
	private JTextField CodEven;
	private JTextField TipoEven;
	private JTextField Codjug;
	private JTextField Codpart;
	private JTextField Codarb;
	private JTextField Min;
	private JTextField Estad;
	private JTextField EstReg;
	private JTable table_event;
	private JButton btnButtonadicionarEven;
	private JButton btnButtonModificarEven;
	private JButton btnButtonborrarEven;
	private JButton btnButtonsalirEven;
	private JButton btnButtonactualizarEven;
	private JButton btnButtoninactivarEven;
	private JButton btnButtonreactivarEven;
	private JButton btnButtonCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		interfaz_evento vista=new interfaz_evento();
		controladorevento controladorent=new controladorevento(vista);
	}

	/**
	 * Create the frame.
	 */
	public interfaz_evento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 635);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tabla Eventos ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(389, 37, 167, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Codigo de Evento");
		lblNewLabel.setBounds(48, 85, 92, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de evento");
		lblNewLabel_2.setBounds(48, 120, 114, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Codigo de jugador");
		lblNewLabel_3.setBounds(598, 85, 114, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Codigo de Arbitro");
		lblNewLabel_4.setBounds(328, 85, 114, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Minuto del Evento");
		lblNewLabel_5.setBounds(328, 120, 114, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Estadio");
		lblNewLabel_6.setBounds(200, 164, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Estado de Registro");
		lblNewLabel_8.setBounds(427, 164, 129, 14);
		getContentPane().add(lblNewLabel_8);
		
		CodEven = new JTextField();
		CodEven.setBounds(160, 82, 86, 20);
		getContentPane().add(CodEven);
		CodEven.setColumns(10);
		
		TipoEven = new JTextField();
		TipoEven.setBounds(160, 117, 86, 20);
		getContentPane().add(TipoEven);
		TipoEven.setColumns(10);
		
		Codjug = new JTextField();
		Codjug.setBounds(722, 82, 86, 20);
		getContentPane().add(Codjug);
		Codjug.setColumns(10);
		
		Codpart = new JTextField();
		Codpart.setBounds(722, 117, 86, 20);
		getContentPane().add(Codpart);
		Codpart.setColumns(10);
		
		Codarb = new JTextField();
		Codarb.setBounds(452, 82, 86, 20);
		getContentPane().add(Codarb);
		Codarb.setColumns(10);
		
		Min = new JTextField();
		Min.setBounds(452, 117, 86, 20);
		getContentPane().add(Min);
		Min.setColumns(10);
		
		Estad = new JTextField();
		Estad.setBounds(283, 161, 86, 20);
		getContentPane().add(Estad);
		Estad.setColumns(10);
		
		EstReg = new JTextField("A");
		EstReg.setEditable(false);
		EstReg.setBounds(598, 161, 86, 20);
		getContentPane().add(EstReg);
		EstReg.setColumns(10);
		
		btnButtonadicionarEven = new JButton("Adicionar");
		btnButtonadicionarEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnButtonadicionarEven.setBounds(183, 209, 89, 23);
		getContentPane().add(btnButtonadicionarEven);
		
		btnButtonModificarEven = new JButton("Modificar");
		btnButtonModificarEven.setBounds(328, 209, 89, 23);
		getContentPane().add(btnButtonModificarEven);
		
		btnButtonborrarEven = new JButton("Borrar");
		btnButtonborrarEven.setBounds(467, 209, 89, 23);
		getContentPane().add(btnButtonborrarEven);
		
		btnButtonsalirEven = new JButton("Salir");
		btnButtonsalirEven.setBounds(520, 258, 89, 23);
		getContentPane().add(btnButtonsalirEven);
		
		btnButtonactualizarEven = new JButton("Actualizar");
		btnButtonactualizarEven.setBounds(623, 209, 106, 23);
		getContentPane().add(btnButtonactualizarEven);
		
		btnButtoninactivarEven = new JButton("Inactivar");
		btnButtoninactivarEven.setBounds(242, 258, 89, 23);
		getContentPane().add(btnButtoninactivarEven);
		
		btnButtonreactivarEven = new JButton("Reactivar");
		btnButtonreactivarEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnButtonreactivarEven.setBounds(379, 258, 89, 23);
		getContentPane().add(btnButtonreactivarEven);
		
		JLabel lblNewLabel_7 = new JLabel("Codigo de Partido");
		lblNewLabel_7.setBounds(598, 120, 114, 14);
		getContentPane().add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 358, 876, 193);
		getContentPane().add(scrollPane);
		
		table_event = new JTable();
		scrollPane.setViewportView(table_event);
		
		btnButtonCancelar = new JButton("Cancelar");
		btnButtonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnButtonCancelar.setBounds(640, 258, 89, 23);
		getContentPane().add(btnButtonCancelar);
	}

	public JButton getBtnButtonCancelar() {
		return btnButtonCancelar;
	}

	public void setBtnButtonCancelar(JButton btnButtonCancelar) {
		this.btnButtonCancelar = btnButtonCancelar;
	}

	public JTextField getCodEven() {
		return CodEven;
	}

	public JTextField getTipoEven() {
		return TipoEven;
	}

	public JTextField getCodjug() {
		return Codjug;
	}

	public JTextField getCodpart() {
		return Codpart;
	}

	public JTextField getCodarb() {
		return Codarb;
	}

	public JTextField getMin() {
		return Min;
	}

	public JTextField getEstad() {
		return Estad;
	}

	public JTextField getEstReg() {
		return EstReg;
	}

	public JTable getTable_event() {
		return table_event;
	}

	public JButton getBtnButtonadicionarEven() {
		return btnButtonadicionarEven;
	}

	public JButton getBtnButtonModificarEven() {
		return btnButtonModificarEven;
	}

	public JButton getBtnButtonborrarEven() {
		return btnButtonborrarEven;
	}

	public JButton getBtnButtonsalirEven() {
		return btnButtonsalirEven;
	}

	public JButton getBtnButtonactualizarEven() {
		return btnButtonactualizarEven;
	}

	public JButton getBtnButtoninactivarEven() {
		return btnButtoninactivarEven;
	}

	public JButton getBtnButtonreactivarEven() {
		return btnButtonreactivarEven;
	}
	
}
