import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int min = 0;
        int max = 100;
        Random r = new Random();
        int attemptLimit = 5;
        int score = 0;
        
        boolean playagain = true;
        
        while(playagain){
            int randomNumber = r.nextInt(max - min + 1)+ min;
            System.out.println("Guess the Number between "+min+" and "+max);
            int attempts = 0;
            boolean guesscorrect = false;

            while(!guesscorrect && attempts < attemptLimit ){
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if(guess == randomNumber){
                    System.out.println("Congrats, you guessed the number in "+attempts+" attempts :)");
                    score++;
                    guesscorrect = true;

                }
                else if(guess < randomNumber){
                    System.out.println("Too low :(");

                }
                else {
                    System.out.println("Too high :(");
                }
            }

            if(!guesscorrect){
                System.out.println("Sorry, you have exceeded the limit :(");
            }

            System.out.println("Your Score: "+score);
            System.out.println("wanna play again? (y/n):");
            String choice = sc.next().toLowerCase();
            playagain = choice.equals("y");
        }
        System.out.println("Thanks for playing :) ");
        sc.close();
    }
}