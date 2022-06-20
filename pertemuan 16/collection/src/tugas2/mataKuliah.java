/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.List;

/**
 *
 * @author acer E5
 */
public class mataKuliah {
    String kode, matkul;
    int sks;
    
    public mataKuliah(){
        
    }
    public mataKuliah(String kode, String matkul, int sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
    
    public String toString(){
        return kode + "\t" + matkul + "\t" + sks;
    }
}
