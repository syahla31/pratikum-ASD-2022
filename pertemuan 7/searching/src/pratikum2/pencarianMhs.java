/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum2;

/**
 *
 * @author acer E5
 */
public class pencarianMhs {
    mahasiswa listMhs[] = new mahasiswa[5];
    int idx;
    
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
    
    public int findSeqSearch(String nama){
        int posisi = -1;
        for ( int j = 0; j < listMhs.length; j++){ 
            if ( listMhs[j].nama.equalsIgnoreCase(nama)) { 
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    
    // untuk menampilkan posisi
    public void tampilPosisi (String x, int pos){ // x = nilainya, pos = posisi
            if (pos != -1){  
                System.out.println("Data " + x + " Ditemukan pada indeks ke - " + (pos));
            } else {
                System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }
    
    
    public void tampilData(String x, int pos){
        if (pos!= -1){ // jika datanya ditemukan
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "Tidak Ditemukan");
        }
    }
}
