/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntocinco;

/**
 *
 * @author Familia
 */
public class Category extends DomainObject {
    private String Name;
    private String Description;

    public Category(String Name, String Description, String ID) {
        super(ID);
        this.Name = Name;
        this.Description = Description;
    }
}
