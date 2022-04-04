
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner sl = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        pencarianMhs data = new pencarianMhs(jumMhs);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("------------- Masukkan Data Mahasiswa ---------------");
        
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            mahasiswa m = new mahasiswa (nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        System.out.println("-----------------------------------------------------");
        data.tampil();
        
        
        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");
        System.out.println("Pencarian Data");
        System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
        int cari = s.nextInt();
       
        System.out.println("=====================================================");
        System.out.println("Menggunakan sequntial Search");
        int posisi = data.findSeqSearch(cari);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        System.out.println("=====================================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, jumMhs - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
    }
}
