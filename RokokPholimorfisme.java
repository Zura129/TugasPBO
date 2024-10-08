/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author HP
 */
class RokokPholimorfisme {
    protected String merek;
    protected double harga;

    // Konstruktor
    public RokokPholimorfisme(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi rokok
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Harga: " + harga);
    }
}
