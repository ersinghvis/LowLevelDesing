package designpatterns.tictactoe;

import designpatterns.tictactoe.enums.PieceType;
import designpatterns.tictactoe.utility.PlayingBoardUtils;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private List<Player> players;

    private PlayingBoard playingBoard;


    public void initializeGame(){
        playingBoard = new PlayingBoard(3);
        Player p1 = new Player(new PieceX(PieceType.O),"Vishal",1);
        Player p2 = new Player(new PieceX(PieceType.X),"Vipul",2);
        players = Arrays.asList(p1,p2);
    }


    public void startGame(){
        System.out.println("Game starting ---------------");
        System.out.println("Initial positions are---------");
        playingBoard.printCurrentStatus();

        System.out.println("Let's start..........");

        int totalMoves = 0;
        boolean isWin = false;
        int player = 1;
        while(totalMoves < 3 * 3 || ! isWin ){
            if( player == 1 ){
                int [] places = getPLaceValue(players.get(0));
                int i = places[0];
                int j = places[1];
               while ( ! selectPositionAndPlay( players.get(0), i, j ) ){

               }
                isWin = playingBoard.isWinner(players.get(0).getPlayingPiece(),i,j);
                totalMoves++;
                player = 2;
            }else{
                int [] places = getPLaceValue(players.get(1));
                int i = places[0];
                int j = places[1];
                while ( ! selectPositionAndPlay( players.get(1), i, j ) ){

                }
                isWin = playingBoard.isWinner(players.get(0).getPlayingPiece(),i,j);
                totalMoves++;
                player = 1;
            }
            playingBoard.printCurrentStatus();
        }
        System.out.println("Ended....");
    }

    public int[] getPLaceValue( Player player ){
        System.out.println("Player "+ player.getName() +" Please select your move :- ");
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine();
        String[] place = move.split(",");
        int[] places = { Integer.parseInt(place[0]), Integer.parseInt(place[1]) };
        return places;
    }

    private boolean selectPositionAndPlay( Player player,int i, int j ){
        if( i < 0 || i > 2 || j < 0 || j > 2 ){
            System.out.println("Please place valid number");
            return false;
        }else if( ! playingBoard.canPlace(i,j) ){
            System.out.println("Please select valid place");
            return false;
        }else{
            playingBoard.placePiece( player.getPlayingPiece() , i, j );
            return true;
        }
    }

}
