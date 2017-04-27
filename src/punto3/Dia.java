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
        segmentos= new ArrayList();
    }
    
    public void addSeg(Segmento segmento){
        this.segmentos.add(segmento);
        
    }
    public String SegmentoLibre(){
        String info="segmento libres";
        for (Segmento segmento : segmentos) {
            if(!segmento.isFuncion()){
                info+=(" \n"+ segmento.toString());
            }
        }
        return info;
    }

    @Override
    public String toString() {
        String info= this.dia.toString();
        for (Segmento segmento : segmentos) {
            info+= "\n"+segmento.toString();
        }
        return info;
        
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }
    
    
  
    
}
