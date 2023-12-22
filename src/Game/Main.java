package Game;

import java.awt.*;
import javax.swing.*;

import Game.Tetrimino.*;
import static Game.Tetrimino.Tetrimino.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import static lib.MafLib.*;

public class Main{
    static Tetrimino currentPiece;
    static final Tetrimino[] classicBag = {I_Piece, T_Piece, O_Piece, S_Piece, Z_Piece, L_Piece, J_Piece};
    
    public static JFrame frame = new JFrame("Tetris");
    static JButton play = new JButton("Play");
    static JButton settings = new JButton("Settings");
    static JButton exit = new JButton("Exit");
    static JLabel bg = new JLabel(new ImageIcon("src/res/background.png"));
    static JLabel title = new JLabel("Tetris");
    static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static Dimension screen = toolkit.getScreenSize();
    
    static int screenWidth = (int) screen.getWidth();
    static int screenHeight = (int) screen.getHeight();

    public static void calibrate(){
        // bg.setLocation(5, -150);
        play.setBounds(screenWidth/2-75, 450, 150, 75);
        settings.setBounds(screenWidth/2-75, 550, 150, 75);
        exit.setBounds(screenWidth/2-75, 650, 150, 75);
        
        title.setBounds(500, 100, 100, 100);
        title.setFont(new Font("Comic Sans", Font.BOLD, 100));
        title.setText("<html><font color = 'aqua'>" + "T" + 
                      "<font color = 'purple'>" + "e" +
                      "<font color = 'yellow'>" + "t" +
                      "<font color = 'red'>" + "r" +
                      "<font color = 'blue'>" + "i" +
                      "<font color = 'lime'>" + "s");        
    }
    
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        calibrate();
        
        frame.add(play);
        frame.add(settings);
        frame.add(exit);
        frame.add(title);
        
        frame.addComponentListener(new ComponentListener() {

            @Override public void componentResized(ComponentEvent e) {calibrate();}
            @Override public void componentMoved(ComponentEvent e) {calibrate();}
            @Override public void componentShown(ComponentEvent e) {calibrate();}
            @Override public void componentHidden(ComponentEvent e) {calibrate();}

        });
    }
}