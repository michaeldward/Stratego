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

    public GUI() throws IOException
    {
        super();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        //this.setLayout(null);
        Board b1 = new Board();
        b1.setSize(1500, 1500);
        //JPanel p2 = new JPanel();
        //p2.setSize(100, 500);
        //JLabel l2 = new JLabel("Tada!");
        //l2.setFont(new Font("TimesRoman", Font.PLAIN, 48));
        //p2.add(l2);
        //p2.setBackground(Color.GREEN);
        this.getContentPane().add(b1);
        //this.getContentPane().add(p2);
        this.setVisible(true);
        this.setSize(1505, 1562);
        this.setResizable(false);
        this.setTitle("Stratego");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
    }
}
