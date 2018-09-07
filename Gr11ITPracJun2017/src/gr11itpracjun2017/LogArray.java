/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr11itpracjun2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class LogArray {
    private Log[] logArray = new Log[200];
    private int number = 0;
    public LogArray(){
        try {
            File f = new File("Log.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                Scanner line = new Scanner(sc.nextLine()).useDelimiter(",");
                logArray[number]= new Log(line.next(),line.next(),line.nextInt());
                number++;
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("No such file.");
        }
        
    }

    @Override
    public String toString() {
        String k = "";
        for(int x = 0;x<number;x++){
            k+=logArray[x].toString()+"\n";
        }
        return k;
    }
    public void changeEmails(){
        for(int x = 0;x<number;x++){
            logArray[x].changeAlumni();
        }
    }
    public void sort(){
        for(int i = 0;i<number-1;i++){
            int index = i;
            for(int j = i;j<number;j++){
                if(logArray[j].getSurname().compareToIgnoreCase(logArray[index].getSurname())<0){
                    index = j;
                }
                Log tmp = logArray[i];
                logArray[i]=logArray[index];
                logArray[index]=tmp;
            }
        }
    }
    public int search(String surname){
        int k = -1;
        for(int i = 0;i<number;i++){
            if(logArray[i].getSurname().equalsIgnoreCase(surname)){
                k = i;
            }
        }
        return k;
    }
    
}
