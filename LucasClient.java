package LucasNumbers;

import java.util.Scanner;
import java.lang.Thread;

public class LucasClient {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] argv)
        throws InterruptedException{
            while (true) {
                System.out.println("Enter the number of numbers (To exit enter q): ");

                if (userInput.hasNextInt()) {
                    int num1 = userInput.nextInt();

                    LucasServer.lucasNumbers(num1);
                    LucasServer.checkDivisibility();

                    Thread.sleep(2000);
                    System.out.println("\n\n\n\n");

                } else if (userInput.hasNext() && userInput.next().equals("q")) {
                    break;
                } else {
                    System.out.println("NaN\n\n");
                }
            }
        }
}



