
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
public class tugas2Main {
    public static void main(String[] args){
        tugas2 pl = new tugas2(5, 5, 10, 10);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO PACMAN");
        pl.printPosition();
        loop:while (true) {
            switch(sc.nextLine()){
                case "kiri":
                    System.out.println("========================");
                    System.out.println("Bergerak ke kiri");
                    pl.moveLeft();
                    break;
                case "kanan":
                    System.out.println("========================");
                    System.out.println("Bergerak ke kanan");
                    pl.moveRight();
                    break;
                case "atas":
                    System.out.println("========================");
                    System.out.println("bergerak Naik");
                    pl.moveUp();
                    break;
                case "bawah" :
                    System.out.println("========================");
                    System.out.println("bergerak Turun");
                    pl.moveDown();
                    break;
                case "keluar":
                    break loop;
                default :
                    pl.printPosition();
                    break;
            }
        }
    }
}
