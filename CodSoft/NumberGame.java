import java.util.*;
public class NumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int userGuess=0;
        int randomNumber;

        randomNumber = rand.nextInt(100);
        // System.out.println(randomNumber);

        // Now taking the guess input from user
       
        while(userGuess!=randomNumber) {
            System.out.print("Please enter your guess : ");
            userGuess = input.nextInt();
            if(userGuess<=100 && userGuess>=0) {
               
                if(userGuess<randomNumber) {
                    System.out.println("It's higher than what you guessed ! ");
                    System.out.println("---------------------------------------");
                }
                else if(userGuess>randomNumber) {
                    System.out.println("It's lesser than what you guessed ! ");
                    System.out.println("---------------------------------------");

                }
                else {
                    System.out.println("Hoooreeyyy ! You Guessed it correct ! ");
                    System.out.println("---------------------------------------");

                }
            }
            else {
                System.out.println("Please enter number between 1-100");
            }
        }
        
        
        



    }


}