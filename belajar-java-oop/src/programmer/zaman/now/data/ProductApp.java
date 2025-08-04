/**
 * Access Modifier
 *
 * Access Level
 * Modifier        Class   Package     Subclass    World
 * public          Y       Y           Y           Y
 * protected       Y       Y           Y           N
 * no modifier     Y       Y           N           N
 * private         Y       N           N           N
 *
 * Class > bisa diakses di class yang sama
 * Package > bisa diakses di package yang sama
 * Subclass > bisa diakses di turunan atau childnya, tetap bisa meskipun di package yang berbeda
 * World > bisa diakses diluar classnya
 *
 * Public Class
 * - Dalam 1 file java hanya bisa membuat 1 public class
 * - Nama public class harus sama dengan nama file java
 */

package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30000000);
        Product product2 = new Product("Macbook Pro", 30000000);

        // name dan price dengan modifier protected bisa diakses dari package yang sama
        // Tapi akan error ketika modifier dirubah menjadi private
        System.out.println(product.name);
        System.out.println(product.price);

        // Ketika diprintln setelah method toString dioverride
        System.out.println(product);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
