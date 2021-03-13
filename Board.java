package endterm_project;

public class Board {
    char[][] board = {{' ', '|', ' ', '|', ' '}, //game appereance
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    public void boardPrint(){ //2 for each loops to print out 5x5 matrix
        for(char[] row : board){
            for(char element : row){
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public boolean setValuePlayer1(int input){ //setting to exact point
        switch(input){
            case 1:
                if(board[0][0] == 'O' || board[0][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][0] = 'X';
                return true;
            case 2:
                if(board[0][2] == 'O' || board[0][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][2] = 'X';
                return true;
            case 3:
                if(board[0][4] == 'O' || board[0][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][4] = 'X';
                return true;
            case 4:
                if(board[2][0] == 'O' || board[2][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][0] = 'X';
                return true;
            case 5:
                if(board[2][2] == 'O' || board[2][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][2] = 'X';
                return true;
            case 6:
                if(board[2][4] == 'O' || board[2][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][4] = 'X';
                return true;
            case 7:
                if(board[4][0] == 'O' || board[4][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][0] = 'X';
                return true;
            case 8:
                if(board[4][2] == 'O' || board[4][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][2] = 'X';
                return true;
            case 9:
                if(board[4][4] == 'O' || board[4][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][4] = 'X';
                return true;
            default:
                return false;
        }
    }
    public boolean setValuePlayer2(int input){
        switch(input){
            case 1:
                if(board[0][0] == 'O' || board[0][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][0] = 'O';
                return true;
            case 2:
                if(board[0][2] == 'O' || board[0][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][2] = 'O';
                return true;
            case 3:
                if(board[0][4] == 'O' || board[0][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[0][4] = 'O';
                return true;
            case 4:
                if(board[2][0] == 'O' || board[2][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][0] = 'O';
                return true;
            case 5:
                if(board[2][2] == 'O' || board[2][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][2] = 'O';
                return true;
            case 6:
                if(board[2][4] == 'O' || board[2][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[2][4] = 'O';
                return true;
            case 7:
                if(board[4][0] == 'O' || board[4][0] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][0] = 'O';
                return true;
            case 8:
                if(board[4][2] == 'O' || board[4][2] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][2] = 'O';
                return true;
            case 9:
                if(board[4][4] == 'O' || board[4][4] == 'X'){
                    System.out.println("You can't enter here");
                    return false;
                }
                board[4][4] = 'O';
                return true;
            default:
                return false;
        }
    }
}
