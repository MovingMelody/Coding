/*
* Created on 28 June 2024
*
* @author Sai Sumanth
*/

import java.util.ArrayList;
import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Union of Two Sorted Arrays - GFG");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sizes for two arrays: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] a1 = new int[size1];
        int[] a2 = new int[size2];
        sc.nextLine();
        System.out.print("Enter array 1 values with space: ");
        String[] s = sc.nextLine().trim().split(" ");
        for(int i = 0;i<size1;i++){
            a1[i] = Integer.parseInt(s[i]);
        }
        System.out.print("Enter array 2 values with space: ");
        s = sc.nextLine().trim().split(" ");
        for(int i = 0;i<size2;i++){
            a2[i] = Integer.parseInt(s[i]);
        }

        System.out.println(findUnionOptimized(a1 , a2 ,5,5));
        sc.close();

    }
    // correct solution but getting time limit exception. because the time complexity is O(m+n) + O(merged_array_length)
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int a = 0, b = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(a<n && b<m){
            if(arr1[a]<arr2[b]){
                res.add(arr1[a++]);
            }else if(arr2[b]<arr1[a]){
                res.add(arr2[b++]);
            }else{
                res.add(arr1[a]);
                a++;
                b++;
            }
        }
        while(a<n){
            res.add(arr1[a++]);
        }
        while(b<m){
            res.add(arr2[b++]);
        }

        ArrayList<Integer> res2 = new ArrayList<>();
        res2.add(res.get(0));
        for(int i = 1;i<res.size();i++){
            if(!res.get(i).equals(res.get(i-1))){
                res2.add(res.get(i));
            }
        }
        return res2;
    }

    public static ArrayList<Integer> findUnionOptimized(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> res = new ArrayList<>();
        int a = 0, b = 0;
        while(a<n && b<m){
            if(arr1[a]<arr2[b]){
                res.add(arr1[a++]);
                while(a<n && arr1[a]==arr1[a-1]) a++;
            }else if(arr2[b]<arr1[a]){
                res.add(arr2[b++]);
                while(b<m && arr2[b]==arr2[b-1]) b++;
            }else{
                res.add(arr1[a]); // anyone can be added since they are equal
                a++;
                b++;
                while(a<n && arr1[a]==arr1[a-1]) a++;
                while(b<m && arr2[b]==arr2[b-1]) b++;
            }
        }

        // only one while gets executed from the below two
        while(a<n){
            res.add(arr1[a++]);
            while(a<n && arr1[a]==arr1[a-1]) a++;
        }

        while(b<m){
            res.add(arr2[b++]);
            while(b<m && arr2[b]==arr2[b-1]) b++;
        }
        return res;
    }
}
