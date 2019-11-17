package com.comlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrAndLinkListcOMPARED {
    public void arrList(){
        List<Integer> stringList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stringList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("arrlist 花了"+(end-start)+"时间");

        List<Integer> list = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 10000000; j++) {
            list.add(j);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("linklist 花了"+(endTime-startTime)+"时间");
    }

    public static void main(String[] args) {
//        ArrAndLinkListcOMPARED arrAndLinkListcOMPARED = new ArrAndLinkListcOMPARED();
//        arrAndLinkListcOMPARED.arrList();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        list.add(2);
    }

}
