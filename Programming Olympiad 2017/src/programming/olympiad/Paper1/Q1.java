/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.olympiad.Paper1;

import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class Q1 {
    public static void main(String[] args) {
        double p = Double.parseDouble(JOptionPane.showInputDialog("Initial Investment:"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Interest Rate:"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Number of Years:"));
        double b = Math.round((p+(p*(r/100)*t))*100);
        String a = Double.toString(b/100);          //Use Decimal Format
        System.out.println(b);
        System.out.println(a);
    }
}
