/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author acer E5
 */
public class singleLinkedList {
    node head;
    node tail;
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List: ");
            int counter = 1;
            while (tmp != null) {
                System.out.println("Antrian ke-" + counter + " : " + tmp.data.nim + " " +
                tmp.data.nama + " " + tmp.data.absen + " " + tmp.data.ipk);
                tmp = tmp.next;
                counter++;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
    
    public void peek() {
        System.out.println("Antrian terdepan : " + head.data.nim + " " + head.data.nama + " " +
        head.data.absen + " " + head.data.ipk);
    }
    
    public void peekRear() {
        System.out.println("Antrian terakhir : " + tail.data.nim + " " + tail.data.nama + " " +
        tail.data.absen + " " + tail.data.ipk);
    }
    
    public void addLast(mahasiswa input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public mahasiswa getData(int index) {
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indoxOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp.next != null && tmp.data.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp.data.nim != key) {
            return -1;
        } else {
            return index;
        }
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            System.out.println("Mahasiswa Keluar: ");
            System.out.println("NIM   :" + head.data.nim);
            System.out.println("Nama  :" + head.data.nama);
            System.out.println("Absen :" + head.data.absen);
            System.out.println("IPK   :" + head.data.ipk);
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
