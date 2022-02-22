
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
public class fungsi {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    menampilkanSemuaBunga();
    menampilkanStock();
    }
    public static void menampilkanSemuaBunga() {
        
        System.out.println("\t\tTOKO BUNGA ROYAL GARDEN");
        System.out.println("=======================================================");
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        String[] namaToko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
        
        int[][] stok = {{10, 5, 15, 7},{ 6, 11, 9, 12},{ 2, 10, 10, 5},{ 5, 7, 12, 9}};
        
        System.out.print("\t\t");
        for(String i : namaBunga) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        for(int i = 0; i < stok.length; i++) {
            System.out.print(namaToko[i] + "\t");
        for(int j = 0; j < stok[0].length; j++){
            System.out.printf("%6d ", stok[i][j]);
        }
        System.out.println();
        }
    }
    
    public static void menampilkanStock() {
        int[][] stokBunga = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}}; 
        
        int stokAglonema = 0, stokKeladi = 0, stokAlocasia = 0, stokMawar = 0;
        
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[0].length; j++) {
                if (j == 0) {
                    stokAglonema += stokBunga [i][j];
                }else if (j == 1) {
                    stokKeladi += stokBunga [i][j];
                }else if (j == 2) {
                    stokAlocasia += stokBunga[i][j];
                }else if (j == 3) {
                    stokMawar += stokBunga[i][j];
                }
            }
        }
        
        System.out.println("=======================================================");
        System.out.println("\tJumlah Stock Bunga di Seluruh Cabang");
        System.out.println("=======================================================");
        System.out.println("Stock Aglonema\t: " + stokAglonema +" Bunga");
        System.out.println("Stock Keladi\t: " + stokKeladi +" Bunga");
        System.out.println("Stock Alocasia\t: " + stokAlocasia +" Bunga");
        System.out.println("Stock Mawar\t: " + stokMawar +" Bunga");
    }
}
