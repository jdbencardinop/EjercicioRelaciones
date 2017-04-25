/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntocinco;

import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Product extends DomainObject {
    private String Name;
    private String Description;
    private ArrayList<Item> Items;

    public Product(String Name, String Description, ArrayList<Item> Items, String ID) {
        super(ID);
        this.Name = Name;
        this.Description = Description;
        this.Items = new ArrayList<>();
    }
}
