package Game;

import java.util.Scanner;
import java.awt.*;
import static Game.Main.*;
import javax.swing.*;

import Game.Tetrimino.*;
import static Game.Tetrimino.Tetrimino.*;
import static lib.MafLib.*;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Main{
    static Tetrimino currentPiece;
    static final Tetrimino[] classicBag = {I_Piece, T_Piece, O_Piece, S_Piece, Z_Piece, L_Piece, J_Piece};
    static JFrame frame = new JFrame("Tetris");
    static JButton play = new JButton("Play");
    static JButton settings = new JButton("Settings");
    static JButton exit = new JButton("Exit to Desktop.");

    static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static Dimension screen = toolkit.getScreenSize();
    
    static int screenWidth = (int) screen.getWidth();
    static int screenHeight = (int) screen.getHeight();

    public static void calibrate(){
        play.setBounds(screenWidth/2, 100, 100, 100);
        settings.setBounds(screenWidth/2, 200, 100, 100);
        exit.setBounds(screenHeight/2, 300, 100, 100);
    }
    
    public static void main(String[] args) {
        frame.setAutoRequestFocus(true);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        
        calibrate();
        frame.add(play);
        frame.add(settings);
        frame.add(exit);

        frame.addComponentListener(new ComponentListener() {

            @Override
            public void componentResized(ComponentEvent e) {
                calibrate();
            }

            @Override public void componentMoved(ComponentEvent e) {}
            @Override public void componentShown(ComponentEvent e) {}
            @Override public void componentHidden(ComponentEvent e) {}

        });
    }
}