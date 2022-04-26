
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
public class stackmain {
    public static void main(String[] args) {
        stack stk = new stack(5);
        
        Scanner sc = new Scanner(System.in);
        
        int menu;
        char pilih;
        do {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||||||||| Stack Pakaian |||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("Masukkan pilihan : ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||||||||||||||||| Penambahan Pakaian ||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    do {
                        System.out.print("Jenis  : ");
                        String jenis = sc.next();
                        System.out.print("Warna  : ");
                        String warna = sc.next();
                        System.out.print("Merk   : ");
                        String merk = sc.next();
                        System.out.print("Ukuran : ");
                        String ukuran = sc.next();
                        System.out.print("Harga  : ");
                        double harga = sc.nextDouble();

                        pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    } while (pilih == 'y');
                    break;
                case 2:
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||| Mengeluarkan Pakaian |||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    stk.pop();
                    break;
                case 3:
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||| Pakaian yang Teratas |||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    stk.peek();
                    break;
                case 4:
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||||||||||||||||| Data Stack Pakaian ||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    stk.print();
                    stk.getMin();
                    break;
                default:
                    System.out.print("Angka yang dimasukkan salah!");
                    break;
            }
            
        } while (menu !=4);
    }
}
