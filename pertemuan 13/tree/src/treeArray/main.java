/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeArray;

/**
 *
 * @author acer E5
 */
public class main {
    public static void main(String[] args){
        binaryTreeArray bta = new binaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        
        System.out.println("\n+------------------------------------+");
        System.out.println("|------------- TREE ARRAY -----------|");
        System.out.println("+------------------------------------+");
        bta.add(10);
        bta.add(15);
        bta.traverseInOrder(0);
        System.out.println();
        bta.traversePreOrder(0);
        System.out.println();
    }
}
