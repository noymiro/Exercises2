import java.util.Scanner;

public class Exe7 {
    static final int ARRAY_SIZE = 9;
    static char[] gameBoard = new char[ARRAY_SIZE];
    static char player1 = 'x';
    static char player2 = 'o';
    static char negative = '-';

    public static void main(String[] args) {
        char player;
        do {
            if (players()  == 1) {
                player = player1;
            } else {
                player = player2;
            }

        } while (placeSymbolOnBoard(gameBoard, getPositionFromUser(), player));
        {
            printBoard(gameBoard);
            getPositionFromUser();
            placeSymbolOnBoard(gameBoard , getPositionFromUser() , player);


        } //System.out.print(player + "win");
    }


    public static int players() {
        int players = 1;
        return players;
    }

    public static void printBoard(char[] gameBoard) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print(gameBoard[i]);
        }
    }

    public static boolean isAvailable(char[] gameBoard, int position) {

        boolean contains = true;
        if (gameBoard[position] == player1 || gameBoard[position] == player2) {
            contains = false;
        }
        return contains;
    }

    public static int getPositionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Please choose a number between 1-9: ");
        int chosenNumber = scanner.nextInt();
        while (isAvailable(gameBoard, chosenNumber) == false);{
            if (chosenNumber <= 0 || chosenNumber > 9) {
                System.out.println(" Wrong number. Please try again. ");
                System.out.println("the place is taken");
                chosenNumber = scanner.nextInt();
            }
        }

        return chosenNumber;
    }

    public static char checkWinner(char[] gameBoard, char player) {
        char winner = negative;
        if (gameBoard[1] == player && gameBoard[2] == player && gameBoard[3] == player) {
            winner = player;
        }
        if (gameBoard[4] == player && gameBoard[5] == player && gameBoard[6] == player) {
            winner = player;
        }
        if (gameBoard[7] == player && gameBoard[8] == player && gameBoard[9] == player) {
            winner = player;
        }
        if (gameBoard[1] == player && gameBoard[4] == player && gameBoard[7] == player) {
            winner = player;
        }
        if (gameBoard[2] == player && gameBoard[5] == player && gameBoard[8] == player) {
            winner = player;
        }
        if (gameBoard[3] == player && gameBoard[6] == player && gameBoard[9] == player) {
            winner = player;
        }
        if (gameBoard[1] == player && gameBoard[5] == player && gameBoard[9] == player) {
            winner = player;
        }
        if (gameBoard[3] == player && gameBoard[5] == player && gameBoard[7] == player) {
            winner = player;


        }
        return winner;
    }

    public static boolean placeSymbolOnBoard(char[] gameBoard, int position, char player) {
        boolean checkVictory = true;
        int i;
        for (i = 2; i <= 11; i++) {
            if (i % 2 == 0) {
                position = player1;
            } else {
                position = player2;
            }

            checkWinner(gameBoard, player);
            if (checkVictory = false) {
                System.out.println("no winner");
            }

        } return checkVictory;
    }
}
    //public static boolean placeSymbolOnBoard (char[] gameBoard , int position , char player) {
            //    boolean checkVictory = true;
            //  boolean isAvailable = isAvailable(gameBoard , position);
            //if (isAvailable ==false) {
            //  System.out.println(gameBoard);
            ///checkWinner(gameBoard , player);
            // System.out.println(gameBoard);
            //checkVictory = false;
            //    }

            // printBoard(gameBoard);
            //      return checkVictory;





