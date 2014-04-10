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
      Scanner kb = new Scanner(System.in);
      char playAgain = kb.nextChar();
      
      return ((playAgain == 'Y') || (playAgain('y')));
   }
   
   public static void fight(Hero hero, Monster monster)
   {
      char p = 'p';
      System.out.println(hero.getName() + "fights" + monster.getName());
      System.out.println("===========================================");
      while((hero.isAlive()) && (monster.isAlive()) && (p != 'q'))
      {
         hero.battleDecisions(monster);
         if(monster.isAlive())
         {
            monster.attack(hero);
         }
         System.out.println("Press q to quit, any other input continues: ");
         p = kb.nextChar();
      }
      if(!monster.isAlive())
      {
         System.out.println(hero.getName() + "VICTORY!");
      }
      else if(!hero.isAlive())
      {
         System.out.println(hero.getName() + "DEATH!");
      }
      else
      {
         System.out.println("You mad bro?");
      }
   }
}