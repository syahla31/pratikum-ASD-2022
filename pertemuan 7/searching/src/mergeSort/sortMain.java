/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeSort;

/**
 *
 * @author acer E5
 */

public class sortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan Merge Sort");
        System.out.println();
        mergeSorting mSort = new mergeSorting();
        System.out.println("Data Awal : ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println();
        System.out.println("Setelah Diurutkan : ");
        mSort.printArray(data);
    }
    
}
