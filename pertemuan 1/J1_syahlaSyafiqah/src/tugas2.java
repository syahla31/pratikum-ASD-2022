
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
public class tugas2 {
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        
        System.out.println("MENGHITUNG KECEPATAN JARAK WAKTU");
        System.out.println("================================");
        
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("Pilih Proses >> ");
        int hitung = scS.nextInt();
        
        switch(hitung){
            case 1 :
               hitungKecepatan();
               break;
            case 2 :
                hitungJarak();
                break;
            case 3 :
                hitungWaktu();
                break;
        }
    }

    private static void hitungKecepatan() {
        System.out.println("====================================");
        System.out.println("\tMENGHITUNG KECEPATAN");
        System.out.println("====================================");
        Scanner scS = new Scanner(System.in);
        System.out.print("Masukkan Jarak: ");
        int jarak = scS.nextInt();
        System.out.print("Masukkan Waktu: ");
        int waktu = scS.nextInt();
        int v = jarak/waktu;
        System.out.println("Maka Kecepatannya adalah: " +v +" Km/Jam");
    }

    private static void hitungJarak() {
        System.out.println("===================================");
        System.out.println("\tMENGHITUNG  JARAK");
        System.out.println("===================================");
        Scanner scS = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan: ");
        int kecepatan = scS.nextInt();
        System.out.print("Masukkan Waktu: ");
        int waktu = scS.nextInt();
        int jarak = kecepatan*waktu;
        System.out.println("Maka Jarak yang ditempuh : " +jarak +" Km");
    }

    private static void hitungWaktu() {
        System.out.println("=============================================");
        System.out.println("\t\tMENGHITUNG WAKTU");
        System.out.println("=============================================");
        Scanner scS = new Scanner(System.in);
        System.out.print("Masukkan Jarak: ");
        int jarak = scS.nextInt();
        System.out.print("Masukkan Kecepatan: ");
        int kecepatan = scS.nextInt();
        
        int waktu = jarak/kecepatan;
        System.out.println("Maka Waktu yang dibutuhkan adalah: " +waktu +" Jam");
    }
}
