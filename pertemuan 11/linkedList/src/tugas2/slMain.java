/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author acer E5
 */
public class slMain {
    public static void main(String[] args){
        
        sLinkedList sl = new sLinkedList();
        
        System.out.println("+----------------------------------+");
        System.out.println("|            LINKED LIST           |");
        System.out.println("+----------------------------------+");
        
        sl.addFirst("a");
        sl.addLast("e");
        sl.insertAfter("a", "b");
        sl.insertAt(2, "c");
        sl.insertAt(3, "d");
        sl.print();
        
    }
}
