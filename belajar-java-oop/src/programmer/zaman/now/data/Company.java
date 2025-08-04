package programmer.zaman.now.data;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

/**
 * Inner Class
 * class di dalam class
 * dibuat ketika kita butuh membuat beberapa class yang saling berhubungan,
 * dimana sebuah class tidak bisa dibuat tanpa class lain
 * misal kita perlu membuat class Employee tetapi butuh class Company.
 * dengan membuat class Employee di dalam blok class Company
 *
 * Keuntungan saat membuat inner class adalah inner class bisa mengakses outer class nya
 * Inner class bisa membaca semua private member yang ada di outer class nya
 * Untuk mengakses object outer class nya, dengan menggunakan nama outer class diikuti kata kunci this.
 * misal Company.this
 * Untuk mengakses super class outer nya, kita bisa menggunakan nama class outernya diikuti kata kunci super.
 * misal Company.super
 */