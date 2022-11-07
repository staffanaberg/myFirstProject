package simpleCalculations;

import java.util.Scanner;

public class MinutesAndSeconds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String text = scan.nextLine();

        int hours = Integer.parseInt(scan.nextLine());

        int minutes = hours * 60;
        int seconds = minutes * 60;


        System.out.println("For " +hours +" hours it takes:");
        System.out.println(minutes +" minutes");
        System.out.println(seconds +" seconds");
        //System.out.println(text);




    }

}
