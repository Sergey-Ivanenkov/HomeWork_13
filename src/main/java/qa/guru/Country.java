package qa.guru;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Цикл while
public class Country {

    public Set<String> country = new HashSet<>();

    public void addCountry(String countyName) {
        country.add(countyName);
    }

    public void removeCountry(String countryName) {
        country.remove(countryName);
    }

    public void searchCountry() {
        Iterator<String> it = country.iterator();

        while(it.hasNext()){
            String resulSearchCountry = it.next();
            System.out.println(resulSearchCountry);
        }
    }
}

