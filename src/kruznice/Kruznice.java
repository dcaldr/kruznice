/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruznice;

/**
 *
 * @author Dan
 */
public class Kruznice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kruh testKruh = new Kruh();
        testKruh.setPolomer(5);
        System.out.println("obvod je "+ testKruh.getObvod()+" Obsah je "+ testKruh.getObsah());
    }
    
}
