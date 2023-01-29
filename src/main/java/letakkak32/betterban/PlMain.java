package letakkak32.betterban;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlMain extends JavaPlugin { //testing version please bulid this repository!

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
                    if(args.length == 1)
                    {
                        Player target = Bukkit.getPlayer(args[0]);
                        if(target != null)
                        {
                            String targetsIp = String.valueOf(target.getAddress());
                            //이제야 밴할 수 있는 관문을 통과함! 나이스하다
                        }
                    }
                }
            }
        }
        return true;
    }
}
