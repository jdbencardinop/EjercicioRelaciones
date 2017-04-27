/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

/**
 *
 * @author juan sebastian
 */
public class Hamster extends Pet{
   private double weight; 

    public Hamster(double weight, String id, String hairColor) {
        super(id, hairColor);
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "sonidos de hamster"; //To change body of generated methods, choose Tools | Templates.
    }
   
}
