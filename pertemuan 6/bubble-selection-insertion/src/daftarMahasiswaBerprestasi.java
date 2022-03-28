/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class daftarMahasiswaBerprestasi {
    mahasiswa listMhs[] = new mahasiswa[5];
    int idx;
    
    // method tambah()
    void tambah(mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh !!!");
        }
    }
    // method tampil()
    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
    // method bubbleSort()
    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){ // jika elemen ke 5 lebih besar daripada elemen ke 4
                    // proses swap atau penukaran
                    mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    // method selectionSort()
    void selectionSort(){ // 
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i; // nilai i masuk ke int idxMin
            for(int j=i+1; j < listMhs.length; j++){  // mulai dari data setelah i
                if(listMhs[j].ipk < listMhs[idxMin].ipk){ // perbandingan
                    idxMin = j; // datanya bertukar
                } 
            }
            // proses Swap
            mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    // method insertionSort()
    void insertionSort(boolean asc){
        for(int i=1; i < listMhs.length; i++){ // data pada elemen 1 sudah terurut
            mahasiswa temp = listMhs[i]; // hanya sementara jadi tidak di instasiasi
            int j = i;
            
            if (asc){
                while(j > 0 && listMhs[j-1].ipk > temp.ipk){ // proses swap
                    listMhs[j] = listMhs[j-1]; // pertukaran
                    j--;
                }
            } else {
                while(j > 0 && listMhs[j-1].ipk < temp.ipk){ // proses swap
                    listMhs[j] = listMhs[j-1]; // pertukaran
                    j--;
                }
            }
            listMhs[j] = temp; 
        }
    }
}
