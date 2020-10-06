package games.visen.simplephantomreset;

import games.visen.simplephantomreset.commands.SleepCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        new SleepCommand(this);
    }
}
