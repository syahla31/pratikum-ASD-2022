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
public class bola {
    public int jari;
    
    public bola(int r){
        jari = r;
    }
    
    public double volume(){
        return (4/3)*3.14*jari*jari*jari;
    }
    
    public double luasPermukaan(){
        return 4*3.14*jari*jari;
    }
}
