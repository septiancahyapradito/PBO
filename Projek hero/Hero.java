import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //world w;
    int speed;
    public void act() 
    {
        //w = getWorld();
        shootLaser();
        moveHero();
        heroCollision();
    }
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("D"))
        setLocation(getX()+5,getY());
        if(Greenfoot.isKeyDown("A"))
        setLocation(getX()-5,getY());
        if(Greenfoot.isKeyDown("W"))
        setLocation(getX(),getY()-5);
        if(Greenfoot.isKeyDown("S"))
        setLocation(getX(),getY()+5);
    }
    
    int laserTimer = 0;
    public void shootLaser(){
        if (Greenfoot.isKeyDown("space")){
           getWorld().addObject(new Laser(), getX() + 5,getY());
           laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
    public void heroCollision(){
        if (isTouching(Enemy.class)){
            
            getWorld().addObject(new Boom(), getX(), getY());
            
            removeTouching(Enemy.class);
            setLocation(51,194);
        } //else if (isAtEdge())
          //  getWorld().removeObject(this);
    }
}
