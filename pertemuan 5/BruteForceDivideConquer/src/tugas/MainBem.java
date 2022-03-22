/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class MainBem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" |||||||||| PEMILIHAN KETUA BEM TAHUN 2022 ||||||||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        System.out.print("Masukkan banyaknya kandidat : ");
        bem mayoritas = new bem(sc.nextInt());
        sc.nextLine();

        for (int i = 0; i < mayoritas.hasilSuara.length; i++) {
            System.out.print("Masukkan hasil suara kandidat ke-" + (i + 1 + " : "));
            mayoritas.hasilSuara[i] = sc.nextLine();
        }

        System.out.println("Mayoritas suara terbanyak yang diperoleh adalah : " + mayoritas.cariMayoritas(mayoritas.hasilSuara, 0, mayoritas.hasilSuara.length-1));

        sc.close();
    }
}
