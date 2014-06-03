import java.lang.Math;

public abstract class Monster extends DungeonCharacter
{
   double skillChance;
   double healChance;
   int minHeal;
   int maxHeal;
   
   public Monster()
   {
      super.name = "";
      super.hitPoints = 0;
      super.attackSpeed = 0;
      super.damageRangeX = 0;
      super.damageRangeY = 0;
      super.chanceToHit = 0.0;
      this.skillChance = 0.0;
      this.healChance = 0.0;
      this.minHeal = 0;
      this.maxHeal = 0;
   } //DVC
   
   public Monster(String name, int hp, int attSp, int dMin, int dMax, double hit, double skill, double heal, int minH, int maxH)
   {
      super.name = name;
      super.hitPoints = hp;
      super.attackSpeed = attSp;
      super.damageRangeX = dMin;
      super.damageRangeY = dMax;
      super.chanceToHit = hit;
      this.skillChance = skill;
      this.healChance = heal;
      this.minHeal = minH;
      this.maxHeal = maxH;
   } //EVC
   
   public void setHealChance(double hc){
      this.healChance = hc;
   }
   public void setMinHeal(int minH){
      this.minHeal = minH;
   }
   public void setMaxHeal(int maxH){
      this.maxHeal = maxH;
   }
   public double getHealChance(){
      return this.healChance;
   }
   public int getMinHeal(){
      return this.minHeal;
   }
   public int getMaxHeal(){
      return this.maxHeal;
   } // Getters and Setters
   
   
   @Override 
   public String toString(){
      return name + "is a monster.";
   }// Overwritten toString
   
   
   public void heal(){
      double failChance = Math.random() + .1; 
      int heal = this.damageRangeX + (int)(Math.random() * ((this.minHeal - this.maxHeal) + 1));
      if (super.hitPoints <= 0)
      {
         return;
      }
      if (this.healChance < failChance)
      {
         System.out.println("Could not heal.");
      }else
      {
         super.hitPoints = super.hitPoints + heal;
         System.out.println("The monster healed " + heal + " points. It is now at " + super.hitPoints + " hit points.");
      }
   } // End of Heal method
}