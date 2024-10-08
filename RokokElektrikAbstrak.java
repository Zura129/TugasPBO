/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rokok;

/**
 *
 * @author HP
 */
// Subclass untuk RokokElektrik
public class RokokElektrikAbstrak extends RokokAbstrak {
    private int kapasitasBaterai;

    public RokokElektrikAbstrak(String nama, double harga, int kapasitasBaterai) {
        super(nama, harga);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah rokok elektrik dengan kapasitas baterai " + kapasitasBaterai + " mAh.");
    }
}
