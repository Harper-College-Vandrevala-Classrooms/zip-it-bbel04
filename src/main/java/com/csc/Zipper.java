package com.csc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zipper {
    public static <T> ArrayList<T> zip(ArrayList<T> listOne, ArrayList<T> listTwo) {
        ArrayList<T> zippedArray = new ArrayList<>();

        int minSize = Math.min(listOne.size(), listTwo.size()); //determine list with least amount of elements

        for (int i = 0; i < minSize; i++){ //zip list one and list two elements together
            zippedArray.add(listOne.get(i));
            zippedArray.add(listTwo.get(i));
        }

        if (listOne.size() > minSize) {   //if list one is bigger than list two
            for (int i = minSize; i < listOne.size(); i++){
                zippedArray.add(listOne.get(i)); //add rest of elements in longer list to end of zipped list
            }
        }

        if (listTwo.size() > minSize) {
            for (int i = minSize; i < listTwo.size(); i++) {
                zippedArray.add(listTwo.get(i));
            }
        }

        return zippedArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ListOne = new ArrayList<>();
        ArrayList<Integer> ListTwo = new ArrayList<>();

        ListOne.add(0);
        ListOne.add(2);
        ListOne.add(4);
        ListOne.add(6);
        ListOne.add(8);
        ListOne.add(10);
        ListOne.add(11);
        ListOne.add(12);
        ListOne.add(13);

        ListTwo.add(1);
        ListTwo.add(3);
        ListTwo.add(5);
        ListTwo.add(7);
        ListTwo.add(9);

        ArrayList<Integer> result = zip(ListOne, ListTwo);
        System.out.println(result);

        Map hash = new Map();

        List<String> colors = List.of("White", "Black", "Orange", "Pink");
        List<Integer> nums = List.of(1, 3, 5, 7);

        // This should create {"White" => 1, "Black" => 3, "Orange" => 5, "Pink" => 7}
        HashMap<String, Integer> map = hash.hashmapify(colors, nums);
        System.out.println(map);
    }

}
