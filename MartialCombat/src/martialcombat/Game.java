/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martialcombat;

import javax.swing.JOptionPane;

/**
 *
 * @author moolm
 */
public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        while(true){
            switch(JOptionPane.showInputDialog("1. Fight Training Dummy\n2. Fight Monster\n3. Quit")){
                case "3":
                    System.out.println("You have quit the game. Thanks for playing!"); return;
                case "1":
                    TrainingDummy td1 = new TrainingDummy();
                    player1.setTarget(td1);
                    break;
                case "2":
                    Monster m1 = new Monster();
                    player1.setTarget(m1);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            while(player1.hasTarget()){
                switch(JOptionPane.showInputDialog("1. Attack\n2. Heal\n3. Run Away")){
                    case "1":
                        player1.playerAttack();
                        if(player1.isDead()){
                            System.out.println("You have died! Thanks for playing.");
                            return;
                        }
                        break;
                    case "2":
                        player1.heal();
                        if(player1.isDead()){
                            System.out.println("You have died! Thanks for playing.");
                            return;
                        }
                        break;
                    case "3":
                        player1.runAway();
                        if(player1.isDead()){
                            System.out.println("You have died! Thanks for playing.");
                            return;
                        }
                        System.out.println("You succesfully ran away. Real courage you have there.");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            
            
            }
        
        }
        
    }
}
