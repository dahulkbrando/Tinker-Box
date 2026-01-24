package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {

    public int worldX, worldY;
    public int speed;
    
    public BufferedImage[] upImageArray = new BufferedImage[3];
    public BufferedImage[] downImageArray = new BufferedImage[3];
    public BufferedImage[] leftImageArray = new BufferedImage[3];
    public BufferedImage[] rightImageArray = new BufferedImage[3];
    public String direction;

    public int spriteCounter = 0; //timer for cycling through walking animation
    public int spriteState = 0; //static, walking_1, walking_2

    public Rectangle solidArea;
    public boolean collisionOn = false;
}
