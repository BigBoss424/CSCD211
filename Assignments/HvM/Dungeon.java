import java.util.Scanner;

public class Dungeon
{
   public static void main(String [] args)
   {
      do
      {
         Hero hero = chooseHero();
         Monster monster = generateMonster();
         fight(hero, monster);
      }while(playAgain());
   }
   
   public static Hero chooseHero()
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Choose a hero:");
      System.out.println("1) Warrior");
      System.out.println("2) Sorceress");
      System.out.println("3) Thief");
      System.out.println("4) Archer");
      
      int choice = kb.nextInt();
      
      switch(choice)
      {
         case 1: return new Warrior();
         case 2: return new Sorceress();
         case 3: return new Thief();
         case 4: return new Archer();
      }
      System.out.println("Invalid choice, returning Archer");
      return new Archer();
   }
   
   public static Monster generateMonster()
   {
      int choice = (int)(Math.random() * 3.0) + 1;
      switch(choice)
      {
         case 1: return new Ogre();
         case 2: return new Gremlin();
         case 3: return new Skeleton();
      }
      System.out.println("Invalid choice, returning Skeleton by default");
      return new Skeleton();
   }
   
   public static boolean playAgain()
   {
      String playAgain;
      Scanner kb = new Scanner(System.in);
      System.out.println("Play again?");
      playAgain = kb.next();
      
      if(playAgain.equals("Yes") || (playAgain.equals("yes")))
      {
         return true;
      }else
      
      return false;
      //return ((playAgain == "Yes") || (playAgain("yes")));
   }
   
   public static void fight(Hero hero, Monster monster)
   {  Scanner kb = new Scanner(System.in);
      String pause = "pause";
      System.out.println(hero.getName() + " fights " + monster.getName());
      System.out.println("===========================================");
      while((hero.isAlive()) && (monster.isAlive()) && (pause != "quit"))
      {
         hero.battleDecisions(monster);
         if(monster.isAlive())
         {
            monster.attack(hero);
         }
         System.out.println("Enter quit to quit, any other input continues: ");
         pause = kb.nextLine();
         if(pause.equals("Quit") || pause.equals("quit"))
         {
            System.out.println("You mad bro?");
            System.exit(0);
         }
         
      }
      if(!monster.isAlive())
      {
         System.out.println(hero.getName() + " is Victorious!");
      }
      else if(!hero.isAlive())
      {
         System.out.println(hero.getName() + " DEATH!");
      }
      else
      {
         System.out.println("You mad bro?");
      }
   }
}