/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author HP
 */
class RokokFilterPolimorfise extends RokokPholimorfisme {
    public RokokFilterPolimorfise(String merek, double harga) {
        super(merek, harga);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Rokok Filter:");
        super.tampilkanInfo();
    }
}

