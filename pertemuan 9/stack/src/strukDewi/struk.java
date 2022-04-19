/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukDewi;

/**
 *
 * @author acer E5
 */
public class struk {
    int nomorTransaksi, jmlBrg;
    String tgl;
    double total;
    
    struk(int nomorTransaksi, String tgl, int jmlBrg, double total){
        this.nomorTransaksi = nomorTransaksi;
        this.tgl = tgl;
        this.jmlBrg = jmlBrg;
        this.total = total;
    }
}
