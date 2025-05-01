package designpatterns.tictactoe;

import designpatterns.tictactoe.enums.PieceType;

public class Player {

    private int id;

    private String name;

    private PlayingPiece playingPiece;

    public Player(PlayingPiece playingPiece, String name, int id){
        this.id = id;
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

}
