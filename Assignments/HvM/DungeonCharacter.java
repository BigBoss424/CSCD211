public abstract class DungeonCharacter
{
   protected String name;
   protected int hitPoints;
   protected int attackSpeed;
   protected double chanceToHit;
   protected int damageMin;
   protected int damageMax;
   
   public DungeonCharacter(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax)
   {
      this.name = name;
      this.hitPoints = hitPoints;
      this.attackSpeed = attackSpeed;
      this.chanceToHit = chanceToHit;
      this.damageMin = damageMin;
      this.damageMax = damageMax;
   
   } 
   
   public String getName()
   {
      return this.name;
   }
   
   public int getHitPoints()
   {
      return this.hitPoints;
   }
   
   public int getAttackSpeed()
   {
      return this.attackSpeed;
   }
   
   public void addHitPoints(int hitPoints)
   {
      if(hitPoints <= 0)
      {
         System.out.println("Hitpoint amount must be positive.");
      }
      else
      {
         this.hitPoits += hitPoints;
      }  
   }
   
   public void removeHitPoints(int hitPoints)
   {
      if(hitPoints < 0)
      {
         System.out.println("Hitpoint amount must be positive.");
      }
      else if(hitPoints > 0)
      {
         this.hitPoints -= hitPoints;
         if(this.hitPoints < 0)
         {
            this.hitPoints = 0;
         }
         System.out.println(getName() + "hit" + "for" + hitPoints + "points damage.");
         System.out.println(getName() + " now has" + getHitPoints() + "hp remaining.");
         System.out.println();
      }
      if(this.hitPoints == 0)
      {
         System.out.println(this.name + " has been exterminated");
      }
   }
   
   public boolean isAlive()
   {
      return this.hitPoints > 0;
   }
   
   public void attack(DungeonCharacter op)
   {
      boolean canAttack = Math.random() <= this.chanceToHit;
      if(canAttack)
      {
         int damage = (int)(Math.random() * (this.damageMax - this.damageMin + 1)) +
         this.damageMin;
         op.substractHitPoints(damage);
         
         System.out.println();
      }
      else
      {
         System.out.println(getName() + "'s attack on" + op.getName() + "missed!");
         System.out.println();
      }
   }
}//end DungeonCharacter