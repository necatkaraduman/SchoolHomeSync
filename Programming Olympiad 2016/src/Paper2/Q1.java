/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper2;

import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
    }
    public static int reverse(int x){
        String k = ""+x;
        char[] arr = k.toCharArray();
        ArrayUtils.reverse(arr);
    }
}
