/*
    Name: Matiullah Jalal, Zakiraye Luqman, Hawo Issa
    Date: 10/06/2023
    Quarter: Autumn 2023
 */
package Model;

<<<<<<< HEAD
import GUIView.MazePanel;
=======
//import GUIView.MazePanel;
>>>>>>> matiBranch

import java.awt.List;
import java.util.ArrayList;

<<<<<<< HEAD
=======

>>>>>>> matiBranch
/**
 * This class creates the Maze and implements maze interfaces.
 * It allows player to move up, down, right and left.
 * Also, provides information about the players current room.
 *
 */
public class Maze implements MazeInterface{
    /** Holds the maze. */
    private Room[][] myMaze;
<<<<<<< HEAD
    private Room myCurrentRoom;

    private int myX;
    private int myY;

=======
    /** Holds current room.*/
    private Room myCurrentRoom;
    /** Holds x-axis value.*/
    private int myX;
    /** Holds y-axis value.*/
    private int myY;

    /**
     * Constructs and initializes the fields.
     */
>>>>>>> matiBranch
    public Maze() {
        myX = 0;
        myY = 0;

        myMaze = new Room[4][4];

<<<<<<< HEAD

=======
        myCurrentRoom = myMaze[myX][myY];
>>>>>>> matiBranch

        char letter = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                myMaze[i][j] = new Room(letter,i,j, new Door());
                letter++;
            }
        }
<<<<<<< HEAD

        myCurrentRoom = myMaze[0][0];
    }



=======
    }
    /**
     * Gets the current room.
     * @return returns the current room.
     */
    @Override
>>>>>>> matiBranch
    public Room getMyCurrentRoom() {
        return myCurrentRoom;
    }

<<<<<<< HEAD
    public void moveUp() {
        myX--;
        myCurrentRoom = myMaze[myX][myY];    }

    public void moveDown() {
        myX++;
        myCurrentRoom = myMaze[myX][myY];
    }
    public void moveRight() {
        myY++;
        myCurrentRoom = myMaze[myX][myY];
    }
    public void moveLeft() {
        myY--;
        myCurrentRoom = myMaze[myX][myY];
    }





=======
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
>>>>>>> matiBranch
}
