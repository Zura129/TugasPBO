/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rokok;

/**
 *
 * @author HP
 */

// Subclass untuk RokokFilter
public class RokokFilterAbstrak extends RokokAbstrak {
    private int jumlahFilter;

    public RokokFilterAbstrak(String nama, double harga, int jumlahFilter) {
        super(nama, harga);
        this.jumlahFilter = jumlahFilter;
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah rokok filter dengan " + jumlahFilter + " filter.");
    }
}
