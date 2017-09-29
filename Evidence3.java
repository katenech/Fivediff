import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence3 extends Uliki
{
    /**
     * Act - do whatever the Evidence3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           getWorld().addObject(new Evidence3(),45,450);
           getWorld().removeObject(this);
            MyWorld.number++;
            
              if (MyWorld.number==5){
          Greenfoot.setWorld(World2.w2);
          
        }
        }
    }    
}
