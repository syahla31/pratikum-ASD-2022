/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class node {
    int data;
    node left;
    node right;
    
    public node(){
        
    }
    
    public node(int data){ // posisi awal
        this.left = null;
        this.data = data;
        this.right = null;
    }
    
}
