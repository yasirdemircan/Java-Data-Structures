package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        sort sorter = new sort(new Integer[]{10,3,80,2,9,8,50,30,54,87,34,69,47,15,24,89});
        ArrayList<Integer> sortedA = sorter.sortAsc();
        System.out.println(sortedA);
        binarySearch bsearch = new binarySearch(sortedA,3);
        bsearch.searchTerm = 9;
        int searchResult = bsearch.search();



        if( searchResult > 0){
            System.out.println( bsearch.searchTerm + " is found at index " + searchResult );
        }else{
            System.out.println("Not Found");
        }





    }
}

