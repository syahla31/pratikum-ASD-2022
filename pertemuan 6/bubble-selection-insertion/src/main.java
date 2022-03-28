/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class main {
    public static void main(String[] args){
        daftarMahasiswaBerprestasi list = new daftarMahasiswaBerprestasi();
        mahasiswa m1 = new mahasiswa("Nussa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("Dompu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        //Bubble sort :
        /*System.out.println("Data Mahasiswa setelah sorting desc berdasarkan IPK");
        list.bubbleSort();
        list.tampil();*/
        
        //Selection Sort :
        /*System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK");
        list.selectionSort();
        list.tampil();*/
        
        //insertion Sort :
        System.out.println("Data Mahasiswa setelah sorting ASC berdasarkan IPK");
        list.insertionSort(true);
        
        //System.out.println("Data Mahasiswa setelah sorting DSC berdasarkan IPK");
        //list.insertionSort(false);
        list.tampil();
    }
    
}
