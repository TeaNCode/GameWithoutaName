import greenfoot.Actor;
import greenfoot.World;
/**
 * Write a description of class SpawnableEntity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnableEntity  
{
    private Actor object;
    private int x;
    private int y;
    /**
     * An actor that is ready to be made, for use in waves
     */
    public SpawnableEntity(Actor object, int x, int y)
    {
        this.object = object;
        this.x = x;
        this.y = y;
    }
    
    public void spawn(World world)
    {
        world.addObject(object,x,y);
    }
}