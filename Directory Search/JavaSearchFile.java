import java.io.*;

import java.util.*;

class JavaSearchFile

{

static Vector<File> v;



 public static void main(String args[]) throws ArrayIndexOutOfBoundsException

 {



 // Create a file pointing a folder

 File f=new File(args[0]);



 // Create a vector of found files

 v=new Vector<File>();

 

 // Print the search starting

 System.out.println("\nStarting search....\n-------------------------\n");

 

 // Go search args[1] (2nd arg) in dir f

 search(f,args[1]);

 

 // Print the found files

 print();

 

 }



 public static void search(File file,String name)

 {

 



 // Print where the search is going on..

 System.out.println("Searching in "+file.getAbsolutePath());



  // Check if file is directory/folder

  if(file.isDirectory())

  {





   if(file.getName().contains(name))

   {

   

   // Add the file to found files vector

   v.addElement(file);

   

   }



  // Get all files in the folder

  File[] files=file.listFiles();





   for(int i=0;i<files.length;i++)

   {

   try

   {



    if(files[i].isDirectory())

    {

    

    // Go search for files if dir

    search(files[i],name);

    

    }



    else

    {



     if(files[i].getName().toLowerCase().contains(name.toLowerCase()))

     {

     

     // Add the found file to vector

     v.addElement(files[i]);

     

     }

   

    }

    

   }catch(Exception e){}

   

   }



  }

 

 }



 public static void print()

 {

 

 // Create a file array of v size

 File[] f=new File[v.size()];

 

 // Copy vector data into f

 v.copyInto(f);



 // Print the results

 System.out.println("\nResults");

 System.out.println("------------------------------------------");

 

  // Loop till end of size

  for(File k:f)

  {

  

  // Print the file path

  System.out.println("Found at "+k.getAbsolutePath());

  

  }

 

 }



}