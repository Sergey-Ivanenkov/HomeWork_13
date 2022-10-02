package qa.guru;

import java.util.HashMap;
import java.util.Map;

public class Streets {
    Map<Integer, String> streets = new HashMap<>();

    public void addStreet(Integer number, String street) {
        streets.put(number, street);
    }

    public void removeStreet(Integer number, String street){
        do {
            streets.remove(number, street);
        } while (streets.equals(street));

    }

    public void printAllStreets() {
        for (Map.Entry<Integer, String> s : streets.entrySet()) {
            System.out.println(s);
        }
    }
}
