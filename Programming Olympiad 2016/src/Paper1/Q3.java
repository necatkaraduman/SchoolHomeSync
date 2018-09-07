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
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N?:");
        int n = sc.nextInt();
        System.out.println("Enter a message:");
        String k = sc.next().toUpperCase();
        char[] kk = k.toCharArray();
        for(int i = 0;i<n;i++){
            char temp = kk[k.length()-1];
            for(int j = k.length()-1;j>0;j--){
                kk[j]=kk[j-1];
            }
            kk[0] = temp;
        }
        String qes = new String(kk);
        System.out.println(qes);
        for(int i = 0;i<k.length();i++){
            int f=(char) (kk[i]+n);
            if(f>90){
                f-=90;
            }
            kk[i]=(char)f;
        }
        String ans = new String(kk);
        System.out.println(ans);
    }
}
