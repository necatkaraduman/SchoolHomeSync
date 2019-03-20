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
public class test {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster();
        TrainingDummy td1 = new TrainingDummy();
        Player p1 = new Player();
        System.out.println("");
        p1.setTarget(m1);
        p1.playerAttack();
    }
}
