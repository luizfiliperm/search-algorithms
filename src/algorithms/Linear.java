package algorithms;

import java.util.ArrayList;

public class Linear {
    public static void search(ArrayList<Integer> array, int search){
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).equals(search)){
                System.out.println("The number " + search + " was found at position " + i);
                return;
            }
        }
        System.out.println("The number " + search + " was not found in the array");
    }
}
