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
public class TrainingDummy {
    private int attackRating, defenseRating;
    
    public TrainingDummy(){
        attackRating = (int)(Math.random()*11)+5;
        defenseRating = (int)(Math.random()*5)+1;
        System.out.println(this.getClass().getSimpleName() + " created with "+attackRating+" attack and "+defenseRating+" defense.");
    }
    public boolean receiveAttack(int attStrength){
        if(attStrength>defenseRating){
            System.out.println("Ouch! That hurt!");
        } else {
            System.out.println("Tis barely a scratch!");
        }
        return false;
    }

    public int getAttackRating() {
        return attackRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }
    
}
