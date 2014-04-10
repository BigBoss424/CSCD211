import java.util.Scanner;

public class Thief extends Hero
{
   public Thief()
   {
      super("Thief", 75, 6, 0.8, 20, 40, 0.5);
   }
   
   public void Ambush(DungeonCharacter op)
   {
      double ambush = Math.random();
      if(ambush <= 0.4)
      {
         System.out.println("Ambush was successful!\n" +
                            this.name + "get ready for another turn!");
         this.numTurns += 1;
         attack(op);                   
      }
      else if(ambush >= 0.9)
      {
         System.out.println("!" + op.getName() + "is alerted of your prescence!" + 
                        "\n Countered");
      }
      else
      {
         attack(op);
      }
   }

   public void battleDecisions(DungeonCharacter op)
   {
      Scanner kb = new Scanner(System.in);
      
      super.battleDecisions(op);
      do
      {
         System.out.println("1) Attack Opponent");
         System.out.println("2) Ambush");
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
}//end class
