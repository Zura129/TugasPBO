/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rokok;

/**
 *
 * @author HP
 */
    public abstract class RokokAbstrak {
    protected String nama;
    protected double harga;

    // Constructor
    public RokokAbstrak(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Abstract method
    public abstract void deskripsi();

    // Method untuk menampilkan informasi rokok
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
}
