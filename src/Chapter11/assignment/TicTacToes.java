package Chapter11.assignment;

public class TicTacToes {
    private static char[][] tttBoard = {
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '}};

    public static void printTttBoard(char[][] tttBoard) {
        for (char[] row : TicTacToes.tttBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


}
