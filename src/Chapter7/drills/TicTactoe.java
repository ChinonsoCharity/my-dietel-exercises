package Chapter7.drills;

public class TicTactoe {
    public static void main(String[] args) {
      char[][]  ticTacToe={{ 'X', 'O', 'O'},{'X','X','X','F'},{'O', 'X','O'}};
      for(int row = 0; row<ticTacToe.length;row++){
        for(int column = 0; column < ticTacToe[row].length;column++){
            System.out.print( ticTacToe[row][column] + " " );
        }
          System.out.println();
      }

        for (char[] chars : ticTacToe) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }


    }
}
