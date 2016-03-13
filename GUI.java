import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Michael on 3/12/2016.
 */
public class GUI extends JFrame //implements ActionListener, KeyListener
{

    private JButton testButton;

    public GUI() throws IOException {
        super();
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1000, 1000);
        this.setResizable(false);
        this.setTitle("Stratego");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image img = Toolkit.getDefaultToolkit().getImage("images/board.png");
        testButton = new JButton("Test");
        JLabel background = new JLabel(new ImageIcon("images/board.png"));
        background.setSize(1000, 1000);
        background.setLocation(0, 0);
        this.getContentPane().add(background);
        //setContentPane(new JLabel(new ImageIcon("images/board.png")));
        //this.getGraphics().drawImage(img, 0, 0, null);
        testButton.setSize(100, 50);
        testButton.setLocation(200, 100);
        //this.getContentPane().add(testButton);
    }

    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
    }
}
