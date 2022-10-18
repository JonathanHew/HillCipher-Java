import java.util.ArrayList;
import java.util.Scanner;

public class HillCipher {
    public static void main(String args[]) {
        // loop through menu until quit selected
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n-----------Hill Cipher-----------");
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Encrypt Text");
            System.out.println("2. Quit");

            int input = scan.nextInt();

            if (input == 1) {
                Encrypt();
            } else if (input == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please enter a valid choice");
            }
        } // end while
    }// end main

    public static void Encrypt() {
        Scanner scan = new Scanner(System.in);
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String answer = "";
        String plaintext = "";
        String key = "";
        ArrayList<Integer> keyArray = new ArrayList<>();
        ArrayList<Integer> textArray = new ArrayList<>();
        ArrayList<Integer> answerArray = new ArrayList<>();

        System.out.println("You have entered Encrypt!");

        // keep asking for plaintext until 4 letter word entered
        while (true) {
            System.out.println("Please enter plaintext to be encrypted. (4 letters) ");
            plaintext = scan.nextLine().toUpperCase();

            if (plaintext.length() == 4) {
                break;
            } else {
                System.out.println("Plaintext must be 4 letters only!");
            }
        }

        // keep asking key until 4 letter word entered
        while (true) {
            System.out.println("Please enter key to be used in the encryption (4 letters) ");
            key = scan.nextLine().toUpperCase();

            if (key.length() == 4) {
                break;
            } else {
                System.out.println("Key must be 4 letters only!");
            }
        }

        // creating the plaintext matrix
        for (int i = 0; i < plaintext.length(); i++) {
            char letter = plaintext.charAt(i);

            for (int j = 0; j < ALPHABET.length(); j++) {
                if (ALPHABET.charAt(j) == letter) {
                    textArray.add(j);
                }
            }
        }

        // creating the key matrix
        for (int i = 0; i < key.length(); i++) {
            char letter = key.charAt(i);

            for (int j = 0; j < ALPHABET.length(); j++) {
                if (ALPHABET.charAt(j) == letter) {
                    keyArray.add(j);
                }
            }
        }

        // creating the answer matrix
        answerArray.clear();
        answerArray.add(((textArray.get(0) * keyArray.get(0)) + (textArray.get(1) * keyArray.get(2))) % 26);
        answerArray.add(((textArray.get(0) * keyArray.get(1)) + (textArray.get(1) * keyArray.get(3))) % 26);
        answerArray.add(((textArray.get(2) * keyArray.get(0)) + (textArray.get(3) * keyArray.get(2))) % 26);
        answerArray.add(((textArray.get(2) * keyArray.get(1)) + (textArray.get(3) * keyArray.get(3))) % 26);

        answer = "";
        // creating the encrytped string using the answer matrix
        for (int i = 0; i < answerArray.size(); i++) {
            answer = answer + ALPHABET.charAt(answerArray.get(i));
        }

        System.out.println("Plaintext: " + plaintext + " Encrypted using Key: " + key + " = " + answer);
    }// end Encrypt()
}// end CaesarCipher
