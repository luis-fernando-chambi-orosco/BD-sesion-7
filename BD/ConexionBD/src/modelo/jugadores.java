package modelo;

public class jugadores {
    int codigo;
    String nombre;
    String dni;
    String posicion_jugador;
    int codigo_equipo;
    int numero_camiseta;
    int edad;
    int goles;
    int targetas_amarillas;
    int targetas_rojas;
    String estado;

    public jugadores() {

    }

    public jugadores(int codigo, String nombre, String dni, String posicion_jugador, int codigo_equipo,
            int numero_camiseta, int edad, int goles, int targetas_amarillas, int targetas_rojas, String estado) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.posicion_jugador = posicion_jugador;
        this.codigo_equipo = codigo_equipo;
        this.numero_camiseta = numero_camiseta;
        this.edad = edad;
        this.goles = goles;
        this.targetas_amarillas = targetas_amarillas;
        this.targetas_rojas = targetas_rojas;
        this.estado = estado;
    }

    public jugadores(String nombre, String dni, String posicion_jugador, int codigo_equipo, int numero_camiseta,
            int edad, int goles, int targetas_amarillas, int targetas_rojas, String estado) {

        super();
        this.nombre = nombre;
        this.dni = dni;
        this.posicion_jugador = posicion_jugador;
        this.codigo_equipo = codigo_equipo;
        this.numero_camiseta = numero_camiseta;
        this.edad = edad;
        this.goles = goles;
        this.targetas_amarillas = targetas_amarillas;
        this.targetas_rojas = targetas_rojas;
        this.estado = estado;
    }

    public jugadores(int codigo, String nombre, String dni, String posicion_jugador, int codigo_equipo, int numero_camiseta,
            int edad) {

        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.posicion_jugador = posicion_jugador;
        this.codigo_equipo = codigo_equipo;
        this.numero_camiseta = numero_camiseta;
        this.edad = edad;
        this.goles = 0;
        this.targetas_amarillas = 0;
        this.targetas_rojas = 0;
        this.estado = "A";
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPosicion_jugador() {
        return posicion_jugador;
    }

    public void setPosicion_jugador(String posicion_jugador) {
        this.posicion_jugador = posicion_jugador;
    }

    public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTargetas_amarillas() {
        return targetas_amarillas;
    }

    public void setTargetas_amarillas(int targetas_amarillas) {
        this.targetas_amarillas = targetas_amarillas;
    }

    public int getTargetas_rojas() {
        return targetas_rojas;
    }

    public void setTargetas_rojas(int targetas_rojas) {
        this.targetas_rojas = targetas_rojas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(int numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }

}
