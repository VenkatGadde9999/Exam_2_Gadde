/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Date;

/**
 *
 * @author  Venkateswararao Gadde
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Date Today = new Date();

        System.out.println(new Person("Balayya", "Guntur",
                999999999, "LION@gmail.com"));
        System.out.println(new Student(9.4, "Venkat", "Detroit",
                6055925, "v@gmail.com"));
        System.out.println(new Employee("OpenDealerExcahnge", 114000, Today, "Venkat",
                "Detroit", 9999999, "vgadde@700credit.com"));
        System.out.println(new Staff("Siri", "QuicknLoans", 80000, Today,
                "Venkat", "Detroit", 999999, "venkat@gmail.com"));
        System.out.println(new Faculty(15, 6, "Colden", 120000, Today,
                "Venkat", "South Dakota State University", 99999999, "sdsu@gmail.com"));
    }

}
