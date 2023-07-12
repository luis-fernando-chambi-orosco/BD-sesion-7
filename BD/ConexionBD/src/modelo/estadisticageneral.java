package modelo;

public class estadisticageneral {
	 int codigo;
	 int goles;
	 int amarillas;
	 int rojas;
	 int codigo_liga;
	 String estado;
	 public estadisticageneral() {
	
	 }
	public estadisticageneral(int codigo, int goles, int amarillas, int rojas, int codigo_liga, String estado) {
		super();
		this.codigo = codigo;
		this.goles = goles;
		this.amarillas = amarillas;
		this.rojas = rojas;
		this.codigo_liga = codigo_liga;
		this.estado = estado;
	}
	public estadisticageneral(int goles, int amarillas, int rojas, int codigo_liga, String estado) {
		super();
		this.goles = goles;
		this.amarillas = amarillas;
		this.rojas = rojas;
		this.codigo_liga = codigo_liga;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getAmarillas() {
		return amarillas;
	}
	public void setAmarillas(int amarillas) {
		this.amarillas = amarillas;
	}
	public int getRojas() {
		return rojas;
	}
	public void setRojas(int rojas) {
		this.rojas = rojas;
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
