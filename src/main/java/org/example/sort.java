package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sort {
    enum sortOrder{
        ASC,DESC
    }
private boolean switched = true;
    private final ArrayList<Integer> array = new ArrayList<Integer>();

    sort(Integer[] args) {
        array.addAll(List.of(args));
    }

    private void sortBase(sortOrder param) {
        while (switched) {
            switched = false;
            array.forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    var index = array.indexOf(integer);

                    switch(param){
                        case ASC -> { if(index < array.size() -1){
                            if(integer > array.get(index+1)){
                                int temp = array.get(index+1);
                                array.set(index+1,integer);
                                array.set(index,temp);
                                switched = true;
                            }
                        }}
                        case DESC -> {
                            if(index < array.size() -1){
                                if(integer < array.get(index+1)){
                                    int temp = array.get(index+1);
                                    array.set(index+1,integer);
                                    array.set(index,temp);
                                    switched = true;
                                }
                            }
                        }
                    }


                }
            });
        }

        //Resetting for next run
        switched = true;

    }

    public ArrayList<Integer> sortAsc(){
        sortBase(sortOrder.ASC);
        return new ArrayList<>(array);
    }

    public ArrayList<Integer> sortDesc(){
        sortBase(sortOrder.DESC);
        return new ArrayList<>(array);
    }
}
