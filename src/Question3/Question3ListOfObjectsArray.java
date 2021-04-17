/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Venkateswararao Gadde
 */
public class Question3ListOfObjectsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                

       
        Date date = new Date();
        ArrayList<Object> list = new ArrayList<>();
        String Nbk = "Balayya";
        list.add(new Loan(12, 120000,false, "Auto"));
        list.add(new Circle(12, true, 12));
        list.add("Balayya");
        list.add(date);

        list.forEach(var -> {
            System.out.println(var);
        });

    }
    
}
