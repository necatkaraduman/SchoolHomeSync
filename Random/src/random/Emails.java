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
public class Emails {

    public static void main(String[] args) throws FileNotFoundException {
        String Fname = JOptionPane.showInputDialog("Enter the file name: ");
        Scanner scFile = new Scanner(new File(Fname + ".txt"));
        String line = "", domain = "";
        System.out.println("UserName: \t\t\t Domain: \n**");
        while (scFile.hasNext()) {
            line = scFile.next();
            Scanner scLine = new Scanner(line).useDelimiter("@");
            System.out.println(scLine.next() + "\t\t\t\t" + scLine.next());
        }
        scFile.close();
    }
}
