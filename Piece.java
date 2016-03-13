import java.net.URL;

/**
 * Created by Michael on 3/13/2016.
 */


public class Piece
{
    private int value = 0;
    private PieceType rank;
    private int speed = 1;
    private boolean disarm = false;
    private String imageName;
    public Piece(PieceType type)
    {
        rank = type;
        if (type == PieceType.Marshal)
        {
            value = 10;
            imageName = "marshal.png";
        }
        else if (type == PieceType.General)
        {
            value = 9;
            imageName = "general.png";
        }
        else if (type == PieceType.Colonel)
        {
            value = 8;
            imageName = "colonel.png";
        }
        else if (type == PieceType.Major)
        {
            value = 7;
            imageName = "major.png";
        }
        else if (type == PieceType.Captain)
        {
            value = 6;
            imageName = "captain.png";
        }
        else if (type == PieceType.Lieutenant)
        {
            value = 5;
            imageName = "lieutenant.png";
        }
        else if (type == PieceType.Sergeant)
        {
            value = 4;
            imageName = "sergeant.png";
        }
        else if (type == PieceType.Miner)
        {
            value = 3;
            imageName = "miner.png";
            disarm = true;
        }
        else if (type == PieceType.Scout)
        {
            value = 2;
            imageName = "scout.png";
            speed = 10;
        }
        else if (type == PieceType.Bomb)
        {
            value = 11;
            imageName = "bomb.png";
            speed = 0;
        }
        else if (type == PieceType.Flag)
        {
            value = 1;
            imageName = "flag.png";
            speed = 0;
        }
    }
}
