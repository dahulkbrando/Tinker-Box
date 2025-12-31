package entity;

import java.awt.image.BufferedImage;

public class Entity {

    public int x, y;
    public int speed;
    
    //public BufferedImage up, up1, up2, down, down1, down2,left, left1, left2, right, right1, right2;
    public BufferedImage[] upImageArray = new BufferedImage[3];
    public BufferedImage[] downImageArray = new BufferedImage[3];
    public BufferedImage[] leftImageArray = new BufferedImage[3];
    public BufferedImage[] rightImageArray = new BufferedImage[3];
    public String direction;

    public int spriteCounter = 0; //timer for cycling through walking animation
    public int spriteState = 0; //static, walking_left, walking_right
}
