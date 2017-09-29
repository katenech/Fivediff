import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence5 extends Uliki
{
    /**
     * Act - do whatever the Evidence5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           getWorld().addObject(new Evidence5(),45,303);  
           getWorld().removeObject(this);
           MyWorld.number++;
           
             if (MyWorld.number==5){
             Greenfoot.setWorld(World2.w2);
          
           } 
        }
    }    
}
