/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Venkateswararao Gadde
 */
public class Question2_twodimensionalarrays_NBK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for (int[] m11 : m1) {
            for (int j = 0; j < m11.length; j++) {
                m11[j] = scanInput.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int[] m21 : m2) {
            for (int j = 0; j < m21.length; j++) {
                m21[j] = scanInput.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
