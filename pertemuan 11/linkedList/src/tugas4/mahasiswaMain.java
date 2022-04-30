/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        singleLinkedList ll = new singleLinkedList();
        
        int pilihan = 0;
        do{
            System.out.println("+----------------------------------+");
            System.out.println("|       LINKED LIST MAHASISWA      |");
            System.out.println("+----------------------------------+");
            System.out.println("1. Mahasiswa masuk");
            System.out.println("2. Mahasiswa keluar");
            System.out.println("3. Tampilkan semua mahasiswa");
            System.out.println("4. Tampilkan mahasiswa terdepan");
            System.out.println("5. Tampilkan makasiswa terakhir");
            System.out.println("6. Cari posisi mahasiswa");
            System.out.println("7. Cek posisi mahasiswa");
            System.out.println("8. Keluar");
            System.out.println("------------------------------------");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("+----------------------------------+");
                    System.out.println("|       PENAMBAHAN MAHASISWA       |");
                    System.out.println("+----------------------------------+");
                    System.out.println("Masukkan data mahasiswa : ");
                    System.out.print("NIM : ");
                    int nim = sc.nextInt();
                    sc.nextLine(); //Scanner safety
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    ll.addLast(new mahasiswa(nim, nama, absen, ipk));
                    break;
                case 2:
                    System.out.println("+----------------------------------+");
                    System.out.println("|      PENGURANGAN MAHASISWA       |");
                    System.out.println("+----------------------------------+");
                    ll.removeFirst();
                    break;
                case 3:
                    System.out.println("+----------------------------------+");
                    System.out.println("|   DATA SEMUA MAHASISWA YANG ADA  |");
                    System.out.println("+----------------------------------+");
                    ll.print();
                    break;
                case 4:
                    System.out.println("+----------------------------------+");
                    System.out.println("|        MAHASISWA TERDEPAN        |");
                    System.out.println("+----------------------------------+");
                    ll.peek();
                    break;
                case 5:
                    System.out.println("+----------------------------------+");
                    System.out.println("|      MAHASISWA TERBELAKANG       |");
                    System.out.println("+----------------------------------+");                    
                    ll.peekRear();
                    break;
                case 6:
                    System.out.println("+----------------------------------+");
                    System.out.println("|       PENCARIAN MAHASISWA        |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Masukkan NIM : ");
                    int indexFound = ll.indoxOf(sc.nextInt());
                    System.out.println("Mahasiswa yang dicari ada diantrian ke-" + (indexFound + 1));
                    break;
                case 7:
                    System.out.println("+----------------------------------+");
                    System.out.println("|       CARI ANTRI MAHASISWA       |");
                    System.out.println("+----------------------------------+");
                    System.out.print("Masukkan nomor antrian Mahasiswa : ");
                    mahasiswa mahasiswaFound = ll.getData((sc.nextInt() - 1));
                    System.out.println("Nomor antrian tersebut diisi oleh : " +
                    mahasiswaFound.nim + " " + mahasiswaFound.nama + " " + mahasiswaFound.absen);
                    break;
                case 8:
                    System.out.println("+----------------------------------+");
                    System.out.println("|         PROGRAM SELESAI          |");
                    System.out.println("+----------------------------------+");
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
