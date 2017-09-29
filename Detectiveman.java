import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Detectiveman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Detectiveman extends Actor
{
MyWorld w= (MyWorld)getWorld();
int speedX=0;

public void act() 
{ 
        keyboard(); 
        scrollingMove();
}

  
  
  public void keyboard(){
        //int dx = 0;     
        //int dy = 0;      
    if (Greenfoot.isKeyDown("right"))
    {
    //dx=2;
    speedX=2;
    //moving(dx,dy);
    this.setLocation(this.getX()+3, this.getY());
    setImage("Без-имени-67.png");
  }
  if (Greenfoot.isKeyDown("left")) 
  {
   //dx=-2;
   speedX=-2;
   //moving(dx,dy);
   this.setLocation(this.getX()-3, this.getY());
   setImage("Без-имени-50.png");
  }
  
  if (Greenfoot.isKeyDown("down"))
  {
    speedX=2;
    //moving(dx,dy);
  }
  if (Greenfoot.isKeyDown("up")) 
  {
   speedX=-2;
   //moving(dx,dy);
  }
}
public void moving(int dx, int dy){
        setLocation(getX()+dx, getY()+dy);
        
        if (isTouching(Mebel.class)){
            setLocation(getX()-dx, getY()-dy);
        }
    
        if (isTouching(Board.class)){
            setLocation(getX()-dx, getY()-dy);
        }
}

public void scrollingMove(){
   //ScrollingWorld w=(ScrollingWorld)getWorld();
   
   if((getX()+speedX)<=50){
       setLocation(50, getY());
       //w.toScrollWorld(-speedX);
   }else
   
   if((getX()+speedX)>=w.getWidth()-50){
       setLocation(w.getWidth()-50, getY());
       //w.toScrollWorld(-speedX);
   }else
   
   setLocation(getX()+speedX, getY());
   speedX=0;
}
}    

