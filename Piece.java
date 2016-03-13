/**
 * Created by Michael on 3/13/2016.
 */


public class Piece
{
    private int value = 0;
    private PieceType rank;
    private int speed = 1;
    private boolean disarm = false;
    public Piece(PieceType type)
    {
        rank = type;
        switch(type)
        {
            case Marshal:
                value = 10;
                break;
            case General:
                value = 9;
                break;
            case Colonel:
                value = 8;
                break;
            case Major:
                value = 7;
                break;
            case Captain:
                value = 6;
                break;
            case Lieutenant:
                value = 5;
                break;
            case Sergeant:
                value = 4;
                break;
            case Miner:
                value = 3;
                disarm = true;
                break;
            case Scout:
                value = 2;
                speed = 10;
                break;
            case Flag:
                value = 1;
                speed = 0;
                break;
            case Bomb:
                value = 11;
                speed = 0;
        }
    }
}
