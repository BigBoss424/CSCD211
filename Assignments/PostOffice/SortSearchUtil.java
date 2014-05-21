//  This utility class holds sorting and searching routines  
public class SortSearchUtil
{
//  Selection sort for an array of integers _______________
   public static void selectionSort(int[] array)
   {
      int current, indexSmallest, position;
      int temp;
      for (position = 0; position < array.length - 1; position++)
      {
         indexSmallest = position;
         for (current = position + 1; current < array.length; current++)
         {
            if (array[current] < array[indexSmallest])
            {
               indexSmallest = current;
            }
         } // end for
         temp = array[position];
         array[position] = array[indexSmallest];
         array[indexSmallest] = temp;
      } // end for       
   }
	

	
//  Selection sort for an array of doubles _______________
   public static void selectionSort(double[] array)
   {
      int curPos, indexSmallest, start;
      double temp;
      for (start = 0; start < array.length - 1; start++)
      {
         indexSmallest = start;
         for (curPos = start + 1; curPos < array.length; curPos++)
         {
            if (array[indexSmallest] > array[curPos])
            {
               indexSmallest = curPos;
            }
         } // end for
         temp = array[start];
         array[start] = array[indexSmallest];
         array[indexSmallest] = temp;
      } // end for       
   }

// //  Selection sort for an array of Strings _______________
//    public static void selectionSort(String[] array)
//    {
//       int current, indexSmallest, position;
//       String temp;
//       for (position = 0; position < array.length - 1; position++)
//       {
//          indexSmallest = position;
//          for (current = position + 1; current < array.length; current++)
//          {
//             if (array[current].compareTo(array[indexSmallest]) < 0) 
//             {
//                indexSmallest = current;
//             }
//          } // end for
//          temp = array[position];
//          array[position] = array[indexSmallest];
//          array[indexSmallest] = temp;
//       } // end for       
//    }





//  Selection sort for an array of strings _______________
 //      public static void selectionSort(String[] array)
//       {
//          int curPos, indexSmallest, start;
//          String temp;
//          for (start = 0; start < array.length - 1; start++)
//          {
//             indexSmallest = start;
//             for (curPos = start + 1; curPos < array.length; curPos++)
//             {
//                if (array[indexSmallest].compareTo(array[curPos]) > 0)
//                {
//                   indexSmallest = curPos;
//                }
//             } // end for
//             temp = array[start];
//             array[start] = array[indexSmallest];
//             array[indexSmallest] = temp;
//          } // end for       
//       }


//  Selection sort for an array of Comparable objects _______________
 
   public static void selectionSort(Comparable[] array)
   {
      int curPos, indexSmallest, start;
      Comparable temp;
      for (start = 0; start < array.length - 1; start++)
      {
         indexSmallest = start;
         for (curPos = start + 1; curPos < array.length; curPos++)
         {
            if (array[indexSmallest].compareTo(array[curPos]) > 0)
            {
               indexSmallest = curPos;
            }
         } // end for
         temp = array[start];
         array[start] = array[indexSmallest];
         array[indexSmallest] = temp;
      } // end for       
   }


// ___________________________________________________

   public static void insertionSort(int[] array)
   {
      for (int index = 1; index < array.length; index++)
      {
         int key = array[index];
         int position = index;
      
         while (position > 0 && key < array[position - 1])
         {
            array[position] = array[position - 1];
            position--;
         
         } // end while...
      
         array[position] = key;
      } // end for...
   } 

// ___________________________________________________

   public static void insertionSort(double[] array)
   {
      for (int index = 1; index < array.length; index++)
      {
         double key = array[index];
         int position = index;
      
         while (position > 0 && key < array[position - 1])
         {
            array[position] = array[position - 1];
            position--;
         
         } // end while...
      
         array[position] = key;
      } // end for...
   } // end main...

// ________________________________________________________

   public static void insertionSort(String[] array)
   {
      for (int index = 1; index < array.length; index++)
      {
         String key = array[index];
         int position = index;
      
         while (position > 0 && key.compareTo(array[position - 1]) < 0)
         {
            array[position] = array[position - 1];
            position--;
         
         } // end while...
      
         array[position] = key;
      } // end for...
   } // end insertion sort...

// ________________________________________________________

