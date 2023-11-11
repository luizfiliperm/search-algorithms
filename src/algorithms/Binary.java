package algorithms;

import java.util.ArrayList;

public class Binary {
    public static void search(ArrayList<Integer> array, int search){
        int left = 0;
        int right = array.size() - 1;
        int middle = (left + right) / 2;

        while(left <= right){
            if(array.get(middle) < search){
                left = middle + 1;
            } else if(array.get(middle) == search){
                System.out.println("The number " + search + " was found at position " + middle);
                return;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        System.out.println("The number " + search + " was not found in the array");
    }
}
