package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void main(String[] args) {

        int[] inputArray = {1,2,3,4,2,3,5,6,7,8,9,9};  //input array
        Set<Integer> distinctSet = new HashSet<Integer>();  //creating set to store the elements
        for (int i=0 ; i < inputArray.length ; i++){               //running a loop into input array and add to set
            distinctSet.add(inputArray[i]);

        }
        System.out.println("count of distinct elements " + distinctSet.size());
        System.out.println("distinct element: " + distinctSet);

    }
}
