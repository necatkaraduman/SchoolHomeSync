/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.olympiad.Paper2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class Q1 {
    public static void main(String[] args) {
        String k = JOptionPane.showInputDialog("Enter a message to encode:");
        System.out.println(k.length());
        int n = 5-k.length()%5;
        for(int i = 0;i<n;i++){
            k+=" ";
        }
        System.out.println(k.length());
        char[][] set = new char [5][k.length()/5];
        char[] m = k.toCharArray();
        int x = 0;
        for(int i = 0;i<k.length()/5;i++){
            for(int j = 0;j<5;j++){
                set[j][i]=m[x];
                x++;
            }
        }
        String code = "";
        for(int j = 0;j<5;j++){
            for(int i = 0;i<k.length()/5;i++){
                if(set[j][i]==' '){
                    code+=".";
                } else {
                    code += set[j][i];
                }
            }
        }
        System.out.println(code);
    }
}
