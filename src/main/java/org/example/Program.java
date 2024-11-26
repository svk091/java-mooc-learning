package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashMap) {
        System.out.println(hashMap.keySet());
    }
    public static void printKeysWhere(HashMap<String, String> hashMap,  String text) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(String key: hashMap.keySet()) {
            if(key.contains(text)){
                arrayList.add(key);
            }
        }
        System.out.println(arrayList);
    }
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap,  String text) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(String key: hashMap.keySet()) {
            if(key.contains(text)){
                arrayList.add(hashMap.get(key));
            }
        }
        System.out.println(arrayList);
    }
}
