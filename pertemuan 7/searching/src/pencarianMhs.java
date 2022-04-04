
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class pencarianMhs {  
    int elemen;
    int idx;
    mahasiswa listMhs[];
    
    public pencarianMhs(int jml){
        elemen = jml;
        listMhs = new mahasiswa[elemen];
    }
    
    void tambah(mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m; //proses penambahan data
            idx ++;
        } else {
            System.out.println("Data Sudah Penuh !!");
        }
    }
    
    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil(); // ngambil tampil di dalam kelas mahasiswa
            System.out.println("-----------------------------------------------------");
        }
    }
    
    public int findSeqSearch( int cari ){
        int posisi = -1; // menandakan nilainya posisi
        for ( int j = 0; j < listMhs.length; j++){ 
            if ( listMhs[j].nim == cari) { // proses pencari kesamaaan antar nim nim yang ada dengan nim yang ingin dicari
                posisi = j; // j adalah nim yang dicari
                break; 
            }
        }
        return posisi;
    }
    
    
    public int findBinarySearch(int cari, int left, int right){ // left = i,right = j
        int mid;
        if(right >= left){ 
            mid = (left + right) / 2; // proses pencarian proses nilai tengah
            if (cari == listMhs[mid].nim){ // jika nilai mid = nilai cari
                return mid;
            } else if (listMhs[mid].nim < cari) { // jika lebih dari nilai cari
                return findBinarySearch(cari, left, mid - 1); // left tetep karena wilayah kiri
            } else { // jika kurang dari nilai cari
                return findBinarySearch(cari, mid + 1, right); // nilai tengah ditambah 1 dan nilai j nya tetep
            }
        }
        return -1; 
    }
    
    // untuk menampilkan posisi
    public void tampilPosisi (int x, int pos){ // x = nilainya, pos = posisi
        if (pos != -1){  
            System.out.println("Data " + x + " Ditemukan pada indeks ke - " + (pos));
        } else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }
    
    
    public void tampilData(int x, int pos){
        if (pos!= -1){ // jika datanya ditemukan
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }
}
