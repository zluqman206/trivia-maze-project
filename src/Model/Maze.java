/*
    This is the Maze class
    Name: Matiullah Jalal
    Date: 10/25/2023
    Quarter: Autumn 2023
 */
package Model;

import GUIView.MazePanel;

import java.awt.List;
import java.util.ArrayList;

/**
 * This class
 */
public class Maze {
    private Room[][] myMaze;
    private Room myCurrentRoom;

    private int myX;
    private int myY;

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



    public Room getMyCurrentRoom() {
        return myCurrentRoom;
    }

    public void moveUp() {
        myCurrentRoom = myMaze[myX][myY++];
    }

    public void moveDown() {
        myCurrentRoom = myMaze[myX][myY--];
    }
    public void moveRight() {
        myCurrentRoom = myMaze[myX--][myY];
    }
    public void moveLeft() {
        myCurrentRoom = myMaze[myX++][myY];
    }





}
