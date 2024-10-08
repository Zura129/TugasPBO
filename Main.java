/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Rokok
        Rokok rokok1 = new Rokok("Gudang Garam", 20000, 50);
        Rokok rokok2 = new Rokok("Djarum Super", 22000, 30);

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

