/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov2016exam;

/**
 *
 * @author moolm
 */
public class Question4 {
    
    public static void main(String[] args) {
        int[] arr = {5,2,67,2,6,2,3,0,8,2,3,4,5,9};
        int i = 4;
        int l = left(arr,i);
        int r = right(arr,i);
        if(l==0&&r==0){System.out.println("No possible output");}
        else if(l<r){System.out.println(l);}
        else if(r<=l){System.out.println(r);}
        else{System.out.println("ERROR");}
    }
    public static int left(int[] a,int i){
        int count = 0;
        for(int x = i;x>0;x--){
            count++;
            if(a[x-1]>a[i]){
                break;
            }
            if(x==1){count = 0;}
        }
        return count;
    }
    public static int right(int[] a,int i){
        int count = 0;
        for(int x = i;x<a.length;x++){
            count++;
            if(a[x+1]>a[i]){
                break;
            }
            if(x==a.length-1){count = 0;}
        }
        return count;
    }
    
}
