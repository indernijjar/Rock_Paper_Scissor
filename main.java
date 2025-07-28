import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String userChoice = " ";
        String computerChoice = " ";

        int num;
        int userWins = 0;
        int computerWins = 0;
        boolean playAgain = true;

        System.out.println("WELCOME TO ROCK, PAPER, SCISSORS!");

        while(playAgain){

            System.out.println("Your turn: ");
            userChoice = input.nextLine();

            num = random.nextInt(3);
            if(num == 0){
                computerChoice = "Rock";
            }
            if(num == 1){
                computerChoice = "Paper";
            }
            if(num == 2){
                computerChoice = "Scissors";

             }

            System.out.println("Computer turn: " + computerChoice);

            if(userChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Scissors") && computerChoice.equals("Paper")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Rock") && computerChoice.equals("Scissors")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Paper") && computerChoice.equals("Rock")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Rock") && computerChoice.equals("Paper")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Paper") && computerChoice.equals("Scissors")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            if(userChoice.equals("Scissors") && computerChoice.equals("Rock")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
         
            }

    
}
if(userWins == computerWins){
    System.out.println("The series is a tie.");
}
if(userWins > computerWins){
    System.out.println("User wins the series!");
}
if(userWins < computerWins){
    System.out.println("Computer wins the series!");
    }
 
}

}