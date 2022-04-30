/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author acer E5
 */
public class node {
    mahasiswa data;
    node next;
    
    public node(mahasiswa data, node next) {
        this.data = data;
        this.next = next;
    }
}
