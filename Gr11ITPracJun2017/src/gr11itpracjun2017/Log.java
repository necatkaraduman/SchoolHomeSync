/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr11itpracjun2017;

import java.util.Scanner;

/**
 *
 * @author moolm
 */
public class Log {
    private String name,email;
    private int pages;
    
    public Log(String n,String e,int p){
        name = n.toUpperCase();
        email = e;
        pages = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getSurname(){
        Scanner sc = new Scanner(name);
        sc.next();
        return sc.next();
    }
    public void changeAlumni(){
        Scanner sc = new Scanner(email).useDelimiter("@");
        String tmp = sc.next();
        String tmp2 = sc.next();
        if(tmp2.substring(0, 6).equals("student")){
            email = tmp+ "@alumni"+tmp2.substring(7);
        }
    }
    @Override
    public String toString(){
        return name+"\t"+email+"\t"+pages;
    }
}
