package minggu5.inheritance;

public class B extends A {

    int z;

    void tampilkanJumlah() {
        // subclass dapat memanggil member dari superclass
        System.out.println("jumlah : " + (x + y + z));
    }
}
