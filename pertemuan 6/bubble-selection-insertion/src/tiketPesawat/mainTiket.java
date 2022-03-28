/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketPesawat;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class mainTiket {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~ PENJUALAN TIKET PESAWAT ~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Asal Penerbangan : ");
        String a = sc.nextLine();
        System.out.print("Masukkan Tujuan Penerbangan : ");
        String t = sc.nextLine();
        
        tiketService list = new tiketService();
        tiket t1 = new tiket("Garuda", 700000, a, t);
        tiket t2 = new tiket("Citilink", 900000, a, t);
        tiket t3 = new tiket("Batik Air", 300000, a, t);
        tiket t4 = new tiket("Lion Air", 380000, a, t);
        tiket t5 = new tiket("Sriwijaya Air", 500000, a, t);
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~ Data Tiket sebelum di sorting ~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.tampilAll();
        
        System.out.println("Sorting : ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Sorting Menggunakan : ");
        int sort = sc.nextInt();
        
        switch(sort) {
            case 1 : 
                //Bubble sort
                System.out.println("");
                System.out.println("Sorting dari :");
                System.out.println("1. Harga Termurah - Harga Tertinggi");
                System.out.println("2. Harga Tertinggi - Harga Termurah");
                System.out.print("Menampilkan berdasarkan ?");
                int bub = sc.nextInt();
                
                switch (bub) {
                    case 1 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Termurah - Tertinggi dgn Bubble Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.bubbleSort(true);
                        list.tampilAll();
                        break;
                    
                    case 2 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Tertinggi - Termurah dgn Bubble Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.bubbleSort(false);
                        list.tampilAll();
                        break;
                }
                break;
            case 2 : 
                System.out.println("");
                System.out.println("Sorting dari :");
                System.out.println("1. Harga Termurah - Harga Tertinggi");
                System.out.println("2. Harga Tertinggi - Harga Termurah");
                System.out.print("Menampilkan berdasarkan ?");
                int sel = sc.nextInt();
                
                switch(sel){
                    case 1 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Termurah - Tertinggi dgn Selection Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.selectionSort(true);
                        list.tampilAll();
                        break;
                    case 2 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Tertinggi - Termurah dgn Selection Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.selectionSort(false);
                        list.tampilAll();
                        break;
                    
                }
                break;
            
            case 3 : 
                System.out.println("");
                System.out.println("Sorting dari :");
                System.out.println("1. Harga Termurah - Harga Tertinggi");
                System.out.println("2. Harga Tertinggi - Harga Termurah");
                System.out.print("Menampilkan berdasarkan ?");
                int ins = sc.nextInt();
                
                switch(ins){
                    case 1 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Termurah - Tertinggi dgn Insertion Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.insertionSort(true);
                        list.tampilAll();
                        break;
                    case 2 :
                        System.out.println("");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~ Harga Tiket Tertinggi - Termurah dgn Insertion Sort ~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        list.insertionSort(false);
                        list.tampilAll();
                        break;
                }
                break;
        }        
    }
}
