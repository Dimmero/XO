package Game;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        Players player1 = new Players();
        Players player2 = new Players();

        Board game = new Board();

        String playerName1 = player1.setName();
        String playerName2 = player2.setName();
while(!game.winner()) {
    game.initGame();

    for (int i = 0; i < 9; i++) {
        isTrue = true;
        game.chooseNumber(player1, player2);
        while (isTrue) {
            int choice = sc.nextInt();
            if (game.isAble(choice)) {
                game.setChar(choice, player1, player2);
                game.printBoard();
                if (game.winner() && game.isFirstPlayer) {
                    System.out.println(playerName1 + " you are the BEST!!!");
                    return;
                } else if (game.winner() && !game.isFirstPlayer) {
                    System.out.println(playerName2 + " you are the BEST!!!");
                    return;
                }

                if (!game.congrads(player1, player2)){
                    return;
                }
                game.isFirstPlayer = !game.isFirstPlayer;
                isTrue = false;
            } else {
                System.out.println("Please try again");
                continue;
            }
        }
    }
    System.out.println("DRAW");
    game.isFirstPlayer = !game.isFirstPlayer;
}
    }
}
