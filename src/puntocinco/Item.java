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
public class Item extends DomainObject {
    private String Name;
    private double UnitCost;

    public Item(String Name, double UnitCost, String ID) {
        super(ID);
        this.Name = Name;
        this.UnitCost = UnitCost;
    }
}
