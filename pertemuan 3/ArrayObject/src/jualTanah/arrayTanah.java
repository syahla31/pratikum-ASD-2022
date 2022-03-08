/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualTanah;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class arrayTanah {
    
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println("|||||||| Jual Beli Tanah ||||||||");
        System.out.println("|||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.print("Masukkan Jumlah Tanah : ");
        int n = scS.nextInt();
        tanah[] tArrayS = new tanah[n];
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            tArrayS[i] = new tanah();
            System.out.println("===========================");
            System.out.println("Tanah "+(i+1));
            System.out.println("---------------------------");
            System.out.print("Masukkan Panjang : ");
            tArrayS[i].panjang = scS.nextInt();
            System.out.print("Masukkan Lebar : ");
            tArrayS[i].lebar = scS.nextInt();
            System.out.println("---------------------------");
        }
        
        System.out.println();
        for( int i = 0; i < n; i++){
            
            System.out.println("Luas Tanah "+(i+1)+": " +tArrayS[i].luasTanah());
        }
        
        System.out.println();
        int s = 0;
        int luas[] = new int[n];
        
        for(int i = 0; i < n; i++){
            luas[i] = tArrayS[i].luasTanah();
        }
        
        s = tArrayS[0].tanahTerluas(luas);
        System.out.println("Tanah Terluas Adalah : Tanah " +(s+1));
    }
}
