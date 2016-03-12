import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * Created by Michael on 3/12/2016.
 */
public class GUI extends JFrame //implements ActionListener, KeyListener
{

    public GUI()
    {
        super();
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setResizable(false);
        this.setTitle("Stratego");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        GUI g = new GUI();
    }
}
