import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is your speed? ");

        int currentSpeed = input.nextInt();
        System.out.println("Target Speed! ");
        int targetSpeed = input.nextInt();

        while(currentSpeed <= targetSpeed) {
            targetSpeed=targetSpeed/10;

            System.out.println("You need " + targetSpeed + " second to reach your speed ");
        }
        targetSpeed++;
    }
}

//The user using a scanner enters the current speed and target
//speed . In every 1-sec car's speed will increase 10mil. Please
//find the total number of sec to reach your target speed using a
//while loop.
//Example:
//CurrentSpeed: 6
//Target Speed: 20
//Output: You need 2 sec to reach target speed.