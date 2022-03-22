/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata;

/**
 *
 * @author acer E5
 */
public class sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    double totalBF(double arr[]){
        for (int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }
        return total;
    }
    
    double totalDC(double arr[], int l, int r){
        if(l==r)
            return arr[l];
        else if(l<r){
            int mid = (l+r)/2; // untuk membagi array menjadi 2 bagian
            double lsum = totalDC(arr, l, mid-1);// nilai yang ada di indeks kiri mid selain 
            double rsum = totalDC(arr, mid+1, r); // nilai yang ada di indeks kanan mid
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
