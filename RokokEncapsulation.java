/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author HP
 */
class RokokEncapsulation {
    // Atribut private
    private String merek;
    private int harga;
    private int stok;

    // Constructor untuk menginisialisasi objek
    public RokokEncapsulation(String merek, int harga, int stok) {
        this.merek = merek;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk mendapatkan nilai merek
    public String getMerek() {
        return merek;
    }

    // Setter untuk mengubah nilai merek
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter untuk mendapatkan nilai harga
    public int getHarga() {
        return harga;
    }

    // Setter untuk mengubah nilai harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Getter untuk mendapatkan nilai stok
    public int getStok() {
        return stok;
    }

    // Setter untuk mengubah nilai stok
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method untuk menampilkan informasi rokok
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }
}
