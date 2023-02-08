package com.assignment;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Object> originalList = Arrays.asList(1, 2, 3, 2, 9, 10.0, "alok", "nishant");
        Map<String, List<Object>> typeMap = new HashMap<>();
        typeMap.put("Integer",
                originalList.stream()
                        .filter(x -> x instanceof Integer)
                        .map(x -> (Integer) x)
                        .collect(Collectors.toList()));
        typeMap.put("Float",
                originalList.stream()
                        .filter(x -> x instanceof Double)
                        .map(x -> (Double) x)
                        .collect(Collectors.toList()));
        typeMap.put("String",
                originalList.stream()
                        .filter(x -> x instanceof String)
                        .map(x -> (String) x)
                        .collect(Collectors.toList()));
        System.out.println("Type Map: " + typeMap);
    }
}
