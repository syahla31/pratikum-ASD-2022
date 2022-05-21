/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author acer E5
 */
public class node {
    
    int id;
    String judul;
    double rating;
    node prev, next;
    
    node(node prev, int id, String judul, double rating, node next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
