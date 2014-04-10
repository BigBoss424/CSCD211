/*
Name: Aaron Jones
Date: 4/10/2014
Description: This is the Warrior class in which is the child class of Hero. In this class
I gave it a special attack called Omnislash (FFVII reference lol). As well as the implementation 
of the Battle Decisions method which allows the user based upon the attacks and decisions that the
user can use in battle using a switch case structure. This class is basically the reference for all
the Hero class except for Sorceress. For my mental state I would rather not get points docked off for
not having a description in each Hero class. Since they're all pretty much the same except for a few 
minor differences such as the heal method in Sorceress, ambush method in Thief, and the Snipe method 
in Archer which is just Omnislash except with more damage (headshot lol). 
*/
import java.util.Scanner;

public class Warrior extends Hero
{
   public Warrior()
   {
      super("Warrior", 125, 4, 0.8, 35, 60, 0.2);
   }
   
   public void Omnislash(DungeonCharacter op)
   {
      if(Math.random() <= 0.4)
      {
         int sPoints = (int)(Math.random() * 76.0) + 100;
         System.out.println(this.name + "uses Omnislash for " + sPoints + " damage!");
         op.removeHitPoints(sPoints);
      }
      else
      {
         System.out.println(this.name + " missed his opportunity for Omnislash \n");
      }
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + " swings his greatsword at " + op.getName() + ":");
      super.attack(op);
   }
   
   public void battleDecisions(DungeonCharacter op)
   {
      Scanner kb = new Scanner(System.in);
      
      super.battleDecisions(op);
      do
      {
         System.out.println("1) Attack Opponent");
         System.out.println("2) Omnislash");
         System.out.println("Make your Decision!: ");
         int choice = kb.nextInt();
         switch(choice)
         {
            case 1: attack(op);
                    break;
            case 2: Omnislash(op);
                    break;
            default: 
               System.out.println("Pick an actual choice retard!");
         }  
         this.numTurns -= 1;
         if(this.numTurns > 0)
         {
            System.out.println("Number of turns remaining: " + this.numTurns);
         }
      }while(this.numTurns > 0);
   }
}