package programmer.zaman.now.data;

public abstract class Animal {
    public String name;
    public abstract void run();
}

/**
 * Abstract method > bisa dibuat didalam abstract class
 * Saat membuat abstract method, kita tidak boleh membuat block method, jadi cuma nama methodnya saja tanpa ada block isinya
 * Child class wajib melakukan override pada abstract method tersebut, jika tidak maka akan error
 * Abstract method tidak boleh memakai modifier private
 */