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

import gui.interfazcab;
import modelo.fixcab;
import modelo.fixcabDAO;

public class controladorfixcab implements ActionListener{
	int codigo=0;
	 int codigo_liga;
	 String estado;
	 fixcab ent =new fixcab();
	fixcabDAO entDAO= new fixcabDAO();
	interfazcab vista =new interfazcab();
	DefaultTableModel tablaent= new DefaultTableModel();
	
	public controladorfixcab(interfazcab vista) {
		this.vista=vista;
		vista.setVisible(true);
		agregarcabdef();
		listarcab();
	}
public void agregarcabdef() {
	vista.getBtnNewButtonadicionar().addActionListener(this);
	vista.getBtnNewButtonactualizar().addActionListener(this);
	vista.getBtnNewButtonborrar().addActionListener(this);
	vista.getBtnNewButtonmodificar().addActionListener(this);
	vista.getBtnNewButtonsalir().addActionListener(this);
	vista.getBtnNewButtoninactivar().addActionListener(this);
	vista.getBtnNewButtonreactvar().addActionListener(this);
	vista.getBtnNewButtoncancelar().addActionListener(this);
	vista.getTablecab().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			llenar_cab(e);
			
		}
	});
}
public void listarcab() {
	String[] titulos=new String[] {"Codigo ","Codigo de liga","Estado de Registro"};
	tablaent = new DefaultTableModel(titulos,0);
	List<fixcab> listacab=entDAO.Listar();
	for(fixcab eve:listacab) {
		tablaent.addRow(new Object[] {eve.getCodigo(),eve.getCodigo_liga(),eve.getEstado()});
	}
	vista.getTablecab().setModel(tablaent);
	vista.getTablecab().setPreferredSize(new Dimension(350,tablaent.getRowCount()*16));
}
public void llenar_cab(MouseEvent e) {
	JTable target=(JTable) e.getSource();
	codigo=(int) vista.getTablecab().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getCodcab().setText(vista.getTablecab().getModel().getValueAt(target.getSelectedRow(), 0).toString());
	vista.getCodlig().setText(vista.getTablecab().getModel().getValueAt(target.getSelectedRow(), 1).toString());
	vista.getEstado().setText(vista.getTablecab().getModel().getValueAt(target.getSelectedRow(), 2).toString());
}
public boolean validardatoscab() {
	if("".equals(vista.getCodcab().getText())||"".equals(vista.getCodlig().getText())) {
		JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
		return false;
	}
	return true;
}
//validando  los datos para que el usuario no meta cosas que no se pide
public boolean cargardatoscab() {
	try {
		codigo=Integer.parseInt(vista.getCodcab().getText());
		codigo_liga=Integer.parseInt(vista.getCodlig().getText());
		estado=vista.getEstado().getText();
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al cargar datos"+e);
		return false;
	}
}
public void limpiarcab() {
	vista.getCodcab().setText("");
	vista.getCodlig().setText("");
	vista.getEstado().setText("");
}
public void agregarcab() {
	try {
		if(validardatoscab()) {
			if(cargardatoscab()) {
				fixcab ent=new fixcab(codigo,codigo_liga,estado);
				entDAO.agregar(ent);
				JOptionPane.showMessageDialog(null, "registro exitosos");
				limpiarcab();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al agregar"+e);
	}
}
public void modificarcab() {
	try {
		if(validardatoscab()) {
		if(cargardatoscab()) {
				fixcab ent=new fixcab(codigo,codigo_liga,estado);
				entDAO.modificar(ent);
				JOptionPane.showMessageDialog(null, "modificacion exitosa");
				limpiarcab();
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar datos"+e);
	}
}
public void borrarcab() {
	try {
		if(codigo!=0) {
					entDAO.borrar(codigo);
					JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
					limpiarcab();
			
			}
	} catch (Exception e) {
		System.out.println("error al borrar datos"+e);
	}
}
public void salircab() {
	try {
		JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
		System.exit(0);
	} catch (Exception e) {
		System.out.println("ocurrio un error inesperado"+e);
	}
}

public void actualizarcab() {
	try {
		listarcab();
		JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ocurrio un error inesperado al querer actualizar la tabla"+e);
	}
}
public void inactivar(){
	try {
		if (validardatoscab()) {
			if (cargardatoscab()) {
				fixcab jug = new fixcab(codigo,codigo_liga,"I");
				entDAO.dejarInactivo(jug);
				JOptionPane.showMessageDialog(null, "inactivacion exitosa");
				limpiarcab();
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
		if (validardatoscab()) {
			if (cargardatoscab()) {
				fixcab jug = new fixcab(codigo,codigo_liga,"A");
				entDAO.volverActivo(jug);
				JOptionPane.showMessageDialog(null, "Reactivacion exitosa");
				limpiarcab();
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
			agregarcab();
		}if(e.getSource()==vista.getBtnNewButtonmodificar()) {
			modificarcab();
		}if(e.getSource()==vista.getBtnNewButtonborrar()) {
			borrarcab();
		}if(e.getSource()==vista.getBtnNewButtonactualizar()) {
			actualizarcab();
		}
		if(e.getSource()==vista.getBtnNewButtonsalir()) {
		salircab();
		}if(e.getSource()==vista.getBtnNewButtoncancelar()) {
			limpiarcab();
			JOptionPane.showMessageDialog(null, "se cancelo exitasamente");
		}
		if (e.getSource() == vista.getBtnNewButtoninactivar()){
			inactivar();
		}

		if (e.getSource() == vista.getBtnNewButtonreactvar()){
			reactivar();
		}
		
	}

}

