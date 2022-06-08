/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class binaryTreeMain {
    public static void main(String[] args){
        binaryTree bt = new binaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.insertRec(200);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        
        System.out.print("Data Terkecil : ");
        bt.min();
        System.out.print("\nData Terbesar : ");
        bt.max();
        System.out.println("");
        
        System.out.print("Leaf data : ");
        bt.displayleaf(bt.root);
        System.out.println("");
        
        System.out.print("Jumlah Leaf : " + bt.totalleaf());
        System.out.println("");
    }
}