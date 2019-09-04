import java.util.Scanner;

public class Gameday
{
    public static void main(String[] args)
    {
        System.out.println("Gymboree Prediction");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("C.E. Byrd: ");
        String score1 = keyboard.nextLine();
        System.out.println("Captain Shreve: ");
        String score2 = keyboard.nextLine();
        keyboard.close();
    }
}