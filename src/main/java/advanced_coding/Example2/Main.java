package advanced_coding.Example2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage(new HashMap<>());

        storage1.addToStorage2("kurnik", "sliepka");
        storage1.addToStorage2("buda", "pes");

        storage1.printValues("kurnik");
        storage1.printValues("buda");

        storage1.addToStorage2("kurnik", "kohut");
        storage1.addToStorage2("dvor", "koza");

        storage1.printValues("kurnik");
        storage1.printValues("buda");

    }
}
