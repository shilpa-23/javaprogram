
import java.io.*;
import java.util.*;
import java.io.IOException;

class Oddfile
{
 
 public static void main(String[] args)
 {
  try{
      int n,f=0;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the no. of integerss : ");
      n=reader.nextInt();
      int[] a=new int[n];
      System.out.print("Enter the integers : ");
      for(int i=0;i<n;i++){
          a[i]=reader.nextInt();
      }
     
     
  FileWriter fw=new FileWriter("C:\\JAVA\\sample\\integer.txt");
  for(int i=0;i<n;i++){
    fw.write(a[i]+ "\n" );
  }
  fw.close();
  BufferedReader fr = new BufferedReader(new FileReader("C:\\JAVA\\sample\\integer.txt"));
 
 
     FileWriter feven=new FileWriter("C:\\JAVA\\sample\\evenfile.txt");
     FileWriter fodd=new FileWriter("C:\\JAVA\\sample\\oddfile.txt");
 
 
  String i;
  while((i=fr.readLine())!=null){
       if(Integer.parseInt(i)%2==0){
           f=1;
           if(f==1)
           feven.write(i+ " ");
       }
        else
           fodd.write(i+ " ");
    }
 
fr.close();
feven.close();
fodd.close();
System.out.println("Copying Done");

 }
 catch(IOException e){
   System.out.println("Exception");
  }



 }

}


