/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.util.ArrayList;

/**
 *
 * @author juan sebastian
 */
public class Person {
    private String name;
    private String id;
    private ArrayList <Pet>pet;

    public Person(String name, String id ) {
        this.name = name;
        this.id = id;
        this.pet = new ArrayList();
    }
    
    public void addPet(Pet pet){
        this.pet.add(pet);  
    }
    
    public String showPets(){
        String info= " "; 
        for(Pet i:pet){
           info+= ("\nl  id: "+i.getId()+"nombre: "+i.getName());
        }
         
        return (info);
    }
}
