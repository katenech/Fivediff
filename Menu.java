import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
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
        Start start = new Start();
        addObject(start,679,453);
        start.setLocation(640,492);
        Exit exit = new Exit();
        addObject(exit,651,716);
        start.setLocation(638,388);
        exit.setLocation(649,654);
        start.setLocation(637,401);
        exit.setLocation(645,634);
        start.setLocation(662,390);
        exit.setLocation(662,596);
    }
}
