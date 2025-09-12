package Arrays;

import java.util.ArrayList;
import java.util.*;
public class insertionElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new
                ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int ele = 50;
        int pos = 2;
        for(int i = 0 ;i < arr.size();i++) {
            System.out.println(arr.get(i));
        }
        arr.add(pos - 1 , ele);
        System.out.println("After insertion the array is ");
        for(int i = 0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
}
