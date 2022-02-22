
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
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENGITUNG NILAI AKHIR");
        System.out.println("=============================");
        System.out.print("masukkan nilai TUGAS: ");
        int tugas = sc.nextInt();
        System.out.print("masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("masukkan nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("=============================");
        System.out.println("=============================");
        float nilaiAkhir;
        String nilaiHuruf;
        nilaiAkhir = (float) ((0.2*tugas) + (0.35* uts) + (0.45 * uas));
        System.out.println("Nilai Akhir: " +nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf ="A";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }else{
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }
        System.out.println("=============================");
        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C" ){
           System.out.println("SELAMAT LULUS");
        } else{
            System.out.println("MOHON MAAF TIDAK LULUS");
        }
    }
}
