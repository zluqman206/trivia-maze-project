/*
 *  Names: Matiullah Jalal, Zakriye Luqman, Hawo Issa
 *  Quareter: Fall 2023
 *  Course: TCSS 360
 */
package GUIView;


import javax.swing.*;
import java.awt.*;

/**
 * This class shows a frame of x by y pixels and will hold all the relevant stuff.
 */
public class Frame extends JFrame {
    /** Hold weight of the frame.*/
    private static final int MY_WEIGHT = 850;
    /** Holds height of the frame.*/
    private static final int MY_HEIGHT = 850;
    /** Holds frame  data.*/
    private JFrame myFrame;
    /** Holds the Toolbar stuff.*/
    private final ToolBar myToolBar;

    /**
     * Constructs frame and initializes the filed.
     */
    public Frame(){
        myToolBar = new ToolBar();
        buildFrame();
        addToolBar();
    }

    /**
     * adds toolBar and its item to the Frame.
     */
    private void addToolBar() {
        //this.add(myToolBar.getMenu());
        this.add(myToolBar.getToolBar());
    }

    /**
     * Builds a frame with two colors.
     */
    private void buildFrame() {

        setSize(MY_WEIGHT,MY_HEIGHT);
        setTitle("Trivia Maze Game");
        setResizable(false);
        setLocationRelativeTo(null);
        setColorOfFrame();

    }

    /**
     * Private method to set the color of the frame.
     */
    private void setColorOfFrame() {
        Color color1 = new Color(51, 0, 111, 244);
        Color color2 = new Color (255, 215, 0, 168);
        // This creates gradient paint color
        GradientPaint gradient = new GradientPaint(0,0,color1, MY_WEIGHT,MY_HEIGHT,color2);
        // setting contents of the pane  using JPanel
        setContentPane(new JPanel() {
            /**
             * Overrides paintComponent interface.
             * @param g the <code>Graphics</code> object to protect
             */
            @Override
            protected void paintComponent(Graphics g){
                //super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, MY_WEIGHT, MY_HEIGHT);
            }
        });
    }

}
