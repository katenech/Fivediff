import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Note3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note3 extends Note
{  
    public void act() 
    {
           if (Suspects.sus==2||Suspects.sus==3||Suspects.sus==4){
         Greenfoot.setWorld(Game_Over.GO);
          
       }
     
          if (Suspects.sus==1){
         Greenfoot.setWorld(Win.W);
          
       }
    }    
}
