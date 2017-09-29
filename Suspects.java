import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suspects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suspects extends Actor
{
    static int sus;
    public void act() 
    {
      if(Greenfoot.mouseClicked(this)){  
       getWorld().addObject(new Note5(),604,610);
       getWorld().addObject(new Note4(),465,700);
       getWorld().addObject(new Note3(),757,697);
      } 
    }    
}
