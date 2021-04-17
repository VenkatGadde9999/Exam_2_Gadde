/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;
import java.util.Scanner;
/**
 *
 * @author 16055
 */
public class mathDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);      
        System.out.print("Enter the FirstSide : ");
        double FirstSide = scan.nextDouble();
        System.out.print("Enter the SecondSide : ");
        double SecondSide = scan.nextDouble();
        System.out.print("Enter the ThirdSide : ");
        double ThirdSide = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the color of the Triangle: ");
        String S = scan.nextLine();
        System.out.print("Is the triangle is filled with color? " + " (True or False): ");
        boolean isFilled = scan.nextBoolean();
        Triangle Triangle = new Triangle(isFilled, S, FirstSide, SecondSide, ThirdSide);
        System.out.println(Triangle.toString());
    }
    
}
