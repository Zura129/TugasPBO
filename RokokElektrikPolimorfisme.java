/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author HP
 */
// Kelas RokokElektrik yang mewarisi dari kelas Rokok
class RokokElektrikPolimorfisme extends RokokPholimorfisme {
    public RokokElektrikPolimorfisme(String merek, double harga) {
        super(merek, harga);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Rokok Elektrik:");
        super.tampilkanInfo();
    }
}
