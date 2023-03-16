package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void countDistinct(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                System.out.print(arr[i] + " ");

            }
        }

        int distinctCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctCount++;
            }
        }
        System.out.println();
            System.out.println("count of distinct element is : " + distinctCount);
        }

        public static void main (String[]args){
        int[] arr ={1,2,3,4,4,5,6,7};
        countDistinct(arr);

        }
    }



