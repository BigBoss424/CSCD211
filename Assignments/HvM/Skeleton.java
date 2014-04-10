public class Skeleton extends Monster
{
   public Skeleton()
   {
      super("Jack the Pumpkin King", 100, 3, 0.8, 0.3, 30, 50, 30, 50);
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + "sweeps his blade at" + op.getName() + ":");
      super.attack(op);
   }
}
