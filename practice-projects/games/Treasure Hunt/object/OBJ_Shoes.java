package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Shoes extends SuperObject {

    public OBJ_Shoes() {

        name = "Shoes";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("../res/objects/shoes.png"));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
