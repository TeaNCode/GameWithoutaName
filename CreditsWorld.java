import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class CreditsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsWorld extends World
{

    /**
     * Constructor for objects of class CreditsWorld.
     * 
     */
    public CreditsWorld(World backTo)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        addObject(new Display("Tea-N-Code"), 500, 100);
        addObject(new Display("Programming:", 30), 500, 150);
        addObject(new Display("Aaron Campbell", 30, Color.LIGHT_GRAY), 500, 185);
        addObject(new Display("Nathan Faltermeier", 30, Color.LIGHT_GRAY), 500, 210);
        addObject(new Display("Images:", 30), 500, 260);
        addObject(new Display("Aaron Campbell", 30, Color.LIGHT_GRAY), 500, 295);
        addObject(new Display("Nathan Faltermeier", 30, Color.LIGHT_GRAY), 500, 320);
        addObject(new Display("Tyler Martinez", 30, Color.LIGHT_GRAY), 500, 345);
        addObject(new Display("Gameplay:", 30), 500, 385);
        addObject(new Display("Aaron Campbell", 30, Color.LIGHT_GRAY), 500, 425);
        addObject(new Display("Nathan Faltermeier", 30, Color.LIGHT_GRAY), 500, 450);
        addObject(new Display("Special Thanks:", 30), 500, 495);
        addObject(new Display("Maverick Edwards", 30, Color.LIGHT_GRAY), 500, 535);
        addObject(new Display("Ethan Renner", 30, Color.LIGHT_GRAY), 500, 560);
        addObject(new Button("back", backTo),29,789);
    }
}
