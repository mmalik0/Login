import java.util.Scanner;

public class Login {
public static void main(String[] args){
	
	String Username = "malik";
	String Password = "mmalik";
	// for (int x = 0; x < 10; x++) {} (To create a loop)
	System.out.println("Please enter your Username");
	Scanner keyboard = new Scanner(System.in);
	Username = keyboard.next();
	
	
	if(Username.compareTo("malik") == 0) {
		System.out.println("Please enter your Password");
		Scanner keyboard1 = new Scanner(System.in);
		
		Password = keyboard1.next();
		if(Password.compareTo("mmalik") == 0) {
			System.out.println("Welcome " + Username);
			
		} else {
			System.out.println("Your password is incorrect");
		}
	} else {
		System.out.println("Your username is incorrect");
	}
     keyboard.close();
}

}

