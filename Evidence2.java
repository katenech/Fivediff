import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evidence2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evidence2 extends Uliki
{
    /**
     * Act - do whatever the Evidence2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
       getWorld().addObject(new Evidence2(),45,156);
       getWorld().removeObject(this);
       MyWorld.number++;
       
          if (MyWorld.number==5){
         Greenfoot.setWorld(World2.w2);
          
       }
    }    
}
}
