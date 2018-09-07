/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class People {

    String name;
    int age;
    final File names = new File("names.txt");

    public People(int line) throws FileNotFoundException {
        Scanner sc = new Scanner(names);
        for (int i = 1; i < line; i++) {
            try {
                sc.nextLine();
                try {
                    name = sc.next();
                } catch (NoSuchElementException e) {
                    System.out.println("No name");
                    name = "ERROR";
                }
                try {
                    age = sc.nextInt();

                } catch (NoSuchElementException e) {
                    System.out.println("No age");
                    age = 0;
                }
            } catch (NoSuchElementException e) {
                System.out.println("ERROR: Line does not exist");
                name = "'None set'";
                age = 999999999;
                break;
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        People Gordon = new People(15);
        System.out.println("Name: "+ Gordon.name);
        System.out.println("Age: "+Gordon.age);
    }
}
