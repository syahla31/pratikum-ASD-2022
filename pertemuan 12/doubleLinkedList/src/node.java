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
    node prev, next; // tipe data primitive yang berguna untuk pointer
    
    node(node prev, int data, node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
