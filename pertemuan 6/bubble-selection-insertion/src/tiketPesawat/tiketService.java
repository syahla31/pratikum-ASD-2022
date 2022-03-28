/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketPesawat;

/**
 *
 * @author acer E5
 */
public class tiketService {
    tiket listTS[] = new tiket[5];
    int ts;
    
    // method tambah ()
    void tambah(tiket t){
        if(ts<listTS.length){
            listTS[ts] = t;
            ts++;
        } else {
            System.out.println("Data Sudah Penuh !!!");
        }
    }
    
    // void tampil()
    void tampilAll(){
        for(tiket t :listTS){
            t.tampil();
            System.out.println("-------------------------");
        }
    }
    
    // void BubbleSort()
    void bubbleSort(boolean asc){
        for(int i = 0; i < listTS.length-1; i++){
            for(int j = 1; j < listTS.length-i; j++){
                
                if(asc) {
                    if(listTS[j].harga < listTS[j-1].harga){
                        // proses swap
                        tiket tmp = listTS[j];
                        listTS[j] = listTS[j-1];
                        listTS[j-1] = tmp;
                    } 
                } else {
                    if(listTS[j].harga > listTS[j-1].harga){
                        // proses swap
                        tiket tmp = listTS[j];
                        listTS[j] = listTS[j-1];
                        listTS[j-1] = tmp;
                    }
                }
            }
        }
    }
    
    // void selectionSort()
    void selectionSort(boolean asc){
        for(int i = 0; i < listTS.length-1; i++){
            int tsMin = i;
            
            if (asc) {
                for(int j=i+1; j < listTS.length; j++){
                    if(listTS[j].harga < listTS[tsMin].harga){
                        tsMin = j;
                    }
                } 
            } else {
                for(int j=i+1; j < listTS.length; j++){
                    if(listTS[j].harga > listTS[tsMin].harga){
                        tsMin = j;
                    }
                } 
            }
            
            // proses swap
            tiket tmp = listTS[tsMin];
            listTS[tsMin] = listTS[i];
            listTS[i] = tmp;
        }
    }
    
    void insertionSort(boolean asc){
        for(int i=1; i < listTS.length; i++){ // data pada elemen 1 sudah terurut
            tiket temp = listTS[i]; // hanya sementara jadi tidak di instasiasi
            int j = i;
            
            if (asc){
                while(j > 0 && listTS[j-1].harga > temp.harga){ // proses swap
                    listTS[j] = listTS[j-1]; // pertukaran
                    j--;
                }
            } else {
                while(j > 0 && listTS[j-1].harga < temp.harga){ // proses swap
                    listTS[j] = listTS[j-1]; // pertukaran
                    j--;
                }
            }
            listTS[j] = temp; 
        }
    }
}
