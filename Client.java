/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geonkim
 */
public class Client {
    
    private String name;
    private int number;
    private static String market = "Costco";
    private int amountOfUsage = 0;
    
    Client(String n, int num) {
        name = n;
        number = num;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getName() {
        return "The name is: " + name;
    }
    
    public String getNumber() {
        return "The number is: " + number;
    }
    
    @Override
    public String toString() {
        return "Name: " + name +
               "Number: " + number;
    }
    
    public boolean equals (Client other) {
        if (! (other instanceof Client))
            return false;
        else {
            if (name.equals(other.name))
                return true;
            else return false;
        }
    }
    
    public int getAmountOfUsage() {
        return amountOfUsage;
    }
}
