package app;

import algorithms.Linear;

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

        Linear.search(array, search);

        System.out.println("The array is: " + array);

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

    public static void bubbleSort(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            for(int j = 0; j < array.size() - 1; j++){
                if(array.get(j) > array.get(j + 1)){
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }
}