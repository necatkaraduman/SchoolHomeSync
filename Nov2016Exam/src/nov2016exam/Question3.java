/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov2016exam;

import java.util.Arrays;

/**
 *
 * @author moolm
 */
public class Question3 {
    public static void main(String[] args) {
        String[] s = {"the","lazy","brown","fox"};
        String temp;
        for(int y = 1;y<s.length;y++){
            for(int x = 0;x<s.length-y;x++){
                if(s[x].compareToIgnoreCase(s[x+1])>0){
                    temp = s[x];
                    s[x]=s[x+1];
                    s[x+1]=temp;
                }
            }
        }
        int max = 0;
        for(int x = 0;x<s.length;x++){
            if(s[x].length()>max){max=s[x].length();}
        }
        for(int x = 0;x<max+2;x++){System.out.print("*");}System.out.println("");
        for(int x = 0;x<s.length;x++){
            System.out.print("*");
            System.out.print(s[x]);
            for(int y = 0;y<max-s[x].length();y++){
                System.out.print(" ");
            }
            System.out.print("*");System.out.println("");
        }
        for(int x = 0;x<max+2;x++){System.out.print("*");}System.out.println("");
    }
    
}
