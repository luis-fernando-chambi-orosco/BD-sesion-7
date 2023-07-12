package modelo;

public class fixcab {
	int codigo;
	 int codigo_liga;
	 String estado;
	 public fixcab() {
		 
	 }
	public fixcab(int codigo_liga, String estado) {
		super();
		this.codigo_liga = codigo_liga;
		this.estado = estado;
	}
	public fixcab(int codigo, int codigo_liga, String estado) {
		super();
		this.codigo = codigo;
		this.codigo_liga = codigo_liga;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_liga() {
		return codigo_liga;
	}
	public void setCodigo_liga(int codigo_liga) {
		this.codigo_liga = codigo_liga;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
}
