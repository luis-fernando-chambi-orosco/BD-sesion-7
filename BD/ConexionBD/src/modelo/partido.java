package modelo;

public class partido {
    int codigo;
    String estadoCurso;
    int codigo_liga;
    int codigo_equipo_local;
    int codigo_equipo_visitante;
    int codigo_arbitro1;
    int codigo_arbitro2;
    int codigo_arbitro3;
    int año;
    int mes;
    int dia;
    int hora_inicio;
    int hora_final;
    int goles_local;
    int goles_visitante;
    String estado;
    int codigo_estadio;

    public partido() {

    }

    public partido(int codigo, String estadoCurso, int codigo_liga, int codigo_equipo_local,
            int codigo_equipo_visitante, int codigo_arbitro1, int codigo_arbitro2, int codigo_arbitro3, int año,
            int mes, int dia, int hora_inicio, int hora_final, int goles_local, int goles_visitante, String estado,
            int codigo_estadio) {
        this.codigo = codigo;
        this.estadoCurso = estadoCurso;
        this.codigo_liga = codigo_liga;
        this.codigo_equipo_local = codigo_equipo_local;
        this.codigo_equipo_visitante = codigo_equipo_visitante;
        this.codigo_arbitro1 = codigo_arbitro1;
        this.codigo_arbitro2 = codigo_arbitro2;
        this.codigo_arbitro3 = codigo_arbitro3;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.goles_local = 0;
        this.goles_visitante = 0;
        this.estado = estado;
        this.codigo_estadio = codigo_estadio;
    }

    public partido(String estadoCurso, int codigo_liga, int codigo_equipo_local,
            int codigo_equipo_visitante, int codigo_arbitro1, int codigo_arbitro2, int codigo_arbitro3, int año,
            int mes, int dia, int hora_inicio, int hora_final, int goles_local, int goles_visitante, String estado,
            int codigo_estadio) {
        this.estadoCurso = estadoCurso;
        this.codigo_liga = codigo_liga;
        this.codigo_equipo_local = codigo_equipo_local;
        this.codigo_equipo_visitante = codigo_equipo_visitante;
        this.codigo_arbitro1 = codigo_arbitro1;
        this.codigo_arbitro2 = codigo_arbitro2;
        this.codigo_arbitro3 = codigo_arbitro3;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.goles_local = 0;
        this.goles_visitante = 0;
        this.estado = estado;
        this.codigo_estadio = codigo_estadio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(String estadoCurso) {
        this.estadoCurso = estadoCurso;
    }

    public int getCodigo_liga() {
        return codigo_liga;
    }

    public void setCodigo_liga(int codigo_liga) {
        this.codigo_liga = codigo_liga;
    }

    public int getCodigo_equipo_local() {
        return codigo_equipo_local;
    }

    public void setCodigo_equipo_local(int codigo_equipo_local) {
        this.codigo_equipo_local = codigo_equipo_local;
    }

    public int getCodigo_equipo_visitante() {
        return codigo_equipo_visitante;
    }

    public void setCodigo_equipo_visitante(int codigo_equipo_visitante) {
        this.codigo_equipo_visitante = codigo_equipo_visitante;
    }

    public int getCodigo_arbitro1() {
        return codigo_arbitro1;
    }

    public void setCodigo_arbitro1(int codigo_arbitro1) {
        this.codigo_arbitro1 = codigo_arbitro1;
    }

    public int getCodigo_arbitro2() {
        return codigo_arbitro2;
    }

    public void setCodigo_arbitro2(int codigo_arbitro2) {
        this.codigo_arbitro2 = codigo_arbitro2;
    }

    public int getCodigo_arbitro3() {
        return codigo_arbitro3;
    }

    public void setCodigo_arbitro3(int codigo_arbitro3) {
        this.codigo_arbitro3 = codigo_arbitro3;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_final() {
        return hora_final;
    }

    public void setHora_final(int hora_final) {
        this.hora_final = hora_final;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public int getGoles_visitante() {
        return goles_visitante;
    }

    public void setGoles_visitante(int goles_visitante) {
        this.goles_visitante = goles_visitante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo_estadio() {
        return codigo_estadio;
    }

    public void setCodigo_estadio(int codigo_estadio) {
        this.codigo_estadio = codigo_estadio;
    }

}
