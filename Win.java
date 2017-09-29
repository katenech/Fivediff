import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{
    static Win W=new Win();
    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
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
        Restart restart = new Restart();
        addObject(restart,593,226);
        restart.setLocation(598,215);
        Exit3 exit3 = new Exit3();
        addObject(exit3,597,610);
        exit3.setLocation(584,635);
        removeObject(restart);
    }
}
