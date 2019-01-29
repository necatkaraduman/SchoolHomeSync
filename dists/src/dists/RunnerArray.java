package dists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunnerArray {

    private Runner[] RunArr = new Runner[100];
    private int count = 0;

    public RunnerArray() {
        try {
            Scanner sc = new Scanner(new File("Runners.txt"));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner scFile = new Scanner(line).useDelimiter(";");
                RunArr[count] = new Runner(scFile.next(), scFile.next(), scFile.next(), scFile.next());
                count++;
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < count; i++) {
            temp = temp + RunArr[i].toString() + "\n";

        }
        return temp;

    }
public String findWinner () {
    int max =0;
    String temp = ""; 
 for ( int i =0; i < RunArr.length; i++ ){
        if ( Integer.parseInt(RunArr[max].getTimeinSecs())< Integer.parseInt(RunArr[i].getTimeinSecs())){
max = i;       
   }
    }
return RunArr[max].getName();
}
    
        
}