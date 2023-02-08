package com.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypeFilter {
    public static void main(String[] args) {
        List<Object> originalList = Arrays.asList(1, 2, 3, 2, 9, 10.0, "alok", "nishant");

        List<Integer> intList = originalList.stream()
                .filter(x -> x instanceof Integer)
                .map(x -> (Integer) x)
                .collect(Collectors.toList());

        List<Double> floatList = originalList.stream()
                .filter(x -> x instanceof Double)
                .map(x -> (Double) x)
                .collect(Collectors.toList());

        List<String> stringList = originalList.stream()
                .filter(x -> x instanceof String)
                .map(x -> (String) x)
                .collect(Collectors.toList());

        System.out.println("Integer List: " + intList);
        System.out.println("Float List: " + floatList);
        System.out.println("String List: " + stringList);
    }
}

