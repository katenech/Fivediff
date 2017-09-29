import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suspect1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suspect1 extends Suspects
{
    /**
     * Act - do whatever the Suspect1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
       sus=1;
       getWorld().addObject(new Note5(),604,610);
       getWorld().addObject(new Note4(),465,700);
       getWorld().addObject(new Note3(),757,697);
      } 
    }    
}
