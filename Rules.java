package endterm_project;

public class Rules extends sql{
    public int winner(){
        for(char[] row : board){ //all horizontal wins
            if(row[0] == 'X' && row[2] == 'X' && row[4] == 'X'){ //top mid bot hor
                return 1;
            }
            if(row[0] == 'O' && row[2] == 'O' && row[4] == 'O'){ //top mid bot hor
                return 2;
            }
        }
        for(int i =0; i <= 4; i = i+ 2){ //all vertical wins
            if(board[0][i] == 'X' && board[2][i] == 'X' && board[4][i] == 'X'){
                return 1;
            }
            if(board[0][i] == 'O' && board[2][i] == 'O' && board[4][i] == 'O'){
                return 2;
            }
        }
        if(board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X'){ //diagonals
            return 1;
        }
        else if(board[0][4] == 'X' && board[2][2] == 'X' && board[4][0] == 'X'){
            return 1;
        }
        if(board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O'){
            return 2;
        }
        else if(board[0][4] == 'O' && board[2][2] == 'O' && board[4][0] == 'O'){
            return 2;
        }
        return 0;
    }
    public boolean check(){ //in case if someone won
        int result = winner();
        if(result == 1){
            System.out.println("Player 1 won!");
            player1Won();
            return true;
        }
        else if(result == 2){
            System.out.println("Player 2 won!");
            player2Won();
            return true;
        }
        return false;
    }
}
