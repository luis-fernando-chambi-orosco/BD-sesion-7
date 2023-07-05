package modelo;

public class eventos {
int codigo;
int codigo_jugador;
int codigo_partido;
int codigo_arbitro;
int codigo_estadio;
int min_evento;
String estado;
String tipo_evento;
 public eventos (){
	 
 }
public eventos(int codigo_jugador, int codigo_partido, int codigo_arbitro, int codigo_estadio, int min_evento,
		String estado, String tipo_evento) {
	super();
	this.codigo_jugador = codigo_jugador;
	this.codigo_partido = codigo_partido;
	this.codigo_arbitro = codigo_arbitro;
	this.codigo_estadio = codigo_estadio;
	this.min_evento = min_evento;
	this.estado = estado;
	this.tipo_evento = tipo_evento;
}
public eventos(int codigo, int codigo_jugador, int codigo_partido, int codigo_arbitro, int codigo_estadio,
		int min_evento, String estado, String tipo_evento) {
	super();
	this.codigo = codigo;
	this.codigo_jugador = codigo_jugador;
	this.codigo_partido = codigo_partido;
	this.codigo_arbitro = codigo_arbitro;
	this.codigo_estadio = codigo_estadio;
	this.min_evento = min_evento;
	this.estado = estado;
	this.tipo_evento = tipo_evento;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public void setCodigo_jugador(int codigo_jugador) {
	this.codigo_jugador = codigo_jugador;
}
public void setCodigo_partido(int codigo_partido) {
	this.codigo_partido = codigo_partido;
}
public void setCodigo_arbitro(int codigo_arbitro) {
	this.codigo_arbitro = codigo_arbitro;
}
public void setCodigo_estadio(int codigo_estadio) {
	this.codigo_estadio = codigo_estadio;
}
public void setMin_evento(int min_evento) {
	this.min_evento = min_evento;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public void setTipo_evento(String tipo_evento) {
	this.tipo_evento = tipo_evento;
}
public int getCodigo() {
	return codigo;
}
public int getCodigo_jugador() {
	return codigo_jugador;
}
public int getCodigo_partido() {
	return codigo_partido;
}
public int getCodigo_arbitro() {
	return codigo_arbitro;
}
public int getCodigo_estadio() {
	return codigo_estadio;
}
public int getMin_evento() {
	return min_evento;
}
public String getEstado() {
	return estado;
}
public String getTipo_evento() {
	return tipo_evento;
}
 
}