   public static void insertionSort(Comparable[] array)
   {
      for (int index = 1; index < array.length; index++)
      {
         Comparable key = array[index];
         int position = index;
      
         while (position > 0 && key.compareTo(array[position - 1]) < 0)
         {
            array[position] = array[position - 1];
            position--;
         
         } // end while...
      
         array[position] = key;
      } // end for...
   } // end main... 



// ___________________________________________________   	
   public static int linearSearch(int[] array, int target)
   {
   
      for (int x = 0; x < array.length; x++)
      {
         if (array[x]== target)
         {
            return x;
         }
      }
   
      return -1;
   
   }

	
	
// ___________________________________________________   	
   public static int linearSearch(char[] array, char target)
   {
   
      for (int x = 0; x < array.length; x++)
      {
         if (array[x]== target)
         {
            return x;
         }
      }
   
      return -1;
   
   }
// ___________________________________________________   	
   public static boolean linearSearch(double[] array, double target)
   {
   
      for (int x = 0; x < array.length; x++)
      {
         if (array[x]== target)
         {
            return true;
         }
      }
   	
      return false;
   
   }

 // ___________________________________________________   	
   public static boolean linearSearch(String[] array, String target)
   {
   
      for (int x = 0; x < array.length; x++)
      {
         if (array[x].equals(target))
         {
            return true;
         }
      }
   	
      return false;
   
   }

	//  ____________________________________________________________
	
   public static boolean linearSearch(Comparable[] array, Comparable target)
   {
   
      for (int x = 0; x < array.length; x++)
      {
         if (array[x].compareTo(target) == 0)
         {
            return true;
         }
      }
   	
      return false;
   
   }


  

// ___  Binary search for an array on ints... _________________   	
   public static int binarySearch(int[] array, int target)
   {
      int high = array.length - 1;
      int low = 0;
      int mid = 0;
   	
      while (low <= high)
      {
         mid = (low + high) / 2;  // Find the mid-point...
      	
      	// Determine which half contains the entry...
         if (array[mid] > target)
         {
            high = mid - 1; //  It's in the first half...
         }        
         else if(array[mid] < target)
         {
            low = mid + 1; //  It's in the last half...
         }
         else 
         {
            return mid;
         }
      } 
      return -1;
   }
   
   public static int binarySearch(double[] array, double target)
   {
      int high = array.length - 1;
      int low = 0;
      int mid = 0;
   	
      while (low <= high)
      {
         mid = (low + high) / 2;  // Find the mid-point...
      	
      	// Determine which half contains the entry...
         if (array[mid] > target)
         {
            high = mid - 1; //  It's in the first half...
         }        
         else if(array[mid] < target)
         {
            low = mid + 1; //  It's in the last half...
         }
         else 
         {
            return mid;
         }
      } 
      return -1;
   }




       // ___________________________________________________   	
//       public static int binarySearch(String[] array, String target)
//       {
//          int high = array.length - 1; 
//          int low = 0;
//          int mid = 0;
//       	
//          while (low <= high)
//          {
//          	// Find the mid-point...
//             mid = (low + high) / 2;
//          	
//          	// Determine which half contains the entry...
//             if (array[mid].compareTo(target) > 0)
//             {
//                high = mid - 1; //  It's in the first half...
//             }        
//             else if (array[mid].compareTo(target) < 0)
//             {
//                low = mid + 1; //  It's in the last half...
//             }
//             else 
//             {
//                return mid;
//             }
//          } 
//          return -1;
//       }
   
   
 	
   public static int binarySearch(Comparable[] array, Comparable target)
   {
      int high = array.length - 1;
      int low = 0;
      int mid = 0;
   	
      while (low <= high)
      {
      	// Find the mid-point...
         mid = (low + high) / 2;
      	
      	// Determine which half contains the entry...
         if (array[mid].compareTo(target) > 0)
         {
            high = mid - 1; //  It's in the first half...
         }        
         else if (array[mid].compareTo(target) < 0)
         {
            low = mid + 1; //  It's in the last half...
         }
         else 
         {
            return mid;
         }
      } 
      return -1;
   }




} // end class...

