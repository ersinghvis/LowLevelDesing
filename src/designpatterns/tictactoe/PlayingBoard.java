package designpatterns.tictactoe;

import designpatterns.tictactoe.utility.PlayingBoardUtils;

public class PlayingBoard {

    private int size;

    private PlayingPiece[][] board;

    private PlayingBoardUtils playingBoardUtils;

    public PlayingBoard(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
        playingBoardUtils = new PlayingBoardUtils();
    }

    public boolean canPlace(int i, int j){
        return playingBoardUtils.isEmpty( board, i, j );
    }

    public void placePiece(PlayingPiece playingPiece, int i, int j){
        board[i][j] = playingPiece;
    }

    public void printCurrentStatus(){
        playingBoardUtils.printBoardStatus(board);
    }

    public boolean isWinner(PlayingPiece playingPiece, int i, int j){
        return playingBoardUtils.isWin(board, playingPiece, i , j);
    }

}
