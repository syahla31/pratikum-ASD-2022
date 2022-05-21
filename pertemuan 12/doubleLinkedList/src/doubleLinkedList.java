/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class doubleLinkedList {
    node head;
    int size; // menghitung jumlah linked list
    
    public doubleLinkedList(){ // kondisi awal
        head = null; 
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null; // kosong jika posisi awal = kosong
    }
    
    public void addFirst(int item){
        if(isEmpty()){ // jika kosong maka masuk ke index pertama
            head = new node(null, item, null); 
        } else { // jika sudah ada isi maka masuk ke paling depan
            node newNode = new node (null, item, head);
            head.prev = newNode; // prev head = node yang baru
            head = newNode; 
        }
        size++; 
    }
    
    public void addLast(int item){
        if(isEmpty()) { // jika kosong maka masuk ke method addFirst
            addFirst(item);
        } else { 
            node current = head; // current = duplikat node
            while (current.next != null){ // jika posisinya setelahnya tidak kosong
                current = current.next; // maka masuk ke posisi setelahnya
            }
            node newNode = new node(current, item, null);
            current.next = newNode; 
        }
        size++; // bertambah size
    }
    
    public void add(int item, int index) throws Exception{
        if(isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai Index diluar batas");
        } else {
            node current = head; // duplkat head
            int i = 0;
            while (i < index){ // proses penambahan tapi mencari posisi index yang diinginkan
                current = current.next;
                i++;
            }
            if (current.prev == null){ // jika memasukkan index = 0
                node newNode = new node(null, item, current); // maka masuk ke index ke - 0
                current.prev = newNode; // alamat node prev setelahnya adalah nilai yang dimasukkan
                head = newNode;
            } else { // jika index > 0
                node newNode = new node(current.prev, item, current);
                // proses perubahan
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size() { //untuk menyimpan nilai size
        return size;
    }
    
    public void clear(){ // untuk mengkosongkan linked list
        head = null;
        size = 0;
    }
    
    public void print(){ // cetak semua data
        if(!isEmpty()) {
            node tmp = head; // tmp = duplikat head
            while (tmp != null) { // proses cetak
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
       if(isEmpty()) {
           throw new Exception("Linked List masih kosong, tidak dapat dihapus");
       } else if (size == 1){ // jika size = 1
           removeLast(); // maka masuk ke method removeLast
       } else {
           head = head.next; // proses pindah head ke node setelahnya / head baru
           head.prev = null; // prev dari head baru = null
           size--; // pengurangan size
           return;
       }
       node current = head;
       while (current.next.next != null){
           current = current.next;
       }
       current.next = null;
       size--;
    }
    
    public void removeLast() throws Exception {
       if(isEmpty()) {
           throw new Exception("Linked List masih kosong, tidak dapat dihapus");
       } else if (head.next == null ) { // jika nilai setelahnya node = null
           head = null; // maka head = null
           size--;
           return;
       }
       node current = head; // proses duplikat node
       while (current.next.next != null){
           current = current.next;
       }
       current.next = null;
       size--;
    }
    
    public void remove(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("Nilai Index diluar batas");
        } else if (index == 0){ // jika hapus index ke = 0
            removeFirst(); // maka masuk ke method removeFirst
        } else {
            node current = head;
            int i = 0; // sebagai pointer
            while (i< index){ // proses pencarian dgn index
                current = current.next;
                i++;
            }
            if(current.next == null){ // jika di posisi index akhir
                current.prev.prev = null;
            } else if (current.prev == null){ // jika di posisi index awal
                current = current.next;
                current.prev = null; // hapus posisi head lama
                head = current;
            } else { // jika di posisi tengah tengah index
                // proses hapus dan tukar nilai current sesuai aturan
                current.prev.next = current.next; 
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst() throws Exception { // mengambil data paling awal
        if(isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }
    
    public int getLast() throws Exception { // mengambil data paling akhir
        if(isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        node tmp = head; // tmp = duplikat head
        while (tmp.next != null) { // proses cari
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index) throws Exception { // mengambil data sesuai index yang diinginkan 
        if(isEmpty() || index >= size) {
            throw new Exception("Linked list kosong");
        }
        node tmp = head;
        for (int i = 0; i < index; i++){ // proses cari
            tmp = tmp.next; 
        }
        return tmp.data;
    }
}
