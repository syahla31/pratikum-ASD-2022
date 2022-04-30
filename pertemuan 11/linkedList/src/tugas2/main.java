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
    public static void main(String[] args){
        sLinkedList sl = new sLinkedList();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("+----------------------+");
        System.out.println("|      LINKED LIST     |");
        System.out.println("+----------------------+");
        
        System.out.println("Menggunakan addFirst");
        System.out.print("Masukkan Huruf: ");
        String huruf1 = sc.nextLine();
        sl.addFirst(huruf1);
       
        System.out.println("");
        System.out.println("Menggunakan addLast");
        System.out.print("Masukkan Huruf: ");
        String huruf2 = sc.nextLine();
        sl.addLast(huruf2);
        
        System.out.println("");
        System.out.println("Menggunakan insertAfter");
        System.out.print("Setelah Huruf: ");
        String key = sc.nextLine();
        System.out.print("Masukkan Huruf: ");
        String huruf = sc.nextLine();
        sl.insertAfter(key, huruf);
        sl.print();
        
        System.out.println("");
        System.out.println("Menggunakan insertAt");
        System.out.print("Masukkan Huruf: ");
        String huruf4 = sc.nextLine();
        System.out.print("Setelah index ke- : ");
        int index = sc.nextInt();
        sl.insertAt(index, huruf4);
        
        sl.print();
         
    }
}
