public class Ogre extends Monster
{
   public Ogre()
   {
      super("Mothafuckin Ogre", 200, 2, 0.6, 0.1, 30, 50, 30, 50);
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + " swings his bat at " + op.getName() + ":");
      super.attack(op);
   }

}