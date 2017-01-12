
package culminatingeyetest;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;

public class Game extends BasicGame
{
    
    static int width = 640;
    static int height = 480;
    static enum GameState{INTRO, MENU, GAMEPLAY, PAUSE, GAMEOVER}
    static int level = 1;
    static boolean fullscreen = false;
    static boolean showFPS = true;
    static String title = "Game";
    static int fpslimit = 60;
    static GameState state = GameState.INTRO;
    static Input input;
    
    public Game(String title)
    {
        super(title);
    }
    
    @Override
    public void init(GameContainer gc) throws SlickException
    {
    
    }
    
      @Override
    public void update(GameContainer gc, int delta) throws SlickException
    {    
        
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        
    }
    
    
    public static void main(String[] args) throws SlickException
    {
        AppGameContainer app = new AppGameContainer(new Game(title));
        app.setDisplayMode(width, height, fullscreen);
        app.setSmoothDeltas(true);
        app.setTargetFrameRate(fpslimit);
        app.setShowFPS(showFPS);
        app.start();
    }
    
}
