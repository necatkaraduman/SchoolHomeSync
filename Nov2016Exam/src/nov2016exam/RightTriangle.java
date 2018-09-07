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
public class RightTriangle {
    double base;
    double height;
    
    public RightTriangle(double b, double h){
        base = b;
        height = h;
    }
    public double hypotenuse(){
        return Math.sqrt(base*base+height*height);
    }
    public double perimeter(){
        return base+height+hypotenuse();
    }
    public String toString(){
        return "Base: "+base+"\tHeight: "+height+"\tPerimeter: "+perimeter();
    }
    public static void main(String[] args) {
        RightTriangle t1 = new RightTriangle(3,4);
        System.out.println(t1);
    }
}
