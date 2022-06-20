/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author acer E5
 */
public class stack {
    String judul, director;
    int id, tahun;
    
    public stack(){
        
    }
    
    public stack(int id, String judul, int tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }
    
    @Override
    public String toString(){
        return "ID Film\t\t = " + id + "\nJudul Film\t = " + judul + "\nTahun Tayang\t = " + tahun + "\nDirector\t = " + director + "\n";
    }
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        Stack<stack> film = new Stack<>();
        int pil = 0;
        do {
            System.out.println("+--------------------------------------+");
            System.out.println("| Data Film Layar Lebar Sepanjang Masa |");
            System.out.println("+--------------------------------------+");
            System.out.println("| 1. Input Judul Film");
            System.out.println("| 2. Hapus Data Film Teratas");
            System.out.println("| 3. Cek judul Film Teratas");
            System.out.println("| 4. Info Semua Judul Film");
            System.out.println("| 5. Keluar"); 
            System.out.println("+--------------------------------------+");
            System.out.print("| pilih : ");
            pil = sc.nextInt();
            switch(pil){
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            INPUT DATA FILM           |");
                    System.out.println("+--------------------------------------+");
                    System.out.print("ID Film      : ");
                    int id = sc.nextInt();
                    System.out.print("Judul Film   : ");
                    String judul = scS.nextLine();
                    System.out.print("Tahun Tayang : ");
                    int tahun = sc.nextInt();
                    System.out.print("Director     : ");
                    String director = scS.nextLine();
                    stack data = new stack(id, judul, tahun, director);
                    film.push(data);
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|        HAPUS DATA FILM TERATAS       |");
                    System.out.println("+--------------------------------------+");
                    System.out.println(film.pop());
                    break;
                case 3:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|           DATA FILM TERATAS          |");
                    System.out.println("+--------------------------------------+");
                    System.out.println(film.peek());
                    break;
                case 4: 
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            SEMUA DATA FILM           |");
                    System.out.println("+--------------------------------------+");
                    for (int i = 0; i < film.size(); i++){
                        System.out.println(film.get(i));
                    }
                    break;
                case 5:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|           T H A N K - Y O U          |");
                    System.out.println("+--------------------------------------+");
                    break;
            }
        } while (pil < 5 && pil > 0);
    }
}
