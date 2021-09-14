import java.lang.Exception;
import java.util.Scanner;

 class UsernameException extends Exception {

    public UsernameException(String str) {
    	super(str);
        //System.out.println(str);
    }
}

class PasswordException extends Exception {

    public PasswordException(String str) {
    	
        super(str);
    }
}

public class Usernamepass{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        int len = username.length();
        try {
            if(len < 8)
               throw new UsernameException("Username must be greater than 8 characters");
            else if(!password.equals("admin"))
               throw new PasswordException("Incorrect password");
            	
            else
                System.out.println("Login Successful");
        }
        catch (UsernameException u) {
        	System.out.println("Exception Occured"+u);
        }
        catch (PasswordException p) {
        	System.out.println("Exception Occured"+p);
        }
    }
}
 