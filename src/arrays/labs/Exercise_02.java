package arrays.labs;

import java.util.Scanner;

/**
 *  More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number from 1 - 10: ");
        int choice = scan.nextInt();
        if (choice < 1 || choice > 10) {
            System.out.println("Wrong number");
        } else {
            for (int i = 0; i < 10; i++){
                if (array[i] == choice) {
                    System.out.println("The index of " + choice + " is " + i);
                    break;
                }
            }
        }
    }
}