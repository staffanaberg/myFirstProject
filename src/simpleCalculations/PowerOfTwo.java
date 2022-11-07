package simpleCalculations;

import java.util.Scanner;

public class PowerOfTwo {


    //main-metod som startar programmet
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv lite text");
        String text = scan.nextLine();

        System.out.println("Skriv ett tal");
        //Ett tal läses in.
        int number = Integer.parseInt(scan.nextLine());

        //Räkna ut kvadraten (som är talet multiplicerat med sig själv)
        int square = number * number;

        //Skriv ut kvadraten
        System.out.println("Kvadraten av " +number +" är " +square);

        System.out.println("Du skrev texten: " +text);


    }




}
