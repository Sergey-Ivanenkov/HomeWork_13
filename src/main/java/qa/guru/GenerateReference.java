package qa.guru;

public class GenerateReference {
    public static void main(String[] args) {
//Regions
        Regions region = new Regions();

        region.addRegion("Москва");
        region.addRegion("Воронеж");
        region.printAllRegions();
        region.deletedRegion("Воронеж");
        System.out.println("");
        region.printAllRegions();

//Country
        Country countryName = new Country();
        countryName.addCountry("Россия");
        countryName.addCountry("Китай");
        System.out.println("");
        countryName.searchCountry();

        countryName.removeCountry("Китай");
        System.out.println("");
        countryName.searchCountry();

//Streets
        Streets streets = new Streets();
        streets.addStreet(1, "ул. Ленина");
        streets.addStreet(2, "ул. Королева");
        System.out.println("");
        streets.printAllStreets();

        streets.removeStreet(1, "ул. Ленина");
        System.out.println("");
        streets.printAllStreets();
    }
}
