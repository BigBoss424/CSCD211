import java.util.Scanner;

public class PostOffice
{
	Letter[] letters = new Letter();
	
	private PostOffice()
	{
		
	}
	
	public static void readLetters(String filename)
	{
		String sWork;
		int iWork = 0;
		int count = 0;
		
		//Create Strings for each variable
		/*
			Such as the address
		*/
		
		
		
		while(fin.hasNext())
		{
			count++;
			fin.nextLine();
		}
		fin.close();
		
		count = count / 7;
		
		ltrAra = new Letter[count];
		
		fin = FileUtil.openInputFile(filename);
		while(fin.hasNext())
		{
		/*
			to extract specific data from a file
			toName = 
		*/
		
		//how to extract the city from the third line
		/*
			toName = fin.nextLine();
			toStreet = fin.nextLine();
			sWork = fin.nextLine();
			iWork = sWork.indexOf(",");
			toCity = sWork.subString(0, iWork);
			iWork = iWork + 2;
			toState = sWork.substring(iWork, iWork + 2);
			iWork = iWork + 3;
			toZip = sWork.substring(iWork);
		*/
		
      String toName = fin.nextLine();
      String toStreet = fin.nextLine();
      String sWork = fin.nextLine();
      String iWork = sWork.indexOf(",");
      String toCity = sWork.substring(0,iWork);
      iWork = iWork + 2;
      String toState = sWork.substring(iWork, iWork + 2);
      iWork = iWork + 3;
      toZip = sWork.substring(iWork);
      
      String foName = fin.nextLine();
      String foStreet = fin.nextLine();
      String fWork = fin.nextLine();
      String 
		ltrAra[count] = new Letter(//variable names);
		count ++;
		}
		fin.close();
	}
	
	public static void sortLetters(String filename)
	{
		SortSearchUtil.selectionSort(ltrAra);
	}
	
	public static void printLetters()
	{
		for(Letter ltr : ltrAra)
		{
			System.out.println(ltr);
			System.out.println();
		}
	}

}