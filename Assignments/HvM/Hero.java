/*
Name: Aaron Jones
Date: 4/10/2014
Description: This class is the Hero class which extends the DungeonCharacter class. This class
includes a EVC, and a way to read the users name (readname() method), the battleDecisions modified
for the us in this class which determines how many turns each character gets based upon their stats.  
*/
import java.util.Scanner;

public abstract class Hero extends DungeonCharacter
{
   protected double chanceToBlock;
   protected int numTurns;
   
   public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax, double chanceToBlock)
   {
      super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
      this.chanceToBlock = chanceToBlock;
      readName();
   }
   
   public void readName()
   {  Scanner kb = new Scanner(System.in);
      System.out.print("Enter character name: ");
      this.name = kb.nextLine();
   }
   
   public boolean defend()
   {
      return Math.random() <= this.chanceToBlock;
   }
   
   public void substractHitPoints(int hitPoints)
   {
      if(defend())
      {
         System.out.println(this.name + " blocked the attack!");
      }
      else
      {
         super.removeHitPoints(hitPoints);
      }
   }
   
   public void battleDecisions(DungeonCharacter op)
   {
      this.numTurns = (this.attackSpeed / op.getAttackSpeed());
      if(this.numTurns == 0)
      {
         this.numTurns += 1;
      }  
      System.out.println("Number of turns: " + this.numTurns);
      
   }
}