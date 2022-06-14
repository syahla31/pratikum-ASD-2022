/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

import java.util.Scanner;

/**
 *
 * @author acer E5
 */
public class graphArray {
    
    private final int vertices;
    private final int[][] twoD_array;

    public graphArray(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1]; // karena array dimulai dari index ke 0
    }

    public void makeEdge(int to, int from, int edge){
        try{
            twoD_array[to][from] = edge;
        }catch (ArrayIndexOutOfBoundsException index){ // jika lebih dari index
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from){ // cek garis penghubung
        try{
            return twoD_array[to][from];
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

   public static void main(String[] args) {
        int v , e ,count  = 1, to = 1, from = 1;

        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try{
            System.out.println("Masukkan jumlah vertices : ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edges : ");
            e = sc.nextInt();

            graph = new graphArray(v);

            System.out.println("Masukkan edges : <to> < from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }

            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.println(" ");
            for (int i = 0; i <= v ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 0; j <= v ; j++) {
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println(" ");
            }
        }catch (Exception E){
            System.out.println("Errooor. Silahkan cek kembali \n" + E.getMessage());
        }
        sc.close();
    }
}