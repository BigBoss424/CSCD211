public class SortSearchUtil
{
   public static void selectionSort(Comparable [] data)
   {
      int min;
      
      for(int index = 0; index < data.length-1;index++)
      {
         min = index;
         for(int scan = index+1; scan < data.length; scan++)
            if(data[scan].compareTo(data[min])) < 0)
               min = scan;
         swap(data, min, index);
      }  
   }
   
   public static void swap(Comparable [] data; int index1. int index2)
   {
      Comparable temp = data[index1];
      data[index1] = data[index2];
      data[index2] = temp;
      
   }
   
   public static Comparable binarySearch(Comparable[] data, Comparable target)
   {
      Comparable result = null;
      int first = 0, last = data.length-1, mid;
      
      while(result == null && first <= last)
      {
         mid = (first + last) /2;
         if(data[mid].compareTo(target) == 0)
            result = data[mid];
         else
            if (data[mid].compareTo(target) > 0)
               last = mid - 1;
            else
               first = mid + 1;
      
      }
      return result;
   }
   
   
}