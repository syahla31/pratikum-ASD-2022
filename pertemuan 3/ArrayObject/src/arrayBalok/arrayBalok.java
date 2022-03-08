/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayBalok;

/**
 *
 * @author acer E5
 */
public class arrayBalok {
    public static void main(String[] args) {
        balok[] blArray = new balok[3];
        
        blArray[0] = new balok(100, 30, 12);
        blArray[1] = new balok(120, 40, 15);
        blArray[2] = new balok(210, 50, 25);
        
        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
    
}
