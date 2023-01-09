import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laut extends World
{

    /**
     * Constructor for objects of class Laut.
     * 
     */
    public Laut()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Fish(), 100, 100);
        addObject(new Karang(), 300,150);
        addObject(new Karang(), 600,150);
        addObject(new Score(), 300, 100);
    }
}
