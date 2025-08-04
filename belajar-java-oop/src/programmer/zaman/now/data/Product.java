package programmer.zaman.now.data;

import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * toString() method
     * kita bisa membuat method toString sendiri atau bisa dibilang mengoverride method toString agar yang ditampilkan lebih mudah dibaca.
     * tidak hanya menampilkan hash code yang tidak mudah dibaca.
     */

    public String toString() {
        return "Product name : " + name + ", price : " + price;
    }

    /**
     * hashCode mirip dengan toString yang representasi String, hashCode adalah representasi integer.
     * Sebanyak apapun hashCode dipanggil, untuk object yang sama harus menghasilkan data integer yang sama.
     * Jika 2 object yang sama dibandingkan menggunakan equals menghasilkan true, maka nilai hashCode nya juga harus sama atau true.
     * Jika 2 object dibandingkan dengan equals menghasilkan false, maka nilai hashCode nya tidak harus sama, atau tidak harus false juga.
     */
    // Override method hashCode dengan generate (alt + insert)
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        return result;
    }

    // Override method equals dengan generate (alt + insert)
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    // Override method equals secara manual
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
//
//        if (!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//        if (this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
