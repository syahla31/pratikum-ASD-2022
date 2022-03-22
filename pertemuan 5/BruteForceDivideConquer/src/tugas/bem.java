/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author acer E5
 */
public class bem {
    String[] hasilSuara;
    
    public bem(int panjang) {
        hasilSuara = new String[panjang];
    }

    public String cariMayoritas(String[] hasilSuara, int first, int last) {
        if (first == last) {
            return hasilSuara[first];
        } else {
            int middle = (first + last) / 2;
            String temp1 = cariMayoritas(hasilSuara, first, middle);
            String temp2 = cariMayoritas(hasilSuara, middle + 1, last);
            String nm = "No Mayoritas";
            if (temp1.equalsIgnoreCase(nm)) return temp2;
            if (temp2.equalsIgnoreCase(nm)) return temp1;
            return (temp1.equalsIgnoreCase(temp2) ? temp1 : nm);
        }
    }
}
