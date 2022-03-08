/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author acer E5
 */
public class arrayObjects {
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        
        System.out.print("Berapa banyak Persegi Panjang : ");
        int ppS = scS.nextInt();
        int p, l;
        
        persegiPanjang[] ppArray = new persegiPanjang[ppS];
        System.out.println();
        
        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            p = scS.nextInt();
            System.out.print("Masukkan lebar: ");
            l = scS.nextInt();
            System.out.println("======================");
            ppArray[i] = new persegiPanjang(p, l);
        }
        System.out.println();
        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" +(i+1));
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            System.out.println("======================");
        }
        
    }
    
}
