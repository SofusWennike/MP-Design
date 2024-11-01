package model;


/**
 * Write a description of class Friend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Friend
{
    // instance variables - replace the example below with your own
    private String name; 
    private String address;
    private String postalCode;
    private String city; 
    private String phone;

    /**
     * Constructor for objects of class Friend
     */
    public Friend(String name, String address, String postalCode, String city, String phone)
    {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone(){
        return this.phone;
    }
}
