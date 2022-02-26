/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class tugas1Main {
    public static void main(String[] args){
        tugas1 bl = new tugas1();
        bl.nama = "Buku Novel";
        bl.jumlah = 12;
        bl.hargaSatuan = 50000;
       
        int total = bl.hitungHargaTotal(bl.jumlah);
        bl.hitungDiskon();
        bl.hitungHargaBayar();
        bl.tampilBarang();
        tugas1 b2 = new tugas1("Kanvas 20 x 20 cm", 5, 22000);
        int total2 = b2.hitungHargaTotal(b2.jumlah);
        b2.hitungDiskon();
        b2.hitungHargaBayar();
        b2.tampilBarang();
    }
}
