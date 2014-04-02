public interface ListInterfaces
{
   public int getSize();
   
   public boolean isEmpty();
   
   public void add(Comparable newItem);
   
   public void addOrdered(Comparable newItem);
   
   public void add(int index, Comparable newItem);
   
   public void remove(int index);
   
   public void removeAll();
   
   public String toString();


}//end ListInterfaces