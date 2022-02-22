
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
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] hari ={"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        
        System.out.println("PROGRAM PERULANGAN DENGAN NIM");
        System.out.println("=============================");
        System.out.print("Masukkan NIM: ");
        String nim =sc.nextLine();
        System.out.println("=============================");
        
        nim = nim.substring(nim.length()-2);
        int number = Integer.parseInt(nim);
       
        if(number < 10){
            number= number+10;
        }
        
        int beda = number%7;
        number/=7;
 
        for(int i = 0; i < number; i++){
            for(int j=0; j<7; j++){
            System.out.print(hari[j]+ " ");
            }
        }
        
        for(int i=0;i<beda;i++){
            System.out.print(hari[i]+ " ");
        }
    }
}
