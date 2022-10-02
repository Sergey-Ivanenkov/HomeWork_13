package qa.guru;

import java.util.ArrayList;


//Цикл for each
public class Regions {
    ArrayList<String> regions = new ArrayList<>();

    public void addRegion(String region) {
        regions.add(region);
    }

    public void deletedRegion(String region) {
        regions.remove(region);
    }

    public void printAllRegions() {
        for (String s : regions) {
            System.out.println(s);
        }
    }
}
