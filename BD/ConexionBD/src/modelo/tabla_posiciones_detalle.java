package modelo;

public class tabla_posiciones_detalle {
    int codigo;
    int codigo_equipo;
    int codigo_tabla_posiciones_cab;
    int partidos_jugados;
    int partidos_ganados;
    int partidos_empatados;
    int partidos_perdidos;
    int goles_favor;
    int goles_contra;
    int puntaje;
    int puesto;
    String estado;

    public tabla_posiciones_detalle(){

    }
    
    public tabla_posiciones_detalle(int codigo_equipo, int codigo_tabla_posiciones_cab, int partidos_jugados,
            int partidos_ganados, int partidos_empatados, int partidos_perdidos, int goles_favor, int goles_contra,
            int puntaje, int puesto, String estado) {
        this.codigo_equipo = codigo_equipo;
        this.codigo_tabla_posiciones_cab = codigo_tabla_posiciones_cab;
        this.partidos_jugados = partidos_jugados;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.partidos_perdidos = partidos_perdidos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.puntaje = puntaje;
        this.puesto = puesto;
        this.estado = estado;
    }


    public tabla_posiciones_detalle(int codigo, int codigo_equipo, int codigo_tabla_posiciones_cab,
            int partidos_jugados, int partidos_ganados, int partidos_empatados, int partidos_perdidos, int goles_favor,
            int goles_contra, int puntaje, int puesto, String estado) {
        this.codigo = codigo;
        this.codigo_equipo = codigo_equipo;
        this.codigo_tabla_posiciones_cab = codigo_tabla_posiciones_cab;
        this.partidos_jugados = partidos_jugados;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.partidos_perdidos = partidos_perdidos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.puntaje = puntaje;
        this.puesto = puesto;
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
    public int getCodigo_tabla_posiciones_cab() {
        return codigo_tabla_posiciones_cab;
    }
    public void setCodigo_tabla_posiciones_cab(int codigo_tabla_posiciones_cab) {
        this.codigo_tabla_posiciones_cab = codigo_tabla_posiciones_cab;
    }
    public int getPartidos_jugados() {
        return partidos_jugados;
    }
    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }
    public int getPartidos_ganados() {
        return partidos_ganados;
    }
    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }
    public int getPartidos_empatados() {
        return partidos_empatados;
    }
    public void setPartidos_empatados(int partidos_empatados) {
        this.partidos_empatados = partidos_empatados;
    }
    public int getPartidos_perdidos() {
        return partidos_perdidos;
    }
    public void setPartidos_perdidos(int partidos_perdidos) {
        this.partidos_perdidos = partidos_perdidos;
    }
    public int getGoles_favor() {
        return goles_favor;
    }
    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }
    public int getGoles_contra() {
        return goles_contra;
    }
    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public int getPuesto() {
        return puesto;
    }
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
