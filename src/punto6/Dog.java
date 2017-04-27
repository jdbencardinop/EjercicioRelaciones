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
public class Dog extends Pet{
    private String breed;

    public Dog(String breed, String id, String hairColor) {
        super(id, hairColor);
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "wow"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
