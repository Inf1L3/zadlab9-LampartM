/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Zad2 {
    
    public static void zad2() {

        int x;
        Random r = new Random();
        TreeSet tab = new TreeSet<Integer>();
        for (int i = 0; i < 100; i++) {
            x = r.nextInt(1001);
            tab.add(x);
        }

        Iterator it = tab.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

    }
    
}
