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

        System.out.println("\nWELCOME TO ROCK, PAPER, SCISSORS!");

        while(playAgain){

            for(int i = 0; i < 3; i++){

            System.out.print("\nYour turn: ");
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
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Scissors") && computerChoice.equals("Paper")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Rock") && computerChoice.equals("Scissors")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Paper") && computerChoice.equals("Rock")){
                System.out.println("You Win!");
                userWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Rock") && computerChoice.equals("Paper")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Paper") && computerChoice.equals("Scissors")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
            }
            else if(userChoice.equals("Scissors") && computerChoice.equals("Rock")){
                System.out.println("Computer Wins!");
                computerWins++;
                System.out.println("\nUser Wins: " + userWins + " Computer Wins: " + computerWins);
         
            }
    
            }
             if(userWins == computerWins){
                System.out.println("\nThe series is a tie.");
            }
            else if(userWins > computerWins){
                System.out.println("\nUser wins the series!");
            }
            else if(userWins < computerWins){
                System.out.println("\nComputer wins the series!");
            }

                System.out.println("\nDo you want to play again? (yes/no)");
                userChoice = input.nextLine().trim().toLowerCase();

                if(userChoice.equals("yes")){
                    playAgain = true;
                }

                if(userChoice.equals("no")){
                    playAgain = false;
                }
                }
            }
            }