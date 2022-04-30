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
public class sLinkedList {
    node head; // posisi awal linked list
    node tail; // posisi akhir linked list
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Lingked list kosong");
        }
    }
    
    public void addFirst(String input) {
        node ndInput = new node(input,null);
        if (isEmpty()){ // jika linked list kosong
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(String input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void insertAfter(String key, String input){
        node ndInput = new node(input, null);
        node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, String input){
        if(index < 0){
            System.out.println("Indeks Salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if(temp.next.next==null) tail = temp.next;
        }
    }
}
