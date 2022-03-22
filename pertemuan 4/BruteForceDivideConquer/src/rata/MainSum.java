/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta Misal 5.9)");
        System.out.println("");
        System.out.print("Masukkaan Jumlah Perusahaan : ");
        int perS = sc.nextInt();
        
        sum sm[] = new sum[perS];
        for (int i = 0; i < sm.length; i++){
            sm[i] = new sum();
            
            System.out.println("============================================================");
            System.out.println("Perusahaan ke- "+(i+1));
            System.out.print("Masukkan Jumlah bulan : ");
            sm[i].elemen = sc.nextInt();
            
            System.out.println("");
            sm[i].keuntungan = new double [sm[i].elemen];
            for (int j = 0; j<sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        sum data = new sum();
        for (int i=0 ; i< sm.length; i++){
            System.out.println("============================================================");
            System.out.println("Perusahaan ke- "+(i+1));
            System.out.println("Jumlah Bulan : "+ sm[i].elemen);
            System.out.println("");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen + " bulan adalah = %.2f ",data.totalBF(sm[i].keuntungan));
            System.out.println("");
            System.out.println("");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen + " bulan adalah = %.2f ", data.totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            System.out.println("");
        }
    }
}
