/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalsDay1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class stargazing {
    static int constellations = 0;
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("stars.txt");
        Scanner sc = new Scanner(f);
        Scanner ln = new Scanner(sc.nextLine());
        int stars = ln.nextInt();
        int dist = ln.nextInt();
        int[][] arr = new int[stars][2];
        for(int i = 0;i<stars;i++){
            constellations = 0;
            Scanner line = new Scanner(sc.nextLine());
                arr[i][0]=line.nextInt();
                arr[i][1]=line.nextInt();
                
                System.out.println(constellations);
        }
        
    }
    public static void constalate(int[][] arr,int i,int d){
        for(int j = 0;j<i;j++){
            if(Math.abs(arr[j][0]-arr[i][0])+Math.abs(arr[j][1]-arr[i][1])<=d){
                constellations++;
            }
        }
    }
}
