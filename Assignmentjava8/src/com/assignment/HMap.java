package com.assignment;

import java.util.WeakHashMap;

public class HMap {
public static void main(String[] args) {
	


WeakHashMap<Integer, String> weakMap = new WeakHashMap<>();
@SuppressWarnings("removal")
Integer key1 = new Integer(1);
@SuppressWarnings("removal")
Integer key2 = new Integer(2);

weakMap.put(key1, "value for key1");
weakMap.put(key2, "value for key2");

System.out.println(weakMap.get(key1)); // "value for key1"
System.out.println(weakMap.get(key2)); // "value for key2"

key1 = null; // key1 is eligible for garbage collection
System.gc();
System.out.println(weakMap.containsKey(key1)); // false
System.out.println(weakMap.get(key1)); // null
}
}