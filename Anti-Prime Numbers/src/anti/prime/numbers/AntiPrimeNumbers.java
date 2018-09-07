/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.prime.numbers;

/**
 *
 * @author moolm
 */
public class AntiPrimeNumbers {

    public static void main(String[] args) {
        int max = 0;
        int n = 0;
        int temp;
        while(true){
            n++;
            temp = divisors(n);
            if(temp>max){
                max = temp;
                System.out.println(n+":\t"+temp);
            }
        }
    }
    public static int divisors(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                total++;
            }
        }
        return total;
    }

}
