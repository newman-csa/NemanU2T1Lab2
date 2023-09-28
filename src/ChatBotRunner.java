import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String arg)
    {
        Scanner scn = new Scanner(System.in);   
        ChatBot winter = new ChatBot("Winter", 21);

        System.out.println("What is your name?: ");
        String name = scn.next();
        winter.greeting(name);
        winter.weather();
        System.out.println("What is your favorite number?: ");
        int favNum = scn.nextInt();
        winter.favoriteNumber(favNum);
        System.out.println("Give me three intgers to add: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        System.out.println("Ok, the sum of those numbers is "winter.addNumbers(num1, num2, num3));
        System.out.println("That number converted to meters is "+ winter.convertFeetToMeters(winter.addNumbers(num1, num2, num3)));
        System.out.println(winter.goodbye());

    }
}
    
