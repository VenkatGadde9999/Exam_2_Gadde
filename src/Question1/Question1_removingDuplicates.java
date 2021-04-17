/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Venkateswararao Gadde
 */
public class Question1_removingDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);// Created scanner

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            numberList.add(scanInput.nextInt());
        }

        removeDuplicate(numberList);

        // Display the output
        System.out.print("The distinct integers are ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();

    }

    public static void removeDuplicate(ArrayList<Integer> Inputlist) {
        for (int i = 0; i < Inputlist.size() - 1; i++) {
            for (int j = i + 1; j < Inputlist.size(); j++) {
                if (Inputlist.get(i) == Inputlist.get(j)) {
                    Inputlist.remove(j);
                }
            }
        }
    }

}
