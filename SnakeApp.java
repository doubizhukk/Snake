package snakeApp;

import javax.swing.*;
import java.awt.*;

public class SnakeApp {
    public static void main(String[] args){
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();

        obj.setBounds(10,10, 905, 700);
        obj.setBackground(Color.DARK_GRAY);
        //obj.setTitle("Snake Game");
        obj.setResizable(false);
        obj.add(gameplay);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
