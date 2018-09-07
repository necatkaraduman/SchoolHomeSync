/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper1;

import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("Ouput:");
        System.out.println(sum);
    }
}
