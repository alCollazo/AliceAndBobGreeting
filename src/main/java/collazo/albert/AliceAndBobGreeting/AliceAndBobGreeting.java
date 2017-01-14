package collazo.albert.AliceAndBobGreeting;

import java.util.Scanner;

public class AliceAndBobGreeting {

    public static void main(String[] args){

        AliceAndBobGreeting response = new AliceAndBobGreeting();

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name? I hope it's Alice or Bob. ");
        String n = userInput.next();

        response.aliceOrBob(n);

    }
    public String aliceOrBob(String s){
        if (s.equalsIgnoreCase("Alice")){
            System.out.println("Hey, Alice!");
            return "Hey, Alice!";
        }
        else if(s.equalsIgnoreCase("Bob")){
            System.out.println("Hey, Bob!");
            return "Hi, Bob!";
        }
        else{
            System.out.println("I don't care about you!");
            return "I don't care about you.";
        }
    }
}
