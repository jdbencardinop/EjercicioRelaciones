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
public class Category extends DomainObject {
    private String Name;
    private String Description;
    private ArrayList<Product> Products;

    public Category(String Name, String Description, ArrayList<Product> Products, String ID) {
        super(ID);
        this.Name = Name;
        this.Description = Description;
        this.Products = new ArrayList<>();
    }
    
    public void AddProduct (Product product) {
        this.Products.add(product);
    }
}
