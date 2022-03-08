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
public class tabung {
    public int jari, tinggi;
    
    public tabung(int rT, int tT){
        jari = rT;
        tinggi = tT;
    }
    
    public double volume(){
        return 3.14*jari*jari*tinggi;
    }
    
    public double luasPermukaan(){
        double selimut = 2*3.14*jari*tinggi;
        double alas = 2*3.14*jari*jari;
        return selimut*alas;
    }
}
