/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ninora_jeepney_fare;
import java.util.*;
/**
 *
 * @author mapninora
 */
public class Ninora_Jeepney_Fare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char fareType = scan.next().charAt(0);
        int distance = scan.nextInt();

        double fare = 0.0;
        double regularBaseFare = 7.50;
        double discountedBaseFare = 6.00;
        double regularAdditionalFare = 1.25;
        double discountedAdditionalFare = 1.00;
        
       
        if (fareType == 'R') {
            if (distance <= 5) {
                fare = regularBaseFare;
            } else {
                fare = regularBaseFare + (distance - 5) * regularAdditionalFare;
            }
        } else if (fareType == 'D') {
            if (distance <= 5) {
                fare = discountedBaseFare;
            } else {
                fare = discountedBaseFare + (distance - 5) * discountedAdditionalFare;
            }
        }      
        System.out.printf("Fare is Php %.2f\n", fare);
    }
}