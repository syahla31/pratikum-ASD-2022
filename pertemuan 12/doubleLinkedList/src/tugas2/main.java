/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class main {
    public static void menu() {
        System.out.println("+--------------------------------+");
        System.out.println("|     DAFTAR FILM LAYAR LEBAR    |");
        System.out.println("+--------------------------------+");
        System.out.println("| 1. Tambah Data Awal            |");
        System.out.println("| 2. Tambah Data Akhir           |");
        System.out.println("| 3. Tambah Data Index tertentu  |");
        System.out.println("| 4. Hapus Data Pertama          |");
        System.out.println("| 5. Hapus Data Terakhir         |");
        System.out.println("| 6. Hapus Data Tertentu         |");
        System.out.println("| 7. Cetak Semua Film            |");
        System.out.println("| 8. Cari ID Film Layar Lebar    |");
        System.out.println("| 9. Urut Rating Film - DESC     |");
        System.out.println("| 10. Keluar                     |");
        System.out.println("+--------------------------------+");
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        System.out.print("ID     : ");
        int id = sc.nextInt();
        System.out.print("Judul  : ");
        String judul = scS.nextLine();
        System.out.print("Rating : ");
        double rating = sc.nextDouble();
    }
    
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        int menu = 0;
        
        dLinkedList s = new dLinkedList();
        
        while (menu != 10){
            menu();
            System.out.print("| Pilih Menu : "); 
            menu = sc.nextInt();
            System.out.println("+--------------------------------+");
            try {
                switch(menu) {
                    case 1:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|    Masukkan Data Film - Awal   |");
                        System.out.println("+--------------------------------+");
                        System.out.print("ID     : ");
                        int id = sc.nextInt();
                        System.out.print("Judul  : ");
                        String judul = scS.nextLine();
                        System.out.print("Rating : ");
                        double rating = sc.nextDouble();
                        s.addFirst(id, judul, rating);
                        System.out.println("----------------------------------");
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|   Masukkan Data Film - Akhir   |");
                        System.out.println("+--------------------------------+");
                        System.out.print("ID     : ");
                        int id1 = sc.nextInt();
                        System.out.print("Judul  : ");
                        String judul1 = scS.nextLine();
                        System.out.print("Rating : ");
                        double rating1 = sc.nextDouble();
                        s.addLast(id1, judul1, rating1);
                        System.out.println("----------------------------------");
                        break;
                    case 3: 
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|   Masukkan Data Film - Index   |");
                        System.out.println("+--------------------------------+");
                        System.out.print("Index ke- : ");
                        int idx = sc.nextInt();
                        System.out.print("ID     : ");
                        int id2 = sc.nextInt();
                        System.out.print("Judul  : ");
                        String judul2 = scS.nextLine();
                        System.out.print("Rating : ");
                        double rating2 = sc.nextDouble();
                        s.add(id2, judul2, rating2, idx);
                        System.out.println("----------------------------------");
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Hapus Data Film - Awal     |");
                        System.out.println("+--------------------------------+");
                        s.removeFirst();
                        s.print();
                        break; 
                    
                    case 5:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Hapus Data Film - Akhir    |");
                        System.out.println("+--------------------------------+");
                        s.removeLast();
                        s.print();
                        break;    
                    
                    case 6:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Hapus Data Film - Index    |");
                        System.out.println("+--------------------------------+");
                        System.out.print("Index ke - : ");
                        int d = sc.nextInt();
                        s.remove(d);
                        s.print();
                        System.out.println("----------------------------------");
                        break;
                        
                    case 7:
                        System.out.println("");
                        System.out.println("+---------------------------------+");
                        System.out.println("|   SEMUA DATA FILM LAYAR LEBAR   |");
                        System.out.println("+---------------------------------+");
                        s.print();
                        break;
                        
                    case 8:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|      Cari Film Layar Lebar     |");
                        System.out.println("+--------------------------------+");
                        System.out.print("Masukkan ID film : ");
                        int cari = sc.nextInt();
                        int idFilm = s.search(cari);
                        s.search(cari);
                        s.tampilData(cari, idFilm);
                        s.tampilPosisi(cari, idFilm);
                        System.out.println("----------------------------------");
                        break;
                    
                    case 9:
                        System.out.println("");
                        System.out.println("+--------------------------------+");
                        System.out.println("|     Urut Rating Film - DESC    |");
                        System.out.println("+--------------------------------+");
                        s.sort();
                        s.print();
                        break;    
                  
                    case 10:
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
