

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class tugas1 {
    public static void main(String[] args) {
        System.out.println("JASA CUCI PAKAIAN SMILE LAUNDRY");
        System.out.println("===============================");
        
        double ani,budi,bina,cita;
        double totalPendapatan=0;
        ani=4*4500;
        System.out.println("Ani  : " + ani);
        budi=(15*4500)-(0.05*67500);
        System.out.println("Budi : " + budi);
        bina=6*4500;
        System.out.println("Bina : " + bina);
        cita=(11*4500)- (0.05*49500);
        System.out.println("Cita : " + cita);
        
        totalPendapatan+=ani+budi+bina+cita;
        System.out.println("Total keseluruhan Pendapatan Slime Laundry : "+totalPendapatan);
        
    }
}
