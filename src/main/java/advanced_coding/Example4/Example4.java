package advanced_coding.Example4;

import java.util.*;
import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 1500);
        productPrices.put("Smartphone", 900);
        productPrices.put("Tablet", 400);
        productPrices.put("Smartwatch", 200);
        productPrices.put("Monitor", 300);

        List<Integer> pricesList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            pricesList.add(entry.getValue());
        }

        Collections.sort(pricesList);

//        for (int price : pricesList) {
//            Map<String, Integer> sortedProductList = new LinkedHashMap<>();
//            sortedProductList.put(productPrices.getValue(price), price);
//        }
//
//        public static <T, E> T getKeyByValue(Map < T, E > map, E value) {
//            for (Entry<T, E> entry : map.entrySet()) {
//                if (Objects.equals(value, entry.getValue())) {
//                    return entry.getKey();
//                }
//            }
//            return null;
//        }
    }


//                    System.out.println(pricesList);

//        Stream<Map.Entry<String,Integer>> sorted =
//                productPrices.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue());


// TODO: Sort the map by price in ascending order.
// TODO: Print the sorted map.
}

