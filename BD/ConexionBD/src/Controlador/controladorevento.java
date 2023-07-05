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
import gui.interfaz_evento;
import modelo.eventos;
import modelo.eventosDAO;
public class controladorevento implements ActionListener {
	 int codigo=0;
	// String nombre;
	// int  codigo_equipo;
	// String estado;
	// String DNI;
	 int codigo_jugador;
	 int codigo_partido;
	 int codigo_arbitro;
	 int codigo_estadio;
	 int min_evento;
	 String estado;
	 String tipo_evento;
	eventos ent=new eventos();
	eventosDAO entDAO= new eventosDAO();
	interfaz_evento vista =new interfaz_evento();
	DefaultTableModel tablaent= new DefaultTableModel();
	
	public controladorevento(interfaz_evento vista) {
		this.vista=vista;
		vista.setVisible(true);
		agregareventosdef();
		listartabla();
	}
public void agregareventosdef() {
	vista.getBtnButtonadicionarEven().addActionListener(this);
	vista.getBtnButtonactualizarEven().addActionListener(this);
	vista.getBtnButtonborrarEven().addActionListener(this);
	vista.getBtnButtonModificarEven().addActionListener(this);
	vista.getBtnButtonsalirEven().addActionListener(this);
	vista.getBtnButtoninactivarEven().addActionListener(this);
	vista.getBtnButtonreactivarEven().addActionListener(this);
	vista.getBtnButtonCancelar().addActionListener(this);
	vista.getTable_event().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			llenar_evento(e);
			
		}
	});
}
public void listartabla() {
	String[] titulos=new String[] {"Codigo ","Tipo de evento","Codigo de jugador","Codigo de partido","Codigo de arbitro","Codigo de estadio","Minuto de evento","Estado de Registro"};
	tablaent = new DefaultTableModel(titulos,0);
	List<eventos> listaevento=entDAO.Listar_evento();
	for(eventos eve:listaevento) {
		tablaent.addRow(new Object[] {eve.getCodigo(),eve.getTipo_evento(),eve.getCodigo_jugador(),eve.getCodigo_partido(),eve.getCodigo_arbitro(),eve.getCodigo_estadio(),eve.getMin_evento(),eve.getEstado()});
	}
	vista.getTable_event().setModel(tablaent);
	vista.getTable_event().setPreferredSize(new Dimension(350,tablaent.getRowCount()*16));
}
public void llenar_evento(MouseEvent e) {
	JTable target=(JTable) e.getSource();
	codigo=(int) vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getCodEven().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 0).toString());
	vista.getCodarb().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 4).toString());
	vista.getCodjug().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 2).toString());
	vista.getCodpart().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 3).toString());
	vista.getTipoEven().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 1).toString());
	vista.getMin().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 6).toString());
	vista.getEstad().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 5).toString());
	vista.getEstReg().setText(vista.getTable_event().getModel().getValueAt(target.getSelectedRow(), 7).toString());
}
public boolean validardatosevento() {
	if("".equals(vista.getCodarb().getText())||"".equals(vista.getCodEven().getText())||"".equals(vista.getCodjug().getText())||"".equals(vista.getCodpart().getText())) {
		JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
		return false;
	}
	return true;
}
// validando  los datos para que el usuario no meta cosas que no se pide
public boolean cargardatosevento() {
	try {
		codigo=Integer.parseInt(vista.getCodEven().getText());
		codigo_jugador=Integer.parseInt(vista.getCodjug().getText());
		codigo_arbitro=Integer.parseInt(vista.getCodarb().getText());
		codigo_estadio=Integer.parseInt(vista.getEstad().getText());
		codigo_partido=Integer.parseInt(vista.getCodpart().getText());
		estado=vista.getEstReg().getText();
		tipo_evento=vista.getTipoEven().getText();
		min_evento=Integer.parseInt(vista.getMin().getText());
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al cargar datos"+e);
		return false;
	}
}
public void limpiarevento() {
	vista.getCodEven().setText("");
	vista.getCodjug().setText(" ");
	vista.getCodarb().setText("");
	vista.getEstad().setText("");
	vista.getCodpart().setText("");
	vista.getEstReg().setText("");
	vista.getTipoEven().setText("");
	vista.getMin().setText("");
}
public void agregarevento() {
	try {
		if(validardatosevento()) {
			if(cargardatosevento()) {
				eventos ent=new eventos(codigo,codigo_jugador,codigo_partido,codigo_arbitro,codigo_estadio,min_evento,estado,tipo_evento);
				entDAO.agregar_evento(ent);
				JOptionPane.showMessageDialog(null, "registro exitosos");
				limpiarevento();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al agregar"+e);
	}
}
public void modificarevento() {
	try {
		if(validardatosevento()) {
		if(cargardatosevento()) {
				eventos ent=new eventos(codigo,codigo_jugador,codigo_partido,codigo_arbitro,codigo_estadio,min_evento,estado,tipo_evento);
				entDAO.modificar_evento(ent);
				JOptionPane.showMessageDialog(null, "modificacion exitosa");
				limpiarevento();
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar datos"+e);
	}
}
public void borrarevento() {
	try {
		if(codigo!=0) {
					entDAO.borrar_evento(codigo);
					JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
					limpiarevento();
			
			}
	} catch (Exception e) {
		System.out.println("error al borrar datos"+e);
	}
}
public void salirevento() {
	try {
		JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
		System.exit(0);
	} catch (Exception e) {
		System.out.println("ocurrio un error inesperado"+e);
	}
}
public void actualizarevento() {
	try {
		listartabla();
		JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ocurrio un error inesperado al querer actualizar la tabla"+e);
	}
}
public void inactivar(){
	try {
		if (validardatosevento()) {
			if (cargardatosevento()) {
				eventos jug = new eventos(codigo,codigo_jugador,codigo_partido,codigo_arbitro,codigo_estadio,min_evento,"I",tipo_evento);
				entDAO.dejarInactivo(jug);
				JOptionPane.showMessageDialog(null, "inactivacion exitosa");
				limpiarevento();
				vista.getEstReg().setText("I");
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al inactivar" + e);
	}
}

public void reactivar(){
	try {
		if (validardatosevento()) {
			if (cargardatosevento()) {
				eventos jug = new eventos(codigo,codigo_jugador,codigo_partido,codigo_arbitro,codigo_estadio,min_evento,"A",tipo_evento);
				entDAO.volverActivo(jug);
				JOptionPane.showMessageDialog(null, "Reactivacion exitosa");
				limpiarevento();
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
		if(e.getSource()==vista.getBtnButtonadicionarEven()) {
			agregarevento();
		}if(e.getSource()==vista.getBtnButtonModificarEven()) {
			modificarevento();
		}if(e.getSource()==vista.getBtnButtonborrarEven()) {
			borrarevento();
		}if(e.getSource()==vista.getBtnButtonactualizarEven()) {
			actualizarevento();
		}
		if(e.getSource()==vista.getBtnButtonsalirEven()) {
		salirevento();
		}if(e.getSource()==vista.getBtnButtonCancelar()) {
			limpiarevento();
			JOptionPane.showMessageDialog(null, "se cancelo exitasamente");
		}
		if (e.getSource() == vista.getBtnButtoninactivarEven()){
			inactivar();
		}

		if (e.getSource() == vista.getBtnButtonreactivarEven()){
			reactivar();
		}
	}

}
