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
		}
		
	}
	
	public static void sortLetters(String filename)
	{
	
	}
	
	public static void printLetters()
	{
	
	}

}