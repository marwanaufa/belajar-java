// Super Keyword
// Dipakai ketika ingin memakai method atau field dari parent yang sudah terlanjur kita override di child class

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    // Method getCorner() telah di overriding dan atau overshadow
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // Memanggil method getCorner milik parent menggunakan super
        return super.getCorner();
    }
}
