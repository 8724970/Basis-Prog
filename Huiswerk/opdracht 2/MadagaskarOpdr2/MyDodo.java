import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author Sjaak Smetsers
 * @version Version 1.2 -- 11-03-2015
 */
public class MyDodo extends Dodo
{
    private int myNrOfEggsHatched;

    public MyDodo() {
        this ( EAST );
    }

    public MyDodo( int init_direction ) {
        super ( init_direction );
        myNrOfEggsHatched = 0;
    }

    /**
     * 
     */
    public void act() {

    }

    /**
     * 
     */    
    public void hatchEgg () {
        if ( foundEgg() ) {
            removeActor( takeEgg() );
            myNrOfEggsHatched++;
        } else {
            showError( "There was no egg in this cell" );
        }
    }

    public int getNrOfEggsHatched() {
        return myNrOfEggsHatched;
    }

    /**
     * Move one cell forward in the current direction.
     */
    public void move() {
        if ( canMove() ) {
            step();
        } else {
            showError( "I'm stuck!" );
        }
    }

    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove() {
        if ( ! borderAhead() ){
            return true;
        } else {
            return false;
        }
    } 

}
