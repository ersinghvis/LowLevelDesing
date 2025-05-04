package designpatterns.tictactoe;

import designpatterns.tictactoe.enums.PieceType;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private List<Player> players;

    private PlayingBoard playingBoard;


    public void initializeGame(){
        playingBoard = new PlayingBoard(3);
        Player p1 = new Player(new PieceX(PieceType.X),"Vishal",1);
        Player p2 = new Player(new PieceO(PieceType.O),"Vipul",2);
        players = Arrays.asList(p1,p2);
    }


    public void startGame(){
        System.out.println("Game starting....");
        System.out.println("Initial positions are :-");
        playingBoard.printCurrentStatus();

        System.out.println("Let's start..........");

        int totalMoves = 0;
        boolean isWin = false;
        int player = 1;
        while(totalMoves < 3 * 3 ){
            boolean isPlaced = false;
            if( player == 1 ){
                int i = 0, j = 0;
               while ( ! isPlaced ){
                   int [] places = getPLaceValue(players.get(0));
                   i = places[0];
                   j = places[1];
                   isPlaced = selectPositionAndPlay( players.get(0), i, j );
               }
                isWin = playingBoard.isWinner(players.get(0).getPlayingPiece(),i,j);
               if( isWin ){
                   break;
               }
                totalMoves++;
                player = 2;
            }else{
                int i = 0, j = 0;
                while ( ! isPlaced){
                    int [] places = getPLaceValue(players.get(1));
                    i = places[0];
                    j = places[1];
                    isPlaced = selectPositionAndPlay( players.get(1), i, j );
                }
                isWin = playingBoard.isWinner(players.get(1).getPlayingPiece(),i,j);
                if( isWin ){
                    break;
                }
                totalMoves++;
                player = 1;
            }
            playingBoard.printCurrentStatus();
        }
        if (isWin) {
            System.out.println("Congratulations " + players.get(player == 1 ? 0 : 1).getName() + ", You Won!");
        } else {
            System.out.println("It's a Draw!");
        }
    }

    public int[] getPLaceValue( Player player ){
        System.out.println("Player "+ player.getName() + " Please select your move :- ");
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
