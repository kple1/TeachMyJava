package commands;

import com.leeple.network.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class Menu implements CommandExecutor, Listener {

    private Main plugin;

    public Menu(Main plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0)
        sender.sendMessage("메뉴 오픈");
        return false;
    }
}
