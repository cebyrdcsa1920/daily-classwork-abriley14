public class MyScanner
{
    public static void main (String[] args)
    {
        Scanner stream = new Scenner(System.in);
        System.out.println("What is your favorite football team?");
        String team = stream.nextLine();
        System.out.println("Nice! I like the" + " " + team + " " + "too.");
        stream.close();

    }
}