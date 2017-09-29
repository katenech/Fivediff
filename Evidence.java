import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence extends Uliki
{
    /**
     * Act - do whatever the Evidence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           getWorld().addObject(new Evidence(),45,748); 
           getWorld().removeObject(this);
           MyWorld.number++;
           
              if (MyWorld.number==5){
             Greenfoot.setWorld(World2.w2);
          
           }
        }
    }    
}
