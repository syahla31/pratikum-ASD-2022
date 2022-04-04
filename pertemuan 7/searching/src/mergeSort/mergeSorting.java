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
public class mergeSorting {
    public void mergeSort(int[] data){
        sort(data, 0, data.length-1);
    }
    
    public void merge(int data[], int left, int middle, int right){
            
        int[] temp = new int[data.length]; // tampungan data sementara
        for(int i = left; i <= right; i++){ 
            temp[i] = data[i]; // dari left ke right semua di duplikatkan
        }
        int a = left; 
        int b = middle + 1;
        int c = left;
            
        //membandingkan  setiap bagian
        while ( a <= middle && b <= right){ // proses descending
            if (temp[a] <= temp[b]){ // jika left kurang dari sama dengan mid + 1
                data[c] = temp[a]; // data paling ujung kanan = duplikat kiri
                a++;
            } else {
                data[c] = temp[b]; // data kanan = duplikat tengah + 1
                b++;
            }
            c++; // merupakan nilai yg paling kecil
        }
        int s = middle - a; // data diantara sesudah tengah dan sebelum kiri
        for (int i = 0; i <= s ; i++){
            data[c + i] = temp[a+i]; // transfer data
        }
    }
    
    // membagi menjadi 2 bagian dan dibagi kembali hingga tidak dapat dibagi kembali
    private void sort(int data[], int left, int right) {
        if (left < right){
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }
    
    // mencetak data data yang ada
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
    

