//   Do not change this class!
public class Tester
{
  /*  Write the 'array220' method in the 'Recursion' class.
	*  Given an array of ints, compute recursively if the array 
	*  contains somewhere a value followed in the array by that value times 10.
	*  For example the array { 1, 3, 42, 7, 70, 0 } contains 7 followed 
	*  immediately by 70 so your recursive method should return 'true'.
	*  Be sure to handle an empty array.
	*/
	public static void main(String[] args)
	{
		int[] nums1 = { 1, 3, 42, 7, 70, 0 };
		System.out.println(Recursion.array220(nums1, 0));
		int[] nums2 = { 30, 3, 42, 2, 0, 10 };
		System.out.println(Recursion.array220(nums2, 0));
		int[] nums3 = {};
		System.out.println(Recursion.array220(nums3, 0));
		int[] nums4 = { 0, -1, 42, 1, 10, 0 };
		System.out.println(Recursion.array220(nums4, 0));
		int[] nums5 = { 0, -5, 50, 1, -10, 0 };
		System.out.println(Recursion.array220(nums5, 0));
		int[] nums6 = { -1, -5, 50, 1, 0, 0 };
		System.out.println(Recursion.array220(nums6, 0));
	}
}
