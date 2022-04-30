/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author acer E5
 */
public class main {
    public static void main(String[] args){
        
        linkedList ls = new linkedList();
        
        System.out.println("+----------------------------------+");
        System.out.println("|      LINKED LIST MATAKULIAH      |");
        System.out.println("+----------------------------------+");
        
        ls.top("Algoritma");
        ls.addLast("Bahasa");
        ls.insertAt(0, "Multimedia");
        ls.insertAfter("Multimedia", "Statistika");
        ls.insertAt(3, "Matematika");
        ls.insertBefore("Bahasa", "Android");
        ls.insertAt(4, "Basis Data");
        ls.insertAfter("Basis Data", "Komputer");
        ls.print();
        
    }
}
