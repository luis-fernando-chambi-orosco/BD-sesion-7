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

import gui.Interfaz_partido;
import modelo.partido;
import modelo.partidoDAO;

public class controladorpartido implements ActionListener {

    int codigo;
    String estadoCurso;
    int codigo_liga;
    int codigo_equipo_local;
    int codigo_equipo_visitante;
    int codigo_arbitro1;
    int codigo_arbitro2;
    int codigo_arbitro3;
    int año;
    int mes;
    int dia;
    int hora_inicio;
    int hora_final;
    int goles_local;
    int goles_visitante;
    String estado;
    int codigo_estadio;

    partido par = new partido();
	partidoDAO parDAO = new partidoDAO();
	Interfaz_partido vista = new Interfaz_partido();
	DefaultTableModel tablaent = new DefaultTableModel();

    public controladorpartido(Interfaz_partido vista) {
		this.vista = vista;
		vista.setVisible(true);
		agregareventos();
		listartabla();
	}

    public void agregareventos() {
		vista.getBtnAdicionar().addActionListener(this);
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
		String[] titulos = new String[] { "Codigo", "Estatus", "Liga", "Equipo Local", "Equipo Visitante", "Arbitro 1",
				"Arbitro 2", "Arbitro 3", "Año", "Mes", "Dia", "Hora inicio", "Hora Final", "Goles Local", "Goles Visitante", "Estado Registro" };
		tablaent = new DefaultTableModel(titulos, 0);
		List<partido> listaprod = parDAO.Listar();
		for (partido pro : listaprod) {
			tablaent.addRow(new Object[] { pro.getCodigo(), pro.getEstadoCurso(), pro.getCodigo_liga(), pro.getCodigo_equipo_local(),
					pro.getCodigo_equipo_visitante(), pro.getCodigo_arbitro1(), pro.getCodigo_arbitro2(), pro.getCodigo_arbitro3(),
					pro.getAño(), pro.getMes(), pro.getDia(), pro.getHora_inicio(), pro.getHora_final(), pro.getGoles_local(), pro.getGoles_visitante(), pro.getEstado() , pro.getCodigo_estadio() });
		
			}
		vista.getTable().setModel(tablaent);
		vista.getTable().setPreferredSize(new Dimension(350, tablaent.getRowCount() * 16));
	}

