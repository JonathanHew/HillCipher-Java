import java.util.Scanner;

public class HillCipher {
    public static void main(String args[]) {
        // loop through menu until quit selected
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n-----------Hill Cipher-----------");
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Encrypt Text");
            System.out.println("2. Decrypt Text");
            System.out.println("3. Quit");

            int input = scan.nextInt();

            if (input == 1) {
                Encrypt();
            } else if (input == 2) {
                Decrypt();
            } else if (input == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please enter a valid choice");
            }
        } // end while
    }// end main

    public static void Encrypt() {
        System.out.println("You have entered Encrypt!");

    }// end Encrypt()

    public static void Decrypt() {
        System.out.println("You have entered Decrypt!");
        
    }// end Decrypt()

    
}// end CaesarCipher