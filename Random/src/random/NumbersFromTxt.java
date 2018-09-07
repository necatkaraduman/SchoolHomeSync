/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class NumbersFromTxt { 
    
    public int SumandAverage(int sum,int average,int count) throws FileNotFoundException{
        //String Fname = JOptionPane.showInputDialog("Enter the name of the file: ");
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        //int average = 0, sum = 0, count = 1;
            while (scFile.hasNext()) {
                sum += scFile.nextInt();
                average = sum / count;
            }
        return  average + sum;
    }
    public int Largest (int highest) throws FileNotFoundException{
        String Fname = JOptionPane.showInputDialog("Enter the name of the file: "); 
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        //int highest = 0;
        int[] arr = new int[26];
        for (int i = 0; scFile.hasNext(); i++) {
            arr[i] = scFile.nextInt();
            if (highest < arr[i]) {
                highest = arr[i];
            }
        } 
        return highest;
    }
    public int Smallest (int lowest) throws FileNotFoundException{
        String Fname = JOptionPane.showInputDialog("Enter the name of the file: "); 
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        //int lowest=0;
        int[] arr = new int[26];
        for (int i = 0; scFile.hasNext(); i++) {
            arr[i] = scFile.nextInt();
            if (lowest > arr[i]) {
                lowest = arr[i];
            }
        }
        return lowest;
    }
    
    public String toString(){
        return "Sum: " + sum + " Average: " + average + " Lowest: " + lowest + " Highest:" + highest;
    }

    public static void main(String[] args){
        String Fname = JOptionPane.showInputDialog("Enter the name of the file: ");
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        NumbersFromTxT ob1 = new NumbersFromTxT(); 
        System.out.println(ob1);
    }
    }
    
}

