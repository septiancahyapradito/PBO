import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public class Enemy extends Actor
{
    public Enemy(){
        setRotation(180);
    }
    public Enemy (int speed)
    {
        setRotation(180);
        this.speed = speed;
    }    
    public int speed = 3;
    public void act()
    {
        move(speed);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
