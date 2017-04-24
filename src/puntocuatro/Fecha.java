package puntocuatro;

import java.util.GregorianCalendar;

/**
 *
 * @author Bencardino Perdomo
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private String nombreDia;
    private String nombreMes;

    public Fecha() {
    }

    public Fecha(long fecha) {
        java.util.Calendar date = new GregorianCalendar();
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nombreDia = this.SetNombreDia(dia, mes, año);
        this.nombreMes = this.getNombreMes(mes);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    private String getNombreMes(int mes) {
        switch (mes % 12) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Mes no válido";
        }
    }

    private String SetNombreDia(int dia, int mes, int año) {

        if (mes == 1) {
            mes = 13;
            año--;
        }
        
        if (mes == 2) {
            mes = 14;
            año--;
        }

        int day = (int) ((dia + Math.floor(2.6 * (mes + 1)) + (año % 100) + 
                Math.floor((año % 100) / 4) + 
                Math.floor(((año - (año % 100)) / 100) / 4) - 
                (2*((año - (año % 100)) / 100))) % 7);
        
        switch(day){
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miercoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 0:
                return "Sábado";
            default:
                return "Algo Salio Mal";
        }
        
    }
    
    @Override
    public String toString(){
        return nombreDia + " " + dia + " de " + nombreMes + " de " + año;
    }

}
