/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class dLinkedListMain {
    public static void main(String[] args) throws Exception {
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        System.out.println("Data Awal pada Linked List Adalah : " + dll.getFirst());
        System.out.println("Data Akhir pada Linked List Adalah : " + dll.getLast());
        System.out.println("Data Indeks ke - 1 pada Linked List Adalah : " + dll.get(1));
        
        /*
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size);
        */
    }
    
}
