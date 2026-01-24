package entity;

// import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.io.IOException;


import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;
    
    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        screenX = (gp.screenWidth - gp.tileSize) / 2;
        screenY = (gp.screenHeight - gp.tileSize) / 2;

        solidArea = new Rectangle();
        solidArea.x = 2 * gp.scale;
        solidArea.y = 7 * gp.scale;
        solidArea.width = 12 * gp.scale;
        solidArea.height = 9 * gp.scale;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        worldX = 23 * gp.tileSize;
        worldY = 21 * gp.tileSize;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage() {

        try {
            downImageArray[0] = ImageIO.read(getClass().getResourceAsStream("../res/player/down0.png"));
            downImageArray[1] = ImageIO.read(getClass().getResourceAsStream("../res/player/down_gait1.png"));
            downImageArray[2] = ImageIO.read(getClass().getResourceAsStream("../res/player/down_gait2.png"));
            upImageArray[0] = ImageIO.read(getClass().getResourceAsStream("../res/player/up0.png"));
            upImageArray[1] = ImageIO.read(getClass().getResourceAsStream("../res/player/up_gait1.png"));
            upImageArray[2] = ImageIO.read(getClass().getResourceAsStream("../res/player/up_gait2.png"));
            leftImageArray[0] = ImageIO.read(getClass().getResourceAsStream("../res/player/left0.png"));
            leftImageArray[1] = ImageIO.read(getClass().getResourceAsStream("../res/player/left_gait1.png"));
            leftImageArray[2] = ImageIO.read(getClass().getResourceAsStream("../res/player/left_gait2.png"));
            rightImageArray[0] = ImageIO.read(getClass().getResourceAsStream("../res/player/right0.png"));
            rightImageArray[1] = ImageIO.read(getClass().getResourceAsStream("../res/player/right_gait1.png"));
            rightImageArray[2] = ImageIO.read(getClass().getResourceAsStream("../res/player/right_gait2.png"));

        }catch(IOException e) {
            System.out.println("failed");
            e.printStackTrace();
        }
    }

    public void update() {
       
        if(keyH.upPressed) {
            direction = "up";
            if(!collisionOn) {
                worldY -= speed;
                spriteUpdate();
            }
        }
        else if(keyH.downPressed) {
            direction = "down";
            if(!collisionOn) {
                worldY += speed;
                spriteUpdate();
            }
        }
        else if(keyH.leftPressed) {
            direction = "left";
            if(!collisionOn) {
                worldX -= speed;
                spriteUpdate();
            }
        }
        else if(keyH.rightPressed) {
            direction = "right";
            if(!collisionOn) {
                worldX += speed;
                spriteUpdate();
            }
        }
        else {
            spriteState = 0;
        }

        // CHECK TILE COLLISIONS
        collisionOn = false;
        gp.cCheck.checkTile(this);

    }

    private void spriteUpdate() {
        // cycle through walking sprites
        spriteCounter++;
        if(spriteCounter > 12) {
            if(spriteState == 0 || spriteState == 1) {
                spriteState = 2;
                // System.out.println("position2");
            }
            else if(spriteState == 2) {
                spriteState = 1;
                // System.out.println("position 1");
            }
            spriteCounter = 0;
        }
    }
    public void draw(Graphics2D g2) {

        // g2.setColor(Color.white);
        // g2.fillRect(x, y, gp.tileSize, gp.tileSize); //(x, y, width, height)

        BufferedImage image = null;

        switch(direction) {
            case "up":
                image = upImageArray[spriteState];
                break;
            case "down":
                image = downImageArray[spriteState];
                break;
            case "left":
                image = leftImageArray[spriteState];
                break;
            case "right":
                image = rightImageArray[spriteState];
                break;

        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