    public void llenar(MouseEvent e) {
		JTable target = (JTable) e.getSource();
		codigo = (int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
		vista.getTextCodigo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
		vista.getTextEstadoCurso().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
		vista.getTextCodigoLiga().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
		vista.getTextFieldCodigoLocal().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
		vista.getTextFieldCodigoVisitante().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
		vista.getTextFieldArbitro1().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 5).toString());
		vista.getTextFieldArbitro2().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 6).toString());
		vista.getTextFieldArbitro3().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 7).toString());
		vista.getComboBoxAño().setToolTipText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 8).toString());
		vista.getComboBoxMes().setToolTipText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 9).toString());
		vista.getComboBoxDia().setToolTipText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 10).toString());
        vista.getTextFieldHoraInicio().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 11).toString());
        vista.getTextFieldHoraFinal().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 12).toString());
        vista.getTextFieldGolLocal().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 13).toString());
        vista.getTextFieldGolVisitante().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 14).toString());
        vista.getTextFieldEstadoRegistro().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 15).toString());
        vista.getTextFieldCodigoEstadio().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 16).toString());
    }

	public boolean validardatosent() {
		if ("".equals(vista.getTextCodigoLiga().getText()) || "".equals(vista.getTextFieldCodigoEstadio().getText())
				|| "".equals(vista.getTextFieldCodigoLocal().getText()) || "".equals(vista.getTextFieldCodigoVisitante().getText())) {
			JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
			return false;
		}
		return true;
	}

	// validando los datos para que el usuario no meta cosas que no se pide
	public boolean cargardatosjug() {
		try {
			codigo = Integer.parseInt(vista.getTextCodigo().getText());
			estadoCurso = vista.getTextEstadoCurso().getText();
			codigo_liga = Integer.parseInt(vista.getTextCodigoLiga().getText());
			codigo_equipo_local = Integer.parseInt(vista.getTextFieldCodigoLocal().getText());
			codigo_equipo_visitante = Integer.parseInt(vista.getTextFieldCodigoVisitante().getText());
			codigo_arbitro1 = Integer.parseInt(vista.getTextFieldArbitro1().getText());
			codigo_arbitro2 = Integer.parseInt(vista.getTextFieldArbitro2().getText());
			codigo_arbitro3 = Integer.parseInt(vista.getTextFieldArbitro3().getText());
			año = Integer.parseInt(vista.getComboBoxAño().getToolTipText());
			mes = Integer.parseInt(vista.getComboBoxMes().getToolTipText());
			dia = Integer.parseInt(vista.getComboBoxDia().getToolTipText());
            hora_inicio = Integer.parseInt(vista.getTextFieldHoraInicio().getText());
            hora_final = Integer.parseInt(vista.getTextFieldHoraFinal().getText());
            goles_local = Integer.parseInt(vista.getTextFieldGolLocal().getText());
            goles_visitante = Integer.parseInt(vista.getTextFieldGolVisitante().getText());
            estado = vista.getTextFieldEstadoRegistro().getText();
            codigo_estadio = Integer.parseInt(vista.getTextFieldCodigoEstadio().getText());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al cargar datos" + e);
			return false;
		}
	}

		public boolean cargardatosjugNuevo() {
		try {
			codigo = Integer.parseInt(vista.getTextCodigo().getText());
			estadoCurso = vista.getTextEstadoCurso().getText();
			codigo_liga = Integer.parseInt(vista.getTextCodigoLiga().getText());
			codigo_equipo_local = Integer.parseInt(vista.getTextFieldCodigoLocal().getText());
			codigo_equipo_visitante = Integer.parseInt(vista.getTextFieldCodigoVisitante().getText());
			codigo_arbitro1 = Integer.parseInt(vista.getTextFieldArbitro1().getText());
			codigo_arbitro2 = Integer.parseInt(vista.getTextFieldArbitro2().getText());
			codigo_arbitro3 = Integer.parseInt(vista.getTextFieldArbitro3().getText());
			año = Integer.parseInt(vista.getComboBoxAño().getToolTipText());
			mes = Integer.parseInt(vista.getComboBoxMes().getToolTipText());
			dia = Integer.parseInt(vista.getComboBoxDia().getToolTipText());
            hora_inicio = Integer.parseInt(vista.getTextFieldHoraInicio().getText());
            hora_final = Integer.parseInt(vista.getTextFieldHoraFinal().getText());
            //goles_local = Integer.parseInt(vista.getTextFieldGolLocal().getText());
            //goles_visitante = Integer.parseInt(vista.getTextFieldGolVisitante().getText());
            //estado = vista.getTextFieldEstadoRegistro().getText();
            codigo_estadio = Integer.parseInt(vista.getTextFieldCodigoEstadio().getText());
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al cargar datos" + e);
			return false;
		}
	}

	public void limpiar() {
		vista.getTextCodigo().setText("");
		vista.getTextEstadoCurso().setText("");
		vista.getTextCodigoLiga().setText("");
		vista.getTextFieldCodigoLocal().setText("");
		vista.getTextFieldCodigoVisitante().setText("");
		vista.getTextFieldArbitro1().setText("");
		vista.getTextFieldArbitro2().setText("");
		vista.getTextFieldArbitro3().setText("");
		vista.getComboBoxAño().setSelectedIndex(0);
		vista.getComboBoxMes().setSelectedIndex(0);
		vista.getComboBoxDia().setSelectedIndex(0);
        vista.getTextFieldHoraInicio().setText("");
        vista.getTextFieldHoraFinal().setText("");
		vista.getTextFieldEstadoRegistro().setText("");
		codigo = 0;
		codigo_equipo_local = 0;
		codigo_equipo_visitante = 0;
		estado = "A";
		codigo_arbitro1 = 0;
		codigo_arbitro2 = 0;
		codigo_arbitro3 = 0;

	}

	public void agregar() {
		try {
			if (validardatosent()) {
				if (cargardatosjugNuevo()) {
					partido jug = new partido(codigo,estadoCurso, codigo_liga, codigo_equipo_local,codigo_equipo_visitante,
							codigo_arbitro1,codigo_arbitro2,codigo_arbitro3,año,mes,dia,hora_inicio,hora_final,estado,codigo_estadio);
					parDAO.agregar(jug);
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
				if (cargardatosjug()) {
					partido jug = new partido(codigo,estadoCurso, codigo_liga, codigo_equipo_local,codigo_equipo_visitante,
							codigo_arbitro1,codigo_arbitro2,codigo_arbitro3,año,mes,dia,hora_inicio,hora_final,goles_local,goles_visitante,estado,codigo_estadio);
					
					parDAO.actualizar(jug);
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
			if (validardatosent()) {
				if (cargardatosjug()) {
					partido jug = new partido(codigo,estadoCurso, codigo_liga, codigo_equipo_local,codigo_equipo_visitante,
							codigo_arbitro1,codigo_arbitro2,codigo_arbitro3,año,mes,dia,hora_inicio,hora_final,goles_local,goles_visitante,"*",codigo_estadio);
					
					parDAO.borradoLogico(jug);
					JOptionPane.showMessageDialog(null, "borrado logico exitoso");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al inactivar" + e);
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
				if (cargardatosjug()) {
					partido jug = new partido(codigo,estadoCurso, codigo_liga, codigo_equipo_local,codigo_equipo_visitante,
							codigo_arbitro1,codigo_arbitro2,codigo_arbitro3,año,mes,dia,hora_inicio,hora_final,goles_local,goles_visitante,"I",codigo_estadio);
					
					parDAO.dejarInactivo(jug);
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
				if (cargardatosjug()) {
					partido jug = new partido(codigo,estadoCurso, codigo_liga, codigo_equipo_local,codigo_equipo_visitante,
							codigo_arbitro1,codigo_arbitro2,codigo_arbitro3,año,mes,dia,hora_inicio,hora_final,goles_local,goles_visitante,"A",codigo_estadio);
					
					parDAO.dejarInactivo(jug);
					JOptionPane.showMessageDialog(null, "inactivacion exitosa");
					limpiar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al inactivar" + e);
		}
	}


    // con esto daremos acciones a los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnAdicionar()) {
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
