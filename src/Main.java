import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int computerScore = 0;
        int playerScore = 0;
        String win = "You win! Congratulations!";
        String lose = "You lost!";
        String tie = "It's a tie!";


        //Scanner
        Scanner scan = new Scanner(System.in);
        String userChoice;

        //Opening Text
        System.out.println("Let's play a simple game of Rock Paper Scissors!");
        System.out.println("Please enter one of the following options:\n1.\trock\n2.\tpaper\n3.\tscissors\n4.\tstop");


        userChoice = scan.nextLine();
        do {
            if (!userChoice.equals("stop")) {


                //Randomizer
                int computerChoice = (int) (Math.random() * 3) + 1;

                //Results when computerChoice = rock
                if (computerChoice == rock && (userChoice.equals("rock") || userChoice.equals("Rock") || userChoice.equals("1"))) {
                    System.out.println("The opponent played rock!" +
                            "\n..." +
                            tie);
                } else if (computerChoice == rock && (userChoice.equals("paper") || userChoice.equals("Paper") || userChoice.equals("2"))) {
                    System.out.println("The opponent played rock!" +
                            "..." +
                            win);
                    playerScore++;
                } else if (computerChoice == rock && (userChoice.equals("scissors") || userChoice.equals("Scissors") || userChoice.equals("3"))) {
                    System.out.println("The opponent played rock!" +
                            "..." +
                            lose);
                    computerScore++;
                }
                //Results when computerChoice = paper
                else if (computerChoice == paper && (userChoice.equals("rock") || userChoice.equals("Rock") || userChoice.equals("1"))) {
                    System.out.println("The opponent played paper!" +
                            "..." +
                            lose);
                    computerScore++;
                } else if (computerChoice == paper && (userChoice.equals("paper") || userChoice.equals("Paper") || userChoice.equals("2"))) {
                    System.out.println("The opponent played paper!" +
                            "..." +
                            tie);
                } else if (computerChoice == paper && (userChoice.equals("scissors") || userChoice.equals("Scissors") || userChoice.equals("3"))) {
                    System.out.println("The opponent played paper!" +
                            "..." +
                            win);
                    playerScore++;
                }
                //Results when computerChoice = scissors
                else if (computerChoice == scissors && (userChoice.equals("rock") || userChoice.equals("Rock") || userChoice.equals("1"))) {
                    System.out.println("The opponent played scissors!" +
                            "..." +
                            win);
                    playerScore++;
                } else if (computerChoice == scissors && (userChoice.equals("paper") || userChoice.equals("Paper") || userChoice.equals("2"))) {
                    System.out.println("The opponent played scissors!" +
                            "..." +
                            lose);
                    computerScore++;
                } else if (computerChoice == scissors && (userChoice.equals("scissors") || userChoice.equals("Scissors") || userChoice.equals("3"))) {
                    System.out.println("The opponent played scissors!" +
                            "..." +
                            tie);
                }


                System.out.println("+------------------+");
                System.out.println("|Player Score: " + playerScore + "   |" + "\n|Computer Score: " + computerScore + " |");
                System.out.println("+------------------+");
                userChoice = scan.nextLine();
            }

            System.out.println("Thank you for playing!");
            System.out.println("+------------------------+");
            System.out.println("|Final Player Score: " + playerScore + "   |" + "\n|Final Computer Score: " + computerScore + " |");
            System.out.println("+------------------------+");
        }while (!userChoice.equals("stop")) ;
    }
}
