package modelo;

public class fixdet {
	int codigo;
	 int codigo_fixcab;
	 int codigo_partido;
	 String estado;
	 public fixdet() {
		 
	 }
	public fixdet(int codigo, int codigo_fixcab, int codigo_partido, String estado) {
		super();
		this.codigo = codigo;
		this.codigo_fixcab = codigo_fixcab;
		this.codigo_partido = codigo_partido;
		this.estado = estado;
	}
	public fixdet(int codigo_fixcab, int codigo_partido, String estado) {
		super();
		this.codigo_fixcab = codigo_fixcab;
		this.codigo_partido = codigo_partido;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_fixcab() {
		return codigo_fixcab;
	}
	public void setCodigo_fixcab(int codigo_fixcab) {
		this.codigo_fixcab = codigo_fixcab;
	}
	public int getCodigo_partido() {
		return codigo_partido;
	}
	public void setCodigo_partido(int codigo_partido) {
		this.codigo_partido = codigo_partido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
}
