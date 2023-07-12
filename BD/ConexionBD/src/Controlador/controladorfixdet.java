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

import gui.interfazdet;
import modelo.fixdet;
import modelo.fixdetDAO;

public class controladorfixdet implements ActionListener {
	int codigo=0;
	 int codigo_fix;
	 int codigo_part;
	 String estado;
	 fixdet ent =new fixdet();
	fixdetDAO entDAO= new fixdetDAO();
	interfazdet vista =new interfazdet();
	DefaultTableModel tablaent= new DefaultTableModel();
	
	public controladorfixdet(interfazdet vista) {
		this.vista=vista;
		vista.setVisible(true);
		agregardetdef();
		listardet();
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
	vista.getTabledet().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			llenar_det(e);
			
		}
	});
}
public void listardet() {
	String[] titulos=new String[] {"Codigo ","Codigo de cabecera","Codigo de partido","Estado de Registro"};
	tablaent = new DefaultTableModel(titulos,0);
	List<fixdet> listacab=entDAO.Listar();
	for(fixdet eve:listacab) {
		tablaent.addRow(new Object[] {eve.getCodigo(),eve.getCodigo_fixcab(),eve.getCodigo_partido(),eve.getEstado()});
	}
	vista.getTabledet().setModel(tablaent);
	vista.getTabledet().setPreferredSize(new Dimension(350,tablaent.getRowCount()*16));
}
public void llenar_det(MouseEvent e) {
	JTable target=(JTable) e.getSource();
	codigo=(int) vista.getTabledet().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getCod().setText(vista.getTabledet().getModel().getValueAt(target.getSelectedRow(), 0).toString());
	vista.getCodcab().setText(vista.getTabledet().getModel().getValueAt(target.getSelectedRow(), 1).toString());
	vista.getCodpart().setText(vista.getTabledet().getModel().getValueAt(target.getSelectedRow(), 2).toString());
	vista.getEstado().setText(vista.getTabledet().getModel().getValueAt(target.getSelectedRow(), 3).toString());
}
public boolean validardatoscab() {
	if("".equals(vista.getCodcab().getText())||"".equals(vista.getCodpart().getText())||"".equals(vista.getCod().getText())) {
		JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
		return false;
	}
	return true;
}
//validando  los datos para que el usuario no meta cosas que no se pide
public boolean cargardatoscab() {
	try {
		codigo=Integer.parseInt(vista.getCodcab().getText());
		codigo_fix=Integer.parseInt(vista.getCodcab().getText());
		codigo_part=Integer.parseInt(vista.getCodpart().getText());
		estado=vista.getEstado().getText();
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al cargar datos"+e);
		return false;
	}
}
public void limpiardet() {
	vista.getCodcab().setText("");
	vista.getCod().setText(" ");
	vista.getCodpart().setText(" ");
	vista.getEstado().setText("");
}
public void agregardet() {
	try {
		if(validardatoscab()) {
			if(cargardatoscab()) {
				fixdet ent=new fixdet(codigo,codigo_fix,codigo_part,estado);
				entDAO.agregar(ent);
				JOptionPane.showMessageDialog(null, "registro exitosos");
				limpiardet();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al agregar"+e);
	}
}
public void modificardet() {
	try {
		if(validardatoscab()) {
		if(cargardatoscab()) {
				fixdet ent=new fixdet(codigo,codigo_fix,codigo_part,estado);
				entDAO.modificar(ent);
				JOptionPane.showMessageDialog(null, "modificacion exitosa");
				limpiardet();
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar datos"+e);
	}
}
public void borrardet() {
	try {
		if(codigo!=0) {
					entDAO.borrar(codigo);
					JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
					limpiardet();
			
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

public void actualizardet() {
	try {
		listardet();
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
				fixdet jug = new fixdet(codigo,codigo_fix,codigo_part,"I");
				entDAO.dejarInactivo(jug);
				JOptionPane.showMessageDialog(null, "inactivacion exitosa");
				limpiardet();
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
				fixdet jug = new fixdet(codigo,codigo_fix,codigo_part,"A");
				entDAO.volverActivo(jug);
				JOptionPane.showMessageDialog(null, "Reactivacion exitosa");
				limpiardet();
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
			agregardet();
		}if(e.getSource()==vista.getBtnNewButtonmodificar()) {
			modificardet();
		}if(e.getSource()==vista.getBtnNewButtonborrar()) {
			borrardet();
		}if(e.getSource()==vista.getBtnNewButtonactualizar()) {
			actualizardet();
		}
		if(e.getSource()==vista.getBtnNewButtonsalir()) {
		salirdet();
		}if(e.getSource()==vista.getBtnNewButtoncancelar()) {
			limpiardet();
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
