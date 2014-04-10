import java.util.Scanner;

public class Sorceress extends Hero
{  
   public final int MIN_HEAL = 25;
   public final int MAX_HEAL = 50;
   
   public Sorceress()
   {
      super("Sorceress", 75, 5, 0.7, 25, 50, 0.3);
   }
   
   public void healHitPoints()
   {
      int hp = (int)(Math.random() * 26.0) + 25;
      addHitpoints(hp);
      System.out.println(this.name + " added (" + hp + ") points.\n" +
                         "Remaining hitpoints: " + this.hitPoints);
      System.out.println();                   
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + " summons a fireball and directs it at" + op.getName() + ":");
      super.attack(op);
   }
   
  public void battleDecisions(DungeonCharacter op)
   {
      Scanner kb = new Scanner(System.in);
      
      super.battleDecisions(op);
      do
      {
         System.out.println("1) Attack Opponent");
         System.out.println("2) Heal");
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
      }while((this.numTurns > 0) && (this.hitPoints >0) && (op.hitPoints() > 0));
   }
}//end class