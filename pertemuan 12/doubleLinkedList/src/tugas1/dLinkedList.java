/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author acer E5
 */
public class dLinkedList {
    
    node front, rear;
    int size;
    
    public dLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(int nomor, String nama){
        node nodeS = new node(null, nomor, nama, null);
        if(isEmpty()){ 
            front = nodeS;
            rear = nodeS;
        } else { 
            rear.next = nodeS;
            rear = nodeS;
        }
        size++; 
    }
    
    public void dequeue() throws Exception {
       if(isEmpty()) {
           throw new Exception("Linked List masih kosong, tidak dapat dihapus");
       } else if (size == 1){ // jika size = 1
           removeLast(); // maka masuk ke method removeLast
       } else {
           System.out.println(front.nama + " telah selesai divaksinasi");
           front = front.next;
           front.prev = null;
           size--;
       }
    }
    
    public void removeLast() throws Exception {
       if(isEmpty()) {
           throw new Exception("Linked List masih kosong, tidak dapat dihapus");
       } else if (front.next == null ) { 
           front = null; 
           size--;
           return;
       }
       node current = front; 
       while (current.next.next != null){
           current = current.next;
       }
       current.next = null;
       size--;
    }
    
    public void print() {
        if (!isEmpty()) {
            node temp = front;
            System.out.println("+--------------------------------+");
            System.out.println("|     Daftar Pengantri vaksin    |");
            System.out.println("+--------------------------------+");
            System.out.println("| Nomor\t | Nama\t |");
            while (temp != null) {
                System.out.println("| " + temp.nomor + " \t | " + temp.nama + "\t |");
                temp = temp.next;
            }
            System.out.println("Sisa Antrian : " + size);
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
