package letakkak32.betterban;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("letakkak32's better ban plugin is enabled!");
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("letakkak32's better ban plugin is disabled... See you again!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (label)
        {
            case "ban":
            {
                if(sender.isOp())
                {

                }
            }
        }
        return true;
    }
}
