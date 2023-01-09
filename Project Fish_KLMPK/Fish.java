import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private double g = 1;
    private int y = 200;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    public Fish(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    public void act() 
    {
        // Menekan spasi, kordinat y akan berkurang dan berenang ke atas
        if(spacePressed()){
            g=-2;
        }
        g +=0.1; //Nilai g meningkat 0,1 setiap saat
        y += g; //Nilay Y tidak berubah dengan kecepatan konstan
        setLocation(getX(), (int)(y));
        //jika menabrak karang maka fish akan mati
        if(isTouchkarang()){
            isalive = false;
        }
        
        if(isTouchkarang()){
            isalive = false;
        }
        // jatuh atau menabrak karang maka fish akan hilang.
        if(!isalive){
            getWorld().addObject(new Gameover(), 300,200);
            getWorld().removeObject(this);
        }
        //penambahan score setelah melewati karang.
        if(!hasaddscore && isacross && isalive){
            Greenfoot.playSound("score.mp3");
            Score.add(1);
        }
        hasaddscore = isacross;
        
    }
    public boolean spacePressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("Space")){
            if(!haspressed){
                Greenfoot.playSound("flay.mp3");
                pressed = true;
            }
            haspressed = true;
        }else{
            haspressed = false;
        }
        return pressed;
    }
    
    public boolean isTouchkarang(){
        isacross = false;
        for(Karang karang : getWorld().getObjects(Karang.class)){
            if(Math.abs(karang.getX() - getX()) < 69){
            if(Math.abs(karang.getY() + 30 - getY()) > 37){
                Greenfoot.playSound("Peng.mp3");
                isalive = false;
            }
            isacross = true;
        }
    }
    return !isalive;
}
}
