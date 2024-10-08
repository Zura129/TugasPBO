/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author HP
 */

public class RokokInheritance {
    protected String merk;
    protected String jenis;
    protected int harga;

    // Constructor
    public RokokInheritance(String merk, String jenis, int harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi rokok
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: Rp " + harga);
    }
}
