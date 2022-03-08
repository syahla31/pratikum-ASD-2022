/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author acer E5
 */
public class segitiga {
    public int alas;
    public int tinggi;
    
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
    
    public double hitungKeliling(){
        return alas + alas + alas;
    }
}
