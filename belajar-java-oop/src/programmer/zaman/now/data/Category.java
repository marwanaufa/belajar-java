package programmer.zaman.now.data;

public class Category {
    private String id;
    private boolean expensive;

    // Variable dibuat private agar tidak bisa diakses secara bebas, kemudian menggunakan public getter dan setter untuk akses dan edit variable data tsb.
    // Untuk generate getter dan setter > Code > Generate > Getter and Setter > pilih semua variable yang mau dibuatkan getter setter dengan shift > ok
    // Atau shortcut alt + insert
    // Jadi tidak perlu membuat manual satu per satu
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
