/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checkerpattern;

/**
 *
 * @author mapninora
 */

//2.27
public class CheckerPattern {
   public static void main(String[] args) {
        int size = 8; 
        int sizes = 16;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < sizes; col++) {
             
                if ((row + col) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}


