/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukDewi;

/**
 *
 * @author acer E5
 */
public class stack {
    int size, top;
    struk data[];
    
    public stack(int size){
        this.size = size;
        data = new struk[size];
        top = -1;
    }
    
    public boolean isEmpty() { 
        if (top == -1){ 
            return true; 
        } else { 
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == size -1){ 
            return true;
        } else {
            return false;
        }
    }
    
    public void push(struk st){
        if(!isFull()){ 
            top++;
            data[top] = st;
        } else {
            System.out.println("isi stack penuh!");
        }
    }
    
    public void pop() { 
        if(!isEmpty()){
            struk x = data[top]; 
            top--; 
            System.out.println("Nomor Transaksi   : " + x.nomorTransaksi);
            System.out.println("Tanggal Pembelian : " + x.tgl);
            System.out.println("Jumlah Barang     : " + x.jmlBrg);
            System.out.println("Total Harga Bayar : " + x.total);
            System.out.println("=======================================================");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    
    public void peek(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~ D A T A - S T R U K - TERATAS ~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nomor Transaksi   : " + data[top].nomorTransaksi);
        System.out.println("Tanggal Pembelian : " + data[top].tgl);
        System.out.println("Jumlah Barang     : " + data[top].jmlBrg);
        System.out.println("Total Harga Bayar : " + data[top].total);
    }
    
    public void print() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~        ISI DATA STACK         ~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for ( int i = top; i >= 0; i --){
            System.out.println("Nomor Transaksi   : " + data[i].nomorTransaksi);
            System.out.println("Tanggal Pembelian : " + data[i].tgl);
            System.out.println("Jumlah Barang     : " + data[i].jmlBrg);
            System.out.println("Total Harga Bayar : " + data[i].total);
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
