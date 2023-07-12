package modelo;

public class liga {
    private int codigo;
    private String nombre;
    private int temporada;
    private String estado;

    public liga() {
    }

    public liga(int codigo, String nombre, int temporada, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.temporada = temporada;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
