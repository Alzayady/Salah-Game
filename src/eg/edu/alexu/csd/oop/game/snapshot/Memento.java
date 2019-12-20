package eg.edu.alexu.csd.oop.game.snapshot;

import eg.edu.alexu.csd.oop.game.Levels.Level;
import eg.edu.alexu.csd.oop.game.Log;

public class Memento {
    private Level level;

    public Memento(Level level)
    {
        Log.getInstance().getLog().info("Snap shot is taken  ");

        this.level = level;
    }

    public Level getLevel() {
        return level;
    }


}
