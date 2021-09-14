import java.util.Scanner;
class Publisher{
Scanner sc=new Scanner(System.in);
   String name;
   Publisher(){
  name=" ";
  }
   void publisher()
   {
	   System.out.println("____ENTER DETAILS____");
   System.out.println("Enter The Name Of Publisher:");
   name=sc.next();
   
   }
}

class Book extends Publisher{
Scanner sc= new Scanner(System.in);
String book;
int bookid;
Book()
{
book="";
bookid=0;
}
void book()
{
	System.out.println("Enter The  BookId:");
	  bookid=sc.nextInt();
  System.out.println("Enter The Name Of Book:");
  book=sc.next();
  
   }
}
class Fiction extends Book{
String Fic;
Fiction()
{
Fic=" ";
}
void fiction()
{
System.out.println("Fiction or Nonfiction:");
Fic=sc.next();
}
}
class Literature extends Book{
String lit;
Literature()
{
lit="";
}
void literature()
{
System.out.println("Enter The Type Of Literature:");
lit=sc.next();
}


  public static void main(String args[]){
	  
  Literature ob=new Literature();
  Fiction f=new Fiction();
  ob.publisher();
  ob.book();
  f.fiction();
  ob.literature();
  System.out.println("---BOOK DETAILS---");

  System.out.println("Name of Publisher    :"+ob.name);
  System.out.println("Book Id              :"+ob.bookid);
  System.out.println("Name of Book         :"+ob.book);
  System.out.println("Fiction or Nonfiction:"+f.Fic);
  System.out.println("Literature Type      :"+ob.lit);

 
 
  }
}  
