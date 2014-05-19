/*  Write the 'array220' method in the 'Recursion' class.
	*  Given an array of ints, compute recursively if the array 
	*  contains somewhere a value followed in the array by that value times 10.
	*  For example the array { 1, 3, 42, 7, 70, 0 } contains 7 followed 
	*  immediately by 70 so your recursive method should return 'true'.
	*  Be sure to handle an empty array.
	*/
   public class Recursion
   {
   
     // Your recursive solution goes here -
     //  Write the 'array220' method...
   
      public static boolean array220(int[] nums, int index) 
      {	  
      //  Your code goes here...
         int n = nums.length;
         if(n == 0)
         {
            return false;
         }
         if(index+1 < nums.length && nums[index] == nums[index+1]/10)
           return true;
         else if(index+1 < nums.length)
            return array220(nums, index+1);
         
         return false;
      }
   
   
   }
