import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random generator = new Random();

        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;

        int clientChoice, computerChoice;

        do{
            System.out.println("1: Rock\n2: Paper\n3: Scissors\n-1 to quit:");
            clientChoice = console.nextInt();
            computerChoice = generator.nextInt(3)+1;

            if(clientChoice == ROCK){
                if(computerChoice == ROCK){
                    System.out.println("Rock vs Rock: TIE game!");
                }
                else if(computerChoice == PAPER){
                    System.out.println("Rock vs Paper: You Lost!");
                    }
                else if(computerChoice == SCISSORS){
                    System.out.println("Rock vs Scissors: You Won!");
                }
            }
            else if(clientChoice == PAPER){
            if(computerChoice == ROCK){
                    System.out.println("Paper vs Rock: You Won!");
                }
                else if(computerChoice == PAPER){
                    System.out.println("Paper vs Paper: TIE game!");
                }
                else if(computerChoice == SCISSORS){
                    System.out.println("Paper vs Scissors: You Lost!");
                }
            }
        }while(clientChoice >0);
        System.out.println("Thanks for playing the game!");

        System.out.println("Rock Paper Scissors!");
    }
}