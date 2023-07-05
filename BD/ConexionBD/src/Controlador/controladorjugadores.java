package Controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import gui.Interfaz_jugadores;
import modelo.jugadores;
import modelo.jugadoresDAO;

public class controladorjugadores implements ActionListener {
	int codigo;
	String nombre;
	String dni;
	String posicion_jugador;
	int codigo_equipo;
	int numero_camiseta;
	int edad;
	int goles;
	int targetas_amarillas;
	int targetas_rojas;
	String estado;

	jugadores jug = new jugadores();
	jugadoresDAO jugDAO = new jugadoresDAO();
	Interfaz_jugadores vista = new Interfaz_jugadores();
	DefaultTableModel tablaent = new DefaultTableModel();

	public controladorjugadores(Interfaz_jugadores vista) {
		this.vista = vista;
		vista.setVisible(true);
		agregareventos();
		listartabla();
	}

	public void agregareventos() {
		vista.getBtnAgregar().addActionListener(this);
		vista.getBtnActualizar().addActionListener(this);
		vista.getBtnBorrar().addActionListener(this);
		vista.getBtnSalir().addActionListener(this);
		vista.getBtnModificar().addActionListener(this);
		vista.getBtnInactivar().addActionListener(this);
		vista.getBtnReactivar().addActionListener(this);
		vista.getBtnCancelar().addActionListener(this);
		vista.getTable().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				llenar(e);

			}
		});
	}

	public void listartabla() {
		String[] titulos = new String[] { "Codigo", "Nombre", "dni", "Posicion", "Codigo de Equipo", "Numero Camiseta",
				"Edad", "Goles", "Targetas Amarillas", "Targetas Rojas", "Estado Registro" };
		tablaent = new DefaultTableModel(titulos, 0);
		List<jugadores> listaprod = jugDAO.Listar();
		for (jugadores pro : listaprod) {
			tablaent.addRow(new Object[] { pro.getCodigo(), pro.getNombre(), pro.getDni(), pro.getPosicion_jugador(),
					pro.getCodigo_equipo(), pro.getNumero_camiseta(), pro.getEdad(), pro.getGoles(),
					pro.getTargetas_amarillas(), pro.getTargetas_rojas(), pro.getEstado() });
		}
		vista.getTable().setModel(tablaent);
		vista.getTable().setPreferredSize(new Dimension(350, tablaent.getRowCount() * 16));
	}

	public void llenar(MouseEvent e) {
		JTable target = (JTable) e.getSource();
		codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
		vista.getTextCodigo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
		vista.getTextNombre().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
		vista.getTextDNI().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
		vista.getTextPosicionJugador().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
		vista.getTextCodigoEquipo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
		vista.getTextNumeroCamiseta()
				.setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 5).toString());
		vista.getTextEdad().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 6).toString());
		vista.getTextGoles().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 7).toString());
		vista.getTextTargetasAmarillas()
				.setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 8).toString());
		vista.getTextTargetasRojas()
				.setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 9).toString());
		vista.getTextEstado().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 10).toString());
	}

	public boolean validardatosent() {
		if ("".equals(vista.getTextNombre().getText()) || "".equals(vista.getTextDNI().getText())
				|| "".equals(vista.getTextCodigoEquipo().getText())) {
			JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
			return false;
		}
		return true;
	}

	// validando los datos para que el usuario no meta cosas que no se pide
	public boolean cargardatosent() {
		try {
			codigo = Integer.parseInt(vista.getTextCodigo().getText());
			nombre = vista.getTextNombre().getText();
			dni = vista.getTextDNI().getText();
			posicion_jugador = vista.getTextPosicionJugador().getText();
			codigo_equipo = Integer.parseInt(vista.getTextCodigoEquipo().getText());
			numero_camiseta = Integer.parseInt(vista.getTextNumeroCamiseta().getText());
			edad = Integer.parseInt(vista.getTextEdad().getText());
			goles = Integer.parseInt(vista.getTextGoles().getText());
			targetas_amarillas = Integer.parseInt(vista.getTextTargetasAmarillas().getText());
			targetas_rojas = Integer.parseInt(vista.getTextTargetasRojas().getText());
			estado = vista.getTextEstado().getText();

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al cargar datos" + e);
			return false;
		}
	}

		public boolean cargardatosentNuevo() {
		try {
			codigo = Integer.parseInt(vista.getTextCodigo().getText());
			nombre = vista.getTextNombre().getText();
			dni = vista.getTextDNI().getText();
			posicion_jugador = vista.getTextPosicionJugador().getText();
			codigo_equipo = Integer.parseInt(vista.getTextCodigoEquipo().getText());
			numero_camiseta = Integer.parseInt(vista.getTextNumeroCamiseta().getText());
			edad = Integer.parseInt(vista.getTextEdad().getText());
			//goles = Integer.parseInt(vista.getTextGoles().getText());
			//targetas_amarillas = Integer.parseInt(vista.getTextTargetasAmarillas().getText());
			//targetas_rojas = Integer.parseInt(vista.getTextTargetasRojas().getText());
			//estado = vista.getTextEstado().getText();

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al cargar datos" + e);
			return false;
		}
	}

	public void limpiar() {
		vista.getTextCodigo().setText("");
		vista.getTextNombre().setText("");
		vista.getTextDNI().setText("");
		vista.getTextCodigoEquipo().setText("");
		vista.getTextEstado().setText("");
		vista.getTextPosicionJugador().setText("");
		vista.getTextNumeroCamiseta().setText("");
		vista.getTextEdad().setText("");
		vista.getTextGoles().setText("");
		vista.getTextTargetasAmarillas().setText("");
		vista.getTextTargetasRojas().setText("");
		codigo = 0;
		nombre = "--";
		codigo_equipo = 0;
		estado = "A";
		dni = "--";
	}

	public void agregar() {
		try {
			if (validardatosent()) {
				if (cargardatosentNuevo()) {
					jugadores jug = new jugadores(codigo, nombre, dni, posicion_jugador, codigo_equipo, numero_camiseta,
							edad);
					jugDAO.agregar(jug);
					JOptionPane.showMessageDialog(null, "registro exitosos");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al agregar" + e);
		}
	}

	public void modificar() {
		try {
			if (validardatosent()) {
				if (cargardatosent()) {
					jugadores jug = new jugadores(codigo, nombre, dni, posicion_jugador, codigo_equipo, numero_camiseta,
							edad, goles, targetas_amarillas, targetas_rojas, estado);
					jugDAO.actualizar(jug);
					JOptionPane.showMessageDialog(null, "modificacion exitosa");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al actualizar datos" + e);
		}
	}

	public void borrar() {
		try {
			if (codigo != 0) {
				jugDAO.borrar(codigo);
				JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
				limpiar();

			}
		} catch (Exception e) {
			System.out.println("error al borrar datos" + e);
		}
	}

	public void salir() {
		try {
			JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("ocurrio un error inesperado" + e);
		}
	}

	public void actualizar() {
		try {
			listartabla();
			JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ocurrio un error inesperado al querer actualizar la tabla" + e);
		}
	}

	public void inactivar(){
		try {
			if (validardatosent()) {
				if (cargardatosent()) {
					jugadores jug = new jugadores(codigo, nombre, dni, posicion_jugador, codigo_equipo, numero_camiseta,
							edad, goles, targetas_amarillas, targetas_rojas, "I");
					jugDAO.dejarInactivo(jug);
					JOptionPane.showMessageDialog(null, "inactivacion exitosa");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al inactivar" + e);
		}
	}

	public void reactivar(){
		try {
			if (validardatosent()) {
				if (cargardatosent()) {
					jugadores jug = new jugadores(codigo, nombre, dni, posicion_jugador, codigo_equipo, numero_camiseta,
							edad, goles, targetas_amarillas, targetas_rojas, "A");
					jugDAO.volverActivo(jug);
					JOptionPane.showMessageDialog(null, "Reactivacion exitosa");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al activar" + e);
		}
	}

	// con esto daremos acciones a los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnAgregar()) {
			agregar();
		}
		if (e.getSource() == vista.getBtnModificar()) {
			modificar();
		}
		if (e.getSource() == vista.getBtnBorrar()) {
			borrar();
		}
		if (e.getSource() == vista.getBtnActualizar()) {
			actualizar();
		}
		if (e.getSource() == vista.getBtnSalir()) {
			salir();
		}
		if (e.getSource() == vista.getBtnCancelar()) {
			limpiar();
		}
		
		if (e.getSource() == vista.getBtnInactivar()){
			inactivar();
		}

		if (e.getSource() == vista.getBtnReactivar()){
			reactivar();
		}

	}

}
