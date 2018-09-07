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
public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));
        int temp = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter term you wish to see:"));
        for(int i = 1;i<=n-3;i++){
            temp = a + b + c;
            a = b;
            b = c;
            c = temp;    
        }
        System.out.println(temp);
    }
}
