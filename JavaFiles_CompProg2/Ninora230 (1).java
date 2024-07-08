/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ninora230;
import java.util.*;
/**
 *
 * @author mapninora
 */
public class Ninora230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input a 5-digit number: ");
        String number = scanner.nextLine();
        
        if (number.length() != 5 || !number.matches("\\d+")) {
            System.out.println("Invalid input. Please try again.");
            return;
        } 
        
        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i));
            if (i < number.length() - 1) {
                System.out.print("   "); 
            }
        }
        System.out.println(); 
    }
}

