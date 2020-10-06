package games.visen.simplephantomreset.commands;

import com.sun.istack.internal.NotNull;
import games.visen.simplephantomreset.Main;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SleepCommand implements CommandExecutor {

    private final Main plugin;

    public SleepCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("sleep").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.setStatistic(Statistic.TIME_SINCE_REST, 0);
        }
        return true;
    }
}
