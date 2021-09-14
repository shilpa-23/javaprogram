import  java.io.FileReader;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;  
public class Filewrite {  
    public static void main(String args[]){  
    	String fname;
    	Scanner scan = new Scanner(System.in);
    	
    	  String string;
    	  System.out.print("Enter the string : ");
    	  string=scan.nextLine();
         try{    
           FileWriter fw=new FileWriter("C:\\JAVA\\sample\\example2.txt");    
           fw.write(string);    
           fw.close();    
          }catch(Exception e){
        	  System.out.println(e);
        	  }    
          
          System.out.println("----Success----"); 
System.out.print("Enter File Name to Open: ");
fname = scan.nextLine();


String line = " ";
try
{
   
    FileReader fr= new FileReader(fname);
    
    String str="";
    int i;
    while((i=fr.read())!=-1){
     str+=(char)i;
    }
   
   System.out.print(str);
   
    
}
catch(IOException ex)
{
    System.out.println("Error reading file named '" + fname + "'");
}
}
}