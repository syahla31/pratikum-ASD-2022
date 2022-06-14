
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class graph {
    int vertex;
    linkedList list[];
    
    public graph(int vertex){
        this.vertex = vertex;
        list = new linkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new linkedList();
        }
    }
    
    public boolean graphType() throws Exception{
        int a = 0, b = 0;
        for(int s=0; s<vertex;s++){
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++){
                for (int j = 0; j < list[i].size(); j++){
                    if(list[i].get(j)==s)
                        ++totalIn;
                }
                //out degree
            for (k=0; k<list[s].size(); k++){
                list[s].get(k);
            }
            totalOut = k;
            }
            a = totalIn;
            b = totalOut;
        }
        if (a == b){
            return true;//indirect
        }else return false;
    }
    
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        //add back edge (for undirected)
        list[destination].addFirst(source);
    }
    
    public void degree(int source) throws Exception{
        if(graphType()){
            //degreee indirected graph
            System.out.println("degree vertex "+source + " :  "+list[source].size());
        }else{
           //degree directed graph
            //in degree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++){
                for (int j = 0; j < list[i].size(); j++){
                    if(list[i].get(j)==source)
                        ++totalIn;
                }
                //out degree
            for (k=0; k<list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
            } 
            System.out.println("Indegree dari vertex "+source+" : "+totalIn);
            System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
            System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
        }
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
    
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public void printGraph4() throws Exception{ // tugas 4
        String kota=" ";
        for(int i = 0; i<vertex; i++){
            if(list[i].size()>0){
                if (i==1){
                    kota = "Gresik";
                }else if(i==2){
                    kota = "Bandung";
                }else if(i==3){
                    kota ="Yogya";
                }else if(i==4){
                    kota ="Malang";
                }else if(i==5){
                    kota = "Jakarta";
                }
                System.out.print("Vertex "+ kota + " terhubung dengan: ");
            for(int j = 0; j<list[i].size(); j++){
                if (list[i].get(j)==1){
                    kota = "Gresik";
                }else if(list[i].get(j)==2){
                    kota = "Bandung";
                }else if(list[i].get(j)==3){
                    kota ="Yogya";
                }else if(list[i].get(j)==4){
                    kota ="Malang";
                }else if(list[i].get(j)==5){
                    kota = "Jakarta";
                }
                System.out.print(kota+" ");
            }
            System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public void print() throws Exception{
        String kota=" ";
        for(int i=0; i<vertex; i++){
            try{
                if(list[i].size() > 0){
                    if (i==1){
                        kota = "Gresik";
                    }else if(i==2){
                        kota = "Bandung";
                    }else if(i==3){
                        kota ="Yogya";
                    }else if(i==4){
                        kota ="Malang";
                    }else if(i==5){
                        kota = "Jakarta";
                    }
                }
            }
            finally{
                System.out.println("Baris di dalam finally akan dieksekusi");
            }
        }
    }
    
    public static void main(String[] args)throws Exception {
        /*
        graph g = new graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 0);
        g.printGraph();
        g.degree(2);
        
        g.removeEdge(1, 2);
        g.printGraph();
        
        
        // tugas 1
        Scanner sc = new Scanner(System.in);
        graph g = new graph(6);
        System.out.print("Masukkan Vertex : ");
        int verte = sc.nextInt();
        
        System.out.print("Masukkan Edge   : ");
        int Tedge = sc.nextInt();
        System.out.println("---------------------------");
        for (int i = 0; i < Tedge; i++) {
            System.out.print("Masukkan Source      : ");
            int source = sc.nextInt();
            System.out.print("Masukkan Destiantion : ");
            int des = sc.nextInt();
            
            g.addEdge(source,des);
            g.printGraph();
        }
        g.degree(verte);
        g.printGraph();
    }
    */
      
    // tugas 4
        Scanner sc = new Scanner(System.in);
        graph g = new graph(6);
        System.out.print("Masukkan Vertex : ");
        int verte = sc.nextInt();
        
        System.out.print("Masukkan Edge   : ");
        int Tedge = sc.nextInt();
        System.out.println("---------------------------");
        System.out.println("1 = Gresik");
        System.out.println("2 = Bandung");
        System.out.println("3 = Yogya");
        System.out.println("4 = Malang");
        System.out.println("5 = Jakarta");
        System.out.println("---------------------------");
        
        for (int i = 0; i < Tedge; i++) {
            System.out.print("Masukkan Source      : ");
            int source = sc.nextInt();
            System.out.print("Masukkan Destiantion : ");
            int des = sc.nextInt();
            
            g.addEdge(source,des);
            g.printGraph4();
        }
        g.degree(2);
        System.out.println("");

        g.removeEdge(2,1);
        g.printGraph4();
    }
        
}
