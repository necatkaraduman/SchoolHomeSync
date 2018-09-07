/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 23723
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and M:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter coordinates of A");
        int na = sc.nextInt()-1;
        int ma = sc.nextInt()-1;
        System.out.println("Enter coordinates of B");
        int nb = sc.nextInt()-1;
        int mb = sc.nextInt()-1;
        int moves = 0;
        boolean[][] places = new boolean[n][m];
        places[na][ma]=true;
        
        while(!places[nb][mb]){
            moves++;
            boolean[][] temp = places;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    if(temp[i][j]){
                        try {
                            places[i-2][j-1]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i-2][j+1]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i-1][j-2]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i-1][j+2]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i+1][j-2]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i+1][j+2]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i+2][j-1]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                        try {
                            places[i+2][j+1]=true;
                        } catch (ArrayIndexOutOfBoundsException ex) {
                        }
                    }
                }
            }
        }
        System.out.println(places[nb][mb]);
        System.out.println(moves);
    }
    
}
