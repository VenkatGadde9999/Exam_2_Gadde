/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author  Venkateswararao Gadde
 */
public class InterfaceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Actor Actor1 = new Balayya();

        Actor1.Movie();
        Actor1.paymentForWork(5000);
        Actor1.Director();
    }

}
