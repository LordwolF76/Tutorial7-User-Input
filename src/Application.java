import java.util.Scanner;

/**
 * Created by LordwolF on 7/31/2016.
 */
public class Application {
    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        //output the prompt
        System.out.println("Enter an Integer);

        //wait for user's input
        int value  = input.nextInt();


        //tell them what they entered
        System.out.println("You entered: " + value);


    }
}
