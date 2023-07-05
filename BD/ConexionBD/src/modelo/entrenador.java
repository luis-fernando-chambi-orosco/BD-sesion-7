package modelo;

public class entrenador {
 int codigo;
 int codigo_equipo;
 String nombre;
 String dni;
 String estado;
 // costructor vacio 
public entrenador() {
	
}
// costructor 

public entrenador(int codigo, int codigo_equipo, String nombre, String dni, String estado) {
	super();
	this.codigo = codigo;
	this.codigo_equipo = codigo_equipo;
	this.nombre = nombre;
	this.dni = dni;
	this.estado = estado;
}
public entrenador(int codigo_equipo, String nombre, String dni, String estado) {
	super();
	this.codigo_equipo = codigo_equipo;
	this.nombre = nombre;
	this.dni = dni;
	this.estado = estado;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getCodigo_equipo() {
	return codigo_equipo;
}
public void setCodigo_equipo(int codigo_equipo) {
	this.codigo_equipo = codigo_equipo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}

 
}
