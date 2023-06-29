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
import gui.Interfaz;
import modelo.entrenador;
import modelo.entrenadorDAO;

public class controladorentrenador implements ActionListener {
	 int codigo=0;
	 String nombre;
	 int  codigo_equipo;
	 String estado;
	 String DNI;
	entrenador ent=new entrenador();
	entrenadorDAO entDAO= new entrenadorDAO();
	Interfaz vista =new Interfaz();
	DefaultTableModel tablaent= new DefaultTableModel();
	
	public controladorentrenador(Interfaz vista) {
		this.vista=vista;
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
	vista.getTable().addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			llenar(e);
			
		}
	});
}
public void listartabla() {
	String[] titulos=new String[] {"Codigo ","Nombre","DNI","Codigo de Equipo","Estado Registro"};
	tablaent = new DefaultTableModel(titulos,0);
	List<entrenador> listaprod=entDAO.Listar();
	for(entrenador pro:listaprod) {
		tablaent.addRow(new Object[] {pro.getCodigo(),pro.getNombre(),pro.getDni(),pro.getCodigo_equipo(),pro.getEstado()});
	}
	vista.getTable().setModel(tablaent);
	vista.getTable().setPreferredSize(new Dimension(350,tablaent.getRowCount()*16));
}
public void llenar(MouseEvent e) {
	JTable target=(JTable) e.getSource();
	codigo=(int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getTextCodigo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0).toString());
	//codigo=(int) vista.getTable().getModel().getValueAt(target.getSelectedRow(), 0);
	vista.getTextNombre().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 1).toString());
	vista.getTextDNI().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 2).toString());
	vista.getTextCodigoEquipo().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 3).toString());
	vista.getTextEstado().setText(vista.getTable().getModel().getValueAt(target.getSelectedRow(), 4).toString());
}
public boolean validardatosent() {
	if("".equals(vista.getTextNombre().getText())||"".equals(vista.getTextDNI().getText())||"".equals(vista.getTextCodigoEquipo().getText())||"".equals(vista.getTextEstado().getText())) {
		JOptionPane.showMessageDialog(null, "los campos no pueden estar vacios");
		return false;
	}
	return true;
}
// validando  los datos para que el usuario no meta cosas que no se pide
public boolean cargardatosent() {
	try {
		codigo=Integer.parseInt(vista.getTextCodigo().getText());
		nombre=vista.getTextNombre().getText();
		codigo_equipo= Integer.parseInt(vista.getTextCodigoEquipo().getText());
		estado=vista.getTextEstado().getText();
		DNI=vista.getTextDNI().getText();
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al cargar datos"+e);
		return false;
	}
}
public void limpiar() {
	vista.getTextNombre().setText("");
	vista.getTextDNI().setText("");
	vista.getTextCodigoEquipo().setText("");
	vista.getTextEstado().setText("");
	codigo=0;
	nombre="--";
	codigo_equipo=0;
	estado="--";
	DNI="--";
}
public void agregar() {
	try {
		if(validardatosent()) {
			if(cargardatosent()) {
				entrenador ent=new entrenador(codigo,codigo_equipo,nombre,DNI,estado);
				entDAO.agregar(ent);
				JOptionPane.showMessageDialog(null, "registro exitosos");
				limpiar();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al agregar"+e);
	}
}
public void modificar() {
	try {
		if(validardatosent()) {
		if(cargardatosent()) {
				entrenador ent=new entrenador(codigo,codigo_equipo,nombre,DNI,estado);
				entDAO.actualizar(ent);
				JOptionPane.showMessageDialog(null, "modificacion exitosa");
				limpiar();
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error al actualizar datos"+e);
	}
}
public void borrar() {
	try {
		if(codigo!=0) {
					entDAO.borrar(codigo);
					JOptionPane.showMessageDialog(null, "registro borrado exitosamente");
					limpiar();
			
			}
	} catch (Exception e) {
		System.out.println("error al borrar datos"+e);
	}
}
public void salir() {
	try {
		JOptionPane.showMessageDialog(null, "se salio exitosamente del programa");
		System.exit(0);
	} catch (Exception e) {
		System.out.println("ocurrio un error inesperado"+e);
	}
}
public void actualizar() {
	try {
		listartabla();
		JOptionPane.showMessageDialog(null, "se actualizo la tabla exitosamente");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ocurrio un error inesperado al querer actualizar la tabla"+e);
	}
}
// con esto daremos acciones a los botones
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vista.getBtnAgregar()) {
			agregar();
		}if(e.getSource()==vista.getBtnModificar()) {
			modificar();
		}if(e.getSource()==vista.getBtnBorrar()) {
			borrar();
		}if(e.getSource()==vista.getBtnActualizar()) {
			actualizar();
		}
		if(e.getSource()==vista.getBtnSalir()) {
		salir();
		}
			
	}

}
