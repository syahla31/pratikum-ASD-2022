/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class tugas1 {
    String nama;
    int hargaSatuan, jumlah, totalBayar, harga, total;
    float diskon;
    
    tugas1(){
        
    }
    tugas1(String nm, int hrg, int jml){
        nama = nm;
        hargaSatuan = hrg;
        jumlah = jml;
    }
    
    void tampilBarang(){
        System.out.println("=============================");
        System.out.println("===== Toko Barang Panda =====");
        System.out.println("=============================");
        System.out.println("Nama\t= "+nama);
        System.out.println("Harga/pc= "+hargaSatuan);
        System.out.println("Jumlah\t= "+jumlah);
        System.out.println("=============================");
        System.out.println("Harga\t= "+harga);
        System.out.println("Diskon\t= "+diskon);
        System.out.println("Total\t= "+total);
    }
    
    int hitungHargaTotal(int jumlah){
        return harga = jumlah*hargaSatuan;
    }
    
    void hitungDiskon(){
        if(harga>100000){
            diskon = (float)(harga*(0.1));
        } else if(harga >= 50000 && harga <= 100000){
            diskon = (float)(harga*(0.05));
        } else{
            diskon = (float)(harga);
        }
    }
    
    void hitungHargaBayar(){
       total = (int) (harga - diskon);
    }
    
}
