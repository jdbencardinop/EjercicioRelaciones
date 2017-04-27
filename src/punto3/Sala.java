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
public class Sala {    
    ArrayList<Semana>semanas;

    public Sala(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }
    
    public void addSemana(Semana semana) {
        this.semanas.add(semana);
    }

    @Override
    public String toString() {
        String info = "Sala ";
        for (Semana semana : semanas) {
            info += ("\n"+ semana.toString());
        }
        return info;
    }
    
    
    
}
