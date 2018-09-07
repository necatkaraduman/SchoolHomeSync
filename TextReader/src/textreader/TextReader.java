/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class TextReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File names = new File("names.txt");
        Scanner sc = new Scanner(names);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
    
}
