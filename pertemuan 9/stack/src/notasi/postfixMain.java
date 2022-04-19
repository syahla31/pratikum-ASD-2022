/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasi;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class postfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        postfix post = new postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
