package designpatterns.tictactoe;

import designpatterns.tictactoe.enums.PieceType;

public class PlayingPiece {

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    private PieceType pieceType;

    public PlayingPiece(PieceType type){
        this.pieceType = type;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

}