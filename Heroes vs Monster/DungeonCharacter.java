import java.lang.Math;

public class DungeonCharacter
{
   protected String name;
   protected int hitPoints,
               attackSpeed,
               damageRangeX,
               damageRangeY;
   protected double chanceToHit;
   
               
   public DungeonCharacter()
   {
      this.name = "";
      this.hitPoints = 0;
      this.attackSpeed = 0;
      this.damageRangeX = 0;
      this.damageRangeY = 0;
      this.chanceToHit = 0.0;
      
   }//end DVC
   
   public DungeonCharacter(String name, int hitPoints, int attackSpeed, 
                           int damageRangeX, int damageRangeY, double chanceToHit)
   {
      this.name = name;
      this.hitPoints = hitPoints;
      this.attackSpeed = attackSpeed;
      this.damageRangeX = damageRangeX;
      this.damageRangeY = damageRangeY;
      this.chanceToHit = chanceToHit;
   }//end EVC
   
   public String getName(String name)
   {
      return name;
   
   }//end getName
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getHitPoints(int hitPoints)
   {
      return hitPoints;
   }
   
   public void setHitPoints(int hitPoints)
   { this.hitPoints = hitPoints; }
   
   public int getAttackSpeed(int attackSpeed)
   {
      return attackSpeed;
   }
   
   public void setAttackSpeed(int attackSpeed)
   {
      this.attackSpeed = attackSpeed;
   }
   
   public int getDamageRangeX(int damageRangeX)
   { return damageRangeX;  } 
   
   public void setDamageRangeX(int damageRangeX)
   { this.damageRangeX = damageRangeX; }
   
   public int getDamageRangeY(int damageRangeY)
   { return damageRangeY; }
   
   public void setDamageRangeY(int damageRangeY)
   { this.damageRangeY = damageRangeY; }
   
   public double getChanceToHit(double chanceToHit)
   { return chanceToHit; }
   
   public void setChanceToHit(double chanceToHit)
   { this.chanceToHit = chanceToHit;}
   
   public int attack()
   {
      //Using random to make a percent, and adding .1 so can reach 1.0
      double failChance = Math.random() + .1; 
      // Looked this code up here(http://stackoverflow.com/questions/363681/generating-random-numbers-in-a-range-with-java)
      // Gets a random integer between the max and min damage
      int damage = this.damageRangeX + (int)(Math.random() * ((this.damageRangeY - this.damageRangeX) + 1));
      if (this.chanceToHit < failChance)
      {
         System.out.println("The attack failed.");
         return 0;
      }else
      {
         System.out.println("The attack hit for " + damage + " points.");
         //returns the damage done to apply to the other creature
         return damage;
      }
   }//end of attack metho


}//end DungeonCharacter