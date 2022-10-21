import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decryptor {


    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        Scanner coolScanner = new Scanner(System.in);

        String decryptor = "";
        String name = "";

        List<String> names = new ArrayList<String>();

        names.add("Blaise Pisano");
        names.add("Charlie Howcroft");
        names.add("Josefine Pisano");

        System.out.println("What is your name. :)");
        name = myScanner.nextLine();


        if(names.contains(name)){

            System.out.println("Hello. What do you want to decrypt?");
            decryptor = coolScanner.nextLine();

            decryptor = decryptor.replaceAll("~@@42q", "a");
            decryptor = decryptor.replaceAll("fg#>m09", "b");
            decryptor = decryptor.replaceAll("g2ro", "c");
            decryptor = decryptor.replaceAll("5oasd", "d");
            decryptor = decryptor.replaceAll("9%UEgb5", "e");
            decryptor = decryptor.replaceAll("fhgp", "f");
            decryptor = decryptor.replaceAll("pl9u", "g");
            decryptor = decryptor.replaceAll("p4o2", "h");
            decryptor = decryptor.replaceAll("p1xz0", "i");
            decryptor = decryptor.replaceAll("xl87", "j");
            decryptor = decryptor.replaceAll("8`kdl", "k");
            decryptor = decryptor.replaceAll("bl2o", "l");
            decryptor = decryptor.replaceAll("5201", "m");
            decryptor = decryptor.replaceAll("asd/;a", "n");
            decryptor = decryptor.replaceAll("::::;;;:::", "o");
            decryptor = decryptor.replaceAll("sJJJ", "p");
            decryptor = decryptor.replaceAll("!~~~BB", "q");
            decryptor = decryptor.replaceAll("@~~@", "r");
            decryptor = decryptor.replaceAll("_--_", "s");
            decryptor = decryptor.replaceAll(";:asdb;;", "t");
            decryptor = decryptor.replaceAll("_65sa", "u");
            decryptor = decryptor.replaceAll("lpdsmIT-_", "v");
            decryptor = decryptor.replaceAll("'':%5", "w");
            decryptor = decryptor.replaceAll("gfg_%", "x");
            decryptor = decryptor.replaceAll(";kflida2", "y");
            decryptor = decryptor.replaceAll("=0jbs23", "z");

            System.out.println(decryptor);
        }
    }
}