package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

  @Test
  void mergeIntegerListsWithThreeElements() { 
    ArrayList<Integer> ListOne = new ArrayList<>();
    ArrayList<Integer> ListTwo = new ArrayList<>();

    ListOne.add(0);
    ListOne.add(2);
    ListOne.add(4);

    ListTwo.add(1);
    ListTwo.add(3);
    ListTwo.add(5);

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
    ArrayList<Integer> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  

  @Test
  void mergeIntegerListsWhenListOneIsLonger() {
    ArrayList<Integer> ListOne = new ArrayList<>();
    ArrayList<Integer> ListTwo = new ArrayList<>();

    ListOne.add(0);
    ListOne.add(2);
    ListOne.add(4);
    ListOne.add(6);
    ListOne.add(7);
    ListOne.add(8);

    ListTwo.add(1);
    ListTwo.add(3);
    ListTwo.add(5);

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    ArrayList<Integer> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  @Test
  void mergeIntegerListsWhenListTwoIsLonger() {
    ArrayList<Integer> ListOne = new ArrayList<>();
    ArrayList<Integer> ListTwo = new ArrayList<>();

    ListOne.add(0);
    ListOne.add(2);
    ListOne.add(4);

    ListTwo.add(1);
    ListTwo.add(3);
    ListTwo.add(5);
    ListTwo.add(6);
    ListTwo.add(7);
    ListTwo.add(8);

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    ArrayList<Integer> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  @Test
  void mergeStringLists() {
    ArrayList<String> ListOne = new ArrayList<>();
    ArrayList<String> ListTwo = new ArrayList<>();

    ListOne.add("Jim");
    ListOne.add("Jack");
    ListOne.add("Chris");

    ListTwo.add("Emma");
    ListTwo.add("Stefanie");
    ListTwo.add("Carson");

    ArrayList<String> expected = new ArrayList<>(Arrays.asList("Jim","Emma","Jack","Stefanie","Chris","Carson"));
    ArrayList<String> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  @Test
  void mergeStringListsWhenListOneIsLonger() {
    ArrayList<String> ListOne = new ArrayList<>();
    ArrayList<String> ListTwo = new ArrayList<>();

    ListOne.add("Jim");
    ListOne.add("Jack");
    ListOne.add("Chris");
    ListOne.add("Harry");
    ListOne.add("John");

    ListTwo.add("Emma");
    ListTwo.add("Stefanie");
    ListTwo.add("Carson");

    ArrayList<String> expected = new ArrayList<>(Arrays.asList("Jim","Emma","Jack","Stefanie","Chris","Carson","Harry","John"));
    ArrayList<String> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  @Test
  void mergeStringListsWhenListTwoIsLonger() {
    ArrayList<String> ListOne = new ArrayList<>();
    ArrayList<String> ListTwo = new ArrayList<>();

    ListOne.add("Jim");
    ListOne.add("Jack");
    ListOne.add("Chris");
    
    ListTwo.add("Emma");
    ListTwo.add("Stefanie");
    ListTwo.add("Carson");
    ListTwo.add("Harry");
    ListTwo.add("John");

    ArrayList<String> expected = new ArrayList<>(Arrays.asList("Jim","Emma","Jack","Stefanie","Chris","Carson","Harry","John"));
    ArrayList<String> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }

  @Test
  void mergeListsOfTypeDouble() {
    ArrayList<Double> ListOne = new ArrayList<>();
    ArrayList<Double> ListTwo = new ArrayList<>();

    ListOne.add(1.1);
    ListOne.add(3.1);
    ListOne.add(5.1);

    ListTwo.add(2.1);
    ListTwo.add(4.1);
    ListTwo.add(6.1);

    ArrayList<Double> expected = new ArrayList<>(Arrays.asList(1.1,2.1,3.1,4.1,5.1,6.1));
    ArrayList<Double> result = Zipper.zip(ListOne, ListTwo);
    assertEquals(expected, result);
  }
}
