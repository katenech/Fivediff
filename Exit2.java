import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit2 extends Button
{
    /**
     * Act - do whatever the Exit2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {  
            Greenfoot.setWorld(new Menu());
        }
    }    
}
