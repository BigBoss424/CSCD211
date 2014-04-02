public abstract class DungeonCharacter
{
   protected int hitPoints,
                 attackSpeed,
                 minDamage,
                 maxDamage;
   protected double chanceToHit;
   protected String name;
   
   public DungeonCharacter(String name, int hp, int as, int maxd, int mind, double c2hit)
   {
      this.name = name;
      this.hitPoints = hp;
      this.minDamage = mind;
      this.maxDamage = maxd;
      this.chanceToHit = c2hit;
      this.attackSpeed = as;
   
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getHitPoints()
   {
      return this.hitPoints;
   }
   
   public void setHitPoints(int hitPoints)
   {
      this.hitPoints = hitPoints;
   }
   
   public int getAttackSpeed()
   {
      return this.attackSpeed;
   }
   
   public void setAttackSpeed(int attackSpeed)
   {
      this.attackSpeed = attackSpeed;
   }
   
   public int getMinDamage()
   {
      return this.minDamage;
   }
   
   public void setMinDamage(int minDamage)
   {
      this.minDamage = minDamage;
   }
   
   public int getMaxDamage()
   {
      return this.maxDamage;
   }
   
   public void setMaxDamage(int maxDamage)
   {
      this.maxDamage = maxDamage;
   }
   
   public double getChance2Hit()
   {
      return this.chanceToHit;
   }
   
   public void setChance2Hit(double chance2Hit)
   {
      this.chanceToHit = chance2hit;
   }
   
   public boolean isAlive()
   {
      return this.hitPoints > 0;
   }
   
   
   

}//end DungeonCharacter