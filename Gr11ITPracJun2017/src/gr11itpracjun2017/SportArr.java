/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr11itpracjun2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moolm
 */
public class SportArr {
    private Sport[] sportArray = new Sport[20];
    private int number = 0;
    
    public SportArr(){
        try {
            File f = new File("SportFile.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                Scanner line = new Scanner(sc.nextLine()).useDelimiter("#");
                sportArray[number]= new Sport(line.next(),line.next(),Math.abs(line.nextInt()));
                number++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File could not be found. Please make sure file is there.");;
        }
    }
    @Override
    public String toString(){
        String tmp = "";
        for(int x = 0; x<number;x++){
            tmp+=sportArray[x].toString();
            tmp+="\n";
        }
        return tmp;
    }
    
    public String averageCost(){
        int sum = 0;
        for(int x = 0; x<number;x++){
            sum+=sportArray[x].getCost();
        }
        sum/=(number);
        return "The average cost os R"+sum;
    }
    public String sortByCost(){
        Sport[] tmp = sportArray;
        for(int i = 0;i<number-1;i++){
            int index = i;
            for(int j = i+1;j<number;j++){
                if(tmp[j].getCost()<tmp[index].getCost()){
                    index = j;
                }
            }
            Sport temp = tmp[index];
            tmp[index] = tmp[i];
            tmp[i]=temp;
        }
        String k = "";
        for(int x = 0;x<5;x++){
            k+=tmp[x].toString();
            k+="\n";
        }
        return k;
    }
    public void changePrice(){
        for(int x = 0;x<number;x++){
            if(sportArray[x].getName().equals("Sky Diving")){
                sportArray[x].setCost(sportArray[x].getCost()+500);
            }
        }
    }
}

