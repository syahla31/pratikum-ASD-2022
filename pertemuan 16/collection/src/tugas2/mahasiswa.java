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
public class mahasiswa {
    String nim, nama, notelp;
    
    public mahasiswa(){
        
    }
    
    public mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    
    @Override
    public String toString(){
        return nim + "\t" + nama + "\t" + notelp;
    }
}
