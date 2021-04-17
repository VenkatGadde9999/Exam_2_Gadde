/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4_Polymorphism;

/**
 *
 * @author  Venkateswararao Gadde
 */
public class Question4_Driver {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
    
    // create an object of Square
    Polygon s1 = new Polygon();
    s1.render();

    // create an object of Circle
    Circle c1 = new Circle();
    c1.render();
  }
    
}
