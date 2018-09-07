/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalsDay1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class towers {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("ex2.txt");
        Scanner sc = new Scanner(f);
        Scanner nmLine = new Scanner(sc.nextLine());
        int n = nmLine.nextInt();
        int m = nmLine.nextInt();
        int[][] nm = new int[n+m][2];
        Scanner nLine = new Scanner(sc.nextLine());
        Scanner mLine = new Scanner(sc.nextLine());
        int p = 0;
        while(nLine.hasNext()){
            nm[p][0]=nLine.nextInt();
            nm[p][1]=0;
            p++;
        }
        while(mLine.hasNext()){
            nm[p][0]=mLine.nextInt();
            nm[p][1]=1;
            p++;
        }
       
        
        for (int i = 0; i < nm.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < nm.length; j++)
                if (nm[j][0] < nm[index][0]) 
                    index = j;
      
            int smallerNumber = nm[index][0];  
            int smallerNumber2 = nm[index][1];
            nm[index][0] = nm[i][0];
            nm[index][1] = nm[i][1];
            nm[i][0] = smallerNumber;
            nm[i][1] = smallerNumber2;
        }
        int[] dist = new int[n+m-1];
        int tot = 0;
        for(int i = 0;i<n+m;i++){
            if(nm[i][1]==0){
                int count = 1;
                while(true){
                    try{
                        if(nm[i-count][1]==1){
                            dist[tot]=Math.abs(nm[i][0]-nm[i-count][0]);
                            //System.out.println("Ran true on i: "+i+", with dist of "+Math.abs(nm[i][0]-nm[i-count][0]));
                            tot++;
                            break;
                        }
                    } catch(ArrayIndexOutOfBoundsException e){
                        
                    }
                    try{
                        if(nm[i+count][1]==1){
                            dist[tot]=Math.abs(nm[i][0]-nm[i+count][0]);
                            //System.out.println("Ran true on i: "+i+", with dist of "+Math.abs(nm[i][0]-nm[i+count][0]));
                            tot++;
                            break;
                        }
                    } catch(ArrayIndexOutOfBoundsException e){
                        
                    }
                    count++;
                }
            }
        }
        Arrays.sort(dist);
        System.out.println(dist[n+m-2]);
    }
}
