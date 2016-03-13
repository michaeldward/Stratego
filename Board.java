import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Michael on 3/13/2016.
 */
public class Board extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Image image = null;
        try
        {
            URL url = this.getClass().getResource("images/board.png");
            image = ImageIO.read(url);
            image = image.getScaledInstance(1500, 1500, Image.SCALE_DEFAULT);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        g.drawImage(image, 0, 0, null);
    }

}
