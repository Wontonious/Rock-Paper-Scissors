import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Randomizer
        int computerChoice = (int)(Math.random()*3) + 1;

        int rock = 1;
        int paper = 2;
        int scissors =3;
        String win = "You win! Congratulations! Please rerun to try again!";
        String lose = "You lost! Wanna try again? Rerun the program!";
        String tie = "It's a tie! Rerun the program and you might win this time!";

        //Opening Text
        System.out.println("Let's play a simple game of Rock Paper Scissors!\nPlease enter one of the following options:\n1.\trock\n2.\tpaper\n3.\tscissors");

        //Scanner
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();

        //Results when computerChoice = rock
        if(computerChoice == rock&&(userChoice.equals("rock")||userChoice.equals("Rock")||userChoice.equals("1"))){
            System.out.println("The opponent played rock!" +
                    "\n..." +
                    tie);
        }
        else if(computerChoice== rock&&(userChoice.equals("paper")||userChoice.equals("Paper")||userChoice.equals("2"))){
            System.out.println("The opponent played rock!" +
                    "..." +
                    win);
        }
        else if(computerChoice== rock&&(userChoice.equals("scissors")||userChoice.equals("Scissors")||userChoice.equals("3"))){
            System.out.println("The opponent played rock!" +
                    "..." +
                    lose);
        }
        //Results when computerChoice = paper
        else if(computerChoice== paper&&(userChoice.equals("rock")||userChoice.equals("Rock")||userChoice.equals("1"))){
            System.out.println("The opponent played paper!" +
                    "..." +
                    lose);
        }
        else if(computerChoice== paper&&(userChoice.equals("paper")||userChoice.equals("Paper")||userChoice.equals("2"))){
            System.out.println("The opponent played paper!" +
                    "..." +
                    tie);
        }
        else if(computerChoice== paper&&(userChoice.equals("scissors")||userChoice.equals("Scissors")||userChoice.equals("3"))){
            System.out.println("The opponent played paper!" +
                    "..." +
                    win);
        }
        //Results when computerChoice = scissors
        else if(computerChoice== scissors&&(userChoice.equals("rock")||userChoice.equals("Rock")||userChoice.equals("1"))){
            System.out.println("The opponent played scissors!" +
                    "..." +
                    win);
        }
        else if(computerChoice== scissors&&(userChoice.equals("paper")||userChoice.equals("Paper")||userChoice.equals("2"))){
            System.out.println("The opponent played scissors!" +
                    "..." +
                    lose);
        }
        else if(computerChoice== scissors&&(userChoice.equals("scissors")||userChoice.equals("Scissors")||userChoice.equals("3"))) {
            System.out.println("The opponent played scissors!" +
                    "..." +
                    tie);
        }
        //When user inputs invalid option
        else {
            System.out.println("Invalid option, please rerun the program and try again");
        }
    }
}
