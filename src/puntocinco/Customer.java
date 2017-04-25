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
public class Customer extends DomainObject {
    private String FirstName;
    private String LastName;
    private String Telephone;
    private String Street1;
    private String Street2;
    private String City;
    private String State;
    private String Zipcode;
    private String Country;

    public Customer(String FirstName, String LastName, String Telephone, String Street1, String Street2, String City, String State, String Zipcode, String Country, String ID) {
        super(ID);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Telephone = Telephone;
        this.Street1 = Street1;
        this.Street2 = Street2;
        this.City = City;
        this.State = State;
        this.Zipcode = Zipcode;
        this.Country = Country;
    }
}
