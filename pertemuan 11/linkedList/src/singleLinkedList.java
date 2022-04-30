/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class singleLinkedList {
    
    node head; // posisi awal linked list
    node tail; // posisi akhir linked list
    
    public boolean isEmpty() {
        return head == null; // membandingkan head dgn null
    }
    
    public void print(){
        if(!isEmpty()){
            node tmp = head; // membuat tiruan
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next; // tmp bergerak ke tmp sebelahnya
            }
            System.out.println("");
        } else {
            System.out.println("Lingked list kosong");
        }
    }
    
    public void addFirst(int input) {
        node ndInput = new node(input,null);
        if (isEmpty()){ // jika linked list kosong
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else { // jika tidak maka ditambahkan di posisi depan
            ndInput.next = head; // head lama
            head = ndInput; // ndInput = head baru
        }
    }
    
    public void addLast(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput; // ndInput di posisi setelah tail
            tail = ndInput; // tail baru = ndInput
        }
    }
    
    public void insertAfter(int key, int input){
        node ndInput = new node(input, null);
        node temp = head; // tiruan head
        do{
            if(temp.data == key){ // data = key
                ndInput.next = temp.next; // pointer nodeBaru = alamat memori setelah key
                temp.next = ndInput; // pointer tmp simpan alamat memori ndinput
                if(ndInput.next==null) tail = ndInput; // jika kosong maka tail bertindak sebagai tail
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertBefore(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
         
        do{  
            if(head.data == key){ 
                addFirst(input); 
                break; 
            } 
            else if(temp.data == key){ 
                ndInput.next = temp; 
                prev.next = ndInput; 
                if(temp.next==null){ 
                    tail = ndInput; 
                break; 
                } 
            } 
            prev = temp; 
            temp = temp.next; 
        } while (temp != null); 
    }
    
    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("Indeks Salah");
        } else if (index == 0){ // jika index = 0, maka memanggil method addFirst
            addFirst(input);
        } else { 
            node temp = head; // duplikat head
            for (int i = 0; i < index-1; i++){ 
                temp = temp.next; 
            }
            temp.next = new node(input, temp.next); // setelah temp adalah data baru
            if(temp.next.next==null) tail = temp.next; // setelah dari setelahnya temp ini adalah null, maka tail adalah node baru
        }
    }
    
    public int getData(int index){
        node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indexOf(int key){
        node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        
        if(tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }  
    }
    
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        } else {
            node temp = head;
            for (int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}
