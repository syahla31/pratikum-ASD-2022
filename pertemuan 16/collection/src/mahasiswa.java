
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", no telp=" + notelp + '}';
    }
    
    public static class Listmahasiswa{
        List<mahasiswa> mahasiswas = new ArrayList<>();

        public void tambah(mahasiswa... mahasiswa){
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }

        public void hapus(int index){
            mahasiswas.remove(index);
        }

        public void update(int index, mahasiswa mhs){
            mahasiswas.set(index, mhs);
        }

        public void tampil(){
            mahasiswas.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
            });
        }

        int linearSearch(String nim){
            for(int i=0; i<mahasiswas.size(); i++){
                if(nim.equals(mahasiswas.get(i).nim)){
                    return i;
                }
            }
            return -1;
        }

        int binarySearch(String nim){
            return Collections.binarySearch(mahasiswas, new mahasiswa(nim, null, null), new Comparator<mahasiswa>() {
                @Override
                public int compare(mahasiswa o1, mahasiswa o2){
                    return o1.nim.compareTo(o2.nim);
                }
            });  
        }
        
        void sortAsc(){
            Collections.sort(mahasiswas, new Comparator<mahasiswa>() {
                @Override
                public int compare(mahasiswa o1, mahasiswa o2){
                    return o1.nim.compareTo(o2.nim);
                }
            });
        }

        void sortDesc(){
            sortAsc();
            Collections.reverse(mahasiswas);
        }
    }
    
    public static void main(String[] args) {
        Listmahasiswa lm = new Listmahasiswa();
        mahasiswa m = new mahasiswa("201234", "Noureen", "021xx1");
        mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
        mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2); // menambah objek mahasiswa
        lm.tampil(); // tampilkan list mahasiswa
        lm.update(lm.binarySearch("201235"), new mahasiswa("201235", "Akhleema lela", "021xx2")); // update mahasiswa
        System.out.println("");
        lm.tampil();
    }
    
}
