import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");

        String word = input.nextLine();

        String a="a";
        int length=word.length();
        int w=1;
        while(w<=length){
            word=a+word.substring(w); // RIDVAN A+IDVAN // AAaaan
            System.out.println(word);
            a=a.concat("a"); //aaa
            w++;
        }


    }
}


//Using the scanner ask the user to provide String value. Then replace all the
//char of the String with 'a' using loop and print in every step.
//For example:
//Input: Success
//Output:
//"auccess"
//"aaccess"
//“aaacess”
//...
//“aaaaaaa”



//        public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter a String value:");
//        String word=input.next();
//        String a="a";
//        int length=word.length();
//        int w=1;
//        while(w<=length){
//            word=a+word.substring(w); // RIDVAN A+IDVAN // AAaaan
//            System.out.println(word);
//            a=a.concat("a"); //aaa
//            w++;
//        }
//    }