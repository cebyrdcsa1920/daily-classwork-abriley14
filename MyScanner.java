import java.util.Scanner;

public class MyScanner
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your favorite football team?");
        String team = keyboard.nextLine();
        System.out.println("Nice! I like the" + " " + team + " " + "too.");
        keyboard.close();


    }
}