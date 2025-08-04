package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Application {
    public static void main(String[] args) {

        // new Product error karena constructor nya di package asal memiliki modifier default atau no modifier
        // Bisa diberi modifier public agar bisa diakses
        Product product = new Product("Macbook Pro", 30000000);

        // name dan price error karena memiliki modifier protected
        // Bisa diberi modifier public agar bisa diakses
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
