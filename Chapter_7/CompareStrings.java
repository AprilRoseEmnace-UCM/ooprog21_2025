import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        String fixedName = "Carmen";     
        String userInput;                

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name> ");
        userInput = keyboard.nextLine(); 

        if (fixedName.equals(userInput)) {
            System.out.println(fixedName + " equals " + userInput);
        } else {
            System.out.println(fixedName + " does not equal " + userInput);
        }
    }
}
