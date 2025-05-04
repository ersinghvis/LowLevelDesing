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
        System.out.println();
    }

    private void printPiece(PlayingPiece piece){
        if( piece == null ){
            System.out.print(" * ");
        }
        else if(PieceType.O == piece.getPieceType() ){
            System.out.print(" O ");
        }else if( PieceType.X == piece.getPieceType() ){
            System.out.print(" X ");
        }
    }

    public boolean isWin(PlayingPiece[][] board, PlayingPiece playingPiece, int row, int col) {
        // Check row
        boolean win = true;
        for (int j = 0; j < 3; j++) {
            if (board[row][j] == null || board[row][j].getPieceType() != playingPiece.getPieceType()) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check column
        win = true;
        for (int i = 0; i < 3; i++) {
            if (board[i][col] == null || board[i][col].getPieceType() != playingPiece.getPieceType()) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check primary diagonal
        if (row == col) {
            win = true;
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == null || board[i][i].getPieceType() != playingPiece.getPieceType()) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check secondary diagonal
        if (row + col == 2) {
            win = true;
            for (int i = 0; i < 3; i++) {
                if (board[i][2 - i] == null || board[i][2 - i].getPieceType() != playingPiece.getPieceType()) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }


}
