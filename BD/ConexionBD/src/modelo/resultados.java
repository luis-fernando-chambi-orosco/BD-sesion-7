package modelo;

public class resultados {
    int codigo;
    int puntos_ganados;
    int goles_favor;
    int goles_contra;
    int codigo_tabla_posiciones_det;
    int codigo_partido;
    String estado;

    public resultados(){
        
    }

    public resultados(int codigo, int puntos_ganados, int goles_favor, int goles_contra,
            int codigo_tabla_posiciones_det, int codigo_partido, String estado) {
        this.codigo = codigo;
        this.puntos_ganados = puntos_ganados;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.codigo_tabla_posiciones_det = codigo_tabla_posiciones_det;
        this.codigo_partido = codigo_partido;
        this.estado = estado;
    }

    
    public resultados(int puntos_ganados, int goles_favor, int goles_contra, int codigo_tabla_posiciones_det,
            int codigo_partido, String estado) {
        this.puntos_ganados = puntos_ganados;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.codigo_tabla_posiciones_det = codigo_tabla_posiciones_det;
        this.codigo_partido = codigo_partido;
        this.estado = estado;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getPuntos_ganados() {
        return puntos_ganados;
    }
    public void setPuntos_ganados(int puntos_ganados) {
        this.puntos_ganados = puntos_ganados;
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
    public int getCodigo_tabla_posiciones_det() {
        return codigo_tabla_posiciones_det;
    }
    public void setCodigo_tabla_posiciones_det(int codigo_tabla_posiciones_det) {
        this.codigo_tabla_posiciones_det = codigo_tabla_posiciones_det;
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
