/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.olympiad.Paper2;

import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class Q3 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        int sum = x+1;
        for(int d = 1;d<=x;d++){
            for(int n = 1;n<d;n++){
                if(d%n!=0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
