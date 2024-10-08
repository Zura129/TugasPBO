/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author HP
 */
public class MainEncapsulation {
    public static void main(String[] args) {
        // Membuat objek Rokok
        RokokEncapsulation rokok1 = new RokokEncapsulation("Gudang Garam", 20000, 50);
        RokokEncapsulation rokok2 = new RokokEncapsulation("Djarum Super", 22000, 30);

        // Menampilkan informasi rokok1
        rokok1.tampilkanInfo();

        System.out.println(); // Pemisah antar informasi

        // Menampilkan informasi rokok2
        rokok2.tampilkanInfo();

        // Mengubah harga dan stok rokok1 menggunakan setter
        rokok1.setHarga(21000);
        rokok1.setStok(45);
    }
}

