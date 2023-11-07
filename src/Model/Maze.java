/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 10/06/2023
    Quarter: Autumn 2023
 */
package Model;

//import GUIView.MazePanel;

import java.awt.List;
import java.util.ArrayList;


/**
 * This class creates the Maze and implements maze interfaces.
 * It allows player to move up, down, right and left.
 * Also, provides information about the players current room.
 *
 */
public class Maze implements MazeInterface{
    /** Holds the maze. */
    private Room[][] myMaze;
    /** Holds current room.*/
    private Room myCurrentRoom;
    /** Holds x-axis value.*/
    private int myX;
    /** Holds y-axis value.*/
    private int myY;

    /**
     * Constructs and initializes the fields.
     */
    public Maze() {
        myX = 0;
        myY = 0;

        myMaze = new Room[4][4];

        myCurrentRoom = myMaze[myX][myY];

        char letter = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                myMaze[i][j] = new Room(letter,i,j, new Door());
                letter++;
            }
        }
    }
    /**
     * Gets the current room.
     * @return returns the current room.
     */
    @Override
    public Room getMyCurrentRoom() {
        return myCurrentRoom;
    }

    /**
     * Moves the player up in maze.
     */
    @Override
    public void moveUp() {
        myCurrentRoom = myMaze[myX][myY++];
    }
    /**
     * Moves the player down in maze.
     */
    @Override
    public void moveDown() {
        myCurrentRoom = myMaze[myX][myY--];
    }
    /**
     * Moves the player right in maze.
     */
    @Override
    public void moveRight() {
        myCurrentRoom = myMaze[myX--][myY];
    }
    /**
     * Moves the player left in maze.
     */
    @Override
    public void moveLeft() {
        myCurrentRoom = myMaze[myX++][myY];
    }
}
