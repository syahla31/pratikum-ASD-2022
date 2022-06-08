/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class binaryTree {
    node root; 
    
    public binaryTree(){ // kondisi awal
        root = null;
    }
    
    boolean isEmpty(){ // cek kosong atau tidak
        return root == null;
    }
    
    void add(int data){ // proses tambah data
        if(isEmpty()){ // tree is empty
            root = new node(data); // root akan diisi data
        } else { 
            node current = root;  // duplikasi root
            while(true){
                if(data < current.data){ // kondisi jika di anak kiri
                    if(current.left != null){ // jika kiri masih kosong
                        current = current.left; // current masuk ke kiri
                    } else { // jika dikiri ada data
                        current.left = new node(data); // pindahkan data kiri dengan data baru
                        break; 
                    }
                } else if(data>current.data){ // kondisi jika data lebih besar daripada current
                    if(current.right != null){ // jika kanan masih kosong
                        current = current.right; // masuk ke kanan
                    } else { // jika ada ada data
                        current.right = new node(data); // pindahkan data kanan dengan data baru
                        break;
                    } 
                } else { // data is already exist
                    break;
                }
            }
        }
    }
    
    boolean find(int data){
        boolean hasil = false; // asumsi jika belum ketemu
        node current = root; // duplikasi root
        while (current != null){ 
            if(current.data == data){ // jika data = current
                hasil = true; 
                break;
            } else if(data < current.data){ // data < current
                current = current.left; // current pindah ke kiri
            } else {
                current = current.right; // current pindah ke kanan
            }
        }
        return hasil; 
    }
    
    void traversePreOrder(node node) {
        if (node != null){ 
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(node node) {
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(node node) {
        if (node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    node getSuccessor(node del){ // del = anak/ child
        node successor = del.right; 
        node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){ 
            // posisi paling mentok
            successorParent.left = successor.right; 
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){ 
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        node parent = root;
        node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){ // jika ditemukan pada current
                break;
            } else if(data < current.data){ // jika data < dari current
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data){ // jika data > dari current
                parent = current;
                current = current.right;
                isLeftChild = false; // karena dikanan maka tidak lefchild
            }
        }
        // deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if(current.left == null && current.right == null){ // jika data di node daun / leaf
                if(current == root){
                    root = null;
                } else {
                    if(isLeftChild){ // jika data ada dikiri
                        parent.left = null; 
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null){ // jika punya 1 anak / child dan di posisi kanan
                if(current == root){
                    root = current.right;
                } else { 
                    if(isLeftChild){ 
                        parent.left = current.right; // anak kanan = anak kiri baru
                    } else {
                        parent.right = current.right; // anak kanan = anak kanan baru
                    }
                }
            } else if(current.right == null){ // jika punya 1 anak / child dan di posisi kiri
                if(current == root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left; // anak kiri = anak kiri baru
                    } else {
                        parent.right = current.left; // anak kanan = anak kiri baru
                    }
                }
            } else { // jika terdapat 2 child / anak
                node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){ // jika berada si posisi kiri
                        parent.left = successor; // masuk ke possi anak kiri
                    } else {
                        parent.right = successor; // masuk ke possi anak kanan
                    }
                    successor.left = current.left; // proses pemindahan posisi
                }
            }
        }
    }
    
    void insertRec(int key){
        root = insertRec(root, key);
    }
    
    //Fungsi Rekursif untuk memasukkan Node
    node insertRec(node root, int key){
        if(root == null){
            root = new node(key);
            return root;
        }
        
        //Untuk menaruh leaf apakah di kiri atau kanan
        if(key < root.data){
            root.left = insertRec(root.left, key);
        }else if(key > root.data){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    
    //Data paling kecil
    void min(){
        node current = root;
        
        while (current.left != null){
            current = current.left;
        }
        System.out.print("" + current.data);
    }
    
    //Data paling besar
    void max(){
        node current = root;
        
        while(current.right != null){
            current = current.right;
        }
        System.out.println("" + current.data);
    }
    
    //Menampilkan data yang ada di leaf
    void displayleaf(node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(" " + root.data);
            return;
        }if(root.left != null){
            displayleaf(root.left);
        }if(root.right != null){
            displayleaf(root.right);
        }
    }
    
    //Menampilkan Jumlah leaf
    int totalleaf(){
        return totalleaf(root);
    }
    
    int totalleaf(node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return totalleaf(node.left) + totalleaf(node.right);
        }
    }
}
