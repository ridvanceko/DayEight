import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        int number1 = input.nextInt();
        System.out.println("Enter second number ");
        int number2 = input.nextInt();
        int division = 0;

        while(number1%3==0 && number2%5==0) {
            System.out.println(division);
            division++;
        }
        System.out.println("Divisible 3 and 5 " + division);

    }
}


//Using a scanner ask the user to provide starting and ending numbers. Print the numbers
//divisible by 3 and 5 between given number AND print count of those numbers which is
//divisible by 3 and 5.
//EXAMPLE:
//First number: 5
//Second number: 65
//Output:
//15
//30
//45
//60
//Total number that divisible by 3 and 5 is 4.