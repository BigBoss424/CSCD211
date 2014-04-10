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