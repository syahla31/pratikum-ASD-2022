
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
public class array2Dimensi {
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        
        persegiPanjang[][] ppArray = new persegiPanjang[2][2];
        
        ppArray[0][1] = new persegiPanjang();
        ppArray[0][1].panjang = 200;
        ppArray[0][1].lebar = 20;
        
        ppArray[1][1] = new persegiPanjang();
        ppArray[1][1].panjang = 100;
        ppArray[1][1].lebar = 10;
        
        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang Array 2 Dimensi ke-" +(i+1));
            System.out.println("Panjang: " + ppArray[i][1].panjang + ", lebar: " + ppArray[i][1].lebar);
            System.out.println("======================================");
        }
        
    }
}
