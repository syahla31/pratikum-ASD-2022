/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class arrayMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~ DATA MAHASISWA ~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int ms = sc.nextInt();
        int nim;
        String nm,jk;
        double ipk;
        
        System.out.println();
        
        mahasiswa[] msArrayS = new mahasiswa[ms];
        
        
        for (int i = 0; i < msArrayS.length; i++) {
            System.out.println("Data Mahasiswa "+(i+1));
            System.out.print("Masukkan Nama : ");
            nm = sc.next();
            System.out.print("Masukkan NIM : ");
            nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            jk = sc.next();
            System.out.print("Masukkan IPK : ");
            ipk = sc.nextDouble();
            msArrayS[i] = new mahasiswa(nim,nm,jk,ipk);
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < msArrayS.length; i++) {
            System.out.println("Data Mahasiswa "+(i+1));
            System.out.println("Nama : "+msArrayS[i].nama);
            System.out.println("NIM : "+msArrayS[i].NIM);
            System.out.println("Jenis Kelamin : "+msArrayS[i].jenisKelamin);
            System.out.println("Nilai IPK : "+msArrayS[i].IPK);
            System.out.println("================================");
        }
    }
}
