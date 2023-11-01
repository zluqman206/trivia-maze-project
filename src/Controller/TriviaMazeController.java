package Controller;

import GUIView.Frame;

import javax.swing.JFrame;
import java.awt.EventQueue;
public class TriviaMazeController {
    /**
     * Main method for Trivia Maze game. Will be entry point for game.
     */
    public static void main(String[] theArgs) {
        EventQueue.invokeLater(() -> {
            var frame = new Frame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
