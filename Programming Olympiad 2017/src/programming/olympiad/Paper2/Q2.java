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
public class Q2 {
    public static void main(String[] args) {
        int[] init = new int[100];
        int num = 0;
        int n = 0;
        while(true){
            try{
                int x = num+1;
                int k = Integer.parseInt(JOptionPane.showInputDialog("Enter term "+ x +" or type 'exit' to finish:"));
                num++;
                init[num-1]=k;
            } catch(NumberFormatException e){
                n = Integer.parseInt(JOptionPane.showInputDialog("Enter term you wish to calculate:"));
                break;
            }
        }
        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i]=init[i];
        }
        for(int i = 0;i<n-3;i++){
            process(arr);
        }
        System.out.println(arr[2]);
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void process(int[] arr){
        int temp = sum(arr);
        for(int i = 0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
