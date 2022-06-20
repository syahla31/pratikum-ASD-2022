
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
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
public class contohList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList(); // no 2
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.printf("Elemen 0: %d, total elemen: %d, elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d , total elemen: %d, elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        
        // List<String> names = new LinkedList<>(); // penamaan yang spesifik
        LinkedList<String> names = new LinkedList<>(); // no 3
        names.add("Noureen"); // tambah data
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al - Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid"); // update data
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
        
        names.push("Mei-mei"); // no 4
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
    }
}
