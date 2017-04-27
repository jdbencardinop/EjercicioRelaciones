/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Date;

/**
 *
 * @author juan sebastian
 */
public class Segmento {
    private Date inicio ;
    private Date fin  ;
    private boolean funcion;
   

    public Segmento(int inicio, int fin,boolean funcion) {
       this.funcion=funcion;
        this.inicio= new Date();
        this.fin= new Date();
        this.inicio.setHours(inicio);
        //System.out.println( "inicio " +this.inicio.toString()+"   fin "+this.fin.toString());
        this.fin.setHours(fin);
      
    }

    @Override
    public String toString() {
        return ("segmento "+ this.inicio.getHours()+" - "+this.fin.getHours());
    } 

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public boolean isFuncion() {
        return funcion;
    }

    public void setFuncion(boolean funcion) {
        this.funcion = funcion;
    }
    
    
     
}
