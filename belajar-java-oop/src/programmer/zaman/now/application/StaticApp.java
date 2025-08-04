package programmer.zaman.now.application;

import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

// Import biasa
// import programmer.zaman.now.data.Constant;
// import programmer.zaman.now.data.Application;

// Static Import
import static programmer.zaman.now.data.Constant.*;
import static programmer.zaman.now.data.Application.PROCESSORS;


// Memanggil static member
public class StaticApp {
    public static void main(String[] args) {
        // Penggunaan import biasa
        // System.out.println(Constant.APPLICATION);
        // System.out.println(Constant.VERSION);

        // Penggunaan Static Import
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5,6,7,8,9,10)
        );

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        // Penggunaan import biasa
        // System.out.println(Application.PROCESSORS);

        // Penggunaan Static Import
        System.out.println(PROCESSORS);
    }
}
