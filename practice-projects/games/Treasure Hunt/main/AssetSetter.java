package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 30 * gp.tileSize;
        gp.obj[0].worldY = 23 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 48 * gp.tileSize;
        gp.obj[1].worldY = 35 * gp.tileSize;
        
        gp.obj[2] = new OBJ_Chest();
        gp.obj[2].worldX = 9 * gp.tileSize;
        gp.obj[2].worldY = 48 * gp.tileSize;
        
        gp.obj[3] = new OBJ_Chest();
        gp.obj[3].worldX = 46 * gp.tileSize;
        gp.obj[3].worldY = 8 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 11 * gp.tileSize;
        gp.obj[4].worldY = 32 * gp.tileSize;
        
        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 4 * gp.tileSize;
        gp.obj[5].worldY = 28 * gp.tileSize;

        gp.obj[6] = new OBJ_Door();
        gp.obj[6].worldX = 9 * gp.tileSize;
        gp.obj[6].worldY = 22 * gp.tileSize;
        
        gp.obj[7] = new OBJ_Door();
        gp.obj[7].worldX = 44 * gp.tileSize;
        gp.obj[7].worldY = 15 * gp.tileSize;

        gp.obj[8] = new OBJ_Door();
        gp.obj[8].worldX = 44 * gp.tileSize;
        gp.obj[8].worldY = 7 * gp.tileSize;
        
        gp.obj[9] = new OBJ_Door();
        gp.obj[9].worldX = 35 * gp.tileSize;
        gp.obj[9].worldY = 15 * gp.tileSize;
    }
}
