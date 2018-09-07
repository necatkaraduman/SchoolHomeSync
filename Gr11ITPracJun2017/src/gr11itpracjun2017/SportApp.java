/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr11itpracjun2017;

/**
 *
 * @author moolm
 */
public class SportApp {
    public static void main(String[] args) {
        SportArr f = new SportArr();
        System.out.println(f.toString());
        System.out.println(f.averageCost());
        System.out.println(f.sortByCost());
        f.changePrice();
        System.out.println(f.toString());
    }
}
