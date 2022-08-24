package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double price1 =  (5*Math.pow(Integer.parseInt(a), 2) +3);
        double price2 =  (5*Math.pow(Integer.parseInt(b), 2) +3);

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else if (price1 == price2){
            return -1;
        } else {
            return 0;
        }
    }
}
