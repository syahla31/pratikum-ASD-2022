/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    barang(){
        
    }
    
    barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    
    void tambahStok(int n){
        stok=stok+n;
    }
    
    void kurangiStok(int n){
        if(stok > 0) stok=stok-n;
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}
