import java.util.Scanner;

public abstract class Hero extends DungeonCharacter
{
   protected double chanceToBlock;
   protected int numTurns;
   
   public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax, double chanceToBlock)
   {
      super(name, hitPoints, attackSpeed, chancetoHit, damageMin, damageMax);
      this.chanceToBlock = chanceToBlock;
      readName();
   }
   
   public void readName();
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
         System.out.println(this.name + "blocked the attack!");
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