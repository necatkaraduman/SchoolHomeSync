/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.olympiad.Paper1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class Q3 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Enter a piece of text:");
        Scanner sc = new Scanner(n);
        double count = 0;
        double sum = 0;
        while(sc.hasNext()){
            count++;
            char[] word = sc.next().toCharArray();
            for(int i = 0; i<word.length;i++){
                if (Character.isLetter(word[i])){
                    sum++;
                }
            }
        }
        double b = Math.round(sum/count*100);
        double a = b/100;
        System.out.println(a);
    }
}
