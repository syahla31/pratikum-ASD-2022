/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkat;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char keluar;
        
    do {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~ MENGHITUNG PANGKAT  ~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
        System.out.println("Menghitung menggunakan :");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu ke (1-3) : ");
        int menu= sc.nextInt();
        
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        int n, p;

        pangkat []png = new pangkat[elemen];
        
        switch(menu){
            case 1 :
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~ menghitung pangkat Brute Force  ~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                for(int i = 0; i < png.length; i++){
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    p = sc.nextInt();
                    png[i] = new pangkat(n,p);
                }

                System.out.println("===============================================");
                System.out.println("====== Hasil Pangkat dengan Brute Force =======");
                System.out.println("===============================================");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBP(png[i].nilai,png[i].pangkat));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                break;
            case 2 :
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~ menghitung pangkat Divide Conquer ~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                
                for(int i = 0; i < png.length; i++){
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    p = sc.nextInt();
                    png[i] = new pangkat(n,p);
                }
                
                System.out.println("===============================================");
                System.out.println("=== Hasil Pangkat dengan Divide and Conquer ===");
                System.out.println("===============================================");
                
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }

                break;
            case 3 :
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~ T E R I M A - K A S I H ~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            default :
                System.out.println("Anda Salah Memasukkan angka !");
                break;
        } if (menu == 3){
            keluar = 'T';
        } else {
            System.out.print("Kembali ke Menu ? (Y/T) : ");
            keluar = sc.next().charAt(0);
        }
    } while (keluar == 'Y' || keluar == 'y');
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
