
import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");

        String str = input.nextLine().toLowerCase();

        String word = str.substring(str.indexOf("d"), str.indexOf("d") + 3);

        if(word.charAt(0)==word.charAt(2)) {
            System.out.println("dad ");
        }
    }
}

//Using scanner ask user to provide the string value. Print "dad" if the given string
//contains the "dad"
//, but where the middle 'a' char can be any char.
//Example:
//Input the year: testdadtest
//Output :dad
//Input the year: testd7dtest
//Output :dad
//Input the year: testdodtest
//Output :dad
//Input the year: testDudtest
//Output :dad