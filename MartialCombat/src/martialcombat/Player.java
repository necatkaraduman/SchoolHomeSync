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
public class Player extends Monster{
    private TrainingDummy currentTarget;
    boolean dead;
    
    public Player(){
        super();
        dead = false;
    }
    
    public void setTarget(TrainingDummy td){
        currentTarget = td;
    }
    
    public void playerAttack(){
        if(this.makeAttack(currentTarget)){
            currentTarget = null;
        } else {
            if(currentTarget.getClass().equals(Monster.class)){
                ((Monster) currentTarget).makeAttack(this);
                if(!(health>0)){
                    dead = true;
                }
            }
        }
        
    }
    
    public void heal(){
        int hp = 1+(int)(Math.random()*5);
        health += hp;
        System.out.println("Player healed by "+hp+"HP. Current health "+health);
        if(currentTarget.getClass().equals(Monster.class)){
            ((Monster) currentTarget).makeAttack(this);
            if(!(health>0)){
                dead = true;
            }
        }
    }
    
    public boolean isDead(){
        return dead;
    }
    
    public void runAway(){
        if(currentTarget.getClass().equals(Monster.class)){
            ((Monster) currentTarget).makeAttack(this);
            if(!(health>0)){
                dead = true;
            }
        }
        currentTarget = null;
    }
    
    public boolean hasTarget(){
        return !(currentTarget==null);
    }
}
