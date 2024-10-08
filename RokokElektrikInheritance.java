/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author HP
 */
public class RokokElektrikInheritance extends RokokInheritance {
    private int kapasitasBaterai; // dalam mAh

    public RokokElektrikInheritance(String merk, int harga, int kapasitasBaterai) {
        super(merk, "Elektrik", harga);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Override method tampilkanInfo untuk menampilkan informasi tambahan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}

