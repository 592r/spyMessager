import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryptor {

    /*
    After the success of your calculator we can move onto our next project, a spy messenger!
    We will have to be able to encrypt messages so no one else can read them

    We will make an encrypter (this file) and a decoder (another file)

    In the encrypter we will be able to give the program a message like "Hello Blaise"
    And we should get back the encrypted message "`m22@=d2q>m"
     */

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        Scanner messageScanner = new Scanner(System.in);

        String message; // To store the message being encrypted
        String name = "";
        List<String> names = new ArrayList<String>();

        names.add("Blaise Pisano");
        names.add("Charlie Howcroft");
        names.add("Josefine Pisano");

        System.out.println("What is your name. :)");
        name = myScanner.nextLine();


        if(names.contains(name)) {

            System.out.println("Welcome to your super secret spy encryptor");
            System.out.println("Enter the message you want to encrypt");

            message = messageScanner.nextLine();
            System.out.println("Ok I will Encrypt " + message);
            System.out.println("Here you are.");

            String encryptedMessage = encrypt(message);

        }

    }

    public static String encrypt(String message) {

        message = message.toLowerCase();

        String[] encryptedMessageArray = new String[message.length()];  // creates an array with the length of the message

        String encryptedMessage = "";

        String[] letters = message.split("");


        for(int i = 0; i<letters.length; i++){

            switch (letters[i].toCharArray()[0]) {
                case 'a':
                    encryptedMessageArray[i] = "~@@42q";
                    break;
                case 'b':
                    encryptedMessageArray[i] = "fg#>m09";
                    break;
                case 'c':
                    encryptedMessageArray[i] = "g2ro";
                    break;
                case 'd':
                    encryptedMessageArray[i] = "5oasd";
                    break;
                case 'e':
                    encryptedMessageArray[i] = "9%UEgb5";
                    break;
                case 'f':
                    encryptedMessageArray[i] = "fhgp";
                    break;
                case 'g':
                    encryptedMessageArray[i] = "pl9u";
                    break;
                case 'h':
                    encryptedMessageArray[i] = "p4o2";
                    break;
                case 'i':
                    encryptedMessageArray[i] = "p1xz0";
                    break;
                case 'j':
                    encryptedMessageArray[i] = "xl87";
                    break;
                case 'k':
                    encryptedMessageArray[i] = "8`kdl";
                    break;
                case 'l':
                    encryptedMessageArray[i] = "bl2o";
                    break;
                case 'm':
                    encryptedMessageArray[i] = "5201";
                    break;
                case 'n':
                    encryptedMessageArray[i] = "asd/;a";
                    break;
                case 'o':
                    encryptedMessageArray[i] = "::::;;;:::";
                    break;
                case 'p':
                    encryptedMessageArray[i] = "sJJJ";
                    break;
                case 'q':
                    encryptedMessageArray[i] = "!~~~BB";
                    break;
                case 'r':
                    encryptedMessageArray[i] = "@~~@";
                    break;
                case 's':
                    encryptedMessageArray[i] = "_--_";
                    break;
                case 't':
                    encryptedMessageArray[i] = ";:asdb;;";
                    break;
                case 'u':
                    encryptedMessageArray[i] = "_65sa";
                    break;
                case 'v':
                    encryptedMessageArray[i] = "lpdsmIT-_";
                    break;
                case 'w':
                    encryptedMessageArray[i] = "'':%5";
                    break;
                case 'x':
                    encryptedMessageArray[i] = "gfg_%";
                    break;
                case 'y':
                    encryptedMessageArray[i] = ";kflida2";
                    break;
                case 'z':
                    encryptedMessageArray[i] = "=0jbs23";
                    break;
                default:
                    encryptedMessageArray[i] = letters[i];
                    break;
            }
        }

        encryptedMessage = String.join("",encryptedMessageArray);

        System.out.println(encryptedMessage);

        return encryptedMessage;
    }
}
