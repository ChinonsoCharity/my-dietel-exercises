package Chapter11.assignment;

import java.util.*;



public class TicTacToeMain {
    private static ArrayList<Integer> playerPos = new ArrayList<Integer>();
    private static ArrayList<Integer> cpuPos = new ArrayList<Integer>();
    private static final char[][] tttBoard = {
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '},
            {'_', '+', '_', '+', '_'},
            {' ', '|', ' ', '|', ' '}};

    public static void main(String[] args) {
        TicTacToes.printTttBoard(tttBoard);
        while (true) {
            Scanner game = new Scanner(System.in);
            System.out.println("Enter The Game Placement; 1-9");
            int playerPlace = game.nextInt();
            while (playerPos.contains(playerPlace) || cpuPos.contains(playerPlace)) {
                System.out.println("Position taken! Enter a current position");
                playerPlace = game.nextInt();
            }
            placePiece(tttBoard, playerPlace, "Player");
            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random rand = new Random();
            int cpuPlace = rand.nextInt(9) + 1;

            while (playerPos.contains(cpuPlace) || cpuPos.contains(cpuPlace)) {
                cpuPlace = rand.nextInt(9) + 1;
            }

            placePiece(tttBoard, cpuPlace, "CPU");

            printTttBoard(tttBoard);

            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void printTttBoard(char[][] tttBoard) {
        for (char[] row : tttBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int place, String user) {
        char symbol = ' ';
        if (user.equals("Player")) {
            symbol = 'X';
            playerPos.add(place);
        } else if (user.equals("CPU")) {
            symbol = 'O';
            cpuPos.add(place);
        }
        switch (place) {
            case 1 -> tttBoard[0][0] = symbol;
            case 2 -> tttBoard[0][2] = symbol;
            case 3 -> tttBoard[0][4] = symbol;
            case 4 -> tttBoard[2][0] = symbol;
            case 5 -> tttBoard[2][2] = symbol;
            case 6 -> tttBoard[2][4] = symbol;
            case 7 -> tttBoard[4][0] = symbol;
            case 8 -> tttBoard[4][2] = symbol;
            case 9 -> tttBoard[4][4] = symbol;
            default -> {
                break;
            }
        }

    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List buttonRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List leftCross = Arrays.asList(1, 5, 9);
        List rightCross = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(buttonRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(leftCross);
        winning.add(rightCross);

        for (List l : winning) {
            if (playerPos.containsAll(l)) {
                return "Congratulations, You Won!";
            } else if (cpuPos.containsAll(l)) {
                return "CPY wins! Sorry :(";
            } else if (playerPos.size() + cpuPos.size() == 9) {
                return "TIE";
            }
        }
        return "";
    }



    }

