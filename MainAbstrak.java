/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Rokok.RokokAbstrak;
import Rokok.RokokFilterAbstrak;
import Rokok.RokokElektrikAbstrak;
/**
 *
 * @author HP
 */

// Main class untuk menjalankan program
public class MainAbstrak {
    public static void main(String[] args) {
        RokokAbstrak rokok1 = new RokokFilterAbstrak("Rokok GudangGaram", 20000, 2);
        RokokAbstrak rokok2 = new RokokElektrikAbstrak("Rokok Calibur GK2", 500000, 40000);

        rokok1.info();
        rokok1.deskripsi();

        System.out.println();

        rokok2.info();
        rokok2.deskripsi();
    }
}

