import  java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class Filecpy
{
  
 public static void main(String[] args)
 {
  try{
  Scanner reader=new Scanner(System.in);
  String string;
  System.out.print("Enter the string : ");
  string=reader.nextLine();
  FileWriter fw=new FileWriter("C:\\JAVA\\sample\\example.txt");
  
  fw.write(string);
  fw.close();

  FileReader fr=new FileReader("C:\\JAVA\\sample\\example2.txt");
  
  String str="";
  int i;
  while((i=fr.read())!=-1){
   str+=(char)i;
  }
 
 System.out.print(str);
 }
 
 catch(IOException e){
   System.out.println("Exception");
  }


 }

}
