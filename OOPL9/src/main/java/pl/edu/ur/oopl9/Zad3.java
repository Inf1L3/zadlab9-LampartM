/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Zad3 {

    public static void zad3() {

        List<Object> lista = new ArrayList<>();
        Samochod sam1 = new Samochod("Marka1", "Nazwa1", 130, 50000);
        Samochod sam2 = new Samochod("Marka2", "Nazwa2", 150, 25000);
        Samochod sam3 = new Samochod("Marka3", "Nazwa3", 100, 10000);
        Samochod sam4 = new Samochod("Marka4", "Nazwa4", 200, 250000);

        lista.add(sam1);
        lista.add(sam2);
        lista.add(sam3);
        lista.add(sam4);
        
         for(int i = 0; i < lista.size(); i++){
            System.out.println("Lista nr "+(i+1)+": "+ lista.get(i).toString());
        }

    }
}
