package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class binarySearch {
    ArrayList<Integer> sortedArray;
    protected int searchTerm;

    binarySearch(ArrayList<Integer> param, int searchTerm) {
        sortedArray = param;
        this.searchTerm = searchTerm;
    }

    private int calcMid(int end, int start) {
        return (start + end) / 2;
    }

    public int search() {
        int start = 0;
        int end = sortedArray.size() - 1;

        while (end >= start) {
            int mid = calcMid(end, start);

            if (searchTerm > sortedArray.get(mid)) {
                start = mid + 1;

            } else if (searchTerm == sortedArray.get(mid)) {

                return sortedArray.indexOf(searchTerm);
            } else if (searchTerm < sortedArray.get(mid)) {
                end = mid - 1;

            }

        }


        return -1;
    }

}
