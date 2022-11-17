import java.util.Scanner;

public class RPS {
    public static void main(String[] args)
    {
        String redo = "";
        boolean end = true;

        Scanner scan = new Scanner(System.in);

        String playerA = getPlayerChoice();
        if (playerA.equals("t")) {
            System.out.println("Wrong input Re-run Game");
            return;
        }

        String playerB = playerB();

        System.out.println("PlayerA: " + playerA);
        System.out.println("PlayerB " + playerB);
        System.out.println("PlayerA " + winVSloss(playerA, playerB) + ".");
        System.out.println("Thanks for Playing! ");

    // Prompts user to play again
        System.out.println("Would you like to play again? [Y/N]");
        redo = scan.nextLine();
        if (redo.equalsIgnoreCase("Y"))
        {
            end = false;
        } else if (redo.equalsIgnoreCase("N"))
        {
            end = true;
            System.out.println("Game is over");
        }while (!end);


    }


    public static String playerB()
    {
        //randomizer
        int rnd = (int) (Math.random() * 3) + 1;
        String p;

        switch (rnd)

        {
            case 1:
                p = "r";
                break;
            case 2:
                p = "p";
                break;
            default:
                p = "s";
        }

        return p;
    }

    public static String getPlayerChoice()

    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter [R,P,S] ");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P")
                || input.equalsIgnoreCase("S"))

        {
            return input;
        } else
        {
            return "t";
        }
    }

    public static String winVSloss(String playerA, String playerB)
    {
        Scanner scan = new Scanner(System.in);
        String redo = "";
        boolean end = true;


        if (playerA.equalsIgnoreCase(playerB))

        {
            return "it's a tie!";
        }

        String winner;
        switch (playerA)
        {
            case "R":
                if (playerB().equalsIgnoreCase("P"))
                {
                    winner = "loses";
                } else
                {
                    winner = "wins";
                }
                break;
            case "p":
                if (playerB.equalsIgnoreCase("R"))
                {
                    winner = "wins";
                } else
                {
                    winner = "loses";
                }
                break;
            default:
                if (playerB.equalsIgnoreCase("P"))
                {
                    winner = "wins";
                } else
                {
                    winner = "loses";
                }
                

        }
        return winner;
    }
}
