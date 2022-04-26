/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukDewi;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class strukMain {
    public static void main(String[] args) {
        stack stk = new stack(10);
        
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
     
        char pilih;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~         STRUK BELANJA         ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Nomor Transaksi          : ");
            int nomorTransaksi = sc.nextInt();
            System.out.print("Tanggal Pembelian        : ");
            String tgl = scS.nextLine();
            System.out.print("Jumlah Barang yang dibeli: ");
            int jmlBrg = sc.nextInt();
            System.out.print("Total Harga Bayar        : ");
            double total = sc.nextDouble();
            System.out.println("");
            
            struk st = new struk(nomorTransaksi, tgl, jmlBrg, total);
            System.out.print("Apakah anda akan menambahkan data baru (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(st);
        } while (pilih == 'y');
        
        stk.print();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Jumlah Struk yang ditukarkan Voucher : ");
        
        int jml = sc.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~     STRUK YANG DITUKARKAN     ~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i = 0; i < jml; i++){
            stk.pop();
        }
        
        System.out.println("");
        stk.peek();
        System.out.println("");
        stk.print();
    }
}
