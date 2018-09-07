/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.util.Scanner;

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
        //System.out.println("a"+na+ma);
        System.out.println("Enter coordinates of B");
        int nb = sc.nextInt()-1;
        int mb = sc.nextInt()-1;
        //System.out.println("b"+nb+mb);
        int moves = 0;
        boolean[][] places = new boolean[n][m];
        boolean[][] temp = new boolean[n][m];
        places[na][ma]=true;
        boolean[] change = new boolean[8];
        
        while(!places[nb][mb]){
            moves++;
            //System.out.println("Moves: "+moves);
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    //System.out.println("ij: "+i+" "+j);
                    System.out.println("Moves: "+moves+" wiped");
                    wipe(change);
                    if(places[i][j]){
                        System.out.println("ij: "+i+" "+j+" is true");
                        if(i-2<8&&i-2>=0&&j-1<8&&j-1>=0){
                            change[0]=true;
                        }
                        if(i-2<8&&i-2>=0&&j+1<8&&j+1>=0){
                            change[1]=true;
                        }
                        if(i-1<8&&i-1>=0&&j-2<8&&j-2>=0){
                            change[2]=true;
                        }
                        if(i-1<8&&i-1>=0&&j+2<8&&j+2>=0){
                            change[3]=true;
                        }
                        if(i+1<8&&i+1>=0&&j-2<8&&j-2>=0){
                            change[4]=true;
                        }
                        if(i+1<8&&i+1>=0&&j+2<8&&j+2>=0){
                            change[5]=true;
                        }
                        if(i+2<8&&i+2>=0&&j-1<8&&j-1>=0){
                            change[6]=true;
                        }
                        if(i+2<8&&i+2>=0&&j+1<8&&j+1>=0){
                            change[7]=true;
                        }
                        System.out.println("Moves: "+moves+" set");
                        add(change,places,i,j);
                    }
                }
            }
            set(places,temp,n,m);
        }
        System.out.println(places[nb][mb]);
        System.out.println(moves);
    }
    public static void wipe(boolean[] change){
        for(boolean a:change){
            a = false;
        }
    }
    public static void add(boolean[] change, boolean[][] temp, int i, int j){
        if(change[0]){
            temp[i-2][j-1]=true;
        }
        if(change[1]){
            temp[i-2][j+1]=true;
        }
        if(change[2]){
            temp[i-1][j-2]=true;
        }
        if(change[3]){
            temp[i-1][j+2]=true;
        }
        if(change[4]){
            temp[i+1][j-2]=true;
        }
        if(change[5]){
            temp[i+1][j+2]=true;
        }
        if(change[6]){
            temp[i+2][j-1]=true;
        }
        if(change[7]){
            temp[i+2][j+1]=true;
        }
    }
    public static void set(boolean[][] places, boolean[][] temp, int n, int m) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(temp[n][m]){
                    places[n][m]=true;
                }
            }
        }
    }
    
}
