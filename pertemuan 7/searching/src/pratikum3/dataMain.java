/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum3;

/**
 *
 * @author acer E5
 */
public class dataMain {
    public static void main(String[] args) {
        int dataArray[] = {12, 7, 2 , 1, 70, 50, 90, 17, 2, 90};
        
        data dt = new data(dataArray);
        
        int jumlah = 10;
        int max = 0;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~ Data Array ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sebelum di sorting : ");
        dt.tampil();
        dt.bubblesort();
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Setelah di sorting : ");
        dt.tampil();
        System.out.println("");
        System.out.println("------------------------------------------------------");
        dt.nilaiTerbesar();
        dt.Searching(max, 0, jumlah - 1);
        dt.tampilPosisi(max);
    }
}
