public abstract class Monster extends DungeonCharacter
{
   protected double chanceToHeal;
   protected int minHeal;
   protected int maxHeal;
   
   public Monster(String name, int hitPoints, int attackSpeed, double chanceToHit, double chanceToHeal)
   {
      super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
      this.chanceToHeal = chanceToHeal;
      this.maxHeal = maxHeal;
      this.minHeal = minHeal;
   }
   
   public void heal()
   {
      //can it heal?
      boolean cheal = (Math.random() <= this.chanceToHeal) && (this.hitPoints > 0);
      if(canHeal)
      {
         int healPoints = (int)(Math.random() * (this.maxHeal - this.minHeal + 1) + this.minHeal;
         addHitPoints(healPoints);
         System.out.println(this.name + "healed itself for " + healPoints + "hp. \n" +
                            "Total hitpoints remaining are: " + this.hitPoints + "\n");
      }
   }  
   
   public void removeHitPoints(int hitPoints)
   {
      super.removeHitPoints(hitPoints);
      heal();
   }
}