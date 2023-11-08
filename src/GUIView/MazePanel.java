package GUIView;

import Model.Maze;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MazePanel extends JPanel {

    private JPanel myMazePanel;

    private JButton myButton = new JButton("arrow");

    Maze myMaze;
    private static final char[][] letterGrid = {
            { 'A', 'B', 'C', 'D' },
            { 'E', 'F', 'G', 'H' },
            { 'I', 'J', 'K', 'L' },
            { 'M', 'N', 'O', 'P' }
    };

    public MazePanel(final Maze theMaze) {
        myMaze = theMaze;

        myMazePanel = new JPanel();
        myMazePanel.setLayout(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                char letter = letterGrid[row][col];
                myMazePanel.add(createLetterPanel(letter, row, col));
            }
        }

        myMazePanel.setPreferredSize(new Dimension(350, 350));
        myMazePanel.setBackground(Color.ORANGE);
    }

    private JPanel createLetterPanel(char letter, int row, int col) {
        JPanel letterPanel = new JPanel();
        letterPanel.setLayout(new BorderLayout());


        // Create a sub-panel for the arrows and letter
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Create a label for the letter and center it
        JLabel letterLabel = new JLabel(Character.toString(letter), SwingConstants.CENTER);
        letterLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 24));

        // Add bidirectional arrow buttons to indicate connections
        if (row > 0) {
            contentPanel.add(createArrowButton("↓"), BorderLayout.NORTH);
        }
        if (row < 3) {
            contentPanel.add(createArrowButton("↑"), BorderLayout.SOUTH);
        }
        if (col > 0) {
            contentPanel.add(createArrowButton("→"), BorderLayout.WEST);
        }
        if (col < 3) {
            contentPanel.add(createArrowButton("←"), BorderLayout.EAST);
        }

        // Add the letter label to the center of the content panel
        contentPanel.add(letterLabel, BorderLayout.CENTER);

        // Add the content panel to the letter panel
        letterPanel.add(contentPanel, BorderLayout.CENTER);

        return letterPanel;
    }

    private JButton createArrowButton(String label) {
        JButton arrowButton = new JButton(label);
        arrowButton.setPreferredSize(new Dimension(20, 20));
        arrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle arrow button click (e.g., navigate to the target cell)
                // You can add your custom logic here

                if (label == "↑") {
                    myMaze.moveUp();
                    System.out.println(myMaze.getMyCurrentRoom().getLetter());
                } else if (label == "↓") {
                    myMaze.moveDown();
                    System.out.println(myMaze.getMyCurrentRoom().getLetter());
                } else if (label == "←") {
                    myMaze.moveLeft();
                    System.out.println(myMaze.getMyCurrentRoom().getLetter());
                } else if (label == "→") {
                    myMaze.moveRight();
                    System.out.println(myMaze.getMyCurrentRoom().getLetter());
                }
            }
        });
        arrowButton.setBorder(new EmptyBorder(0, 0, 0, 0)); // Remove button border
        arrowButton.setFont(new Font("Arial", Font.BOLD, 20)); // Adjust font size

        return arrowButton;
    }






    public JPanel getMyMazePanel(){
        return myMazePanel;
    }

    public Maze getMyMaze() {
        return myMaze;
    }
}
