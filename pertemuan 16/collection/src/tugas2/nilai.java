/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class nilai {
    String kodeNil;
    double nilai;
    mahasiswa mhs;
    mataKuliah mk;
    
    public nilai(String kodeNil, double nilai, mahasiswa mhs, mataKuliah mk){
        this.kodeNil = kodeNil;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    
    List<mahasiswa> mhsS = new ArrayList<>();
    List<mataKuliah> matkulS = new ArrayList<>();
    
    public void tambahMhs(mahasiswa... mahasiswa){
        mhsS.addAll(Arrays.asList(mahasiswa));
    }
    
    public void tambahMatkul(mataKuliah... matkul){
        matkulS.addAll(Arrays.asList(matkul));
    }
    
    public void tampilMhs(){
        mhsS.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }
    
    public void tampilMatkul(){
        matkulS.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }
    
    int linearSearchMhs(String nim){
            for(int i = 0; i < mhsS.size(); i++){ 
                if(nim.equals(mhsS.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }
    
    int linearSearchMatkul(String matkul){
            for(int i = 0; i < matkulS.size(); i++){ 
                if(matkul.equals(matkulS.get(i).kode)){
                    return i;
                }
            }
            return -1;
    }
    
    mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhsS.size(); i++){
            if(nim.equals(mhsS.get(i).nim)){
                return mhsS.get(i);
            }
        }
        return null;
    }
    
    mataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkulS.size(); i++){
            if(matkul.equals(matkulS.get(i).kode)){
                return matkulS.get(i);
            }
        }
        return null;
    }
    
    public String toString(int idx1, int idx2){
        return mhsS.get(idx1).nim + "\t" + mhsS.get(idx1).nama + "\t" + matkulS.get(idx2).matkul + "\t" + matkulS.get(idx2).sks + "\t";
    }
    
    static Comparator<nilai> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        List<nilai> nil = new ArrayList<>();
        nilai n = new nilai("", 0, null, null);
        
        mahasiswa m1 = new mahasiswa("20001", "Natasha", "021xxx");
        mahasiswa m2 = new mahasiswa("20002", "Amanda", "021xxx");
        mahasiswa m3 = new mahasiswa("20003", "Iqball", "021xxx");
        mahasiswa m4 = new mahasiswa("20004", "Anggara", "021xxx");
        mahasiswa m5 = new mahasiswa("20005", "Guanna", "021xxx");
        mahasiswa m6 = new mahasiswa("20006", "Antares", "021xxx");
        
        n.tambahMhs(m1, m2, m3, m4, m5, m6);
        
        mataKuliah mk1 = new mataKuliah("00001", "Internet of Things\t\t", 3);
        mataKuliah mk2 = new mataKuliah("00002", "Algoritma dan Struktur Data\t", 2);
        mataKuliah mk3 = new mataKuliah("00003", "Algoritma dan Pemrograman\t", 2);
        mataKuliah mk4 = new mataKuliah("00004", "Pratikum Algoritma dan Struktur Data", 3);
        mataKuliah mk5 = new mataKuliah("00005", "Pratikum Algoritma dan Pemrograman", 3);
        
        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
        
        nilai n1 = null;
        String nimMhs, mkMhs;
        
        int pil = 0;
        do{
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|           SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER           |");
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("| 1. Input Nilai");
            System.out.println("| 2. Tampil Nilai");
            System.out.println("| 3. Mencari Nilai Mahasiwa");
            System.out.println("| 4. Urut Data Nilai");
            System.out.println("| 5. Keluar"); 
            System.out.println("+---------------------------------------------------------------------+");
            System.out.print("Pilih : ");
            pil = sc.nextInt();
            System.out.println("");
            
            switch(pil){
                case 1:
                    System.out.print("Kode\t : ");
                    String kd = scS.nextLine();
                    System.out.print("Nilai\t : ");
                    double nilMhs = sc.nextDouble();
                    System.out.println("");
                    
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                          DAFTAR MAHASISWA                           |");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("NIM\tNama\tTelf");
                    n.tampilMhs();
                    System.out.print("Pilih Mahasiswa by NIM :");
                    nimMhs = scS.nextLine();
                    mahasiswa mahaSiswa;
                    mahaSiswa = n.cariMhs(nimMhs);
                    
                    System.out.println("");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                         DAFTAR MATA KULIAH                          |");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilMatkul();
                    System.out.print("Pilih MK by kode : ");
                    mkMhs = scS.nextLine();
                    mataKuliah matKulS;
                    matKulS = n.cariMatkul(mkMhs);
                    
                    n1 = new nilai(kd, nilMhs, mahaSiswa, matKulS);
                    nil.add(n1);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                       DAFTAR NILAI MAHASISWA                        |");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    for (int i = 0; i < nil.size(); i++){
                        n.linearSearchMhs(nil.get(i).mhs.nim);
                        n.linearSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).mhs.nim), n.linearSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                case 3: 
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                       DAFTAR NILAI MAHASISWA                        |");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    int sks = 0;
                    for (int i = 0; i < nil.size(); i++){
                        n.linearSearchMhs(nil.get(i).mhs.nim);
                        n.linearSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).mhs.nim), n.linearSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                    String input = scS.nextLine();
                    System.out.println("");
                    for (int i = 0; i < nil.size(); i++){
                        if(input.equalsIgnoreCase(nil.get(i).mhs.nim)){
                            sks += n.matkulS.get(i).sks;
                            n.linearSearchMhs(nil.get(i).mhs.nim);
                            n.linearSearchMatkul(nil.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nil.get(i).mhs.nim), n.linearSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                        }
                    }
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                          DAFTAR MAHASISWA                           |");
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    nil.sort(CompNilai);
                    for (int i = 0; i < nil.size(); i++){
                        n.linearSearchMhs(nil.get(i).mhs.nim);
                        n.linearSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).mhs.nim), n.linearSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                case 5: 
                    System.out.println("+---------------------------------------------------------------------+");
                    System.out.println("|                           T H A N K - Y O U                         |");
                    System.out.println("+---------------------------------------------------------------------+");
                    break;    
            }
        } while (pil < 5 && pil > 0);
    }
}
