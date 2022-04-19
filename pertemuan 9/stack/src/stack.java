/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class stack {
    int size;
    int top;
    pakaian data[];
    
    public stack(int size) {
        this.size = size;
        data = new pakaian[size];
        top = -1; // kondisi kosong
    }
    
    public boolean isEmpty() { // pengecekan kosong / tidak
        if (top == -1){ //kalau kosong
            return true; 
        } else { 
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == size -1){ // pengecekan apakah penuh
            return true;
        } else {
            return false;
        }
    }
    
    public void push(pakaian pkn){ // memasukkan data
        if(!isFull()){ 
            top++;
            data[top] = pkn;
        } else {
            System.out.println("isi stack penuh!");
        }
    }
    
    public void pop() { // mengambil data
        if(!isEmpty()){
            pakaian x = data[top]; // x = data yang paling atas
            top--; 
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    
    public void peek(){ // mencari data yang paling atas
        System.out.println("Elemen Teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    
    public void print() { // mrncetak semua data
        System.out.println("Isi Stack: ");
        for ( int i = top; i >= 0; i --){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }
    
    public void clear() { // menghapus semua data
        if (!isEmpty()) {
            // proses mengosongkan
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    
    public void getMin(){  
        if (!isEmpty()){
            int min = 0;
            for (int i = 0; i <= top; i++){
                if(data[min].harga > data[i].harga){
                    min = i;
                }
            }
            System.out.println("Harga Pakaian Termurah: " + data[min].jenis + " " + data[min].warna + " " + data[min].merk + " " + data[min].ukuran + " " + data[min].harga);
        } else {
            System.out.println("Stack Kosong!!");
        }
    }
}
