package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
static final String projectFilesPath="C:\\Users\\Chethan\\eclipse-workspace";
    public static void displayMenu()
   {
System.out.println("****************************************************");
System.out.println("\tWelcome to lockedMe.com secure app");
System.out.println("\tDeveloped by :Chethan Gowda M");
System.out.println("****************************************************");
    System.out.println("\t\t1. Display all files");
    System.out.println("\t\t2. Add a new file");
    System.out.println("\t\t3. delete the file");
    System.out.println("\t\t4. Search a file");
    System.out.println("\t\t5. exit");
   }
    public static void getAllFiles()
    {
    File folder = new File(projectFilesPath);
    File[] listofFiles = folder.listFiles();
   
    if(listofFiles.length>0)
      {
    System.out.println("Files list displayed below:\n");
    for(var l:listofFiles)
    {
    System.out.println(l.getName());
    }
      }
    else
    {
    System.out.println("folder is empty");
    }
   }
   public static void createFiles()
   {
try
{
Scanner obj = new Scanner(System.in);
String fileName;
System.out.println("enter file name");
fileName = obj.nextLine();

int linesCount;
System.out.println("enter how many lines in the file:");
linesCount = Integer.parseInt(obj.nextLine());

FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
for(int i=1;i<=linesCount;i++)
 {
System.out.println("enter file line:");
fw.write(obj.nextLine()+"\n");
 }
System.out.println("file creaed successfully");
fw.close();
}
catch (Exception e) {

//TODO:handle exception
}
   }
public static void deleteFiles()
{
Scanner obj = new Scanner(System.in);
String fileName;
System.out.println("enter the file name:");
fileName = obj.nextLine();
File f = new File(projectFilesPath+"\\"+fileName);
if(f.exists())
   {  
f.delete();
System.out.println("file deleted successfully");

   }
else
     {
System.out.println("file does not exist");
     }
}
public static void searchFiles()
   {
try
{
Scanner obj = new Scanner (System.in);
   String fileName;
   System.out.println("enter the file name");
   fileName = obj.nextLine();
   ArrayList <String> allFilesName = new ArrayList<>();
   File folder = new File (projectFilesPath);
   File[]listofFiles = folder.listFiles();
   if(listofFiles.length>0)
   {
   for(var l:listofFiles)
     {
    allFilesName.add(l.getName());
     }
   }
File f = new File (projectFilesPath+"\\"+fileName);
if(allFilesName.contains(fileName))
  {
System.out.println("file is available");
  }
else  
  {
System.out.println("file is not available");
  }
}
catch(Exception e)
  {
       }
   
   }
   
}


