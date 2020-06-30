package model.beam;

import java.util.Date;

public class Registro {

    private String vacina;
    private String aplicador;
    private int usuario;
    private Date data;
    private String hora;
    private String dose;

    public Registro(String vacina, String aplicador, int usuario, Date data, String hora, String dose) {
        this.vacina = vacina;
        this.aplicador = aplicador;
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
        this.dose = dose;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getAplicador() {
        return aplicador;
    }

    public void setAplicador(String aplicador) {
        this.aplicador = aplicador;
    }
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String[] registro() {
        String[] registro = new String[4];
        registro[0] = this.hora;
        registro[1] = this.vacina;
        registro[2] = this.aplicador;
        registro[3] = "200-09-09";
        
        return registro;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

}
