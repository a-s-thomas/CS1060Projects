import java.util.*;
import java.io.*;

public class DiceGame {
    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("src/DiceGameOutput.txt");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter how many sides the die will have: ");
        int numSides = in.nextInt();
        System.out.println("Please enter how many players: ");
        int numPlayers = in.nextInt();
        List<Player> players = new ArrayList<>(numPlayers);

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("please enter player " + i + "'s name: ");
            String name = in.next();
            Die die = new Die(numSides);
            Player player = new Player(name, die);
            players.add(player);
        }

        for (int i = 0; i < numPlayers; i++) {
            Player player = players.get(i);
            player.die.roll(player.die.getNumSides());
            try {
                output.write("Player " + player.name + " rolled a "
                        + player.die.getValue() + " on a "
                        + player.die.getNumSides() + " sided die. \n");
            } catch (IOException e) {
                System.out.println("I'm sorry, I couldn't find the output file");
            }
        }

        try {
            output.write("\n");
        } catch (IOException e) {
            System.out.println("I'm sorry, I couldn't find the output file");
        }
        List<Integer> winners = decideWinner(players);
        if (winners.size() == 1) {
            Player winPlayer = players.get(winners.getFirst());
            try {
                output.write(winPlayer.name + " won the game.");
                output.close();
            } catch (IOException e) {
                System.out.println("I'm sorry, I couldn't find the output file");
            }
        } else {
            try {
                output.write("Players ");
                for (int i = 0; i < winners.size() - 1; i++) {
                    Player tiePlayer = players.get(winners.get(i));
                    output.write(tiePlayer.name + " and ");
                }
                Player lastTiePlayer = players.get(winners.getLast());
                output.write(lastTiePlayer.name + " tied the game.");
                output.close();
            } catch (IOException e) {
                System.out.println("I'm sorry, I couldn't find the output file");
            }
        }
    }

    //List.remove is the best way I could figure to keep it from getting the index of the first player with the winning roll repeatedly
    @SuppressWarnings("SuspiciousListRemoveInLoop")
    public static List<Integer> decideWinner(List<Player> playerList) {
        /*I figure this method using sort is better than a huge tree of if statements
         * this takes the list of players, creates a 1:1 list of their rolls,
         * and another list to be sorted, and gets the highest roll from the sorted list
         * to find in the rolls list, which should have the same index as the player
         * who got that roll, thus finding the winner, or returning multiple indexes
         * if there's a tie*/
        List<Integer> playerRolls = new ArrayList<>();
        List<Integer> rollComparison = new ArrayList<>();
        List<Integer> winnerIndex = new ArrayList<>();
        for (int i = 0; i < playerList.size(); i++) {
            Player player = playerList.get(i);
            playerRolls.add(player.die.getValue());
            rollComparison.add(player.die.getValue());
        }
        rollComparison.sort(Comparator.reverseOrder());
        int winningRoll = rollComparison.getFirst();
        for (int i = 0; i < rollComparison.size(); i++) {
            if (playerRolls.get(i) == winningRoll) {
                winnerIndex.add(playerRolls.indexOf(winningRoll));
                playerRolls.remove(i);
                playerRolls.add(i, 0);
            }
        }
        return winnerIndex;
    }
}