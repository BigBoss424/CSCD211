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
         System.out.println(this.name + "missed his opportunity for Omnislash \n");
      }
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println
   }
   
}