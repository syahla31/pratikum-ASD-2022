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
    
    public void addFirst(int id, String judul, double rating){
        if(isEmpty()){
            front = new node(null, id, judul, rating, null); 
        } else { 
            node newNode = new node (null, id, judul, rating, front);
            front.prev = newNode; 
            front = newNode; 
        }
        size++; 
    }
    
    public void addLast(int id, String judul, double rating){
        if(isEmpty()) {
            addFirst(id, judul, rating);
        } else { 
            node current = front; // current = duplikat node
            while (current.next != null){ // jika posisinya setelahnya tidak kosong
                current = current.next; // maka masuk ke posisi setelahnya
            }
            node newNode = new node(current, id, judul, rating, null);
            current.next = newNode; 
        }
        size++; // bertambah size
    }
    
    public void add(int id, String judul, double rating, int index) throws Exception{
        if(isEmpty()){
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai Index diluar batas");
        } else {
            node current = front;
            int i = 0;
            while (i < index){ 
                current = current.next;
                i++;
            }
            if (current.prev == null){ 
                node newNode = new node(null, id, judul, rating, current); 
                current.prev = newNode; 
                front = newNode;
            } else { // jika index > 0
                node newNode = new node(current.prev, id, judul, rating, current);
                // proses perubahan
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void removeFirst() throws Exception {
       if(isEmpty()) {
           throw new Exception("Linked List masih kosong, tidak dapat dihapus");
       } else if (size == 1){
           removeLast();
       } else {
           front = front.next; 
           front.prev = null; 
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
    
    public void remove(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("Nilai Index diluar batas");
        } else if (index == 0){
            removeFirst(); 
        } else {
            node current = front;
            int i = 0; 
            while (i< index){ 
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.prev = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null; 
                front = current;
            } else {
                current.prev.next = current.next; 
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int search(int cari){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
        } 
        node tmp = front;
        int posisi = -1;
        int index = 0;
        while (tmp != null){
            if(tmp.id == cari){
                posisi = index;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }
    
    public void tampilPosisi (int x, int pos){ // x = nilainya, pos = posisi
        if (pos != -1){  
            System.out.println("ID " + x + " Ditemukan pada indeks ke - " + (pos));
        } else {
            System.out.println("ID " + x + " Tidak Ditemukan");
        }
    }
    
    
    public void tampilData(int x, int pos){
        if (pos!= -1){ // jika datanya ditemukan
            System.out.println("ID\t: " + x);
            System.out.println("Judul\t: " + front.judul);
            System.out.println("Rating\t: " + front.rating);
        } else {
            System.out.println("ID " + x + " Tidak Ditemukan");
        }
    }
    
    public void sort(){
        node current = front, index = null;
        double temp;
        
       if (isEmpty()){
           System.out.println("Linked List Kosong");
       } else {
           while (current != null){
               index = current.next;
               while(index != null) {
                   if(current.rating < index.rating){
                       temp = current.rating;
                       current.rating = index.rating;
                       index.rating = temp;
                   }
                   index = index.next;
               }
               current = current.next;
           }
       }
    }
    
    public void print(){
        if (!isEmpty()) {
            node temp = front;
            System.out.println("| ID\t | Judul\t | Rating |");
            while (temp != null) {
                System.out.println("| " + temp.id + " \t | " + temp.judul + " \t | " + temp.rating + " \t  |");
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
