import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a Username ");

        String userName = input.nextLine();
        System.out.println("Create a Password ");

        String expectedPassword = input.nextLine();
        System.out.println("Welcome to your account ");
        System.out.println("Provide your Username ");

        String actualUsername = input.nextLine();
        System.out.println("Provide your password ");
        String actualPassword = input.nextLine();

        int countOfLogin = 1;

        boolean isCorrectUserAndPassword = false;


    }
}

//Using a scanner ask the user to input username and password. Create
//the two variables for the expected username and password. if user input
//is not matching with the expected username and password ask the user
//again until they are correct. (Optional: if you want to make it a little
//complicated. You can allow the user only three times to enter the wrong
//username or password. if it is more than 3 times you can print “your
//account is on hold now. Try after 5 min”)