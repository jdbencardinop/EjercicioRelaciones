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
public abstract class  Pet {
    protected String id;
    protected String name;
    protected String hairColor;
    

    public Pet(String id, String hairColor ) {
        this.id = id;
        this.hairColor = hairColor;
        
    }
    public String sound(){return "";};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
        
    
    
 
    
}
