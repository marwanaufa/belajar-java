package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTire();

    /**
     * Default method, muncul karena ketika kita mengedit atau menambah method pada interface yang sudah memiliki banyak child/implements,
     * maka akan menyulitkan krn semua child harus diedit untuk melakukan override terhadap method baru tersebut
     * Caranya adalah memberi keterangan/modifier "default" sebelum method. Ini membuat class turunannya tidak harus mengoverride method tsb.
     */
    default boolean isBig() {
        return false;
    }
}

/**
 * Interface > sebuah kontrak untuk membuat class. Mirip seperti parent class, interface bisa diturunkan namun menggunakan implements
 * Untuk menurunkan interface ke class menggunakan implements
 * Untuk menurunkan interface ke interface menggunakan extends
 * Class turunan interface harus mengoveride semua method yang ada di interfacenya. Karena semua yang ada di dalam interface secara default memiliki modifier abstract.
 * Satu turunan bisa mengimplements lebih dari 1 interface
 * Satu turunan juga bisa mengextends lebih dari 1 interface
  */
