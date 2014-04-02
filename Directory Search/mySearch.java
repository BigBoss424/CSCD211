import java.util.*;
import java.io.*;

public class mySearch
{
  
   public static String input;
   public Scanner kb;
   
   private String fileNameToSearch;
   private List<String> result = new ArrayList<String>();
   
   public String getFileNameToSearch()
   {
      return fileNameToSearch;
   }
   
   public void setFileNameToSearch(String fileNameToSearch)
   {
      this.fileNameToSearch = fileNameToSearch;
   }
   
   public List<String> getResult()
   {
      return result;
   }
   
   public static void main(String [] args)
   {
      mySearch mySearch = new mySearch();
      
      //Scanner kb = new Scanner(System.in);
      
      System.out.println("Welcome to the Directory Search");
      
      options(input);
      
      File parent = new File(input);
      
      /*File allMyFolderObjects[] = parent.listFiles();*/
      
      mySearch.searchDirectory(parent);
      
      int count = mySearch.getResult().size();
      if(count == 0)
      {
         System.out.println("\n No Result Found!");
         
      }
      else
      {
         System.out.println("\n Found" + count + "result!\n");
         for(String matched : mySearch.getResult())
         {
            System.out.println("Found: " + matched);
         }
      }
      
      
   }
   
   
   public static String options(String choice)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter starting directory for the search (like c:\temp): ");
      choice = kb.nextLine();
      System.out.println("Enter the file name (like myFile or enter for all: ");
      choice = kb.nextLine();
      System.out.println("Enter the file extension (like txt or enter for all): ");
      choice = kb.nextLine();
      System.out.println("Enter content to search for (like cscd211 or enter for any): ");
      choice = kb.nextLine();
      System.out.println("Enter last modified date (like 11/21/2013 or enter for any): ");
      choice = kb.nextLine();
      
      return choice;
   }

   public void searchDirectory(File directory, String fileNameToSearch)
   {
      setFileNameToSearch(fileNameToSearch);
      
      if(directory.isDirectory())
      {
         search(directory);
      }else
      {
         System.out.println(directory.getAbsoluteFile() + "is not a directory!");
      }
   }
   
   public void search(File file)
   {
      if(file.isDirectory())
      {
         System.out.println("Searching directory ..." + file.getAbsoluteFile());
         
         if(file.canRead())
         {
            for(File temp : file.listFiles())
            {  
               if(temp.isDirectory())
               {
               search(temp);
               }else
               {
               if(getFileNameToSearch().equals(temp.getName().toLowerCase()))
               {
                  result.add(temp.getAbsoluteFile().toString());
               }
            }
        
         }
      }else
         {
            System.out.println(file.getAbsoluteFile() + "Permission Denied");
         }
    }
  }
   
   /*public void recursiveTraversal(File fileObject)
   {
      if (fileObject.isDirectory())
      {
         indent = getIndent(fileObject);
         System.out.println(indent + fileObject.getName());
         File allFiles[] = fileObject.listFiles();
         for(File aFile : allFiles)
         {
            recursiveTraversal(aFile);
         }
         
      }else if (fileObject.isFile())
      {
         System.out.println(indent + " " + fileObject.getName());
      }
   }
   
   public void traverse()
   {
      recursiveTraversal(fileObject);
   }
   
   private String getIndent(File fileObject)
   {
      String original = originalFileObject.getAbsolutePath();
      String fileStr = fileObject.getAbsolutePath();
      String subString = fileStr.substring(orignal.length(),
                                           fileStr.length());
      String indent = "";
      for(int index = 0; index < subString.length(); index++)
      {
         char aChar = subString.charAt(index);
         if(aChar == File.separatorChar) 
         {
            indent = indent + " ";
         }
      }
      return indent;
   }*/
   
}//end mySearch