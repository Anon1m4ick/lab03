import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Object obj) {
        //проверяем является ли классом Location
        if (obj instanceof Location) {
            //если равны возвращаем true
            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
        }

        //если не равны возвращаем false
        return false;
    }

    /** Provides a hashCode for each Location. **/
    public int hashCode() {
        int result = 31;
        result = 31 * result + xCoord;
        result = 31 * result + yCoord;
        return result;
    }
}
