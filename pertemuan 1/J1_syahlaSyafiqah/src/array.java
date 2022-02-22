
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
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("TOKO BUNGA ROYAL GARDEN");
        System.out.println("=======================");
        
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 10000};
        int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12},{2, 10, 10, 5},{5, 7, 12, 9}};
        int total = 0;
  
        System.out.println("Nama Bunga :");
        System.out.println("1. Algonema");
        System.out.println("2. Keladi");
        System.out.println("3. Alocasia");
        System.out.println("4. Mawar");
        System.out.print("Cek Stok Bunga (1-4) : ");
        int bunga = sc.nextInt();
        switch(bunga){
            case 1 :
                int stok1 = 0;
                for(int i=0; i<4; i++){
                stok1 += stok[i][0];}
                System.out.println("Total stok bunga " + namaBunga[bunga-1]+" di seluruh cabang : "+ stok1);
                break;
            case 2 :
                int stok2 = 0;
                for(int i=0; i<4; i++){
                stok2 += stok[i][1];}
                System.out.println("Total stok bunga " + namaBunga[bunga-1]+" di seluruh cabang : "+ stok2);
                break;
            case 3 :
                int stok3 = 0;
                for(int i=0; i<4; i++){
                stok3 += stok[i][2];}
                System.out.println("Total stok bunga " + namaBunga[bunga-1]+" di seluruh cabang : "+ stok3);
                break;
            case 4 :
                int stok4 = 0;
                for(int i=0; i<4; i++){
                stok4 += stok[i][3];}
                System.out.println("Total stok bunga " + namaBunga[bunga-1]+" di seluruh cabang : "+ stok4);
                break;
            default :
                System.out.println("Tidak ada yang sesuai");
        }
        System.out.println("==============================================");
        System.out.println("Pengurangan stok bunga dicabang Royal Garden 1");
        System.out.println("==============================================");
        for(int i=0; i<4; i++){
            System.out.print(namaBunga[i] + " : ");
            int royalGarden1 =sc.nextInt();
            stok[0][i] -= royalGarden1;
        }
        System.out.println("==================================");
        System.out.println("Stok Bunga dicabang Royal Garden 1");
        System.out.println("==================================");
        for(int i=0; i<4; i++){
            total += stok[0][i]*harga[i];
            System.out.println(namaBunga[i]+ " : " + stok[0][i]);
            
        }

        System.out.println("Total pendapatan Toko Bunga Royal Garden 1 jika semua bunga terjual habis: "+ total);
    }
}
