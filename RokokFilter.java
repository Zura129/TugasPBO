/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author HP
 */
public class RokokFilter extends Rokok {
    private int kadarNikotin;

    public RokokFilter(String merk, int harga, int kadarNikotin) {
        super(merk, "Filter", harga);
        this.kadarNikotin = kadarNikotin;
    }

    // Override method tampilkanInfo untuk menampilkan informasi tambahan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kadar Nikotin: " + kadarNikotin + " mg");
    }
}

