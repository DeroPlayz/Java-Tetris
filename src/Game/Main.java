package Game;

import javax.swing.*;

import Game.Tetrimino.*;
import static Game.Tetrimino.Tetrimino.*;

class Main{
    static Tetrimino currentPiece;
    static final Tetrimino[] classicBag = {I_Piece, T_Piece, O_Piece, S_Piece, Z_Piece, L_Piece, J_Piece};
    static JFrame frame = new JFrame("Tetris");
    static JButton play = new JButton("Play");
    static JButton settings = new JButton("Settings");
    static JButton exit = new JButton("Exit to Desktop.");
    public static void main(String[] args) {
        frame.setAutoRequestFocus(true);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        
    }
}