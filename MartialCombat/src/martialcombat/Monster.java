/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martialcombat;

/**
 *
 * @author addmin
 */
public class Monster extends TrainingDummy{
    protected int health;
    
    public Monster(){
        health = (int)(Math.random()*21)+20;
        System.out.println("Health: "+health);
    }
    
    public boolean receiveAttack(){
        if(attack)
    }
}
