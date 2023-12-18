package Game.Tetrimino;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.IIOImage;
import javax.swing.ImageIcon;

public class Tetrimino {
    String name;
    ImageIcon texture;
    int x = 0;
    int y = 0;

    public Tetrimino(String name, ImageIcon texture){
        this.name = name;
        this.texture = texture;
    }

    public void loop(){
        x++;
    }


    public static final Tetrimino I_Piece = new Tetrimino("I", new ImageIcon("res/I_Piece.png"));
    public static final Tetrimino T_Piece = new Tetrimino("T", new ImageIcon("res/T_Piece.png"));
    public static final Tetrimino O_Piece = new Tetrimino("O", new ImageIcon("res/O_Piece.png"));
    public static final Tetrimino S_Piece = new Tetrimino("S", new ImageIcon("res/S_Piece.png"));
    public static final Tetrimino Z_Piece = new Tetrimino("Z", new ImageIcon("res/Z_Piece.png"));
    public static final Tetrimino L_Piece = new Tetrimino("L", new ImageIcon("res/L_Piece.png"));
    public static final Tetrimino J_Piece = new Tetrimino("J", new ImageIcon("res/J_Piece.png"));
}