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
public class Numbers {

    public static void main(String[] args) throws FileNotFoundException {
        String Fname = JOptionPane.showInputDialog("Enter the name of the file: ");
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        int sum = 0, average = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE, count = 0;
        
        while (scFile.hasNext()) {
            count++;
            int k = scFile.nextInt();
            sum += k;
            average = sum / count;
            if(k>highest){
                highest=k;
            }
            if(k<lowest){
                lowest=k;
            }
        }
        
        System.out.println("Sum is: \t" + sum);
        System.out.println("Average is : \t" + average);
        System.out.println("Highest is: \t" + highest);                    //782
        System.out.println("Lowest is: \t" + lowest);                     //2
    }
}
