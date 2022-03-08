/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class bangunRuang {
    
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~ T A B U N G ~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Tabung : ");
        int tabungS = scS.nextInt();
        int rT, tT;
        
        tabung[] tbArrayS = new tabung[tabungS];
        System.out.println("====================================");
        for (int i = 0; i < tbArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rT = scS.nextInt();
            System.out.print("Masukkan tinggi "+(i+1)+": ");
            tT = scS.nextInt();
            tbArrayS[i] = new tabung(rT, tT);
            System.out.println("====================================");
        }
        for (int i = 0; i < tbArrayS.length; i++){
            System.out.println("Tabung ke - "+(i+1));
            System.out.println("Jari - jari : "+tbArrayS[i].jari);
            System.out.println("Tinggi : "+tbArrayS[i].tinggi);
            System.out.println("------------------------------------");
            System.out.println("Volume tabung "+(i+1)+": "+tbArrayS[i].volume());
            System.out.println("Luas Permukaan tabung "+(i+1)+": "+tbArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~ B O L A ~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Bola : ");
        int bolaS = scS.nextInt();
        int rB;
        
        bola[] bArrayS = new bola[bolaS];
        System.out.println("====================================");
        for (int i = 0; i < bArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rB = scS.nextInt();
            bArrayS[i] = new bola(rB);
            System.out.println("====================================");
        }
        
        for (int i = 0; i < bArrayS.length; i++){
            System.out.println("Bola ke - "+(i+1));
            System.out.println("Jari - jari : "+bArrayS[i].jari);
            System.out.println("------------------------------------");
            System.out.println("Volume Bola "+(i+1)+": "+bArrayS[i].volume());
            System.out.println("Luas Permukaan Bola "+(i+1)+": "+bArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~ K E R U C U T ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Berapa banyak Kerucut : ");
        int keS = scS.nextInt();
        int rK, sK, tK;
        
        kerucut[] kArrayS = new kerucut[keS];
        System.out.println("====================================");
        for (int i = 0; i < kArrayS.length; i++){
            System.out.print("Masukkan Jari - jari "+(i+1)+": ");
            rK = scS.nextInt();
            System.out.print("Masukkan Garis Pelukis "+(i+1)+": ");
            sK = scS.nextInt();
            System.out.print("Masukkan Tinggi "+(i+1)+": ");
            tK = scS.nextInt();
            System.out.println("====================================");
            kArrayS[i] = new kerucut(rK,sK,tK);
        }
        
        for (int i = 0; i < kArrayS.length; i++){
            System.out.println("====================================");
            System.out.println("Kerucut ke- "+(i+1));
            System.out.println("Jari - jari : "+kArrayS[i].jari);
            System.out.println("Garis Pelukis : "+kArrayS[i].garisPelukis);
            System.out.println("Tinggi : "+kArrayS[i].tinggi);
            System.out.println("------------------------------------");
            System.out.println("Volume Kerucut "+(i+1)+": "+kArrayS[i].volume());
            System.out.println("Luas Permukaan Kerucut "+(i+1)+": "+kArrayS[i].luasPermukaan());
            System.out.println("------------------------------------");
        }
        System.out.println("====================================");
    }
}
