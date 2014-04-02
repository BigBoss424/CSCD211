public abstract class Thief extends Hero
{
   protected int supriseAttack;
   public Thief()
   {
      super.name = " ";
      super.hitPoints = 75;
      super.attackSpeed = 6;
      super.chanceToHit = 0.8;
      super.damageRangeX = 20;
      super.damageRangeY = 40;
      super.chanceToBlock = 0.4;
      //this.supriseAttack = 34;
      
   }//end DVC
   
   public Thief(String name, int hp, int aS, double cTHit, int minD, int maxD, double cTBlock)
   {
      super.name = name;
      super.hitPoints = hp;
      super.chanceToHit = cTHit;
      super.damageRangeX = minD;
      super.damageRangeY = maxD;
      super.chanceToBlock = cTBlock;
   }//end EVC
   
   public void supriseAttack()
   {
   
   }

}//end Thief