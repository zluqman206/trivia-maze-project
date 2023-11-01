package GUIView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MazePanel extends JPanel {

    private JPanel myMazePanel;

    private JButton myButton = new JButton("arrow");
    private static final char[][] letterGrid = {
            { 'A', 'B', 'C', 'D' },
            { 'E', 'F', 'G', 'H' },
            { 'I', 'J', 'K', 'L' },
            { 'M', 'N', 'O', 'P' }
    };

    public MazePanel() {
        myMazePanel = new JPanel();
        myMazePanel.setLayout(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                char letter = letterGrid[row][col];
                myMazePanel.add(createLetterPanel(letter, row, col));
            }
        }

        myMazePanel.setPreferredSize(new Dimension(400, 400));
        myMazePanel.setBackground(Color.ORANGE);
    }

    private JPanel createLetterPanel(char letter, int row, int col) {
        JPanel letterPanel = new JPanel();
        letterPanel.setPreferredSize(new Dimension(30,30));

        JLabel letterLabel = new JLabel(Character.toString(letter), SwingConstants.CENTER);
        letterLabel.setPreferredSize(new Dimension(20,20));
        letterPanel.add(letterLabel, BorderLayout.CENTER);


        return letterPanel;
    }




    public JPanel getMyMazePanel(){
        return myMazePanel;
    }
}
