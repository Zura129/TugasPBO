/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author HP
 */
// Kelas utama
public class MainPolimorfisme {
    public static void main(String[] args) {
        // Membuat objek dari RokokFilter dan RokokElektrik
        RokokPholimorfisme rokok1 = new RokokFilterPolimorfise("Merek GudangGaram", 20000);
        RokokPholimorfisme rokok2 = new RokokElektrikPolimorfisme("Merek Caliburn GK2", 500000);

        // Menampilkan informasi masing-masing rokok
        rokok1.tampilkanInfo();
        System.out.println(); // Baris kosong
        rokok2.tampilkanInfo();
    }
}