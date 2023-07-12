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

import gui.interfazestadisticaGeneral;
import modelo.estadisticageneral;
import modelo.estadisticageneralDAO;

public class controladorestgeneral implements ActionListener{
	 int codigo=0;
	 int goles;
	 int amarillas;
	 int rojas;
	 int codigo_liga;
	 String estado;
	 estadisticageneral ent =new estadisticageneral();
	estadisticageneralDAO entDAO= new estadisticageneralDAO();
	interfazestadisticaGeneral vista =new interfazestadisticaGeneral();
	DefaultTableModel tablaent= new DefaultTableModel();
	
	public controladorestgeneral(interfazestadisticaGeneral vista) {
		this.vista=vista;
		vista.setVisible(true);
		agregardetdef();
		listarestgen();
	}
public void agregardetdef() {
	vista.getBtnNewButtonadicionar().addActionListener(this);
	vista.getBtnNewButtonactualizar().addActionListener(this);
	vista.getBtnNewButtonborrar().addActionListener(this);
	vista.getBtnNewButtonmodificar().addActionListener(this);
	vista.getBtnNewButtonsalir().addActionListener(this);
	vista.getBtnNewButtoninactivar().addActionListener(this);
	vista.getBtnNewButtonreactivar().addActionListener(this);
	vista.getBtnNewButtoncancelar().addActionListener(this);
	vista.getTableestgen().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			llenar_estgen(e);
			
		}
	});
}
public void listarestgen() {
	String[] titulos=new String[] {"Codigo ","Num de goles","Num de tarjetas amarillas","Num de tarjetas rojas","Codigo de liga","Estado de Registro"};
	tablaent = new DefaultTableModel(titulos,0);
	List<estadisticageneral> listacab=entDAO.Listar();
	for(estadisticageneral eve:listacab) {
		tablaent.addRow(new Object[] {eve.getCodigo(),eve.getGoles(),eve.getAmarillas(),eve.getRojas(),eve.getCodigo_liga(),eve.getEstado()});
	}
	vista.getTableestgen().setModel(tablaent);
	vista.getTableestgen().setPreferredSize(new Dimension(350,tablaent.getRowCount()*16));
}
public void llenar_estgen(MouseEvent e) {
	JTable target=(JTable) e.getSource();
	codigo=(int) vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getCod().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 0).toString());
	vista.getNumgoles().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 1).toString());
	vista.getTarjamar().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 2).toString());
	vista.getTarjroj().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 3).toString());
	vista.getCodliga().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 4).toString());
	vista.getEstado().setText(vista.getTableestgen().getModel().getValueAt(target.getSelectedRow(), 5).toString());
}
public boolean validardatosestgen() {
	if("".equals(vista.getNumgoles().getText())||"".equals(vista.getTarjamar().getText())||"".equals(vista.getTarjroj().getText())||"".equals(vista.getCodliga().getText())) {
		JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
		return false;
	}
	return true;
}
//validando  los datos para que el usuario no meta cosas que no se pide
public boolean cargardatosestgen() {
	try {
		codigo=Integer.parseInt(vista.getCod().getText());
		goles=Integer.parseInt(vista.getNumgoles().getText());
		amarillas=Integer.parseInt(vista.getTarjamar().getText());
		rojas=Integer.parseInt(vista.getTarjroj().getText());
		codigo_liga=Integer.parseInt(vista.getCodliga().getText());
		estado=vista.getEstado().getText();
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al cargarhgh datos"+e);
		return false;
	}
}
public void limpiarestgen() {
	vista.getCod().setText("");
	vista.getNumgoles().setText("");
	vista.getTarjamar().setText("");
	vista.getTarjroj().setText("");
	vista.getCodliga().setText("");
	vista.getEstado().setText("A");
}
public void agregarestgen() {
	try {
		if(validardatosestgen()) {
			if(cargardatosestgen()) {
				estadisticageneral ent=new estadisticageneral(codigo,goles,amarillas,rojas,codigo_liga,estado);
				entDAO.agregar(ent);
				JOptionPane.showMessageDialog(null, "registro exitosos");
				limpiarestgen();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al agregar"+e);
	}
}
public void modificarestgen() {
	try {
		if(validardatosestgen()) {
		if(cargardatosestgen()) {
			estadisticageneral ent=new estadisticageneral(codigo,goles,amarillas,rojas,codigo_liga,estado);
				entDAO.modificar(ent);
				JOptionPane.showMessageDialog(null, "modificacion exitosa");
				limpiarestgen();
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar datos"+e);
	}
}
public void borrarestgen() {
	try {
		if(codigo!=0) {
					entDAO.borrar(codigo);
					JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
					limpiarestgen();
			
			}
	} catch (Exception e) {
		System.out.println("error al borrar datos"+e);
	}
}
public void salirdet() {
	try {
		JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
		System.exit(0);
	} catch (Exception e) {
		System.out.println("ocurrio un error inesperado"+e);
	}
}

public void actualizarestgen() {
	try {
		listarestgen();
		JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ocurrio un error inesperado al querer actualizar la tabla"+e);
	}
}
public void inactivar(){
	try {
		if (validardatosestgen()) {
			if (cargardatosestgen()) {
				estadisticageneral jug = new estadisticageneral(codigo,goles,amarillas,rojas,codigo_liga,"I");
				entDAO.dejarInactivo(jug);
				JOptionPane.showMessageDialog(null, "inactivacion exitosa");
				limpiarestgen();
				vista.getEstado().setText("I");
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al inactivar" + e);
	}
}

public void reactivar(){
	try {
		if (validardatosestgen()) {
			if (cargardatosestgen()) {
				estadisticageneral jug = new estadisticageneral(codigo,goles,amarillas,rojas,codigo_liga,"A");
				entDAO.volverActivo(jug);
				JOptionPane.showMessageDialog(null, "Reactivacion exitosa");
				limpiarestgen();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al activar" + e);
	}
}
//con esto daremos acciones a los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vista.getBtnNewButtonadicionar()) {
			agregarestgen();
		}if(e.getSource()==vista.getBtnNewButtonmodificar()) {
			modificarestgen();
		}if(e.getSource()==vista.getBtnNewButtonborrar()) {
			borrarestgen();
		}if(e.getSource()==vista.getBtnNewButtonactualizar()) {
			actualizarestgen();
		}
		if(e.getSource()==vista.getBtnNewButtonsalir()) {
		salirdet();
		}if(e.getSource()==vista.getBtnNewButtoncancelar()) {
			limpiarestgen();
			JOptionPane.showMessageDialog(null, "se cancelo exitasamente");
		}
		if (e.getSource() == vista.getBtnNewButtoninactivar()){
			inactivar();
		}

		if (e.getSource() == vista.getBtnNewButtonreactivar()){
			reactivar();
		}
		
	}
}
