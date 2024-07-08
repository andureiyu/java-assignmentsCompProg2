/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ninora233;
import javax.swing.JOptionPane;

/**
 *
 * @author mapninora
 */
//2.33
public class Ninora233 {
     public static void main(String[] args) {
        // Creating Options for the user to choose the units
        String[] userOptions = {"Pounds(lb) and Inches(inch)", "Kilograms(kg) and Centimeters(cm)"};
        int userChoice = JOptionPane.showOptionDialog(null, "Please Select units for weight and height:", "User Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, userOptions, userOptions[0]);

        //i declared the data-type float in both weight and height because BMI involves with decimals
        float weight = 0;
        float height = 0;

        if (userChoice == 0) {
            // This will get weight in pounds
            String weightInp = JOptionPane.showInputDialog(null, "Please type your weight in pounds(lb): ");
            weight = Float.parseFloat(weightInp);

            // This will get height in inches
            String heightInp = JOptionPane.showInputDialog(null, "Please type your height in inches(″): ");
            height = Float.parseFloat(heightInp);
        } else if (userChoice == 1) {
            // This will get weight in kilograms
            String weightInp = JOptionPane.showInputDialog(null, "Please type your weight in kilograms(kg): ");
            weight = Float.parseFloat(weightInp);

            // This will get height in centimeters
            String heightInp = JOptionPane.showInputDialog(null, "Please type your height in centimeters(cm): ");
            height = Float.parseFloat(heightInp);

            // Conversion of weight from kg to pounds and height from cm to inches
            weight = weight * 2.20462f;
            height = height * 0.393701f;
        } else {
            JOptionPane.showMessageDialog(null, "No Valid Unit Selected.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);  // Exit if no valid unit selected
        }

        // To Calculate BMI following the formula and using float since it is decimal
        float BMI = (weight * 703) / (height * height);

        // This Determines the BMI category and corresponding message icon
        String message;
        int messageType;

        if (BMI < 18.5) {
            message = String.format("Your BMI is: %.2f\nYou are underweight.", BMI);
            messageType = JOptionPane.WARNING_MESSAGE;
        } else if (BMI < 25) {
            message = String.format("Your BMI is: %.2f\nYou have a normal weight.", BMI);
            messageType = JOptionPane.INFORMATION_MESSAGE;
        } else if (BMI < 30) {
            message = String.format("Your BMI is: %.2f\nYou are overweight.", BMI);
            messageType = JOptionPane.WARNING_MESSAGE;
        } else {
            message = String.format("Your BMI is: %.2f\nYou are obese.", BMI);
            messageType = JOptionPane.ERROR_MESSAGE;
        }

        // Display the result
        JOptionPane.showMessageDialog(null, message, "BMI Result", messageType);

        String BMIvalues = "BMI VALUES\n" +
                           "Underweight: less than 18.5\n" +
                           "Normal: between 18.5 and 24.9\n" +
                           "Overweight: between 25 and 29.9\n" +
                           "Obese: 30 or greater";
        JOptionPane.showMessageDialog(null, BMIvalues, "BMI Categories", JOptionPane.INFORMATION_MESSAGE);
    }
}
      
  

