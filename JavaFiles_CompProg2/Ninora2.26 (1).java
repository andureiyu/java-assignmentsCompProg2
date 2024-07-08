/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercise2;
import java.util.Scanner;
/**
 *
 * @author mapninora
 */
public class Exercise2 {
//2.26
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Please Enter 1st Integer:");
        int num1 = scanner.nextInt();
        
        System.out.print("Please Enter 2nd Integer:");
        int num2 = scanner.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d%n", num1, num2);
      } else {
            System.out.printf("%d is not a multiple of %d%n", num1, num2);
        }
    }
}



    
