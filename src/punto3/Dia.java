/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juan sebastian
 */
public class Dia {
    Date dia = new Date();
    String name;
    private ArrayList <Segmento>segmentos;

    public Dia(Date dia, String name) {
        this.dia = dia;
        this.name = name;
        segmentos=null;
    }
    
    public void addSeg(){
        
    }

    @Override
    public String toString() {
        return (this.dia.toString());
        
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
    
    
  
    
}
