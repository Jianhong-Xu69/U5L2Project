public class Square
{
    private int side;

    public Square ()
    {
        side = 0;
    }
    public Square (int side)
    {
        this.side = side;
    }

    public void setSide(int newSide)
    {
        side = newSide;
    }

    public String toString()
    {
        return "Side: " + side;
    }
}
