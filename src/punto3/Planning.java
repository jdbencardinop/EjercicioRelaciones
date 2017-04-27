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
public class Planning {
    
    ArrayList <Sala> salas;

    public Planning(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    public void addSalas(Sala sala){
        this.salas.add(sala);
    }

    @Override
    public String toString() {
        String info=" Planning  ";
        for (Sala sala : salas) {
            info+="\n"+sala.toString();
            
        }
        return info;
    }
    
}
