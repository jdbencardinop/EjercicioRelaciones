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
public class Cat extends Pet{
    boolean isHunter;

    public Cat(boolean isHunter, String id, String hairColor) {
        super(id, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        return " miau"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
