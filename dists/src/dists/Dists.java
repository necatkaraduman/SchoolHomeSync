/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dists;

/**
 *
 * @author moolm
 */
public class Dists {

    private int[] dArr = new int[5];

    public Dists(String c) {
        String[] temp = c.split("\\s+");
        for (int i = 0; i < temp.length; i++) {
            dArr[i] = Integer.parseInt(temp[i]);
        }

        /**
         * @param args the command line arguments
         */
    }

    public int getTotalkms() {
        int temp = 0;
        for (int i = 0; i < dArr.length; i++) {
            temp = temp + dArr[i];
        }
        return temp;
    }
    
}
