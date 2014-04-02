public class EnumLabDriver
{
   public static final int SIZE = 52;
   public static final int CARDS = 2;
   
   public static void main(String [] args)
   {
      int hand1Score;
      int hand2Score;
      int count = 0;
      
      Card [] hand1 = new Card[2];
      Card [] hand2 = new Card[2];
      Card [] decl = new Card[SIZE];
      
      EnumLabUtils.fillDeck(deck);
      EnumLabUtils.shuffle(deck);
      
      for(int x = 0; x < CARDS; x++)
      {
         hand1[x] = EnumLabUtils.dealCards(deck, count);
         hand2[x] = EnumLabUtils.dealCards(deck, count + 1);
         count += 2;
      }
      
      hand1Score = EnumLabUtils.calcHandScore(hand1);
      hand2Score = EnumLabUtils.calcHandScore(hand2);
      
      EnumLanUtils.displayWinningHand(hand1Score, hand2Score);
   }


}//end main