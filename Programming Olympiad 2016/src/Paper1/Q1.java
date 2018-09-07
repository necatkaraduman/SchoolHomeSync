/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper1;

import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);
        System.out.println("Time?");
        double ts = pm.nextInt();
        double th = ts/3600;
        System.out.println("Distance?");
        double dm = pm.nextInt();
        double dk = dm/1000;
        System.out.println((int)(dk/th));
    }
}
