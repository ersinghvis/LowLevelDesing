package designpatterns.tictactoe.utility;

import designpatterns.tictactoe.PlayingPiece;
import designpatterns.tictactoe.enums.PieceType;

public class PlayingBoardUtils {

    public boolean isEmpty(PlayingPiece[][] board, int i , int j){
        return board[i][j] == null;
    }

    public void printBoardStatus(PlayingPiece[][] board){
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                printPiece(board[i][j]);
            }
        }
    }

    private void printPiece(PlayingPiece piece){
        if( piece == null ){
            System.out.print(" | ");
        }
        else if(PieceType.O == piece.getPieceType() ){
            System.out.print("| O ");
        }else if( PieceType.X == piece.getPieceType() ){
            System.out.print("| X ");
        }
    }

    public boolean isWin(PlayingPiece[][] board, PlayingPiece playingPiece, int i, int j){
        int row = i;
        int col = j;
        //Check left-up diagonal
        while( row >= 0 &&  col >= 0){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            row--;
            col--;
        }
        //Check right-up diagonal
        row = i;
        col = j;
        while( row >= 0 &&  col < 3){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            row--;
            col++;
        }
        //Check left-down
        row = i;
        col = j;
        while( row < 3 &&  col >= 0){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            row++;
            col--;
        }
        //Check right-down
        row = i;
        col = j;
        while( row < 3 &&  col < 3){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            row++;
            col++;
        }
        //Check row
        row = i;
        col = 0;
        while( col < 3){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            col++;
        }
        //Check col
        row = 0;
        col = j;
        while( row < 3){
            if( board[row][col] == null || board[row][col] != playingPiece ){
                return false;
            }
            row++;
        }
        return true;
    }

}
