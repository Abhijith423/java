
import java.util.Random;
import java.util.Scanner;

public class MiniCricket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int balls = 0;
        int wickets = 0;

        System.out.println("================================");
        System.out.println("       🏏 MINI CRICKET GAME");
        System.out.println("            5 OVERS");
        System.out.println("================================");

        while (balls < 30 && wickets == 0) {

            System.out.println("\nSelect Your Shot:");
            System.out.println("0 - Dot Ball");
            System.out.println("1 - Single");
            System.out.println("2 - Double");
            System.out.println("3 - Three Runs");
            System.out.println("4 - Four");
            System.out.println("5 - Five Runs");
            System.out.println("6 - Six");
            System.out.println("Any other number - EXIT");

            System.out.print("\nEnter your number: ");

            int player = sc.nextInt();

            switch (player) {

                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:

                    int computer = random.nextInt(7);

                    System.out.println("\nYou selected: " + player);
                    System.out.println("Computer selected: " + computer);

                    balls++;

                    if (player == computer) {

                        wickets = 1;
                        System.out.println("\nWICKET! YOU ARE OUT!");

                    } else {

                        score += player;

                        System.out.println("Runs scored: " + player);
                    }

                    break;

                default:

                    System.out.println("Match abandoned!");
                    balls = 30;
                    break;
            }

            System.out.println("\n================================");
            System.out.println("          SCOREBOARD");
            System.out.println("================================");

            System.out.println("Score   : " + score + "/" + wickets);
            System.out.println("Overs   : " + (balls / 6) + "." + (balls % 6));
            System.out.println("Balls   : " + balls + "/30");
            System.out.println("================================");
        }

        System.out.println("\n🏏 INNINGS COMPLETED!");

        System.out.println("FINAL SCORE: " + score + "/" + wickets);

        if (wickets == 1) {
            System.out.println("Reason: All Out!");
        } else {
            System.out.println("Reason: 5 Overs Completed!");
        }

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
