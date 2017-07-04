import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Valentin on 03.07.2017.
 */
public class testimg extends Applet {


    public static void main(String[] args) {
        File file=new File("src/java.jpg");
        BufferedImage image=null;
        try {
            image=ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
