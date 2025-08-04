package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // Error karena langsung membuat object location dari abstract class Location
        var city = new City(); // Aman karena membuat object city dari class city yang merupakan turunan dari class Location
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
