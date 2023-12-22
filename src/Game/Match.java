package Game;

import Game.Tetrimino.Tetrimino;

class Match{
    private int playerCount;
    private Tetrimino[] bagType;
    private boolean reservePiece;
    private boolean strictPlacement;
    private boolean hardDrop;

    public Match(int playerCount, Tetrimino[] bagType, boolean reservePiece, boolean strictPlacement, boolean hardDrop){
        this.playerCount = playerCount;
        if(this.playerCount > 4){
            this.playerCount = 4;
        }
        this.bagType = bagType;

        this.reservePiece = reservePiece;
        this.strictPlacement = strictPlacement;
        this.hardDrop = hardDrop;
    }

    public void loop(){
        
    }
}