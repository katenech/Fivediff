import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    static Game_Over GO=new Game_Over();
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Exit2 exit2 = new Exit2();
        addObject(exit2,646,476);
        exit2.setLocation(639,463);
        exit2.setLocation(637,505);
        exit2.setLocation(632,505);
        exit2.setLocation(637,504);
        Restart restart2 = new Restart();
        addObject(restart2,777,499);
        restart2.setLocation(801,501);
        restart2.setLocation(797,498);
        exit2.setLocation(528,449);
        restart2.setLocation(810,441);
    }
}
