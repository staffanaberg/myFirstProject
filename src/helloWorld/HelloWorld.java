package helloWorld;

import java.util.Scanner;

//Definition av vår klass
public class HelloWorld {

    //Metod för att köra programmet
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());


        //int number = 10;
        int secondNumber = number + number;

        System.out.println("Second number är: " + secondNumber);
        System.out.println("Number är: " + number);

        if (number < secondNumber) {
            System.out.println("If-satsen var sann!");
        }

        while (number <= secondNumber) {
            System.out.println("while-loopen är igång!!! " + number);
            number += 1;
        }

        System.out.println("Number är nu: " + number);
        System.out.println("Nu är vi klara med programmet");

    }

}
