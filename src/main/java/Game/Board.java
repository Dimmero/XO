package Game;

public class Board {
    boolean isFirstPlayer = true;
    char[][] board = new char[3][3];

    public Players player;

    public void initGame() {
        board[0][0] = '1';
        board[0][1] = '2';
        board[0][2] = '3';
        board[1][0] = '4';
        board[1][1] = '5';
        board[1][2] = '6';
        board[2][0] = '7';
        board[2][1] = '8';
        board[2][2] = '9';

        printBoard();
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("");
            System.out.println("-------------");
        }
    }

    void selection(int selection, char sign) {

        switch (selection) {
            case 1: {
                board[0][0] = sign;
                break;
            }
            case 2: {
                board[0][1] = sign;
                break;
            }
            case 3: {
                board[0][2] = sign;
                break;
            }
            case 4: {
                board[1][0] = sign;
                break;
            }
            case 5: {
                board[1][1] = sign;
                break;
            }
            case 6: {
                board[1][2] = sign;
                break;
            }
            case 7: {
                board[2][0] = sign;
                break;
            }
            case 8: {
                board[2][1] = sign;
                break;
            }
            case 9: {
                board[2][2] = sign;
                break;
            }
        }
    }

    public boolean isAble(int selection){
        boolean isTrue = true;
        switch (selection) {
            case 1: {
                if (board[0][0] == 'X' || board[0][0] == 'O'){
                    return false;
                }
                return isTrue;
            }
            case 2: {
                if (board[0][1] == 'X' || board[0][1] == 'O'){
                    return false;
                }
                return isTrue;
            }case 3: {
                if (board[0][2] == 'X' || board[0][2] == 'O'){
                    return false;
                }
                return isTrue;
            }case 4: {
                if (board[1][0] == 'X' || board[1][0] == 'O'){
                    return false;
                }
                return isTrue;
            }case 5: {
                if (board[1][1] == 'X' || board[1][1] == 'O'){
                    return false;
                }
                return isTrue;
            }case 6: {
                if (board[1][2] == 'X' || board[1][2] == 'O'){
                    return false;
                }
                return isTrue;
            }case 7: {
                if (board[2][0] == 'X' || board[2][0] == 'O'){
                    return false;
                }
                return isTrue;
            }case 8: {
                if (board[2][1] == 'X' || board[2][1] == 'O'){
                    return false;
                }
                return isTrue;
            }case 9: {
                if (board[2][2] == 'X' || board[2][2] == 'O'){
                    return false;
                }
                return isTrue;
            }
        }
        return isTrue;
    }

    public boolean winner(){
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' || board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
        {
            return true;
        } else  if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' || board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
        {
            return true;
        } else  if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' || board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
        {
            return true;
        } else  if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' || board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
        {
            return true;
        } else  if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' || board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
        {
            return true;
        } else  if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' || board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
        {
            return true;
        } else  if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' || board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
        {
            return true;
        } else  if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
        {
            return true;
        } else {
            return false;
        }
    }


    public boolean isBoardFull(){
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O' ) {
                    isFull = false;
                }
            }
        }
        return isFull;
    }


public void setChar(int choice, Players player1, Players player2) {
    if (isFirstPlayer) {
        selection(choice, player1.getCharX());
    } else {
        selection(choice, player2.getCharO());
    }
}

boolean win = true;
public boolean congrads(Players player1, Players player2){
    if (winner() && isFirstPlayer) {
        System.out.println(player1.name + " you are the BEST!!!");
return win;
    } else if (winner() && !isFirstPlayer) {
        System.out.println(player2.name + " you are the BEST!!!");

    }
return true;
}

    public void chooseNumber(Players player1, Players player2){
        if (isFirstPlayer) {
            System.out.println(player1.name + ", please choose a number!");
        } else {
            System.out.println(player2.name + ", please choose a number!");
        }
    }



}