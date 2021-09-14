import java.io.*;  
import java.util.*;  
class Filecopy {  
 public static void main(String arg[]) 
 {
 try
 {
  Scanner sc = new Scanner(System.in);  
  System.out.print("enter the file to copy:");  
  String file1 = sc.next();  
  System.out.print("file 2: ");  
  String file2 = sc.next();  
  FileReader f1 = new FileReader(file1);  
  FileWriter f2 = new FileWriter(file2, true);  
  int c;  
  while ((c = f1.read()) != -1) {  
   f2.write(c);  
  }  
  System.out.println("----successfully copied----");  
  f1.close();  
  f2.close();  
 }  
 catch(IOException e){
	   System.out.println("Exception");
	  }
 }

}   
