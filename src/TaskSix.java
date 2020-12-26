import java.util.Scanner;
public class TaskSix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs are in the basket? ");

        int eggNum = input.nextInt();

        while(eggNum >0) {

            System.out.println("How many eggs did you eat today? ");
            int total = input.nextInt();
            eggNum-=total;
            System.out.println("There are " + eggNum +  " eggs left");
        }



}}


//Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs
//are eaten at the end of the day and keep asking the same question until your number of
//eggs is equaled to 0 in the box.
//Example:
//Input: 13
//How many eggs did you eat today?
//2
//There are 11 eggs left
//How many eggs did you eat today?
//5
//There are 6 eggs left
//How many eggs did you eat today?
//6
//You have finished all the eggs