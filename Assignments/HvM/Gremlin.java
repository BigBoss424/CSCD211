public class Gremlin extends Monster
{
   public Gremlin()
   {
      super("Gizmo the hater", 70, 5, 0.8, 0.4, 15, 30, 20, 40);
   }
   
   public void attack(DungeonCharacter op)
   {
      System.out.println(this.name + " lunges his punch at" + op.getName() + ":");
      super.attack(op);
   }
}
