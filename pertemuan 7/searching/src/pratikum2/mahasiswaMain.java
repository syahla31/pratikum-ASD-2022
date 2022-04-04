/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum2;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner sl = new Scanner (System.in);
        
        pencarianMhs data = new pencarianMhs();
        int jumMhs = 5;
        
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
        System.out.println("----------- Data Keseluruhan Mahasiswa : ------------");
        System.out.println("-----------------------------------------------------");
        data.tampil();
       
        System.out.println("_____________________________________________________");
        System.out.println("Pencarian Data");
        System.out.println("");
        System.out.print("Masukkan Nama Mahasiswa yang dicari : ");
        String nama = sl.nextLine();
       
        System.out.println("=====================================================");
        System.out.println("Menggunakan sequntial Search : ");
        int posisi = data.findSeqSearch(nama);
        
        data.tampilPosisi(nama, posisi);
        data.tampilData(nama, posisi);
        
    }
}
