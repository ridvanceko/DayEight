
import java.util.Scanner;
public class TaskOne {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        int number = input.nextInt();
        int number2 = 1;

        while(number>5) {
            System.out.println(number2);
            number2+=1;
            number--;
        }
    }
}

//Using Scanner ask user to provide any int number and print
//multiplication table of given number
//Input number: 5
//Output :
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//...
//...
//5*10 = 50
