/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.ArrayList;

/**
 *
 * @author juan sebastian
 */
public class Semana {
    int numero;
    Dia dia[];
    int d;
    ArrayList <Sala>sala;

    public Semana(int numero) {
        this.numero = numero;
        this.dia = new Dia[5];
        this.d=0;
    }
    
    public void addDia(Dia dia){
        if (d<5){
            this.dia[d]=dia;
            d++;
        }  
    }

    @Override
    public String toString() {
        return "Semana{" + "numero=" + numero + ", dia=" + dia + ", d=" + d + '}';
    }
    
    
    public ArrayList<Segmento> calcuar(){
        ArrayList<Segmento> segs= new ArrayList();
        
        for (Dia dias : this.dia) {
            for (Segmento seg : dias.getSegmentos()) {
                  segs.add(seg); 
            }     
        }
        
        return segs;
    }
        
    
    
}
