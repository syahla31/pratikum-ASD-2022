/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class main {
    
    public static void menu() {
        System.out.println("+--------------------------------+");
        System.out.println("|  PENGANTRI VAKSIN EXTRAVAGANZA |");
        System.out.println("+--------------------------------+");
        System.out.println("| 1. Tambah Data Penerima Vaksin |");
        System.out.println("| 2. Hapus Data Pengantri Vaksin |");
        System.out.println("| 3. Daftar Penerima Vaksin      |");
        System.out.println("| 4. Keluar                      |");
        System.out.println("+--------------------------------+");
    }
    
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        int menu = 0;
        
        dLinkedList s = new dLinkedList();
        
        while (menu != 4){
            menu();
            System.out.print("| Pilih Menu : "); 
            menu = sc.nextInt();
            System.out.println("+--------------------------------+");
            try {
                switch(menu) {
                    case 1:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|  Masukkan Data Penerima Vaksin |");
                        System.out.println("+--------------------------------+");
                        System.out.print("Nomor Antrian: ");
                        int no = sc.nextInt();
                        System.out.print("Nama Penerima: ");
                        String nama = scS.nextLine();
                        s.enqueue(no, nama);
                        System.out.println("----------------------------------");
                        break;
                    case 2:
                        s.dequeue();
                        s.print();
                        break;
                    case 3:
                        System.out.println("");
                        s.print();
                        break;
                    case 4:
                        System.out.println("+--------------------------------+");
                        System.out.println("|  PROGRAM SELESAI DIJALANKAN    |");
                        System.out.println("+--------------------------------+");
                        break;

                    default:
                        System.out.println("Pilihan Tidak ada");
                        break;
                }
                System.out.println("");
            } catch (Exception e){
                
            }
        }
    }
}
