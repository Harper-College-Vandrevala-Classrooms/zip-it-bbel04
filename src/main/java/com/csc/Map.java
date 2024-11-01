package com.csc;

import java.util.HashMap;
import java.util.List;

public class Map {
    public <T> HashMap<String, T> hashmapify(List<String> stringList, List<T> elementList) {
        HashMap<String, T> stringIds = new HashMap<>(); //string with generic type

        if (stringList.size() == elementList.size()) {
            for (int i = 0; i < stringList.size(); i++) {
                stringIds.put(stringList.get(i), elementList.get(i)); //assign values to keys
            }
        }
        else { //throw exception when lists are of unequal size
            throw new IllegalArgumentException("The two lists are not the same size.");
        }
        return stringIds;
    }
}
