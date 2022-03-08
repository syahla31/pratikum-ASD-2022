/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author acer E5
 */
public class kerucut {
    public int jari, garisPelukis, tinggi;
    
    public kerucut(int rK, int sK, int tK){
        jari = rK;
        garisPelukis = sK;
        tinggi = tK;
    }
    
    public double volume(){
        return 1/ (double)3 *3.14*(jari*jari)*tinggi;
    }
    
    public double luasPermukaan(){
        return 3.14 * jari * (jari + garisPelukis);
    }
}
