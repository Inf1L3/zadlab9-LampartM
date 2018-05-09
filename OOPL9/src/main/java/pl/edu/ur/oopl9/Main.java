/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Scanner;

/**
 *
 * @author Maciek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 1;

        while (x != 0) {
            System.out.println("Podaj numer zadania(1,2,3)");
            
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            x = odczyt.nextInt();
            
            switch (x) {
                case 1:
                    Zad1.zad1();
                    break;
                case 2:
                   Zad2.zad2();
                    break;
                case 3:
                    Zad3.zad3();
                    break;
            }
        }

    }

}
