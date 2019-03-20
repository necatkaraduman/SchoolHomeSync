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
        super();
        health = (int)(Math.random()*21)+20;
        System.out.println("Health: "+health);
        
    }
    public void seeattack(){
        System.out.println("Monsterrr att "+this.getAttackRating());
    }
    
    @Override
    public boolean receiveAttack(int attackStrength){
        if(attackStrength>this.getDefenseRating()){
            int damage = attackStrength - this.getDefenseRating();
            System.out.print(this.getClass().getSimpleName()+" was damaged for "+damage+" health.");
            health -= damage;
            if(health>0){
                System.out.println(" Current health "+health+".");
                return false;
            } else {
                System.out.println(this.getClass().getSimpleName()+" died.");
                return true;
            }
        } else {
            System.out.println("Tis barely a scratch!");
            return false;
        }
    }
    public boolean makeAttack(TrainingDummy td){
        return td.receiveAttack(this.getAttackRating());
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + "health=" + health + ", attack=" + this.getAttackRating()+ ", defense=" + this.getDefenseRating() +'}';
    }
    
}
