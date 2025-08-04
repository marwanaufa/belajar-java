package programmer.zaman.now.data;

/**
 * Final Class
 * kata kunci final bisa digunakan untuk class,
 * fungsinya sama yaitu agar class tersebut tidak bisa dirubah atau diturunkan lagi
 * jika final class diturunkan maka akan error
 */

/**
 * Final Method
 * kata kunci final bisa digunakan untuk method,
 * fungsinya yaitu agar method tidak bisa dioverride oleh class turunan
 * jika final method coba dioverride maka akan error
 */

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {
        // Isi method
    }
}

//class FakeFacebook extends Facebook {
//    void login(String username, String password) {
//        // Isi method
//    }
//}
