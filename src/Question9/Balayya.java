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
public class Balayya implements Actor {
        @Override
    public void paymentForWork(int hours) {
        System.out.println("Balayya will make $" + hours*300.00);
    }
        @Override
    public void Movie() {
        System.out.println("Wait for the Massive Roar on May 28 of Movie Akhanda");
    }
    @Override
    public void Director() {
        System.out.println("The new age action director Boyapati Srinivas");
    }
}
