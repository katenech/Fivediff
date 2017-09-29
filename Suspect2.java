import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suspect2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suspect2 extends Suspects
{
    /**
     * Act - do whatever the Suspect2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
       sus=2;
       getWorld().addObject(new Note5(),604,610);
       getWorld().addObject(new Note4(),465,700);
       getWorld().addObject(new Note3(),757,697);
      }    
    }
}
