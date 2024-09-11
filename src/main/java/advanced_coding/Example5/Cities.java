package advanced_coding.Example5;

import java.util.HashMap;
import java.util.Map;

public class Cities {
    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("New York", 8419600);
        cityPopulation.put("Los Angeles", 3980400);
        cityPopulation.put("Chicago", 2716000);
        cityPopulation.put("Houston", 2328000);

        // 1. Iterate using entrySet()

        System.out.println(cityPopulation.entrySet());

        // 2. Iterate using keySet()

        System.out.println(cityPopulation.keySet());

        // 3. Iterate using forEach()

        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()){
            System.out.println(entry);
        };


        cityPopulation.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        System.out.println();
        cityPopulation.keySet().forEach(e -> System.out.println(e));
        System.out.println();
        cityPopulation.values().forEach(e -> System.out.println(e));


    }



}
