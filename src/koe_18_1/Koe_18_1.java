/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koe_18_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Koe_18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Koe_18_1().ohjelma();
    }
    
    public void ohjelma() {
        List<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(4);
        lista.add(1);
        lista.add(2);
        lista.add(5);
        lista.add(12);
        
        List<Integer> indeksit = alkulukujenIndeksit(lista);
        for(int indeksi : indeksit) {
            System.out.println("Indeksissä " + indeksi + " on alkuluku " + lista.get(indeksi));
        }
    }
    
    public static List<Integer> alkulukujenIndeksit(List<Integer> luvut) {
        List<Integer> palauta = new ArrayList<>();
        
        for(int i=0;i<luvut.size();i++) {
            if(luvut.get(i)>2) {
                if(luvut.get(i) % 2 != 0 && luvut.get(i) % 1 == 0 && luvut.get(i) % luvut.get(i) == 0) {
                    palauta.add(i);
                }
            } else if(luvut.get(i)==2) {
                palauta.add(i);
            }
        }
        return palauta;
    }
    
}
