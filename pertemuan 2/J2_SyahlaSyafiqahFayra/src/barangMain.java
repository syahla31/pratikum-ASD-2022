/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class barangMain {
    public static void main(String[] args){
        barang bl = new barang();
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        
        bl.tampilBarang();
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        System.out.println("===============================");
        barang b2 = new barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        System.out.println("===============================");
        barang b3 = new barang("Samsung", "Monitor", 31, 250000);
        b3.tampilBarang();
        System.out.println("===============================");
    }
    
}
