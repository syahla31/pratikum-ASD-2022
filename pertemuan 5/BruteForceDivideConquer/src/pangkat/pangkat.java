/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkat;

/**
 *
 * @author acer E5
 */
public class pangkat {
    public int nilai, pangkat;
    
    public pangkat(int n, int p){ // Konstruktor
        nilai = n;
        pangkat = p;
    }
    
    public int pangkatBP(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }
    
    public int pangkatDC(int a, int n){
        if(n==0) {
            return 1;
        } else {
            if(n%2==1)//bilangan ganjil
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else//bilangan genap
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
}
