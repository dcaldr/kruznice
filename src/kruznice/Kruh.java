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
public class Kruh {
    private double polomer, prumer;
    
 public void setPolomer(double vPolomer){
     this.polomer = vPolomer;
     this.prumer = vPolomer*2;
     
 }   
 public void setPrumer(double vPrumer){
     this.prumer = vPrumer;
     this.polomer = vPrumer/2;
 }
 public double getObvod(){
     return (2*Math.PI *this.polomer);
 }
 public double getObsah(){
     return (Math.PI*this.polomer*this.polomer);
 }
}
