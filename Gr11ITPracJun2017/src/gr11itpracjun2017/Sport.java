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
public class Sport {
    private String name, place, code;
    private int cost;
    
    public Sport(String n,String p,int c){
        name = n;
        place = p;
        cost = c;
        code = "";
    }
    @Override
    public String toString(){
        return name+"\t"+place+"\t"+cost+"\t"+code;
    }
    public void setCost(int c){
        cost = c;
    }
    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    public void generateCode(){
        String tmp = "";
        switch (name) {
            case "Whale Watching":
            case "River Rafting":
                tmp+="W";
                break;
            case "Bungee Jumping":
            case "Abseiling":
                tmp+="L";
                break;
            case "Sky Diving":
            case "Paragliding":
            case "Hot Air Balloon":
                tmp+="A";
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        tmp+=cost/100;
        code = tmp;
    }
    
}
