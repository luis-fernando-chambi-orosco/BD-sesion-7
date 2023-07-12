package modelo;

public class tabla_posiciones_cab {
    int codigo;
    int codigo_liga;
    String estado;

    public tabla_posiciones_cab() {
    }

    public tabla_posiciones_cab(int codigo, int codigo_liga, String estado) {
        this.codigo = codigo;
        this.codigo_liga = codigo_liga;
        this.estado = estado;
    }

    public tabla_posiciones_cab(int codigo_liga, String estado) {
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
