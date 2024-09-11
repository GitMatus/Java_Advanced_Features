package advanced_coding.Example2;

// Create a `Storage` class that will have a private Map field, a public constructor, and methods:
//- `addToStorage(String key, String value)` → adding elements to the storage
//- `printValues(String key)` → displaying all elements under a given key
//- `findValues(String value)` → displaying all keys that have a given value
//
//The Storage class should allow you to store multiple values under one key.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Storage {

    private Map<String, List<String>> map;

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public Map addToStorage(String key, String value) {
        if (map.containsKey(key)) {
            List<String> temp = map.get(key);
            temp.add(value);
            map.put(key, temp);
        } else {
            List<String> temp2 = new ArrayList<>();
            temp2.add(value);
            map.put(key, temp2);
        }
        return map;
    }

    public void addToStorage2(String key, String value) {
        map.computeIfAbsent(key, k -> new LinkedList<>()).add(value);
    }

    public void printValues(String key) {
        System.out.println(map.get(key));
    }

//    public void findValues(String value) {
//        Stream<String> keys = map.entrySet().stream()
//                .filter(x -> "value".equals(x.getValue()))
//                .map(Map.Entry::getKey);
//    }

}
