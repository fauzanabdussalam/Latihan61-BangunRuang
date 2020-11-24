/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menghitung Volume bangun ruang bola, tabung dan kerucut
 *
 */
public class PBO10K10119901Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        b.setJariJari(7);
        System.out.println("Jari-jari \t = " + b.getJariJari() + " cm");
        System.out.println("Volume \t\t = " + b.hitungVolume() + " cm^3");
        
        System.out.println();
        
        Tabung t = new Tabung();
        t.setJariJari(10);
        t.setTinggi(21);
        System.out.println("Jari-jari \t = " + t.getJariJari() + " cm");
        System.out.println("Tinggi \t\t = " + t.getTinggi() + " cm");
        System.out.println("Volume \t\t = " + t.hitungVolume() + " cm^3");
        
        System.out.println();
        
        Kerucut k = new Kerucut();
        k.setJariJari(14);
        k.setTinggi(9);
        System.out.println("Jari-jari \t = " + k.getJariJari() + " cm");
        System.out.println("Tinggi \t\t = " + k.getTinggi() + " cm");
        System.out.println("Volume \t\t = " + k.hitungVolume() + " cm^3");
    }
}
