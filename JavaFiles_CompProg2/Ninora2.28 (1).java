/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.circlee;
import java.util.Scanner;
/**
 *
 * @author mapninora
 */
public class Circlee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        int radius = scanner.nextInt();
        
        double diameter = 2.0 * radius;
        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.printf("Diameter: %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);
        
    }
}
