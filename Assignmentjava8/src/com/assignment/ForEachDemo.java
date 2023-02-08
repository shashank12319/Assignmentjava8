package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
public static void main(String[] args) {
	


List<Object> originalList = Arrays.asList(1, 2, 3, 2, 9, 10.0, "alok", "nishant");
List<Integer> intList = new ArrayList<>();
List<Double> floatList = new ArrayList<>();
List<String> stringList = new ArrayList<>();

originalList.forEach(x -> {
    if (x instanceof Integer) {
        intList.add((Integer) x);
    } else if (x instanceof Double) {
        floatList.add((Double) x);
    } else if (x instanceof String) {
        stringList.add((String) x);
    }
});

System.out.println("Integer List: " + intList);
System.out.println("Float List: " + floatList);
System.out.println("String List: " + stringList);
}
}