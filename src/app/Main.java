package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a search array application!");
        System.out.println("The array is composed of 50 numbers from 1 to 50 disposed in a random way");

        ArrayList<Integer> array = new ArrayList<Integer>();

        populateArray(array);
        shuffleArray(array);

        System.out.print("Choose a number to search in the array: ");
        int search = sc.nextInt();




        sc.close();
    }

    public static void waitForEnter(Scanner sc){
        System.out.println("Press enter to continue...");
        sc.nextLine();
    }

    public static void populateArray(ArrayList<Integer> array){
        for(int i = 1; i <= 50; i++){
            array.add(i);
        }
    }

    public static void shuffleArray(ArrayList<Integer> array){
        for(int i = 0; i < 50; i++){
            int random = (int) (Math.random() * 50);
            int temp = array.get(i);
            array.set(i, array.get(random));
            array.set(random, temp);
        }
    }
}