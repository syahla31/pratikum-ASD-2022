
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class loopCollection {
    public static void main(String[] args) {
        
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        fruits.set(4, "Strawberry"); // no 5
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|                     Sebelum Diurutkan                     |");
        System.out.println("+-----------------------------------------------------------+");
        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|                     Setelah Diurutkan                     |");
        System.out.println("+-----------------------------------------------------------+");
        Collections.sort(fruits);
        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        /*
        System.out.println("\n" + fruits.toString());
        
        while (!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        
        // Tugas 2 hapus line 36 & 37
        //fruits.push("Melon");
        //fruits.push("Durian");
        // System.out.println("");
        // soal 3
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
           String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        //System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for(int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
        */
    }
}
