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
    private JLabel background;

    public GUI() throws IOException {
        super();
        //this.setLayout(new BorderLayout());
        Container pane = this.getContentPane();
        pane.setBackground(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        //this.getContentPane().setLayout(new BorderLayout());
        this.setVisible(true);
        this.setSize(1100, 1100);
        this.setResizable(false);
        this.setTitle("Stratego");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image img = ImageIO.read(getClass().getResource("images/board.png"));
        img = img.getScaledInstance(1000, 1000, Image.SCALE_DEFAULT);
        testButton = new JButton();
        background = new JLabel("This Label");
        background.setVisible(true);
        background.setSize(100, 100);
        background.setLocation(100, 100);
        //background.setIcon(new ImageIcon(img));
        pane.add(background);
        //setContentPane(new JLabel(new ImageIcon("images/board.png")));
        //this.getGraphics().drawImage(img, 0, 0, null);
        testButton.setSize(1000, 1000);
        testButton.setLocation(0, 0);
        testButton.setIcon(new ImageIcon(img));
        pane.add(testButton);
        //this.add(panel);
        //this.getContentPane().add(testButton);
    }

    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
    }
}
