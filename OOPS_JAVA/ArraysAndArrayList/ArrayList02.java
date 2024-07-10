/*
 * Created on 06 July 2024
 *
 * @author Sai Sumanth
 */
package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        System.out.println("Dynamic Arrays - ArrayList in Java. Similar to vectors in C++");

        List<String> list = new ArrayList<>(4);
        List<String> x = new ArrayList<>(Arrays.asList("initial", "values"));

        list.add("New");
        list.add("3");
        list.add("ArrayList");

        list.set(1, "1st Index Element");

        String val = list.get(2);
        System.out.println("Element at Index 0 :" + val);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);


        /*
            2D Arraylist
        */

        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        twoDArrayList.add(new ArrayList<Integer>());
        twoDArrayList.add(new ArrayList<Integer>());
        twoDArrayList.add(new ArrayList<Integer>());

        for (int i = 0; i < twoDArrayList.size(); i++) {
            for (int j = 1; j <= 3; j++) {
                twoDArrayList.get(i).add(i + j);
            }
        }

        /// Print the 2d Array in matrix format
        for (ArrayList<Integer> eachArray : twoDArrayList) {
            modifyArrayList(eachArray);
            System.out.println(eachArray);
        }

        // reverse each array inside 2d array
        System.out.println("Start reversing each array inside 2D array");
        for (ArrayList<Integer> eachArray : twoDArrayList) {
            reverseArray(eachArray);
        }


        /// Print the 2d Array again
        System.out.println("twoDArrayList after performing reverse operation");
        for (ArrayList<Integer> eachArray : twoDArrayList) {
            System.out.println(eachArray);
        }

    }

    public static void reverseArray(ArrayList<Integer> list) {
        int leftP = 0, rightP = list.size()-1;
        int temp = 0;
        while(leftP<rightP){
            temp = list.get(leftP);
            list.set(leftP, list.get(rightP));
            list.set(rightP, temp);
            leftP++;
            rightP--;
        }
    }

    public static void modifyArrayList(ArrayList<Integer> copy) {
        copy.add(0, 9999);
    }
}
