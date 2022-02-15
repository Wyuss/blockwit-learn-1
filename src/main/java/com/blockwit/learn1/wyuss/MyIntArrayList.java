package com.blockwit.learn1.wyuss;

public class MyIntArrayList {

    int[] list;
    int count;

    public MyIntArrayList() {
        list = new int[0];
        count = 0;
    }

    public int add (int num) {

        if (count == list.length) {
            int[] newList = new int [list.length +1];
            for (int i = 0; i < list.length; i++) {
                newList[i]= list[i];
            }
            newList[newList.length - 1] = num;
            list = newList;
        } else {
            list[count - 1] = num;
        }
        count++;
        return list.length  - 1;
    }

    public int get (int i) {
        return list[i];
    }

    public int size () {
        return count;
    }
    public void clear () {
        int[] clearList = new int [0];
        list = clearList;
    }
}
