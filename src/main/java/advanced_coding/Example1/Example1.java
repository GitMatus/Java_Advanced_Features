package advanced_coding.Example1;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "Banana", "kiwi");
        System.out.println(caseSensitiveSortListDescending(strings));
    }

//    public static List<TreeSet<String>> caseSensitiveSortListDescending(List<String> stringList) {
//        TreeSet<String> tree = new TreeSet<>();
//        tree.addAll(stringList);
//        return List.of(tree);
//    }



    public static List<String> caseSensitiveSortListDescending(List<String> stringList) {
        stringList.sort(Collections.reverseOrder());
        return stringList;
    }
}