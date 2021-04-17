/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author 16055
 */
public class JavaEnumExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for(HardDrink drink : HardDrink.values()){
            System.out.println("Drink :"+drink.getTitle()+" "+"Consumer :"+drink.getConsumer());
        }
    }

    }
    

