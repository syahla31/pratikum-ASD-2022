/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualTanah;

/**
 *
 * @author acer E5
 */
public class tanah {
    public int panjang, lebar;
    
    public int luasTanah(){
        return panjang*lebar;
    }
    
    public int tanahTerluas(int luas[]) {
        int terluas = 0;
        int s = 0;
        
        for(int i = 0; i < luas.length; i++){
            if(luas[i]>terluas){
                terluas = luas[i];
                s = i;
            }
        }
        return s;
    }
}
