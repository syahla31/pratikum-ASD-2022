/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class tugas2 {
    int x, y, width, height;
    
    tugas2(){
        
    }
    tugas2(int xS, int yS, int wS, int hS){
        x = xS;
        y = yS;
        width = wS;
        height = hS; 
    }
    
    void moveLeft(){
        if(x > 1)x--;
        printPosition();
    }
    
    void moveRight() {
        if(x > 1)x++;
        printPosition();
    }
    
    void moveDown(){
        if(y < height-1)y++;
        printPosition();
    }
    
    void moveUp(){
        if(y > 1)y--;
        printPosition();
    }
    
    
    void printPosition(){
        for(int i = 0; i <= height; i++){
            for(int j = 0; j <= width; j++){
                if (i == 0 || i == height || j == 0 || j == width){
                    System.out.print("|");
                }else if (i == y && j == x) {
                    System.out.print("O");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("Masukkan Perintah: ");
    }
}
