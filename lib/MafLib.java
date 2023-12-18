package lib;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;
// import java.io.FileInputStream;
//import java.util.Properties;
import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;
import java.awt.*;
import static Game.Main.*;

import javax.swing.JComponent;
// import javax.swing.JLabel;
import javax.swing.JTextField;

public class MafLib{
    static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static Dimension screen = toolkit.getScreenSize();
    
    static int screenWidth = (int) screen.getWidth();
    static int screenHeight = (int) screen.getHeight();

    public static JTextField response = new JTextField();
    public static boolean asking = false;
    public static final String RESET = "\033[0m";
    public static final String CLEARC = "\033[39m";
    public static final String CLEARF = "\033[22m" + "\033[23m" + "\033[24m" + "\033[27m" + "\033[28" + "\033[29m";
    public static final String BLACK = "\033[30m"; public static final String BLACKH = "\033[40m";
    public static final String RED = "\033[31m"; public static final String REDH = "\033[41m";
    public static final String GREEN = "\033[32m"; public static final String GREENH = "\033[42m"; //Mint Green
    public static final String YELLOW = "\033[33m"; public static final String YELLOWH = "\033[43m";
    public static final String BLUE = "\033[34m"; public static final String BLUEH = "\033[44m"; //Dark Blue
    public static final String MAGENTA = "\033[35m"; public static final String MAGENTAH = "\033[45m";
    public static final String CYAN = "\033[36m"; public static final String CYANH = "\033[46m";
    public static final String WHITE = "\033[37m"; public static final String WHITEH = "\033[47m";
    public static final String BLINK = "\033[5m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String STRIKE = "\033[9m";
    public static final String INVERT = "\033[7m";
    public static final String HIDE = "\033[8m";
    
    static Scanner Scan = new Scanner(System.in);
    
    /**
     * Asks the user to input text into the console.
     * @param Prompt - What question is printed to the console.
     * @param EndOnNewline - Whether or not the console should move to the next line before accepting input.
     * @return What the user typed.
     */
    public static String askString(String Prompt, Boolean EndOnNewline){
        if(EndOnNewline == true){
            System.out.println(Prompt);
        }
        if(EndOnNewline == false){
            System.out.print(Prompt);
        } 
        String response = Scan.nextLine();
        return response;
    }

    /**
     * Asks the user to input a number into the console.
     * @param Prompt - What question is printed to the console.
     * @param EndOnNewline - Whether or not the console should move to the next line before accepting input.
     * @return What the user typed.<p>
     * Note: If the user inputs a String, it will ask them again. If a decimal number is entered, it will round down indiscriminately.
     */
    public static int askInt(String Prompt, Boolean EndOnNewline){
        String nl = "";
        if(EndOnNewline == true){
            nl = "\n";
        }
        System.out.print(Prompt + nl);
        String response = Scan.next();
        response = response.replaceAll("[^0-9.]", "");
        int dot = response.indexOf(".");
        if(dot == -1){
            response = response.replaceAll("[^0-9]", "");
        }
        else{
            response = response.substring(0, dot);
        }
        return Integer.valueOf(response);
        
    }

    /**
     * Asks the user to input a decimal number into the console.
     * @param Prompt - What question is printed to the console.
     * @param EndOnNewline - Whether or not the console should move to the next line before accepting input.
     * @return What the user typed.<p>
     * Note: If the user inputs a String, it will ask them again. If an integer is entered, it will add a ".0" to make it a decimal.
     */
    public static double askDouble(String Prompt, Boolean EndOnNewline){
        String nl = "";
        if(EndOnNewline == true){
            nl = "\n";
        }
        System.out.print(Prompt + nl);
        String response = Scan.next();
        response = response.replaceAll("[^0-9]", "");
        if(response.contains(".") == false){
            return Double.valueOf(response + ".0");
        }
        else{
            return Integer.valueOf(response);
        }
        
    }

    /**
     * Allows checking if a string is purely composed of letters.
     * @param s - The string to check.
     * @return If the string only contains letters, true is returned. Otherwise, it returns false.
     */
    public static boolean isAlpha(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            int j = i + 1;
            String t;
            if(i + 1 >= s.length()){
                t = s.substring(i);
            }
            else{
                t = s.substring(i, j);
            }
            if("abcdefghijklmnopqrstuvwxyz".contains(t) == false){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Allows checking if a string is purely composed of numerals.
     * @param s - The string to check.
     * @return If the string only contains numerals (decimals permitted), true is returned. Otherwise, it returns false.
     */
    public static boolean isNumeric(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if("1234567890.".contains(String.valueOf((s.charAt(i)))) == false){
                return false;
            }
        }
        return true;
    }

    /**
     * Takes user input and removes unneeded whitespace to prevent minor formatting from breaking responses. 
     * @param s
     * @return
     */
    public static String reduce(String s){
        return s.strip().toLowerCase();
    }

    /**
     * Allows you to find the first occurence of an exact string in an array.
     * @param a
     * @param s
     * @return
     */
    public static int ArrayInd(Object[] a, String s){
        int ind = -1;
        for(int i = 0; i < a.length; i ++){
            if(s.equals(a[i])){
                ind = i;
            }
        }
        return ind;
    }

    /**
     * Allows a component to be perfectly on the x-axis within a JFrame without a layout manager.
     * @param j - What component to center.
     * @return The value that would put the component at the exact center.
     */
    public static int centerTextH(JComponent j){
        int h = (int) ((int) (screenWidth/2)-(j.getPreferredSize().getWidth()));
        return h;
    }

    /**
     * Allows a component to be perfectly on the y-axis within a JFrame without a layout manager.
     * @param j - What component to center.
     * @return The value that would put the component at the exact center.
     */
    public int centerTextV(JComponent j){
        int v = (int) ((int) (screenHeight/2)-(j.getPreferredSize().getHeight()));
        return v;
    }
    
    // static String ans = "";
    // /**
    //  * Asks the user to input text in a JFrame.
    //  * @param Prompt - What the user will be asked.
    //  * @param Location - What element to show the Prompt on.
    //  */
    // public static void askString(String Prompt) {
    //     // log.setText(Prompt);
    //     frame.add(response);
    //     response.setBounds(680, 500, 200, 20);
    // }
}