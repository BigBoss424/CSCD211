import java.util.Scanner;

public class Archer extends Hero
{
   public Archer()
   {
      super("Archer", 100, 4, 0.8, 35, 75, 0.5);
   }
   
   public void Snipe(DungeonCharacter op)
   {
      if(Math.random() <= 0.4)
      {
         int sPoints = (int)(Math.random() * 125.0) + 100;
         System.out.println(this.name + " uses Snipe for " + sPoints + " damage!");
         op.removeHitPoints(sPoints);
      }
      else
      {
         System.out.println(this.name + " missed the shot \n");
      }
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + "swings his greatsword at " + op.getName() + ":");
      super.attack(op);
   }
   
   public void battleDecisions(DungeonCharacter op)
   {
      Scanner kb = new Scanner(System.in);
      
      super.battleDecisions(op);
      do
      {
         System.out.println("1) Attack Opponent");
         System.out.println("2) Snipe");
         System.out.println("Make your Decision!: ");
         int choice = kb.nextInt();
         switch(choice)
         {
            case 1: attack(op);
                    break;
            case 2: Snipe(op);
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