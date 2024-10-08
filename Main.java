/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing jenis rokok
        Rokok rokokFilter = new RokokFilter("Gudang Garam", 25000, 1);
        Rokok rokokElektrik = new RokokElektrik("VapeX", 150000, 1200);

        // Menampilkan informasi masing-masing rokok
        System.out.println("Informasi Rokok Filter:");
        rokokFilter.tampilkanInfo();

        System.out.println("\nInformasi Rokok Elektrik:");
        rokokElektrik.tampilkanInfo();
    }
}
