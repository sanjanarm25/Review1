package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void countDistinct(int[] arr) {
        int n = arr.length;
        int distinctCount = 0;
        for (int i = 0; i < n; i++) {   //running a loop throughout the array
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {   //comparing the values
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                System.out.print(arr[i] + " ");
                distinctCount++;    //increase the count

            }
        }

        System.out.println();
            System.out.println("count of distinct element is : " + distinctCount);
        }

        public static void main (String[]args){
        int[] arr ={1,2,3,4,4,5,6,6,8,8,7};
        countDistinct(arr);

        }
    }



