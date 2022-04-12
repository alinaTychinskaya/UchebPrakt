/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * /
package game;

/**
 *
 * @author Тычинская
 */
import java.awt.Graphics;
import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game1 extends JFrame {
    private static Game1 game_window;
    private static Image 1;
    
}
private static Game1 game_window ;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        game_window = new Game1();
        game_window.setDefaultCloseOperation( WindowConstants .EXIT_ON_CLOSE);
        game_window.setLocation(200,50);
        game_window.setSize(900, 600);
        game_window.setResizable(false);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    /**
 *
 * @author Тычинская
 */
   private static void onRepaint(Graphics g){
    g.fillOval(10, 10, 200, 100);
}
   private static class GameField extends JPanel {
       @Override
       protected void paintComponent(Graphics g){
           super.paintComponent(g);
           onRepaint(g);
       }
   }
}
}

