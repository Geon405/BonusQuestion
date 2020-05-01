/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geonkim
 */
public class Service {
    
    public static void main(String[] args) {
        
        Client geon = new Client("Geon,", 1);
        Client kevin = new Client("Kevin,", 2);
        
        geon.setName("Geon");
        System.out.println("The number of Geon is: " + geon.getName());

        System.out.println("The number of Geon is: " + geon.getNumber());
        
        kevin.setName("Kevin");
        System.out.println("The number of Kevin is: " + kevin.getName());

        System.out.println("The number of Kevin is: " + kevin.getNumber());
    }
}
